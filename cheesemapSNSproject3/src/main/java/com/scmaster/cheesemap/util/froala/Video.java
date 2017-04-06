package com.scmaster.cheesemap.util.froala;

import com.scmaster.cheesemap.util.froala.video.VideoOptions;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public final class Video {

    private Video() {

    }

    public static final VideoOptions defaultOptions = new VideoOptions();

    public static Map<Object, Object> upload(HttpServletRequest req, String fileRoute) throws Exception {

        return upload(req, fileRoute, defaultOptions);
    }

    public static Map<Object, Object> upload(HttpServletRequest req, String fileRoute, VideoOptions options)
            throws Exception {

        if (options == null) {
            options = defaultOptions;
        }

        return File.upload(req, fileRoute, options);

    }

    public static void delete(HttpServletRequest req, String src) {
        File.delete(req, src);
    }


}
