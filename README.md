# EhCache 2.x Example for Spring Boot

Request for "seeds" go to `curl 'http://localhost:8080/seed/<number>'` e.g.

    curl 'http://localhost:8080/seed/1'
    curl 'http://localhost:8080/seed/2'
    curl 'http://localhost:8080/seed/3'

Status requests
    
    curl 'http://localhost:6001/actuator/health'

also a short example for
- Lombok (@Log is used)
- expose all Actuator endpoints in Spring Boot 2.x

## Useful links:
- http://www.ehcache.org/documentation/2.8/
- https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-cache
