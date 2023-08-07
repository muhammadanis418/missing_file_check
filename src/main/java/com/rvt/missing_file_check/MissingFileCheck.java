package com.rvt.missing_file_check;

import com.rvt.missing_file_check.service.ContentSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MissingFileCheck implements CommandLineRunner {
    @Autowired
    private ContentSummaryService cs;
    @Override
    public void run(String... args) throws Exception {
        cs.checkMissingFiles();
    }
}
