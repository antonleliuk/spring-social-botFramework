package org.springframework.social.botframework.api.data.cards.adaptive.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptive.dict.ActionType;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Action.Http represents the properties needed to do an Http request. All input properties are available for use via
 * data binding. Properties can be data bound to the Uri and Body properties, allowing you to send a request
 * to an arbitrary url.
 * @author Anton Leliuk
 */
public class HttpAction extends Action<HttpAction> {

    /**
     * content to post (can have binding information)
     */
    private String body;

    /**
     * Object which represents headers Example: { \"content-type\":\"application/json\" }
     */
    private Map<String, String> headers = new HashMap<>();

    /**
     * Http method (Default: POST)
     */
    private HttpMethod method = HttpMethod.POST;


    /**
     * url to use (can have binding information)
     */
    private String url;

    public HttpAction body(String body){
        this.body = body;
        return this;
    }

    public HttpAction header(String key, String value){
        headers.putIfAbsent(key, value);
        return this;
    }

    public HttpAction method(HttpMethod method){
        this.method = method;
        return this;
    }

    public HttpAction url(String url){
        this.url = url;
        return this;
    }

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
