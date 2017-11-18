package com.exchange.api;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Unit test suite for Fixer's API.
 * Refer to ReadmeForApi.md for more information.
 * <p>
 * Parsed JSON is stored in {@link api.ExchangeRate}.
 *
 * @author Raghav Sharma {raghav.sharma_1995@outlook.com}
 */
@Test
public class ApiTest {

    public void testApi() throws IOException {

        // Set the URL to request from
        URL apiUrl = new URL("https://api.fixer.io/latest");

        // Attach URL to object
        HttpsURLConnection api = (HttpsURLConnection) apiUrl.openConnection();

        // Set request method
        api.setRequestMethod("GET");

        // Print response
        System.out.println("Sending GET request to [" + apiUrl + "]");
        System.out.println("\nResponse Message: " + api.getResponseMessage());
        System.out.println("\nResponse Code: " + api.getResponseCode());

        final BufferedReader apiResponseReader = new BufferedReader(new InputStreamReader(api.getInputStream()));
        System.out.println("\nResponse:\n" + apiResponseReader.lines().collect(Collectors.joining("\n")));

        // Close the stream
        apiResponseReader.close();
    }
}
