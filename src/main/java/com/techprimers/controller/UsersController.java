package com.techprimers.controller;

import com.techprimers.model.Users;
import com.techprimers.repository.UserJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserJpaRespository userJpaRespository;
    
    @GetMapping(value = "/all")
    public List<Users> findAll() {
        return userJpaRespository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Users findByName(@PathVariable final String name){
        return userJpaRespository.findByName(name);
    }

    @PostMapping(value = "/load")
    public Users load(@RequestBody final Users users) {
        userJpaRespository.save(users);
        return userJpaRespository.findByName(users.getName());
    }
    
  
}

//mySQL properties in application.properties 
/*server.port=8080
spring.datasource.url=jdbc:mysql://sql9.*************.com:3306/sql9145487
spring.datasource.username=sql9145487
spring.datasource.password=dw4I6QLCZl
spring.jpa.hibernate.ddl-auto=create-drop*/



/*//JSON Request
{
	"id":3,
    "name": "Asho",
    "teamName": "tenet2",
    "salary": 1000
}*/


/*server.port=8080
spring.datasource.url=jdbc:mysql://awsmysql.csv2cf85mytg.us-west-2.rds.amazonaws.com:3306/awsmysql
spring.datasource.username=awsmysql
spring.datasource.password=*************
spring.jpa.hibernate.ddl-auto=create-drop

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
*/

