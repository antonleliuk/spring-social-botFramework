package org.springframework.social.botframework.api.data;

/**
 * Defines a attachment view.
 * @author Anton Leliuk
 */
public class AttachmentView {

    /**
     * View ID.
     */
    private String viewId = null;

    /**
     * Size of the file.
     */
    private Integer size = null;

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
