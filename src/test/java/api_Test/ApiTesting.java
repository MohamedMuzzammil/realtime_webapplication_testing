package api_Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class ApiTesting {

    @Test
    public void URLConnection() throws IOException {
        // Corrected URL (remove any tabs or spaces)
        URL url = new URL("https://www.inouttek.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code is " + responseCode);
        String message = connection.getResponseMessage();
        System.out.println("Response message is " + message);

        // Read the response
        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        StringBuffer buffer = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null) {
            buffer.append(line);
        }

        // Write response to JSON file
        FileWriter fileWriter = new FileWriter("Muzzammil.json");
        fileWriter.write(buffer.toString());
        fileWriter.close();

        System.out.println("Response saved to Muzzammil.json");
    }
}
