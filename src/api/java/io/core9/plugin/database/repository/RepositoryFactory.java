package io.core9.plugin.database.repository;

import io.core9.core.plugin.Core9Plugin;

public interface RepositoryFactory extends Core9Plugin {
	
	<T extends CrudEntity> CrudRepository<T> getRepository(Class<T> type) throws NoCollectionNamePresentException;

}
