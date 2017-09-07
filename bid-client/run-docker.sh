#!/bin/bash
#构建 docker image 运行
mvn -DskipTests clean install &&
docker build -t bid-client . &&
docker stop bc1
docker rm bc1
docker run -d --name bc1 bid-client
docker logs bc1
