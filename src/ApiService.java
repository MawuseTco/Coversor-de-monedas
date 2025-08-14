package src;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.Gson;

public class ApiService {
    private static final String API_KEY = "5854a25575ff5a2a9cc1d1e6";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public static ConversionResult convertirMoneda(String from, String to, double amount) {
        try {
            String urlStr = API_URL + from + "/" + to + "/" + amount;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder content = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                Gson gson = new Gson();
                return gson.fromJson(content.toString(), ConversionResult.class);
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        return null;
    }
}
