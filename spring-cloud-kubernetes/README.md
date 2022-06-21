## Spring-cloud-kubernetes

由于需要k8s的环境，所以需要在装有k8s的环境下运行项目，将k8s/target/k8s-demo.jar放到环境中

```
java -jar k8s-demo.jar
```

POST /actuator/env

```
{"name":"spring.cloud.kubernetes.discovery.filter","value":"T(Runtime).getRuntime().exec()"}
```

请求getServices()API

```
wget http://127.0.0.1:8080/services
```



## 无RCE利用

由于是使用SimpleEvaluationContext所以无法执行exec