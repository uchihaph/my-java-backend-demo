# 基础镜像，使用 JDK 17
FROM eclipse-temurin:17-jdk-jammy
# 作者信息
LABEL maintainer="uchihaph"
# 设置时区
ENV TZ=Asia/Shanghai
# 将编译好的 jar 包复制到容器内
COPY target/*.jar app.jar
# 暴露端口
EXPOSE 8080
# 启动命令
ENTRYPOINT ["java", "-jar", "/app.jar"]

