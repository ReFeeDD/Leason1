package Lesson7;

import com.google.gson.annotations.SerializedName;

public record WeatherResponse(@SerializedName("date") String DATE,
                              @SerializedName("city") String CITY,
                              @SerializedName("condition") String WEATHER_TEXT,
                              @SerializedName("temp_avg") Integer TEMPERATURE) {
}
