package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ActionType;

/**
 * When Action.OpenUrl is invoked it will show the given url, either by launching it to an external web browser
 * or showing in-situ with embedded web browser.
 * @author Anton Leliuk
 */
public class OpenUrlAction extends Action<OpenUrlAction> {

    /**
     * Default (browser) url to use
     */
    private String url;

    public OpenUrlAction url(String url){
        this.url = url;
        return this;
    }

    @Override
    public ActionType getType() {
        return ActionType.OpenUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
