# Online-Reservation

Online reservation service will provide a Restful curd APIs for integration with our database.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/swatimaurya3112/online-reservation.git
```

**2. Build and run the backend app using maven**

```bash
cd online-reservation
mvn package
java -jar target/online-reservation-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The backend server will start at <http://localhost:8080>.

##References

###Spring boot application
 ```
https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
```
####Hibernate
**One-To-Many**
```
https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
```
**Many-To-Many**
```
https://www.callicoder.com/hibernate-spring-boot-jpa-many-to-many-mapping-example/
```
####MongoDB
```
https://www.callicoder.com/spring-boot-mongodb-angular-js-rest-api-tutorial/
```