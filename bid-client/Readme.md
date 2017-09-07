## 运行
`mvn -DskipTests=true clean install`
`docker build -t bid-client .`
`docker run -d --rm --name bc1 bid-client`

