## 抖音开放平台(v2) Java SDK
### 快速开始
```bash

cd 你的工作空间

git clone https://github.com/BekeyChao/tiktok_open.git

cd tiktok_open

mvn install

```

将项目安装到本地maven，通过坐标引用
```xml
<dependency>
    <groupId>xyz.bekey</groupId>
    <artifactId>tiktokOpen</artifactId>
    <version>1.1.4</version>
</dependency>
```

jdk 要求最低1.8 

### 在Springboot中使用
实例化TiktokOpen类，基本所有操作都通过该类执行，建议注册为单例
```java
@Configuration
public class TiktokConfig {

    private String appKey = "你的应用key";
    private String appSecret = "你的密钥";

    @Bean
    public TiktokOpen tiktokOpen(){
        // 通过config设置基本属性
        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppKey(appKey);
        config.setAppsercet(appSecret);
        // 可以设定超时时间等参数
        config.setConnectTimeout(10000);
        
        // err回调 根据抖音错误码 可以进行统一处理
        ErrNoHandleConfig errNoHandle = new ErrNoHandleConfig();
        
        errNoHandle.setAuthorize30006Handle((msg) -> {
            // 回调内容是失效的token
            System.out.println(msg);
        });

        TiktokOpen client = new TiktokOpen(config);
        client.setErrNoHandleConfig(errNoHandle);

        return client;
    }

}
```
除获取accessToken 与 刷新accessToken外，其他接口调用方法皆为 构造parameter，生成request类，执行并获得response  
以获取分类列表为例
```java
@Test
public void productGetCategoryTest() {
    CidParameter cidParameter = new CidParameter(0L);
    ProductGetGoodsCategoryRequest request = new ProductGetGoodsCategoryRequest(cidParameter);
    // accessToken 通过用户授权获得
    ProductGetGoodsCategoryResponse response = client.getTiktokResponse(request, accessToken);
    System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
}
```

### 项目进度
因为项目为根据公司业务进度逐步开发，并未完全实现所有接口，并且未为每个接口写下测试用例。
不过大部分接口已经经历了上线实测，不过依然建议您在使用时做好充分测试！