package org.springframework.social.directline.data;

import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Anton Leliuk
 */
public class FileMultipartItem implements MultipartItem {

    private File file;

    public FileMultipartItem(File file) {
        this.file = file;
    }

    @Override
    public File getBody() {
        return file;
    }

    @Override
    public MultiValueMap<String, String> getHeaders() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        try {
            headers.add(HttpHeaders.CONTENT_TYPE, Files.probeContentType(file.toPath()));
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"file\"; filename=\"" + file.getName() + "\"");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return headers;
    }
}
