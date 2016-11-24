package paluclic.service;

import paluclic.dto.DtoBiologique;
import paluclic.util.ExceptionAppli;

public interface IServiceBiologique {
	
	void			inserer( DtoBiologique dto ) throws ExceptionAppli;

	void			modifier( DtoBiologique dto ) throws ExceptionAppli;

	void			supprimer( DtoBiologique dto ) throws ExceptionAppli;
	
}
