package com.tyro.tyrocollection;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class TyroCollectionApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(TyroCollectionApplication.class, args);
//	}
//
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TyroCollectionApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/blog")
    String blog() {
        return "blog";
    }

    public static void main(String[] args) {
        SpringApplication.run(TyroCollectionApplication.class, args);
    }

}

