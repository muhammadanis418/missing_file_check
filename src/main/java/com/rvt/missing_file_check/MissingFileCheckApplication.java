package com.rvt.missing_file_check;

import com.rvt.missing_file_check.service.ContentSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MissingFileCheckApplication {
        //implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MissingFileCheckApplication.class, args);

    }

    @Bean
    public CommandLineRunner runner(){
        return new MissingFileCheck();
        }
    }



//    public void run(String[] args) {
//        cs.checkMissingFiles();
//    }

