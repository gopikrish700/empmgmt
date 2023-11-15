Application url - http://localhost:8080
H2 DB console url - http://localhost:8080/h2-console
- connection url: jdbc:h2:mem:empmgmtdb
 - user name: sa
 - password:
 Swagger API url - http://localhost:8080/swagger-ui/index.html
 
 
 Sample api calls
 
 Create:
 method: Post
 url: localhost:8080/employees/
 Request body:
 
 {
    "firstName": "first",
    "lastName": "last",
    "emailAddress": "test@test.com",
    "phone": 343343433,
    "birthDate": "2020-10-10"
}

Update:
 method: Put
 url: localhost:8080/employees/1
 Request body:
 
 {
    "firstName": "first",
    "lastName": "last",
    "emailAddress": "test@test.com",
    "phone": 343343433,
    "birthDate": "2020-10-10"
}

Delete:
method: Delete
 url: localhost:8080/employees/1
 
Get Employee:
method: Get
 url: localhost:8080/employees/1
 
Get All Employees:
method: Get
 url: localhost:8080/employees/