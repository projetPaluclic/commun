package paluclic.dto;

/**
 * 
 * @author Henrey
 * Nom classe: DtoClinique
 * @version 1.0
 * date: 22/11/2016 à 14h17
 * Cette classe contiendra les valeurs renseignées lors de la saisie du formulaire Clinique
 * et pour ses traitements
 *
 */
public class DtoClinique {
	
	
	
	//###### Attributs de la classe DtoClinique #######
	
	/**
	 * Score de Glasgow
	 * type integer 
	 */
	private int glasgow;
	
	/**
	 * Prostration:
	 * type String
	 * Valeur dans {oui; non; non-renseigné}
	 */
	private String prostration;
	
	/**
	 * Trouble de la conscience
	 * type boolean
	 */
	private boolean troubleConscience;
	
	/**
	 * Trouble neurologique
	 * type boolean
	 */
	private boolean troubleNeurologique;
	
	/**
	 * Convulsion
	 * type integer
	 */
	private int convulsion;
	
	/**
	 * Ictère
	 * Valeur dans {"slinique";"clinique+dysfonctionnement"}
	 * type String
	 */
	private String ictere;
	
	/**
	 * Oedème pulmonaire
	 * Valeur dans {"normal"; "clinique"; "radiologiquement confirmé"}
	 * type String
	 */
	private String oedemePulmonaire;
	
	/**
	 * Saturation(O2)
	 * valeur dans [0;2]
	 * type integer
	 */
	private int saturation;
	
	/**
	 * Hémorragie
	 * valeur dans {"définition clinique";"clinique significative";"significatifs"}
	 * type String
	 */
	private String hemorragie;
	
	/**
	 * TAS
	 * valeur dans [0;2]
	 * type integer
	 */
	private int tas;
	
	/**
	 * Hémoglobinurie macroscopique
	 * type boolean
	 */
	private boolean hemoMacroscopique;

	
	
	
	// ###### Méthodes Getters & Setters #######
	
	/**
	 * @return the glasgow
	 */
	public int getGlasgow() {
		return glasgow;
	}

	/**
	 * @param glasgow the glasgow to set
	 */
	public void setGlasgow(int glasgow) {
		this.glasgow = glasgow;
	}

	/**
	 * @return the prostration
	 */
	public String getProstration() {
		return prostration;
	}

	/**
	 * @param prostration the prostration to set
	 */
	public void setProstration(String prostration) {
		this.prostration = prostration;
	}

	/**
	 * @return the troubleConscience
	 */
	public boolean isTroubleConscience() {
		return troubleConscience;
	}

	/**
	 * @param troubleConscience the troubleConscience to set
	 */
	public void setTroubleConscience(boolean troubleConscience) {
		this.troubleConscience = troubleConscience;
	}

	/**
	 * @return the troubleNeurologique
	 */
	public boolean isTroubleNeurologique() {
		return troubleNeurologique;
	}

	/**
	 * @param troubleNeurologique the troubleNeurologique to set
	 */
	public void setTroubleNeurologique(boolean troubleNeurologique) {
		this.troubleNeurologique = troubleNeurologique;
	}

	/**
	 * @return the convulsion
	 */
	public int getConvulsion() {
		return convulsion;
	}

	/**
	 * @param convulsion the convulsion to set
	 */
	public void setConvulsion(int convulsion) {
		this.convulsion = convulsion;
	}

	/**
	 * @return the ictere
	 */
	public String getIctere() {
		return ictere;
	}

	/**
	 * @param ictere the ictere to set
	 */
	public void setIctere(String ictere) {
		this.ictere = ictere;
	}

	/**
	 * @return the oedemePulmonaire
	 */
	public String getOedemePulmonaire() {
		return oedemePulmonaire;
	}

	/**
	 * @param oedemePulmonaire the oedemePulmonaire to set
	 */
	public void setOedemePulmonaire(String oedemePulmonaire) {
		this.oedemePulmonaire = oedemePulmonaire;
	}

	/**
	 * @return the saturation
	 */
	public int getSaturation() {
		return saturation;
	}

	/**
	 * @param saturation the saturation to set
	 */
	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}

	/**
	 * @return the hemorragie
	 */
	public String getHemorragie() {
		return hemorragie;
	}

	/**
	 * @param hemorragie the hemorragie to set
	 */
	public void setHemorragie(String hemorragie) {
		this.hemorragie = hemorragie;
	}

	/**
	 * @return the tas
	 */
	public int getTas() {
		return tas;
	}

	/**
	 * @param tas the tas to set
	 */
	public void setTas(int tas) {
		this.tas = tas;
	}

	/**
	 * @return the hemoMacroscopique
	 */
	public boolean isHemoMacroscopique() {
		return hemoMacroscopique;
	}

	/**
	 * @param hemoMacroscopique the hemoMacroscopique to set
	 */
	public void setHemoMacroscopique(boolean hemoMacroscopique) {
		this.hemoMacroscopique = hemoMacroscopique;
	}
	
	
	
}
