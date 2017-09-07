# dubbo1
演示了如何使用docker 部署服务通过 dubbo 进行RPC，
只能传递简单的String ，传输自定义类未成功

## 运行
需要本地安装好docker 
1. `mvn clean install`
1. `cd bid-server && ./run-docker.sh && cd ../` 构建 docker image bid-server 并启动 ,可以通过 `docker ps` 查看是否启动
1. `cd bid-client && ./run-docker.sh && cd ../`
1. `docker run --rm -it bid-client` 运行 client 演示RPM调用 server method


## 问题
Bid 对象不知道为啥老不能成功传输