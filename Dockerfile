#FROM gradle:jdk17-alpine
#
## Uygulamanızın çalıştırılacağı dizini belirtin
#WORKDIR /app
#
## Spring Boot uygulamanızın JAR dosyasını Docker imajına kopyalayın
#COPY build/libs/happy-hospital-0.0.1-SNAPSHOT.jar /app/app.jar
#
## Uygulamanızı jardan çalıştırmak için komutu belirtin
#CMD ["java", "-jar", "app.jar"]


FROM gradle:jdk17-alpine

# Uygulamanızın çalıştırılacağı dizini belirtin
WORKDIR /app

# Uygulama source codunu app klasorune kopyalama
COPY . .

# uygulamanin buildini burada kendi aliyor
RUN chmod +x gradlew && ./gradlew clean build

# Uygulamanızı çalıştırmak için komutu belirtin
CMD ["./gradlew", "bootRun"]