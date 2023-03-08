package com._2lazy2name.notion.entity.property.database;

import com._2lazy2name.notion.entity.enumeration.type.PropertyTypeEnum;
import com._2lazy2name.notion.entity.property.NullToEmptyObjectSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


/***
 * @author Yi
 * @since 1.0
 * @version 1.0
 * @see <a href="https://developers.notion.com/reference/property-object#people-configuration">People configuration</a>
 */
public class PeopleConfiguration extends AbstractDatabaseProperty{
    private final PropertyTypeEnum type = PropertyTypeEnum.PEOPLE;
    @JsonSerialize(nullsUsing = NullToEmptyObjectSerializer.class)
    private final Object people = null;
    @JsonIgnore
    private static final PeopleConfiguration INSTANCE = new PeopleConfiguration();

    private PeopleConfiguration() {
    }

    public static PeopleConfiguration getInstance() {
        return INSTANCE;
    }

    @Override
    public PropertyTypeEnum getType() {
        return type;
    }

    public Object getPeople() {
        return people;
    }
}
