package paluclic.service;

import paluclic.dto.DtoBilanBase;
import paluclic.util.ExceptionAppli;

public interface IServiceBilanBase {
	
	void			inserer( DtoBilanBase dto ) throws ExceptionAppli;

	void			modifier( DtoBilanBase dto ) throws ExceptionAppli;

	void			supprimer( DtoBilanBase dto ) throws ExceptionAppli;
	
}
