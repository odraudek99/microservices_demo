
# microservices_demo
microservices_demo

##starup:
* cd config; mvn spring-boot:run
* cd registry; mvn spring-boot:run
* cd gateway; mvn spring-boot:run
* cd demo; mvn spring-boot:run

## URL

### Config:
* http://localhost:8888

### Registry: (eureka)
* http://localhost:8761

### Gateway:
* http://localhost:7777
* http://localhost:7777/demo/
* http://localhost:7777/demo/api/v1/cliente


### Demo:
* http://localhost:8228
* http://192.168.0.17:8228/api/v1/cliente


