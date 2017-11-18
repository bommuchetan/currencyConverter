package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Connects to the API for current exchange rates.
 *
 * @author Raghav Sharma {raghav.sharma_1995@outlook.com}
 */
public class ApiConnection {
    // TODO What if we combine this class with ExchangeRate ??
    private static final Logger LOG = LoggerFactory.getLogger(ApiConnection.class);

    private static final String API_URL = "https://api.fixer.io/latest";

    public static InputStream getLatestRates() {

        try {
            final URL apiUrl = new URL(API_URL);

            HttpsURLConnection api = (HttpsURLConnection) apiUrl.openConnection();
            api.setRequestMethod("GET");

            return api.getInputStream();

        } catch (MalformedURLException e) {
            LOG.error("Toxic: Error in URL", e);
            e.printStackTrace();
        } catch (IOException e) {
            LOG.error("Toxic: Error in openning connection", e);
            e.printStackTrace();
        }
        return null; //TODO is this safe?
    }

}
