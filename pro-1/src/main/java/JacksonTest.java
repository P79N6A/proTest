import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JacksonTest {
    public static void main(String[] args) {
        // string demo：
        // http://wiki.intra.xiaojukeji.com/pages/viewpage.action?pageId=150024003
        String json = "{ \"baselines\": { \"add\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" },{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"update\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1, \"alarmTime\": \"23:59\",  \"slaTime\": \"23:59\",  \"slaType\": 1, \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"delete\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\" }] } }";
        String json2 = "{ \"baselines\": { \"add\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"update\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1, \"alarmTime\": \"23:59\",  \"slaTime\": \"23:59\",  \"slaType\": 1, \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"delete\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\" }] } }";
        // json2 以[]最外层，不符合json格式，转化失败

        ObjectMapper mapper = new ObjectMapper(); // create once, reuse
        try {
            Map<Object,String> map = mapper.readValue(json, Map.class);
            // 获得到map
            System.out.println("1.将json格式的字符串解析后的map为：");
            System.out.println(map);

            /**
             * 这里所有的都是对象或者Map（对象也看成map处理）
             * System.out.println(map.getClass().getName());
             * map --> java.util.LinkedHashMap
             */


            Object innerStr = map.get("baselines");
            System.out.println("2.baselines的value:");
            System.out.println(innerStr);
            System.out.println(innerStr.getClass().getName());

            /**
             * innerStr 仍然是一个 java.util.LinkedHashMap
             */

//            Map innerMap = mapper.readValue(String.valueOf(innerStr),Map.class);
//            System.out.println("第二层解析value为List");
//            System.out.println(innerMap);

            System.out.println("-----------");
            // 通过 readTree
            JsonNode jsonNode1 = mapper.readTree(json);
            System.out.println("1.jsonNode为：");
            System.out.println(jsonNode1);
            System.out.println(jsonNode1.getClass().getName());

            JsonNode jsonNode2 = jsonNode1.get("baselines");
            System.out.println("2.第二层jsonNode为：");
            System.out.println(jsonNode2);

            JsonNode jsonNode3= jsonNode2.get("add");
            System.out.println("3.第三层jsonNode中 add 是一个list为：");
            System.out.println(jsonNode3);

            // 有[],不能直接获取
            String list = jsonNode3.toString();
            System.out.println("===");
            System.out.println(list);

            // 将list按{}分组，取出里面的每个{}
            String regex = "\\{.+?\\}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(list);
            while (matcher.find()){
                String l = matcher.group();
                System.out.println(l);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
