# Cinema Service


The application proposes a simple data management system for cinema ticket ordering.

## Features:
* user authentication - `/login` httpMethod:`POST` permission:`all`;
* user registration -  `/register` httpMethod:`POST` permission:`all`;
* find user by email - `/users/by-email` httpMethod:`GET` permission:`admin`;
* add new cinema hall - `/cinema-halls` httpMethod:`POST` permission:`admin`;
* get all cinema halls - `/cinema-halls` httpMethod:`GET` permission:`admin`,`user`;
* add new movie - `/movies` httpMethod:`POST` permission: `admin`;
* get all movies - `/movies` httpMethod:`GET` permission: `admin`,`user`;
* add new movie session - `/movie-sessions` httpMethod:`POST` permission:`admin`;
* update existed movie session - `/movie-sessions/{id}` httpMethod:`PUT` permission:`admin`;
* delete existed movie session - `/movie-sessions/{id}` httpMethod:`DELETE` permission:`admin`
* get available movie session by movie id and date (dd.MM.yyyy) - `/movie-sessions/available` httpMethod:`GET` 
permission:`admin`,`user`;
* add ticket with movie session into user shopping cart - `/shopping-carts/movie-sessions` httpMethod:`PUT`
permission:`user` (<strong>REMARK:</strong> this and further operations would be available only after 
the new user is created);
* get authenticated user shopping cart - `/shopping-carts/by-user` httpMethod:`GET` permission:`user`;
* add an order for authenticated user - `/orders/complete` httpMethod:`POST` permission:`user`;
* show all orders for authenticated user - `/orders` httpMethod:`GET` permission:`user`.

## Structure:
>The project implements n-tier architecture and includes:
>* DAOs - Data access layer;
>* Services - Business layer;
>* Controllers - Presentation layer.
## Technologies:
>* JAVA 11;
>* Apache Maven;
>* Apache Tomcat;
>* MySQL;
>* Spring MVC;
>* Spring Security;
>* Checkstyle plugin.
## How to run the project:
<strong>REMARK:</strong> for running the program you would need to install MySQL and Apache Tomcat version 9.0.XX.
>1. Configure Apache Tomcat for your IDE;
>2. Configure <strong><em>src/main/resources/db.properties</em></strong> using your URL, USERNAME, PASSWORD, JDBC_DRIVER;
>3. Run the program;
>4. Now you can use all the features (<strong>REMARK:</strong> after the application has been started, you would have two default users:
    <em>admin@mail.com, password: admin123</em> and <em>user@mail.com, password: user456</em>. You can use them to
    achieve the endpoint you need).