package io.core9.plugin.database.repository;

import io.core9.plugin.server.VirtualHost;

import java.util.List;
import java.util.Map;

public interface CrudRepository<T extends CrudEntity> {
	
	/**
	 * Create a new entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	T create(VirtualHost vhost, T entity);
	
	/**
	 * Create a new entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	T create(String database, String prefix, T entity);
	
	/**
	 * Return a new entity from the id
	 * @param vhost
	 * @param id
	 * @return
	 */
	T read(VirtualHost vhost, String id);
	
	/**
	 * Return a new entity from the id
	 * @param vhost
	 * @param collection
	 * @param id
	 * @return
	 */
	T read(VirtualHost vhost, String collection, String id);
	
	/**
	 * Return a new entity from the id
	 * @param database
	 * @param prefix
	 * @param id
	 * @return
	 */
	T read(String database, String prefix, String id);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param id
	 * @param entity
	 * @return
	 */
	@Deprecated
	T update(VirtualHost vhost, String id, T entity);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	T update(VirtualHost vhost, T entity);
	
	/**
	 * Update the entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	T update(String database, String prefix, T entity);
	
	/**
	 * Update the entity
	 * @param database
	 * @param prefix
	 * @param id
	 * @param entity
	 * @return
	 */
	@Deprecated
	T update(String database, String prefix, String id, T entity);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param id
	 * @param entity
	 * @return
	 */
	T updateFields(VirtualHost vhost, T entity);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param id
	 * @param entity
	 * @return
	 */
	T updateFields(String database, String prefix, T entity);
	
	/**
	 * Upsert the entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	T upsert(VirtualHost vhost, T entity);
	
	/**
	 * Upsert the entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	T upsert(String database, String prefix, T entity);
	
	/**
	 * Get all entities from the collection
	 * @param vhost
	 * @return
	 */
	List<T> getAll(VirtualHost vhost);
	
	/**
	 * Get all entities from the collection
	 * @param database
	 * @param prefix
	 * @return
	 */
	List<T> getAll(String database, String prefix);
	
	/**
	 * Query the collection for specific entities
	 * @param vhost
	 * @param query
	 * @return
	 */
	List<T> query(VirtualHost vhost, Map<String,Object> query);
	
	/**
	 * Query the collection for specific entities
	 * @param database
	 * @param prefix
	 * @param query
	 * @return
	 */
	List<T> query(String database, String prefix, Map<String,Object> query);
	
	/**
	 * Delete the entity
	 * @param vhost
	 * @param entity
	 */
	void delete(VirtualHost vhost, T entity);
	
	/**
	 * Delete the entity
	 * @param database
	 * @param prefix
	 * @param entity
	 */
	void delete(String database, String prefix, T entity);
	
	/**
	 * Delete the entity by id
	 * @param vhost
	 * @param id
	 */
	void delete(VirtualHost vhost, String id);
	
	/**
	 * Delete the entity
	 * @param database
	 * @param prefix
	 * @param id
	 */
	void delete(String database, String prefix, String id);

}
