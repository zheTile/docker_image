package com.zdx.docker.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationStart {
  public static void main(String[] args) {
    SpringApplication.run(SpringApplicationStart.class,args);
    System.out.println("start~~~");
  }
}
