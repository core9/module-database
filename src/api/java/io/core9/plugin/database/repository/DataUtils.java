package io.core9.plugin.database.repository;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class DataUtils {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	private DataUtils() {}
	
	public static String toJSON(Object obj) throws JsonProcessingException {
		return mapper.writeValueAsString(obj);
	}
	
	public static Map<String,Object> toMap(Object obj) {
		return mapper.convertValue(obj, new TypeReference<Map<String, Object>>() {});
	}
	
	public static <T> T toObject(Map<String,Object> map, Class<T> type) {
		return mapper.convertValue(map, type);
	}

}
