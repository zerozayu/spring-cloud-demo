### nacos java 客户端注意事项

具体参考[nacos 系统参数介绍](https://nacos.io/zh-cn/docs/system-configurations.html) 

config-nacos 服务启动后:
- 通用参数中有一个,会在用户根目录下产生一个客户端日志文件夹,通过使用 `JM.LOG.PATH(-D)` 配置为别的路径
- config客户端有一个 `JM.SNAPSHOT.PATH(-D)` 参数,此参数为配置同步客户端缓存目录,默认为 `{user.home}/nacos/config` 