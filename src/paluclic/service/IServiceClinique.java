package paluclic.service;

import paluclic.dto.DtoClinique;
import paluclic.util.ExceptionAppli;

public interface IServiceClinique {
	
	void			inserer( DtoClinique dto ) throws ExceptionAppli;

	void			modifier( DtoClinique dto ) throws ExceptionAppli;

	void			supprimer( DtoClinique dto ) throws ExceptionAppli;

}
