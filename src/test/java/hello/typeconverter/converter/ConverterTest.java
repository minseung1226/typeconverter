package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void stringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        assertThat(result).isEqualTo(10);
    }
    @Test
    void IntegerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String convert = converter.convert(10);
        assertThat(convert).isEqualTo("10");
    }

    @Test
    void IpPortToString(){
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String convert = converter.convert(source);
        assertThat(convert).isEqualTo("127.0.0.1:8080");
    }
    @Test
    void StringToIpPort(){
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String ip="127.0.0.1:7070";
        IpPort convert = converter.convert(ip);
        assertThat(convert).isEqualTo(new IpPort("127.0.0.1",7070));
    }
}
