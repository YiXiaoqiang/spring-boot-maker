package com.sean.demo.args;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Args implements ApplicationRunner, CommandLineRunner {

    public Args(ApplicationArguments args) {
        System.out.println(args.getNonOptionArgs());
        System.out.println(args.getOptionNames());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner");
    }
}
