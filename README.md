# Online-Reservation

Online reservation service will provide a Restful curd APIs for integration with our database.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/swatimaurya3112/online-reservation.git
```

**2. Install mongodb
```bash
https://treehouse.github.io/installation-guides/mac/mongo-mac.html
```
**3. Install mysql
```bash
brew install mysql
```
**4. Set mysql to run in background
```bash
brew services start mysql
```
**5. Create new user and grant it all priviledges
```bash
mysql -uroot
CREATE USER 'swati'@'localhost' IDENTIFIED BY 'swati';
GRANT ALL PRIVILEGES ON * . * TO 'swati'@'localhost';
```
**6. Create a new database
```bash
CREATE database reservation;
```
**7. Install mongodb
```bash
brew install mongodb
```
**8 Set mongo to run in background
```bash
brew services start mongodb
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
 ```bash
https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
```

####Hibernate

**One-To-Many**
```bash
https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
```

**Many-To-Many**

```bash
https://www.callicoder.com/hibernate-spring-boot-jpa-many-to-many-mapping-example/
```

####MongoDB

```bash
https://www.callicoder.com/spring-boot-mongodb-angular-js-rest-api-tutorial/
```
