package io.core9.plugin.database.repository;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

/**
 * Provides a default implementation for {@link CrudEntity}
 * 
 * @author mark.wienk@core9.io
 */
public abstract class AbstractCrudEntity implements CrudEntity {
	
	private String _id;
	
	/**
	 * FIXME: Fix for @Id, which isn't working somehow
	 * @param id
	 */
	public void set_id(String id) {
		this._id = id;
	}
	
	public String get_id() {
		return this.getId();
	}

	@Override
	public String getId() {
		if(_id == null) {
			UUID uuid = UUID.randomUUID();
			long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
			_id = Long.toString(l, Character.MAX_RADIX).toUpperCase();
		}
		return _id;
	}
	
	@Override
	public void setId(String id) {
		this._id = id;
	}
	
	@Override
	public Map<String,Object> retrieveDefaultQuery() {
		return null;
	}

}
