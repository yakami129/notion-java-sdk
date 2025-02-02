package com._2lazy2name.notion.property.page;

import com._2lazy2name.notion.entity.common.richText.AbstractRichText;
import com._2lazy2name.notion.entity.common.richText.TextText;
import com._2lazy2name.notion.enumeration.type.PropertyTypeEnum;


import java.util.List;

/***
 * @author Yi
 * @since 1.0
 * @version 1.0
 * @see <a href="https://developers.notion.com/reference/page-property-values#rich-text">Rich Text</a>
 */
public class RichTextValue extends AbstractPagePropertyValue {
    private final PropertyTypeEnum type = PropertyTypeEnum.RICH_TEXT;
    private List<AbstractRichText> richText;

    private RichTextValue() {
    }

    public RichTextValue(List<AbstractRichText> richText) {
        this.richText = richText;
    }

    public RichTextValue(AbstractRichText richText) {
        this.richText = List.of(richText);
    }

    public RichTextValue(String text) {
        this.richText = List.of(new TextText(text));
    }

    @Override
    public PropertyTypeEnum getType() {
        return type;
    }

    public List<AbstractRichText> getRichText() {
        return richText;
    }

    public RichTextValue setRichText(List<AbstractRichText> richText) {
        this.richText = richText;
        return this;
    }
}
