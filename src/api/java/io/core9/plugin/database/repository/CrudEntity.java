package io.core9.plugin.database.repository;

import java.util.Map;

import javax.persistence.Id;

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
	@Id
	String getId();

	/**
	 * Set the ID of the entity, use {@link AbstractCrudEntity} for a default ID implementation
	 * @param id
	 */
	@Id
	void setId(String id);
	
	/**
	 * Returns the default query, or null if none
	 * @return
	 */
	Map<String,Object> retrieveDefaultQuery();
	
	/**
	 * Return the collection override (overrides a collection name set on a CrudEntity type
	 * @return
	 */
	String retrieveCollectionOverride();
}
