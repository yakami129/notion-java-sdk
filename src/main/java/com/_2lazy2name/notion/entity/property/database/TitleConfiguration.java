package com._2lazy2name.notion.entity.property.database;

import com._2lazy2name.notion.entity.enumeration.type.PropertyTypeEnum;
import com._2lazy2name.notion.entity.property.NullToEmptyObjectSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/***
 * @author Yi
 * @since 1.0
 * @version 1.0
 * @see <a href="https://developers.notion.com/reference/property-object#title-configuration">Title Configuration</a>
 */
@ToString @Getter @Setter
public class TitleConfiguration extends AbstractDatabaseProperty {
    private final PropertyTypeEnum type = PropertyTypeEnum.TITLE;
    @JsonSerialize(nullsUsing = NullToEmptyObjectSerializer.class)
    private final Object title = null;
    @JsonIgnore
    private static final TitleConfiguration INSTANCE = new TitleConfiguration();

    private TitleConfiguration() {
    }

    public static TitleConfiguration getInstance() {
        return INSTANCE;
    }


}