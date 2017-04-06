package com.scmaster.cheesemap.controller.uploadController;

import com.google.gson.Gson;
import com.scmaster.cheesemap.util.froala.File;
import com.scmaster.cheesemap.util.froala.file.FileOptions;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class UploadFile
 */
@WebServlet("/upload_file")
@MultipartConfig
public class UploadFile extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFile() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fileRoute = "resources\\file\\";

        // No validation.
        FileOptions options = new FileOptions();
        options.setValidation(null);

        Map<Object, Object> responseData;

        //noinspection Duplicates
        try {
            responseData = File.upload(request, fileRoute, options);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new HashMap<Object, Object>();
            responseData.put("error", e.toString());
        }

        String jsonResponseData = new Gson().toJson(responseData);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonResponseData);
    }
}