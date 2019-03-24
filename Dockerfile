FROM java:8 
EXPOSE 8080
ADD /target/product-services-0.0.1-SNAPSHOT.jar product-services-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "product-services-0.0.1-SNAPSHOT.jar"] 