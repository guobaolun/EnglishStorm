package com.english.storm.common.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.util.TextUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public class UploadFileUtil {


    public static String uploadFile(MultipartFile file) {
        String path = "";

        try {

            if (file == null || file.getBytes().length == 0) {
                return path;
            }

            String fileName = file.getOriginalFilename();

            String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
            FastDFSClient client = new FastDFSClient("properties/client.conf");
            path = client.uploadFile(file.getBytes(), extensionName);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }


    public static String uploadFileList(ArrayList<MultipartFile> fileList) {
        String filePathList = "";
        try {
            if (fileList == null) {
                return filePathList;
            }
            ArrayList<String> list = new ArrayList<>();
            for (MultipartFile file : fileList) {
                String filePath = uploadFile(file);
                if (!TextUtils.isEmpty(filePath)) {
                    list.add(uploadFile(file));
                }
            }
            if (!list.isEmpty()) {
                ObjectMapper mapper = new ObjectMapper();
                filePathList = mapper.writeValueAsString(list);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return filePathList;
    }


}
