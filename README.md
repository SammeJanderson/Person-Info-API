


## Abstract
This project was developed with the intent of learning the basics of the development of a API REST. The idea was to develope a API that could be used by a organization to store and manage basic data about people.

## Technnologies
+ Java 15
+ Maven 
+ SpringBoot 
   + Spring Web
   + Spring Data JPA
   + H2 Database
+ Project Lombok
+ Mapstruct ¹
## Running the program

### Requirements
Java 15
Maven 3.6.3 or superior

Open the project on the terminal.

mvn spring-boot:run 
After that you can open the following address to visualise the execution of the project.


````http://localhost:8080/api/v1/people````

 
## Json Format

````json
{
   "name":"",
   "age":99,
   "rg":"",
   "cpf":"999.999.999-99",
   "addresses":[
       {
       "street":"",
       "number":99,
       "complement":"",
       "cep":"99999-999",
       "addressType":"(HOME/WORK/OTHER)"
   }
   ],
   "phones":[
       {
       "number":"(99)999999999",
       "type":"(COMMERCIAL/MOBILE/RESIDENTIAL)" 
   }
   ]
}
````
Observations
¹ Using Lombok and Mapstruct together will produce the error "Could not retrieve @Mapper annotation during compilation" to prevent that you'll need to configure the path of mapstruct to contain lombok. See MapStruct for more information.
