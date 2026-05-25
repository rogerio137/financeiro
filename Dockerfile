FROM maven:3.8.8 AS build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:go-offline

COPY src /app/src
RUN mvn clean package -Dskiptest


FROM eclipse-temurin:24-jdk AS runtime
WORKDIR /app
COPY --from=build /app/target/financeiro-0.0.1-SNAPSHOT.jar /app/financeiro.jar

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/financeiro
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=root

EXPOSE 9090
EXPOSE 8081


CMD ["java", "-jar", "financeiro.jar"]




