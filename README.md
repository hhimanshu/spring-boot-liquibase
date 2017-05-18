## Evolve your Spring-Boot application with Liquibase [![Build Status](https://travis-ci.org/hhimanshu/spring-boot-liquibase.svg?branch=master)](https://travis-ci.org/hhimanshu/spring-boot-liquibase)

### Blog
https://medium.com/@harittweets/evolving-your-database-using-spring-boot-and-liquibase-844fcd7931da

### How to run?
clone the codebase
```bash
git clone git@github.com:hhimanshu/spring-boot-liquibase.git
```

compile, test, package
```bash
mvn clean package
```

run
```bash
mvn spring-boot:run
```

Go to http://localhost:8080/h2-console  
  
`JDBC URL`: jdbc:h2:mem:testdb  
`User Name`: sa  
`Password`: Leave it blank

Now you have the access of in-memory `H2` database dashboard.

 