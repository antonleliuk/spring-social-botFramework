package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ActionType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.HttpMethod;

import java.util.Map;

/**
 * Action.Http represents the properties needed to do an Http request. All input properties are available for use via
 * data binding. Properties can be data bound to the Uri and Body properties, allowing you to send a request
 * to an arbitrary url.
 * @author Anton Leliuk
 */
public class HttpAction extends Action {

    /**
     * content to post (can have binding information)
     */
    private String body;

    /**
     * Object which represents headers Example: { \"content-type\":\"application/json\" }
     */
    private Map<String, String> headers;

    /**
     * Http method (Default: POST)
     */
    private HttpMethod method = HttpMethod.POST;


    /**
     * url to use (can have binding information)
     */
    private String url;

    @Override
    public ActionType getType() {
        return ActionType.Http;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
