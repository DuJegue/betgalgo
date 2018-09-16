package br.betgalgo.commons.util;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.betgalgo.commons.pojo.Analysis2;

public class Analysis2Adapter implements JsonDeserializer<Analysis2> {


	@Override
	public Analysis2 deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		if (json.isJsonArray()) {
			return null;
		}
		
		JsonObject jsonObject = json.getAsJsonObject();
		
		Analysis2 analysis = new Analysis2();
		analysis.setOverall(jsonObject.get("overall").getAsInt());
		analysis.setResult(jsonObject.get("result").getAsString());
		
		return analysis;
	}

}
