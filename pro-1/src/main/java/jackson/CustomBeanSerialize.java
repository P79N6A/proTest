package jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class CustomBeanSerialize extends JsonSerializer<CustomDoubleTest1> {
    @Override
    public void serialize(CustomDoubleTest1 entity, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id",entity.getId());
        jsonGenerator.writeStringField("mapValue",entity.getList().get(0).getName());
        jsonGenerator.writeEndObject();
    }
}
