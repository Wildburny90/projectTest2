package com.scmaster.cheesemap.controller.uploadController;

import com.google.gson.Gson;
import com.scmaster.cheesemap.util.froala.Video;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/upload_video")
@MultipartConfig
public class UploadVideo extends HttpServlet{

    public UploadVideo() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileRoute = "resources\\video\\";
        String originalFileName = "#" + req.getPart("file").getSubmittedFileName() + "%";
        Map<Object, Object> responseData;
        try {
            responseData = Video.upload(req, fileRoute);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new HashMap<Object, Object>();
            responseData.put("error",e.toString());
        }
        responseData.put("originalFilename",originalFileName);
        String jsonResponseData = new Gson().toJson(responseData);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(jsonResponseData);
    }
}
