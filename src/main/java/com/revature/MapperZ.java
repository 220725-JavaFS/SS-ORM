package com.revature;

public interface MapperZ {

	public String serialize(Object o);
	// deserialize
	public <T> T deSerialize(String str, Class<T> clazz);
}
