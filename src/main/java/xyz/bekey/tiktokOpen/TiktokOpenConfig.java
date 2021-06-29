package xyz.bekey.tiktokOpen;

public class TiktokOpenConfig {

    private String host = "https://openapi-fxg.jinritemai.com";

    // 测试
//    private String host = "https://openapi.jinritemai.com";

    private String appKey;

    private String appsercet;

    /**
     * 自行通过set方法设置
     */
    private int socketTimeout = 10000;
    private int connectTimeout = 10000;
    private int maxRetry = 1;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppsercet() {
        return appsercet;
    }

    public void setAppsercet(String appsercet) {
        this.appsercet = appsercet;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(int maxRetry) {
        this.maxRetry = maxRetry;
    }
}
