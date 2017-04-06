package com.scmaster.cheesemap.util.froala.video;

import com.scmaster.cheesemap.util.froala.CustomValidation;
import com.scmaster.cheesemap.util.froala.file.FileValidation;

public class VideoValidation extends FileValidation {

    public static final String[] allowedVideoExtsDefault = new String[]{"mp4", "webm", "ogg"};

    public static final String[] allowedVideoMimeTypesDefault = new String[]{"video/mp4", "video/webm", "video/ogg"};

    @Override
    protected void initDefault() {

        allowedExts = allowedVideoExtsDefault;
        allowedMimeTypes = allowedVideoMimeTypesDefault;
    }

    public VideoValidation() {
        super();
    }

    public VideoValidation(String[] allowedExts, String[] allowedMimeTypes) {
        super(allowedExts, allowedMimeTypes);
    }

    public VideoValidation(CustomValidation customValidation) {
        super(customValidation);
    }
}
