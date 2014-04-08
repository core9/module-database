package io.core9.plugin.database.repository;

import io.core9.plugin.server.VirtualHost;

import java.util.List;
import java.util.Map;

public interface CrudRepository<T extends CrudEntity> {
	
	/**
	 * Create a new entity
	 * @param item
	 */
	T create(VirtualHost vhost, T entity);
	
	/**
	 * Return a new entity from the id
	 * @param id
	 * @return
	 */
	T read(VirtualHost vhost, String id);
	
	/**
	 * Update the entity
	 * @param item
	 */
	T update(VirtualHost vhost, String id, T entity);
	
	/**
	 * Get all entities from the collection
	 */
	List<T> getAll(VirtualHost vhost);
	
	/**
	 * Query the collection for specific entities
	 */
	List<T> query(VirtualHost vhost, Map<String,Object> query);
	
	/**
	 * Delete the entity
	 * @param item
	 */
	void delete(VirtualHost vhost, T entity);
	
	/**
	 * Delete the entity by id
	 * @param item
	 */
	void delete(VirtualHost vhost, String id);

}
