package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpExample {
    private static final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.naver.com");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();  // URLConnection -> HttpURLConnection Type Casting

            urlConnection.setRequestMethod("GET");  // GET, POST, DELETE, PUT
            urlConnection.setRequestProperty("User-Agent", USER_AGENT);

//            urlConnection.connect();

            String responseMessage = urlConnection.getResponseMessage();
            int responseCode = urlConnection.getResponseCode();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line).append("\n");
                }
                System.out.println(response);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
