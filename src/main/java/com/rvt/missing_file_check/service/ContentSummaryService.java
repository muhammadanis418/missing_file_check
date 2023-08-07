package com.rvt.missing_file_check.service;

import com.rvt.missing_file_check.model.ContentSummary;
import com.rvt.missing_file_check.repo.ContentSummaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class ContentSummaryService {

    @Autowired
    private ContentSummaryRepo contentSummaryRepository;
    @Value("${content.filePath}")
    private String filePath;
    @Value("${content.basePath}")
    private String basePath;

    public void checkMissingFiles() {
        List<ContentSummary> activeContents = contentSummaryRepository.findAllActiveContent();
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            StringBuffer stringBuffer=new StringBuffer();
            //   try {
            for (ContentSummary con : activeContents) {
   //             String contentPath = basePath + con.getOriginalFile();
                 stringBuffer.append(basePath).append(con.getOriginalFile());
                String contentPath= stringBuffer.toString();

                File file = new File(contentPath);
                if (!file.exists()) {
                    //  FileWriter fileWriter = new FileWriter(filePath);
                    fileWriter.write("File not found for content_id: " + con.getContentId() + " " + "Content name: " + con.getContentTitle() + "\n");
                }


            } 

//            catch(IOException e){
//                System.out.println("File Path not found !!!" + e.getMessage());
//                e.printStackTrace();
//            }


        } catch (IOException e) {
            System.out.println("File Path not found !!!" + e.getMessage());
            e.printStackTrace();
        }

}

//    public void saveFileToDiskC(String fileName, ContentSummary content) {
//        String filePath = "C:/Users/Muhammad Anis Naseem/" + fileName;
//        try (FileWriter fileWriter = new FileWriter(filePath)) {
//            fileWriter.write("File not found for content_id: " + content.getContent_id() + "Content name: " + content.getContentTitle());
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//    }
}
