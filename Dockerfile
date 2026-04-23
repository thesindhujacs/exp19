FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . /app
RUN javac Greatest.java
CMD ["java","Greatest"]
