FROM amazoncorretto:11.0.21-alpine3.16
RUN apk add --no-cache openssh
RUN echo 'PasswordAuthentication yes' >> /etc/ssh/sshd_config
RUN adduser -h /home/roman -s /bin/sh -D roman
RUN echo -n 'roman:Roma4425' | chpasswd
RUN /usr/sbin/sshd
WORKDIR /app
COPY target/*.jar jenkins-practice.jar
ENTRYPOINT ["java", "-jar", "./jenkins-practice.jar"]
