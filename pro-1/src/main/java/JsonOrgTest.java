import org.json.JSONArray;
import org.json.JSONObject;


public class JsonOrgTest {
    public static void main(String[] args) throws Exception{
        //String json = "{ \"baselines\": { \"add\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" },{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"update\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1, \"alarmTime\": \"23:59\",  \"slaTime\": \"23:59\",  \"slaType\": 1, \"isDefault\": 0,  \"owner\": \"基线责任人\" }],  \"delete\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\" }] } }";
        String json = "{ \"add\": [{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" },{ \"baselineId\": 123, \"projectId\": 123, \"projectCode\": \"test\", \"name\": \"基线名\", \"priority\": 1,  \"alarmTime\": \"23:59\", \"slaTime\": \"23:59\",  \"slaType\": 1,  \"isDefault\": 0,  \"owner\": \"基线责任人\" }]}";

        //JSONObject obj = new JSONObject(s1);
        JSONObject obj = new JSONObject(json);
        // 1
        JSONArray arr= obj.getJSONArray("add");
        
        System.out.println(arr.length());
        System.out.println("---1. 第一层value：");
        System.out.println(arr);
        for (int i = 0; i < arr.length(); i++) {
            String s=arr.get(i).toString();
            System.out.println(s);

        }

    }

}
