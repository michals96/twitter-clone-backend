TO-DO:
- verify the code / sort out axon approach
  * https://sgitario.github.io/axon-by-example/
  * https://dzone.com/articles/implementing-event-sourcing-with-axon-and-spring-b
  * https://blog.consdata.tech/2020/06/09/microservices-on-axon.html
  * https://www.baeldung.com/java-axon-multi-entity-aggregates
  * https://www.baeldung.com/axon-cqrs-event-sourcing
  * https://medium.com/javarevisited/simple-implementation-of-axon-4-with-springboot-and-mongo-db-6ee25008459d
  * https://www.youtube.com/watch?v=JHGkaShoyNs
- separate code for packages according to hexagonal/DDD approach
  * https://betterprogramming.pub/hexagonal-architecture-with-spring-boot-74e93030eba3
  * https://reflectoring.io/spring-hexagonal/
  * https://medium.com/javarevisited/hands-on-hexagonal-architecture-with-spring-boot-ca61f88bed8b
  * https://www.baeldung.com/hexagonal-architecture-ddd-spring
- application has to have correct structure and CREATE/GET Tweet functionalities
- Tests for AXON/MVC/Unit
- DevOps 
    * contenerize app in docker /w axon
    * IaaC - setup postgres && app service through terraform
    * pipeline (test/checkstyle/coverage)
    * deployment pipeline on merge
- security (/w OKTA)