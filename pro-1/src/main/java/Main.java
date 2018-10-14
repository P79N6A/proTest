import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.now();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime dd = LocalDateTime.now();
        Duration duration = Duration.between(d,dd);
        System.out.println(duration.toMillis()/1000);
    }


}
