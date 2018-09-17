package br.betgalgo.commons.util;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class IntegerCustomTypeAdapter implements JsonDeserializer<IntegerCustom>, JsonSerializer<IntegerCustom> {

	public IntegerCustom deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		int value;
		try {
			value = json.getAsInt();
		} catch (NumberFormatException e) {
			value = 0;
		}
		return new IntegerCustom(value);
	}

	public JsonElement serialize(IntegerCustom src, Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(src.getValue());
	}

}
