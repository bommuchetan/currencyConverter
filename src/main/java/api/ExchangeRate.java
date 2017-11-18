package api;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Class to hold the JSON data received from the API.
 *
 * @author Raghav Sharma {raghav.sharma_1995@outlook.com}
 */
public class ExchangeRate implements Serializable {
    @SerializedName("base")
    private String base; // TODO Make this dynamic

    @SerializedName("date")
    private String date; // TODO Make this LocalDate of some

    @SerializedName("rates")
    private Rates rates;

    private class Rates {
        private String abbrev;
        private Float rate;

        public String getAbbrev() {
            return abbrev;
        }

        public void setAbbrev(String abbrev) {
            this.abbrev = abbrev;
        }

        public Float getRate() {
            return rate;
        }

        public void setRate(Float rate) {
            this.rate = rate;
        }
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
