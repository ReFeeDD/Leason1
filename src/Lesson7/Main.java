package Lesson7;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("forecast")
                .addQueryParameter("lat", "59.93909836")
                .addQueryParameter("lon", "30.31587601")
                .addQueryParameter("lang", "ru_RU")
                .addQueryParameter("limit", "5")
                .addQueryParameter("hours", "false")
                .addQueryParameter("extra", "true")
                .build();

        Request request = new Request.Builder()
                .addHeader("X-Yandex-API-Key", "b5374001-d0cc-488c-9b60-31206f90bb2c")
                .url(url)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String body = response.body().string();
        ObjectMapper objectMapper = new ObjectMapper();
        String city = objectMapper.readTree(body).at("/geo_object/locality/name").asText();

        ArrayNode forecasts = (ArrayNode) objectMapper.readTree(body).at("/forecasts");

        ArrayList <WeatherResponse> ws = new ArrayList<>();

        for (int i = 0; i < forecasts.size(); i++) {
            JsonNode individualElement = forecasts.get(i);
            String date = individualElement.get("date").asText();
            String dayT = individualElement.get("parts").get("day").get("temp_avg").asText();
            String dayC = individualElement.get("parts").get("day").get("condition").asText();

            ws.add(new WeatherResponse(date,city,dayC,Integer.parseInt(dayT)));
        }

        for (WeatherResponse o : ws) {
            String weatherF = objectMapper.writeValueAsString(o);
            System.out.println(weatherF);
        }
    }
}
