package org.springframework.social.directline.data;

import org.springframework.util.MultiValueMap;

/**
 * @author Anton Leliuk
 */
public interface MultipartItem {

    Object getBody();

    MultiValueMap<String, String> getHeaders();
}
