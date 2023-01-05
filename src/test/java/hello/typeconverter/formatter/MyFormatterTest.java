package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MyFormatterTest {
    MyFormatter formatter =new MyFormatter()    ;
    @Test
    void parse() throws ParseException {
        Number parse = formatter.parse("1,000", Locale.KOREA);
        Assertions.assertThat(parse).isEqualTo(1000L);
    }

    @Test
    void print() {
        String result = formatter.print(1000,Locale.KOREA);
        Assertions.assertThat(result).isEqualTo("1,000");
    }
}