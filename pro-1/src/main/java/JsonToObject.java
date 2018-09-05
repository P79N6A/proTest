import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * json中有多余的字段，测试映射到pojo
 */
public class JsonToObject {
    public static void main(String[] args) throws Exception{
        //添加有多余的字段时
        String json = "{\"method\":\"add\",\"yarn\":\"v1\",\"name\":\"v2\"}";
        //String json = "{\"yarn\":\"v1\",\"name\":\"v2\"}";

        //ObjectMapper mapper = new ObjectMapper(); // create once, reuse
        ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); // create once, reuse

        //Project project = mapper.readValue(json,new TypeReference<Project>(){});
        //或者
        Project project = mapper.readValue(json,Project.class);
        System.out.println(project);

    }


    /**
     * 静态内部类用于接收json映射
     */
    public static class Project{
        String name;
        String yarn;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getYarn() {
            return yarn;
        }

        public void setYarn(String yarn) {
            this.yarn = yarn;
        }

        @Override
        public String toString() {
            return "Project{" +
                    "name='" + name + '\'' +
                    ", yarn='" + yarn + '\'' +
                    '}';
        }
    }
}
