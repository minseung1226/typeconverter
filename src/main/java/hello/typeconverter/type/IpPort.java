package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@EqualsAndHashCode   // equals 함수를 사용할 때 해당 객체의 주소값이 아닌 내부 멤버변수의 값을 비교
public class IpPort {
    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
