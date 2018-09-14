package httputil;
import lombok.Cleanup;

import java.io.*;
import java.net.*;
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
}
