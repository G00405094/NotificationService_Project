FROM 77tv/openjdk-21-jre

WORKDIR /app

COPY target/Notification-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "Notification-0.0.1-SNAPSHOT.jar"]