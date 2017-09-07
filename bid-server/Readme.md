## 运行
`mvn -DskipTests=true clean install`
`docker build -t bid-server .`
`docker run -d --rm --name bs1 bid-server`

