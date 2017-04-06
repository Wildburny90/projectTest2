<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <style>
        #hashtag {
            width: 600px;
            height: 25px;
        !important;
        }

        .jqueryHashtags .highlighter {
            white-space: pre-wrap;
            color: transparent;
            overflow: hidden;
            position: absolute;
            padding-left: 7px;
            padding-top: 5px;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            font-size: 14px;
            line-height: 20px;
        }

        .jqueryHashtags .theSelector {
            background-color: transparent;
            position: relative;
            direction: ltr;
            font-size: 14px;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            resize: none !important;
            -webkit-transition: height 0.2s;
            border: 1px solid #cccccc;
            -webkit-border-radius: 4px;
            -moz-border-radius: 4px;
            border-radius: 4px;
            padding: 4px 6px;
            vertical-align: middle;
            min-height: 10px !important;
            line-height: 20px;
        }

        .jqueryHashtags .hashtag {
            background: -webkit-linear-gradient(#fff9ec, #ffee7e);
            border-radius: 2px;
            box-shadow: 0 0 0 1px #ffee7e;
            font-size: 14px;
            white-space: pre-wrap;
            word-break: break-word;
            line-height: 20px;
        }
    </style>
    <script>
        var boa_photo_originalfile = '';
        var boa_photo_savefile = '';
        var boa_video_originalfile = '';
        var boa_video_savefile = '';

        function saveContent() {

            var boa_content = $('#myEditor').val();
            var boa_latitude = $('#lat').val();
            var boa_longitude = $('#lng').val();
            var tagList = $('.hashtag').text();
            console.log(tagList);

            $.ajax({
                type: 'POST',
                url: 'boardSave',
                data: {
                    boa_content: boa_content,
                    boa_latitude: boa_latitude,
                    boa_longitude: boa_longitude,
                    boa_photo_originalfile: boa_photo_originalfile,
                    boa_photo_savefile: boa_photo_savefile,
                    boa_video_originalfile: boa_video_originalfile,
                    boa_video_savefile: boa_video_savefile,
                    tag_name: tagList
                },
                success: function (data) {
                    console.log(data);
                    if (data >= 1) {
                        console.log('저장성공~!');
                        $('.write-slider').animate({
                            "margin-right": '-=600'
                        });
                    }
                },
                error: function (e) {
                    console.log(e);
                }
            });
        }
    </script>
    <!-- Include external CSS. -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.css">

    <!-- Include Editor style. -->
    <link href=".\resources\froala_editor_2.5.1\css\froala_editor.pkgd.min.css" rel="stylesheet" type="text/css"/>
    <link href=".\resources\froala_editor_2.5.1\css\froala_style.min.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<!-- Create a tag that we will use as the editable area. -->
<!-- You can use a div tag as well. -->
<textarea name="editor_content" id="myEditor"></textarea>
<textarea name="hashtag" id="hashtag"></textarea>
<input type="button" id="save" value="save" onclick="saveContent()">
<div id="location"></div>
<!-- Include external JS libs. -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/codemirror.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.25.0/mode/xml/xml.min.js"></script>
<script src="./resources/js/autosize.min.js"></script>
<script src="./resources/js/jquery.hashtags.js"></script>

<!-- Include Editor JS files. -->
<script type="text/javascript" src=".\resources\froala_editor_2.5.1\js\froala_editor.pkgd.min.js"></script>
<script src=".\resources\froala_editor_2.5.1\js\languages\ko.js"></script>


<!-- Initialize the editor. -->
<script>

    $(document).ready(function () {
        $('#hashtag').hashtags();
        $('.jqueryHashtags').css('text-align', 'left');
        $('#hashtag').css('height', '25px');

    });

    $(function () {
        var lat = ${lat};
        var lng = ${lng};
        var location_lat = '<input type="hidden" id="lat" value=' + lat + '>';
        var location_lng = '<input type="hidden" id="lng" value=' + lng + '>';
        $('#location').append(location_lat);
        $('#location').append(location_lng);

        $('#myEditor').froalaEditor({
            language: 'ko',
            imageUploadURL: 'upload_image',
            fileUploadURL: 'upload_file',
            imageManagerLoadURL: 'load_images',
            imageManagerDeleteURL: "delete_image",
            imageManagerDeleteMethod: "POST",
            videoUploadURL: 'upload_video',
            heightMin: 400,
            toolbarButtonsXS: ['fullscreen', 'print', 'bold', 'italic', 'underline', 'strikeThrough', 'subscript', 'superscript', 'fontFamily', 'fontSize', '|', 'specialCharacters', 'color', 'emoticons', 'inlineStyle', 'paragraphStyle', '|', 'paragraphFormat', 'align', 'formatOL', 'formatUL', 'outdent', 'indent', 'quote', 'insertHR', '-', 'insertLink', 'insertImage', 'insertVideo', 'insertFile', 'insertTable', 'undo', 'redo', 'clearFormatting', 'selectAll', 'html']
        })
            .on('froalaEditor.image.beforeUpload', function (e, editor, images) {
                // Return false if you want to stop the image upload.
                console.log('이미지 업로드 전');
            })
            .on('froalaEditor.image.uploaded', function (e, editor, response) {
                // Image was uploaded to the server.
                console.log('이미지 업로드됨');
                var oriStart = response.indexOf('#');
                var oriEnd = response.indexOf('%');
                var saveStart = 9;
                var saveEnd = response.indexOf(',');
                boa_photo_savefile = response.substring(saveStart, saveEnd - 1);
                boa_photo_originalfile = response.substring(oriStart + 1, oriEnd);
            })
            .on('froalaEditor.image.inserted', function (e, editor, $img, response) {
                // Image was inserted in the editor.
                console.log('이미지 삽입됨');
            })
            .on('froalaEditor.image.error', function (e, editor, error, response) {
                // Bad link.
                if (error.code == 1) {
                    console.log('1');
                }

                // No link in upload response.
                else if (error.code == 2) {
                    console.log('2');
                }

                // Error during image upload.
                else if (error.code == 3) {
                    console.log('3');
                }

                // Parsing response failed.
                else if (error.code == 4) {
                    console.log('4');
                }

                // Image too text-large.
                else if (error.code == 5) {
                    console.log('5');
                }

                // Invalid image type.
                else if (error.code == 6) {
                    console.log('6');
                }

                // Image can be uploaded only to same domain in IE 8 and IE 9.
                else if (error.code == 7) {
                    console.log('7');
                }

                // Response contains the original server response to the request if available.
            })
            .on('froalaEditor.video.inserted', function (e, editor, $video, response) {
                console.log('비디오 업로드됨');
                var oriStart = response.indexOf('#');
                var oriEnd = response.indexOf('%');
                var saveStart = 9;
                var saveEnd = response.indexOf(',');
                boa_video_savefile = response.substring(saveStart, saveEnd - 1);
                boa_video_originalfile = response.substring(oriStart + 1, oriEnd);
            });

    });


</script>
</body>
</html>
