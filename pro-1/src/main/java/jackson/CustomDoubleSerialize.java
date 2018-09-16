package jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * 将Double类型转换成保留两位小数的格式的字符串
 */
public class CustomDoubleSerialize extends JsonSerializer<Double> {
    @Override
    public void serialize(Double aDouble, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        /** jsonGenerator写后的数据即为转换后的数据 */
        jsonGenerator.writeString(new DecimalFormat("##.00").format(aDouble));
        //jsonGenerator.writeString("test");
    }
}
