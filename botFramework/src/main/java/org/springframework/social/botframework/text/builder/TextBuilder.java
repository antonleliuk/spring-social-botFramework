package org.springframework.social.botframework.text.builder;

import java.util.List;

import org.springframework.social.botframework.text.data.TextPart;
import org.springframework.social.botframework.util.CollectionUtils;

/**
 * @author Anton Leliuk
 */
public class TextBuilder {

    private TextBuilderState state;

    private TextBuilder() {
        this.state = new TextBuilderState();
    }

    public static TextBuilder newInstance(){
        return new TextBuilder();
    }

    public TextBuilder reset(){
        this.state = new TextBuilderState();
        return this;
    }

    public TextBuilder addPart(TextPart part){
        state.parts = CollectionUtils.add(state.parts, part);
        return this;
    }

    public String text(){
        StringBuilder sb = new StringBuilder();
        state.parts.stream().forEach(p -> sb.append(p.toText()));
        return sb.toString();
    }

    private class TextBuilderState {

        private List<TextPart> parts;
    }
}
