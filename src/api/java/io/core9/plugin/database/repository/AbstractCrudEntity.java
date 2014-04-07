package io.core9.plugin.database.repository;

import java.util.UUID;

import javax.persistence.Id;

/**
 * Provides a default implementation for {@link CrudEntity}
 * 
 * @author mark.wienk@core9.io
 */
public abstract class AbstractCrudEntity implements CrudEntity {
	
	private String _id;

	@Id
	@Override
	public String getId() {
		if(_id == null) {
			_id = UUID.randomUUID().toString(); 
		}
		return _id;
	}
	
	@Id
	@Override
	public void setId(String id) {
		this._id = id;
	}

}
