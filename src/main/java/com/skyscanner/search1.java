import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty("city")
    private String city;

    public Search() {
        // No-arg constructor for deserialization
    }

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}