package io.core9.plugin.database.repository;

import java.util.Map;

/**
 * A default database entry, extend {@link AbstractCrudEntity} for a default implementation.
 * 
 * @author mark.wienk@core9.io
 *
 */
public interface CrudEntity {
	
	/**
	 * Returns the ID, use {@link AbstractCrudEntity} for a default ID implementation
	 * @return
	 */
	String getId();

	/**
	 * Set the ID of the entity, use {@link AbstractCrudEntity} for a default ID implementation
	 * @param id
	 */
	void setId(String id);
	
	/**
	 * Returns the default query, or null if none
	 * @return
	 */
	Map<String,Object> retrieveDefaultQuery();
}
