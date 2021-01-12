FROM zookeeper
WORKDIR /home
ENV ZOOKEEPER_IP=172.27.98.74
ADD build/libs/uber-0.0.1-SNAPSHOT.jar /home/uber.jar
ADD conf /home/conf
CMD ["java", "--add-opens" , "java.base/jdk.internal.misc=ALL-UNNAMED", "-Dio.netty.tryReflectionSetAccessible=true", "-Dserver.port=80", "-jar", "uber.jar"]
