package io.core9.plugin.database.repository;

import io.core9.plugin.server.VirtualHost;

import java.util.Map;

import rx.Observable;

public interface ObservableCrudRepository<T extends CrudEntity> {
	
	/**
	 * Create a new entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	Observable<T> create(VirtualHost vhost, T entity);
	
	/**
	 * Create a new entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	Observable<T> create(String database, String prefix, T entity);
	
	/**
	 * Return a new entity from the id
	 * @param vhost
	 * @param id
	 * @return
	 */
	Observable<T> read(VirtualHost vhost, String id);
	
	/**
	 * Return a new entity from the id
	 * @param database
	 * @param prefix
	 * @param id
	 * @return
	 */
	Observable<T> read(String database, String prefix, String id);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	Observable<T> update(VirtualHost vhost, T entity);
	
	/**
	 * Update the entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	Observable<T> update(String database, String prefix, T entity);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param id
	 * @param entity
	 * @return
	 */
	Observable<T> updateFields(VirtualHost vhost, T entity);
	
	/**
	 * Update the entity
	 * @param vhost
	 * @param id
	 * @param entity
	 * @return
	 */
	Observable<T> updateFields(String database, String prefix, T entity);
	
	/**
	 * Upsert the entity
	 * @param vhost
	 * @param entity
	 * @return
	 */
	Observable<T> upsert(VirtualHost vhost, T entity);
	
	/**
	 * Upsert the entity
	 * @param database
	 * @param prefix
	 * @param entity
	 * @return
	 */
	Observable<T> upsert(String database, String prefix, T entity);
	
	/**
	 * Get all entities from the collection
	 * @param vhost
	 * @return
	 */
	Observable<T> getAll(VirtualHost vhost);
	
	/**
	 * Get all entities from the collection
	 * @param database
	 * @param prefix
	 * @return
	 */
	Observable<T> getAll(String database, String prefix);
	
	/**
	 * Query the collection for specific entities
	 * @param vhost
	 * @param query
	 * @return
	 */
	Observable<T> query(VirtualHost vhost, Map<String,Object> query);
	
	/**
	 * Query the collection for specific entities
	 * @param database
	 * @param prefix
	 * @param query
	 * @return
	 */
	Observable<T> query(String database, String prefix, Map<String,Object> query);
	
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
