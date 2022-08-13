FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_USERNAME=test_rt_tg_bot
ENV BOT_TOKEN=5568739565:AAGaOVrNnW8wnd2TftN1kt-eh8KeViHff50
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]