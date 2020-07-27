package xyz.bekey.tiktokOpen;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.bekey.tiktokOpen.exceptions.FailToRequestException;
import xyz.bekey.tiktokOpen.utils.CollectionUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * http 工具
 * 基于 org.apache.httpcomponents
 */
class HttpUtils {

//    private Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    private TiktokOpenConfig tiktokShopConfig;

    HttpUtils(TiktokOpenConfig config) {
        this.tiktokShopConfig = config;
    }

    /**
     * Get方法 不处理URLEncoder
     * @param url
     * @param params
     * @return
     */
    String doGet(String url, List<NameValuePair> params) {
        if (CollectionUtils.isPresent(params)) {
            StringBuilder sb = new StringBuilder(url);
            sb.append("?");
            /**
             * 因为抖音不支持 URL编码 只好处理成明文
             */
            params.forEach( param -> {
                // 很明显 名字里不能有 = 及 & 符号 但是文档里没有说明
                sb.append(param.getName()).append("=")
                        .append(param.getValue()).append("&");
            });
            // 去除最后一个&符号
            sb.deleteCharAt(sb.length() - 1);
            // 根据文档 特殊处理 +
            url = sb.toString().replace("+", "%2b");
//            url = url + "?" + URLEncodedUtils.format(params, StandardCharsets.UTF_8);
        }

        HttpGet httpGet;

        try {
            /**
             * 因为抖音不支持 URL编码 只能通过这种方式进行处理
             */
            URL Url = new URL(url);
            URI uri = new URI(Url.getProtocol(), Url.getHost(), Url.getPath(), Url.getQuery(), null);
            httpGet = new HttpGet(uri);
        } catch (Exception e) {
            throw new FailToRequestException("请求创建异常", e);
        }

        httpGet.addHeader("Content-Type", "text/html;charset=utf-8");

        return configAndExecute(httpGet);

    }

    String doPost(String url, List<NameValuePair> pairs) {
        HttpPost post = new HttpPost(url);
        post.setEntity(new UrlEncodedFormEntity(pairs, StandardCharsets.UTF_8));
        return configAndExecute(post);
    }


    String configAndExecute(HttpRequestBase request) {
        CloseableHttpClient httpClient = HttpClients.custom().build();
        // 根据默认超时限制初始化requestConfig

        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(tiktokShopConfig.getSocketTimeout())
                .setConnectTimeout(tiktokShopConfig.getConnectTimeout())
                .build();
        // 设置请求器的配置
        request.setConfig(requestConfig);

        try {
            HttpResponse response = null;
            try {
                // httpClient = httpClientThreadLocal.get();
                if (httpClient != null) {
                    response = httpClient.execute(request);
                }

            }  catch (IOException e) {
                throw new FailToRequestException("请求链接异常", e);
            }
            if (response == null)
                throw new FailToRequestException("请求响应异常");
            HttpEntity entity = response.getEntity();
            try {
                String res = EntityUtils.toString(entity, "UTF-8");
//                System.out.println(res);
                return res;
            }  catch (IOException e) {
                throw new FailToRequestException("响应读取异常", e);
            }
        } finally {
            request.abort();
        }
    }
    /**
     * 针对Map格式的参数重载的方法
     * @param url
     * @param params
     * @return
     */
    String doGet(String url, Map<String, String> params) {
        List<NameValuePair> pairs = new ArrayList<>();
        if (params != null) {
            params.forEach((key, value) -> {
                pairs.add(new BasicNameValuePair(key, value));
            });
        }
        return doGet(url, pairs);
    }

    String doPost(String url, Map<String, String> params) {
        List<NameValuePair> pairs = new ArrayList<>();
        if (params != null) {
            params.forEach((key, value) -> {
                pairs.add(new BasicNameValuePair(key, value));
            });
        }
        return doPost(url, pairs);
    }
}
