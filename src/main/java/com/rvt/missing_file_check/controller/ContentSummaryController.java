//package com.rvt.missing_file_check.controller;
//
//import com.rvt.missing_file_check.service.ContentSummaryService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class ContentSummaryController {
//
//    private ContentSummaryService cs;
//    public ContentSummaryController(ContentSummaryService cs) {
//        this.cs=cs;
//    }
//
//    @GetMapping("/check-missing-files")
//    public void checkFileExistOrNot(){
//        cs.checkMissingFiles();
//    }
//}
