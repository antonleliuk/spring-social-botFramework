package org.springframework.social.botframework.text.builder;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.social.botframework.text.builder.TextBuilder;
import org.springframework.social.botframework.text.data.Text;
import org.springframework.social.botframework.text.data.Wrap;
import org.springframework.social.botframework.text.dict.Smiles;

/**
 * @author Anton Leliuk
 */
public class TextBuilderTest {

    @Test
    public void build(){
        TextBuilder builder = TextBuilder.newInstance();
        builder.addPart(Text.text("Hello")).addPart(Wrap.bold(Text.text("userName"))).addPart(Text.text("!"));
        Assert.assertEquals("Hello<b raw_pre=\"*\" raw_post=\"*\">userName</b>!", builder.text());

        builder.reset();

        builder.addPart(Text.text("I'm glad to see you")).addPart(Smiles.Happy);
        Assert.assertEquals("I'm glad to see you(happy)", builder.text());
    }

}
