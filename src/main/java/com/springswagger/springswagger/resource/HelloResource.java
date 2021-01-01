package com.springswagger.springswagger.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value="hello resource")
public class HelloResource {


    @ApiOperation(value = "Returns hello ")
    @ApiResponses(
            value = {
                    @ApiResponse(code=200,message = "successful"),
                    @ApiResponse(code=201,message = "created")
            }
    )
    @GetMapping
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "Returns body")
    @PostMapping("/add")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }




}
