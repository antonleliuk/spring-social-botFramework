package org.springframework.social.botFramework.text.builder;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.social.botFramework.text.data.Bold;
import org.springframework.social.botFramework.text.data.Text;
import org.springframework.social.botFramework.text.dict.Smiles;

/**
 * @author Anton Leliuk
 */
public class TextBuilderTest {

    @Test
    public void build(){
        TextBuilder builder = TextBuilder.newInstance();
        builder.addPart(Text.text("Hello")).addPart(Bold.text("userName")).addPart(Text.text("!"));
        Assert.assertEquals("Hello<b raw_pre=\"*\" raw_post=\"*\">userName</b>!", builder.text());

        builder.reset();

        builder.addPart(Text.text("I'm glad to see you")).addPart(Smiles.Happy);
        Assert.assertEquals("I'm glad to see you(happy)", builder.text());
    }

    @Test
    public void parse() throws Exception {
        String text = "Some test and <b raw_pre=\"*\" raw_post=\"*\">its a bold text</b>";
    }
}
