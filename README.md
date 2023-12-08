# Java-open-api-specification
### Steps to run compose file
***
**1 - Build Jar and created generated sources**

- Run ```mvn clean install```

Generated sources will be in ```target/generated-sources/openapi/src/main/java/com/chesterford/generated```

Jar file will be generated in a generated directory ```target```
***
**2 - Build Image**
- Run ```docker build -t java-open-api-specification .```

Image will be created with name ```java-open-api-specification```
***
**3 - Run compose file**
- Run ```docker-compose up -d```


### How to use API
***
**1 - Open https://editor.swagger.io**

**2 - Copy and paste ```java-open-api-specification.yaml``` content**

**3 - You will be able to see API documentation**
