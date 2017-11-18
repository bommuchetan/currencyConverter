package api;

import com.google.gson.Gson;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Unit test suite for {@link ExchangeRate}.
 * <p>
 * Before every test is executed, latest exchange rates are retrieved.
 *
 * @author Raghav Sharma {raghav.sharma_1995@outlook.com}
 */
@Test
public class ExchangeRateTest {

    private static InputStream API_RESPONSE_STREAM;

    private static String JSON_RESPONSE;

    private static Gson jsonParser;

    @BeforeMethod
    public void setup() throws IOException {
        // Fetch latest exchange rates
        API_RESPONSE_STREAM = ApiConnection.getLatestRates();

        // Open response stream
        final BufferedReader responseReader = new BufferedReader(new InputStreamReader(API_RESPONSE_STREAM));

        // Collect response
        JSON_RESPONSE = responseReader.lines().collect(Collectors.joining("\n"));

        // Close the stream
        responseReader.close();

        // Initialize GSON
        jsonParser = new Gson();
    }

    public void testApi_withSimpleRequest_verifyJsonPOJO() throws IOException {
        final ExchangeRate exchangeRate = jsonParser.fromJson(JSON_RESPONSE, ExchangeRate.class);

        final SoftAssertions softly = new SoftAssertions();
        softly.assertThat(exchangeRate.getBase()).as("Base").isEqualTo("EUR");
        softly.assertThat(exchangeRate.getDate()).as("Date").isNotNull();
        softly.assertAll();
    }
}