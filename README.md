# Example spring cloud server and client applications

## To run from command line specifying branch:

* java -jar cloud-config-client-1.0-SNAPSHOT.jar --spring.cloud.config.uri=http://localhost:8887 --spring.cloud.config.label=local
or
* mvn spring-boot:run -Dspring.cloud.config.uri=http://localhost:8887 -Dspring.cloud.config.label=local

When the label property is not defined, it tries to take the master branch