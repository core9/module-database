package io.core9.plugin.database;

import java.util.List;
import java.util.Map;


public interface Database {
	
	Map<String, Object> getSingleResult(String db, String coll, Map<String, Object> query);
	
	List<Map<String, Object>> getMultipleResults(String db, String coll, Map<String, Object> query);
	
	Map<String, Object> findByID(String db, String collection, String id);
	
	Map<String, Object> findByField(String db, String collection, String field, String value);
	
	/**
	 * Upserts a document, returns the ID
	 * @param db
	 * @param coll
	 * @param doc
	 * @param query
	 * @return
	 */
	String upsert(String db, String coll, Map<String, Object> doc, Map<String, Object> query);
	
	void delete(String db, String coll, Map<String, Object> query);
	
}
