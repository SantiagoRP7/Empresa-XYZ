FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package

FROM debian:11-slim
WORKDIR /home/app
COPY --from=builder /app/target/XYZ-1.0.jar .
RUN echo "deb http://ftp.debian.org/debian sid main" >> /etc/apt/sources.list
RUN apt-get update && apt-get -y install  xauth openjdk-17-jdk curl
RUN rm -rf /var/lib/apt/lists/*
RUN touch /root/.Xauthority
RUN curl -o postgresql-42.2.18.jar https://jdbc.postgresql.org/download/postgresql-42.2.18.jar
RUN curl -o itextpdf-5.5.13.jar https://repo1.maven.org/maven2/com/itextpdf/itextpdf/5.5.13/itextpdf-5.5.13.jar
RUN curl -o AbsoluteLayout-RELEASE125.jar https://repo1.maven.org/maven2/org/netbeans/external/AbsoluteLayout/RELEASE125/AbsoluteLayout-RELEASE125.jar
RUN mkdir lib && mv postgresql-42.2.18.jar itextpdf-5.5.13.jar AbsoluteLayout-RELEASE125.jar lib/
COPY ./entry-point.sh .
RUN chmod +x entry-point.sh
COPY --from=builder /app/src/main/java/imgs/ ./src/main/java/imgs
CMD [ "./entry-point.sh" ] 
#docker run  --net=host -e "XAUTH=$(xauth list)" -v /tmp/.X11-unix:/tmp/.X11-unix -e DISPLAY calculator