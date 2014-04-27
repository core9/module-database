package io.core9.plugin.database.repository;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

import javax.persistence.Id;

/**
 * Provides a default implementation for {@link CrudEntity}
 * 
 * @author mark.wienk@core9.io
 */
public abstract class AbstractCrudEntity implements CrudEntity {
	
	@Id
	public String _id;

	@Id
	@Override
	public String getId() {
		if(_id == null) {
			UUID uuid = UUID.randomUUID();
			long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
			_id = Long.toString(l, Character.MAX_RADIX).toUpperCase();
		}
		return _id;
	}
	
	@Id
	@Override
	public void setId(String id) {
		this._id = id;
	}
	
	@Override
	public Map<String,Object> retrieveDefaultQuery() {
		return null;
	}

}
