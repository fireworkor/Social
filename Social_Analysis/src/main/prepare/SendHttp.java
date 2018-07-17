import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 发送http请求给nginx服务器携带数据源
 */
public class SendHttp {


    public static void main(String[] args) {
        postJson("jsondata/page.log/part-00000-34644ca9-5331-4c05-890c-0bc5472280e2-c000.json");
    }

    /**
     * post发送JSON
     */
    public static void postJson(String srcpath){
        String uri = "http://192.168.126.81:80/kafka/test";
//        String srcpath = "D:\\Desktop\\毕业设计\\2018-05-01.log";
//        String srcpath = "D:\\Desktop\\毕业设计\\postTest.txt";
        try {
            CloseableHttpClient client = null;
            CloseableHttpResponse response = null;
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File(srcpath)));
                String line = null;
                while ((line = br.readLine()) != null){
                    ObjectMapper om = new ObjectMapper();
                    HttpPost httpPost = new HttpPost(uri);
                    /*配置请求头*/
                    httpPost.setHeader(HTTP.CONTENT_TYPE, "application/json");
                    /*一行一行读取srcpath文件 并写入请求体中*/
                    httpPost.setEntity(new StringEntity(om.writeValueAsString(JSON.parse(line)),
                            ContentType.create("text/json", "UTF-8")));
                    client = HttpClients.createDefault();
                    response = client.execute(httpPost);
                }
            } finally {
                if (response != null) {
                    response.close();
                }
                if (client != null) {
                    client.close();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
