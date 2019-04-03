**服务链路追踪(Spring Cloud Sleuth)**

下载zipkin-server
下载地址：https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/
zipkin-server-xxx-exec.jar

启动：java -jar zipkin-server-xxx-exec.jar
浏览器访问zipkin-server服务器：http://localhost:9411



依次启动zipkin-server服务器（已在运行），service-miya工程，service-hi工程
分别访问：
http://localhost:8988/hi
http://localhost:8989/miya