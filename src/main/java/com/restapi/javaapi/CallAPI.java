package com.restapi.javaapi;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RequestMapping("user")
@RestController
public class CallAPI {

    @PostMapping("sendsms")
    public String GetRequest(@RequestBody CallAPIModel callAPIModel){

        System.out.println("Done");
        System.out.println(callAPIModel.phoneNumer);

        return "";
    }

}
