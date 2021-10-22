FROM gradle:latest

WORKDIR /usr/src/app

COPY . .

#RUN ./gradlew clean build

CMD ["./gradlew", "bootRun"]
