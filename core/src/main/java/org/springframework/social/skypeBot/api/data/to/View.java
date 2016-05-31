package org.springframework.social.skypeBot.api.data.to;

/**
 * Attachment view
 * @author Anton Leliuk
 */
public class View {

    /**
     * The View Id available for this attachment.
     */
    private String viewId;

    /**
     * The View's content size in bytes
     */
    private int size;

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
