package com._2lazy2name.notion.entity.common.icon;

import com._2lazy2name.notion.entity.common.Emoji;
import com._2lazy2name.notion.entity.enumeration.type.IconTypeEnum;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class EmojiIcon extends AbstractIcon{
    private final static IconTypeEnum type = IconTypeEnum.EMOJI;
    @JsonUnwrapped
    private Emoji emoji;

    private EmojiIcon() {
    }

    public EmojiIcon(char emoji) {
        this.emoji = new Emoji(emoji);
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public EmojiIcon setEmoji(Emoji emoji) {
        this.emoji = emoji;
        return this;
    }
}
