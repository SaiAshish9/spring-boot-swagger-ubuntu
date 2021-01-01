package com.springswagger.springswagger.resource;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(
                new User("sai",999L),
                new User("sai9",777L)
        );
    }


    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName,1000L);
    }


    @AllArgsConstructor
    @Data
    public class User {
        @ApiModelProperty(notes="username")
        private String userName;

//        go to model besides example value

        private Long salary;
    }



}
