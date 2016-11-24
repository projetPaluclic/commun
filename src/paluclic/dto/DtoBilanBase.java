
package paluclic.dto;

import java.util.Date;

/**
 * 
 * @author Henrey
 * Nom classe: DtoBilanBase
 * @version 1.0
 * date: 22/11/2016 à 14h17
 * Cette classe contiendra les valeurs renseignées lors de la saisie du formulaire Bilan de base
 * et pour ses traitements
 *
 */


public class DtoBilanBase {
	
	
	//###### Attributs de la classe DtoBilanBase #######
	/**
	 * Identifiant du patient dans le bilan
	 */
	private String identifiant;
	
	/**
	 * Poids du patient
	 */
	private double poids;
	
	/**
	 * Déficite en G6PD
	 */
	private boolean defG6PD;
	
	/**
	 *  Grossesse en cours
	 */
	private boolean grossesse;
	
	/**
	 *  Immunodépression
	 */
	private boolean immunodepression;
	
	/**
	 *  Spélectomie
	 */
	private boolean spelectomie;
	
	/**
	 *  Température du patient
	 */
	private int temperature;
	
	/**
	 *  Taille du QTc
	 */
	private String tailleQTc;
	
	/**
	 *  Pays de contamination
	 */
	private String paysContamination;
	
	/**
	 *  Date d'arrivé dans ce pays
	 */
	private Date arrivePays;
	
	/**
	 *  Date de retour en France
	 */
	private Date retourFrance;
	
	/**
	 *  DAt premier symptômes
	 */
	private Date date1erSymptomes;
	
	/**
	 *  Prophylaxir utilisée
	 */
	private String prophylaxie;
	
	/**
	 *  Espèce de plasmodium
	 */
	private String especePlasmodium;
	
	/**
	 *  Méthodes diagnostique utilisées
	 */
	private String methodeDiagnostique;

	
	// ###### Méthodes Getters & Setters #######
	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}

	/**
	 * @return the defG6PD
	 */
	public boolean isDefG6PD() {
		return defG6PD;
	}

	/**
	 * @param defG6PD the defG6PD to set
	 */
	public void setDefG6PD(boolean defG6PD) {
		this.defG6PD = defG6PD;
	}

	/**
	 * @return the grossesse
	 */
	public boolean isGrossesse() {
		return grossesse;
	}

	/**
	 * @param grossesse the grossesse to set
	 */
	public void setGrossesse(boolean grossesse) {
		this.grossesse = grossesse;
	}

	/**
	 * @return the immunodepression
	 */
	public boolean isImmunodepression() {
		return immunodepression;
	}

	/**
	 * @param immunodepression the immunodepression to set
	 */
	public void setImmunodepression(boolean immunodepression) {
		this.immunodepression = immunodepression;
	}

	/**
	 * @return the spelectomie
	 */
	public boolean isSpelectomie() {
		return spelectomie;
	}

	/**
	 * @param spelectomie the spelectomie to set
	 */
	public void setSpelectomie(boolean spelectomie) {
		this.spelectomie = spelectomie;
	}

	/**
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the tailleQTc
	 */
	public String getTailleQTc() {
		return tailleQTc;
	}

	/**
	 * @param tailleQTc the tailleQTc to set
	 */
	public void setTailleQTc(String tailleQTc) {
		this.tailleQTc = tailleQTc;
	}

	/**
	 * @return the paysContamination
	 */
	public String getPaysContamination() {
		return paysContamination;
	}

	/**
	 * @param paysContamination the paysContamination to set
	 */
	public void setPaysContamination(String paysContamination) {
		this.paysContamination = paysContamination;
	}

	/**
	 * @return the arrivePays
	 */
	public Date getArrivePays() {
		return arrivePays;
	}

	/**
	 * @param arrivePays the arrivePays to set
	 */
	public void setArrivePays(Date arrivePays) {
		this.arrivePays = arrivePays;
	}

	/**
	 * @return the retourFrance
	 */
	public Date getRetourFrance() {
		return retourFrance;
	}

	/**
	 * @param retourFrance the retourFrance to set
	 */
	public void setRetourFrance(Date retourFrance) {
		this.retourFrance = retourFrance;
	}

	/**
	 * @return the date1erSymptomes
	 */
	public Date getDate1erSymptomes() {
		return date1erSymptomes;
	}

	/**
	 * @param date1erSymptomes the date1erSymptomes to set
	 */
	public void setDate1erSymptomes(Date date1erSymptomes) {
		this.date1erSymptomes = date1erSymptomes;
	}

	/**
	 * @return the prophylaxie
	 */
	public String getProphylaxie() {
		return prophylaxie;
	}

	/**
	 * @param prophylaxie the prophylaxie to set
	 */
	public void setProphylaxie(String prophylaxie) {
		this.prophylaxie = prophylaxie;
	}

	/**
	 * @return the especePlasmodium
	 */
	public String getEspecePlasmodium() {
		return especePlasmodium;
	}

	/**
	 * @param especePlasmodium the especePlasmodium to set
	 */
	public void setEspecePlasmodium(String especePlasmodium) {
		this.especePlasmodium = especePlasmodium;
	}

	/**
	 * @return the methodeDiagnostique
	 */
	public String getMethodeDiagnostique() {
		return methodeDiagnostique;
	}

	/**
	 * @param methodeDiagnostique the methodeDiagnostique to set
	 */
	public void setMethodeDiagnostique(String methodeDiagnostique) {
		this.methodeDiagnostique = methodeDiagnostique;
	}
	
	
}
