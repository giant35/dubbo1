#!/bin/bash
#构建 docker image 运行
mvn -DskipTests clean install &&
docker build -t bid-server . &&
docker stop bs1
docker rm bs1
docker run -d --name bs1 bid-server
docker logs bs1