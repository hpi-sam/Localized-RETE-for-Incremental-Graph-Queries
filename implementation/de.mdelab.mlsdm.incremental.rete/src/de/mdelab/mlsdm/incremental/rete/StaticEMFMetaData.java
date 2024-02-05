package de.mdelab.mlsdm.incremental.rete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.mlsdm.incremental.rete.util.FeatureSpecification;

public class StaticEMFMetaData implements EMFMetaData {

	private static final String FEATURE_PREFIX = "FEATURE:";
	private static final String CLASSIFIER_PREFIX = "CLASSIFIER:";
	private static final String VALUE_SEPARATOR = "=";
	private static final String FEATURE_SEPARATOR = "->";
	private static final String CLASSIFIER_SEPARATOR = "#";
	private static final String PACKAGE_SEPARATOR = ";";
	
	protected Map<EClassifier, Double> classifierDomainSizes;
	protected Map<FeatureSpecification, Double> featureDomainSizes;

	public StaticEMFMetaData() {
		this.classifierDomainSizes = new LinkedHashMap<EClassifier, Double>();
		this.featureDomainSizes = new LinkedHashMap<FeatureSpecification, Double>();
	}
	
	public void setDomainSize(EClassifier classifier, double value) {
		classifierDomainSizes.put(classifier, value);
	}

	public void setDomainSize(FeatureSpecification feature, double value) {
		featureDomainSizes.put(feature, value);
	}
	
	@Override
	public double getDomainSize(EClassifier type) {
		return classifierDomainSizes.get(type);
	}

	@Override
	public double getDomainSize(FeatureSpecification feature) {
		return featureDomainSizes.get(feature);
	}

	@Override
	public Iterable<EClassifier> getRegisteredClassifiers() {
		return classifierDomainSizes.keySet();
	}

	@Override
	public Iterable<FeatureSpecification> getRegisteredFeatures() {
		return featureDomainSizes.keySet();
	}

	public static void serializeMetaData(EMFMetaData metaData, String file) {
		try {
			StringBuffer sb = new StringBuffer();
			for(EClassifier classifier:metaData.getRegisteredClassifiers()) {
				sb.append(serializeDomainValue(classifier, metaData) + "\n");
			}
			for(FeatureSpecification feature:metaData.getRegisteredFeatures()) {
				sb.append(serializeDomainValue(feature, metaData) + "\n");
			}

			FileWriter fw = new FileWriter(file);
			fw.write(sb.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String serializeDomainValue(EClassifier classifier, EMFMetaData metaData) {
		return CLASSIFIER_PREFIX
				+ serializeClassifier(classifier) + VALUE_SEPARATOR
				+ metaData.getDomainSize(classifier);
	}

	private static String serializeDomainValue(FeatureSpecification feature, EMFMetaData metaData) {
		return FEATURE_PREFIX
				+ serializeClassifier(feature.sourceClassifier) + FEATURE_SEPARATOR
				+ serializeFeature(feature.feature) + FEATURE_SEPARATOR
				+ serializeClassifier(feature.targetClassifier) + VALUE_SEPARATOR
				+ metaData.getDomainSize(feature);
	}

	private static String serializeClassifier(EClassifier classifier) {
		return classifier.getEPackage().getNsURI() + PACKAGE_SEPARATOR
				+ classifier.getName();
	}

	private static String serializeFeature(EStructuralFeature feature) {
		return serializeClassifier(feature.getEContainingClass()) + CLASSIFIER_SEPARATOR +
				feature.getName();
	}

	public static StaticEMFMetaData parseMetaData(String path) {
		StaticEMFMetaData metaData = new StaticEMFMetaData();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				parseLine(line, metaData);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return metaData;
	}

	private static void parseLine(String line, StaticEMFMetaData metaData) {
		if(line.startsWith(CLASSIFIER_PREFIX))  {
			parseClassifierValue(line, metaData);
		}
		else if(line.startsWith(FEATURE_PREFIX)) {
			parseFeatureValue(line, metaData);
		}
	}

	private static void parseClassifierValue(String line, StaticEMFMetaData metaData) {
		String s = line.substring(CLASSIFIER_PREFIX.length());
		
		String[] tokens = s.split(VALUE_SEPARATOR);
		EClassifier c = getClassifier(tokens[0]);
		double value = Double.parseDouble(tokens[1]);

		metaData.setDomainSize(c, value);
	}

	private static void parseFeatureValue(String line, StaticEMFMetaData metaData) {
		String s = line.substring(FEATURE_PREFIX.length());
		
		String[] tokens = s.split(VALUE_SEPARATOR);
		String specificationString = tokens[0];
		double value = Double.parseDouble(tokens[1]);

		String[] featureTokens = specificationString.split(FEATURE_SEPARATOR);
		EClassifier sourceClassifier = getClassifier(featureTokens[0]);
		EStructuralFeature feature = getFeature(featureTokens[1]);
		EClassifier targetClassifier= getClassifier(featureTokens[2]);
		
		metaData.setDomainSize(new FeatureSpecification(sourceClassifier, feature, targetClassifier), value);
	}

	private static EClassifier getClassifier(String classifierString) {
		String[] classifierTokens = classifierString.split(PACKAGE_SEPARATOR);
		String packageURI = classifierTokens[0];
		String name = classifierTokens[1];
		
		EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(packageURI);
		EClassifier c = pkg.getEClassifier(name);
		
		return c;
	}

	private static EStructuralFeature getFeature(String string) {
		String[] tokens = string.split(CLASSIFIER_SEPARATOR);
		
		EClassifier c = getClassifier(tokens[0]);
		EStructuralFeature feature = ((EClass) c).getEStructuralFeature(tokens[1]);
		return feature;
	}
}
