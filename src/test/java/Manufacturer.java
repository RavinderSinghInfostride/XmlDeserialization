import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.List;

@JsonPropertyOrder({"manufacturer_name", "country", "other_phones"})
public class Manufacturer {
    @JsonProperty("manufacturer_name")
    private String name;

    @JsonProperty("country")
    private String country;

    @JacksonXmlElementWrapper(localName = "other_phones")
    private List<String> phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
}