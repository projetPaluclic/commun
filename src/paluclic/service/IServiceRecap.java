package paluclic.service;

import paluclic.dto.DtoRecap;
import paluclic.util.ExceptionAppli;

public interface IServiceRecap {
	
	void			inserer( DtoRecap dto ) throws ExceptionAppli;

	void			modifier( DtoRecap dto ) throws ExceptionAppli;

	void			supprimer( DtoRecap dto ) throws ExceptionAppli;
	
}
