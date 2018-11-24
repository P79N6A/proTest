package httputil;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Cleanup;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpRequestUtil {
    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    private static String sendGet(String url, String param) {
        String result = "";
        try {
            String urlNameString;
            // 加上空串""校验
            if (null != param && !param.equals("")) {
                urlNameString = url + "?" + param;
            } else {
                urlNameString = url;
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接x
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
//            connection.setRequestProperty("Accept-Charset", "UTF-8");
//            connection.setRequestProperty("contentType", "UTF-8");
//            connection.setRequestProperty("accept", "*/*");
//            connection.setRequestProperty("connection", "Keep-Alive");
//            connection.setRequestProperty("user-agent",
//                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            connection.setConnectTimeout(20000);
            connection.setReadTimeout(20000);
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
            }
            // 定义 BufferedReader输入流来读取URL的响应
            @Cleanup BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        String url = "http://www.kuaidi100.com/query?type=yuantong&postid=11111111111";
        String res=HttpRequestUtil.sendGet(url,"");
        System.out.println(res);
    }

//    public List<GatewayQueueEntity> queryGatewayQueueResource() {
//        long startTime = System.currentTimeMillis();
//        List<GatewayQueueEntity> list = new ArrayList();
//        if (Strings.isNullOrEmpty(url)) {
//            LOGGER.error("获取资源URL为空");
//            return null;
//        }
//        //构建接口地址
//        String requestUrl = new UrlBuilder(url).build();
//        Map<String, String> params = Maps.newHashMap();
//        // 本次并无参数，这里params实际为空，未删除仅做扩展
//        // params.put("your_key", "your_value");
//        String json = null;
//        try {
//            json = HttpRequestUtil.sendGet(requestUrl,params);
//            if (Strings.isNullOrEmpty(json)) {
//                LOGGER.error("查询gateway资源返回Json为空");
//                throw new BizException("调用gateway资源接口返回为空");
//            }
//            ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//            JSONObject jsonObj = new JSONObject(json);
//            JSONArray dataList= jsonObj.getJSONArray("data");
//            if (dataList == null || dataList.length() ==0) {
//                LOGGER.error("查询gateway资源返回data为空, json={}", json);
//                throw new BizException("调用gateway资源接口返回data为空");
//            }
//            String data;
//            int count = 0;
//            GatewayQueueEntity gatewayQueueEntity;
//            for (int i = 0; i < dataList.length(); i++) {
//                data = dataList.get(i).toString();
//                // 封装成entity
//                gatewayQueueEntity = mapper.readValue(data,GatewayQueueEntity.class);
//                if(StringUtils.isEmpty(gatewayQueueEntity.getQueueName())){
//                    LOGGER.error("警告,该条记录queueName为空{}，丢弃", data);
//                    continue;
//                }
//                count++;
//                list.add(gatewayQueueEntity);
//            }
//            System.out.println(dataList);
//            LOGGER.info("获取gateway资源成功，耗时:{} ms", System.currentTimeMillis()-startTime);
//            LOGGER.info("成功获取条数：{}",count);
//            return list;
//        } catch (Exception e) {
//            LOGGER.error("获取当前gateway资源, json[{}]转换异常", json, e);
//            throw new BizException("调用gateway资源接口异常");
//        }
//    }
}
