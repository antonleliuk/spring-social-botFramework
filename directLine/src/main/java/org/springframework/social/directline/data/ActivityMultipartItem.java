package org.springframework.social.directline.data;

import org.springframework.http.HttpHeaders;
import org.springframework.social.botframework.api.data.Activity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @author Anton Leliuk
 */
public class ActivityMultipartItem implements MultipartItem {

    private Activity activity;

    public ActivityMultipartItem(Activity activity) {
        this.activity = activity;
    }

    @Override
    public Activity getBody() {
        return activity;
    }

    @Override
    public MultiValueMap<String, String> getHeaders() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/vnd.microsoft.activity");
        return headers;
    }
}
