package paluclic.service;

public interface IContextService {
	
	<T> T 		getService( Class<T> type );

}