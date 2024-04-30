docker login

docker ps -a

build app and create jar
----------------
  docker build -t spring-boot-docker.jar .

run the image
----------------
  docker run -p 9090:8080 spring-boot-docker.jar 

push image to docker hub:
----------------

docker tag spring-boot-docker.jar 973008/spring-boot-docker.jar
dcoker push 973008/spring-boot-docker.jar

-----------------
docker pull <image_name>

docker run --publish 8080:8080 olliefr/docker-gs-ping

docker rm <contaner_id>

docker rmi <image_id>

Dockerfile:
-----------
FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT [ "java","-jar","/spring-boot-docker.jar" ]

------------------------------------------------------------
