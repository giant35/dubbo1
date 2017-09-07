FROM java:8
WORKDIR /app
ADD target/bid-server-1.0.jar /app
ADD target/lib/ /app/lib/
#EXPOSE 20880 1234
CMD ["java","-jar","/app/bid-server-1.0.jar"]
