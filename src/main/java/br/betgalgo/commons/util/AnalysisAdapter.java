package br.betgalgo.commons.util;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.betgalgo.commons.pojo.Analysis;

public class AnalysisAdapter implements JsonDeserializer<Analysis> {


	@Override
	public Analysis deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		if (json.isJsonArray()) {
			return null;
		}
		
		JsonObject jsonObject = json.getAsJsonObject();
		
		Analysis analysis = new Analysis();
		analysis.setOverall(jsonObject.get("overall").getAsInt());
		analysis.setResult(jsonObject.get("result").getAsString());
		analysis.setTopTime(jsonObject.get("top_time").getAsDouble());
		analysis.setPreview(jsonObject.get("preview").getAsInt());
		analysis.setRatingTopTime(jsonObject.get("rating_top_time").getAsInt());
		analysis.setAveragePlace(jsonObject.get("average_place").getAsDouble());
		//analysis.setRatingAveragePlace(jsonObject.get("ratingAveragePlace").getAsInt());
		analysis.setLastTime(jsonObject.get("last_time").getAsDouble());
		//analysis.setRatingLastTime(jsonObject.get("ratingLastTime").getAsInt());
		analysis.setAverageTime(jsonObject.get("average_time").getAsDouble());
		//analysis.setRatingAverageTime(jsonObject.get("ratingAverageTime").getAsInt());
		//analysis.setTopBreakTime(jsonObject.get("topBreakTime").getAsDouble());
		//analysis.setRatingTopBreakTime(jsonObject.get("ratingTopBreakTime").getAsInt());
		//analysis.setAverageBreakTime(jsonObject.get("averageBreakTime").getAsDouble());
		//analysis.setRatingAverageBreakTime(jsonObject.get("ratingAverageBreakTime").getAsInt());
		//analysis.setAverageRecovery(jsonObject.get("averageRecovery").getAsDouble());
		//analysis.setAverageFinalTime(jsonObject.get("averageFinalTime").getAsDouble());
		//analysis.setRatingAverageFinalTime(jsonObject.get("ratingAverageFinalTime").getAsInt());
		//analysis.setAverageFinalBreakTime(jsonObject.get("averageFinalBreakTime").getAsDouble());
		//analysis.setRatingAverageFinalBreakTime(jsonObject.get("ratingAverageFinalBreakTime").getAsInt());
		
		return analysis;
	}

}
