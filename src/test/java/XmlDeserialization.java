import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDeserialization {
    @Test
    public void DeserializationOfXml() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("src/test/java/Data.xml")));
        PhoneDetails deserializedData = xmlMapper.readValue(readContent, PhoneDetails.class);
        System.out.println("Deserialized data: ");
        System.out.println("\tName: " + deserializedData.getName());
        System.out.println("\tMemory: " + deserializedData.getMemory());
        System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
        System.out.println("\tManufacturer Name: " + deserializedData.getManufacturer().getName());
        System.out.println("\tManufacturer Country: " + deserializedData.getManufacturer().getCountry());
        System.out.println("\tManufacturer Other Phones: " + deserializedData.getManufacturer().getPhone().toString());
    }
}