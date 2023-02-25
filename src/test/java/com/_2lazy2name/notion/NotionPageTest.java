package com._2lazy2name.notion;

import com._2lazy2name.notion.entity.common.parent.AbstractParent;
import com._2lazy2name.notion.entity.common.parent.DatabaseParent;
import com._2lazy2name.notion.entity.common.parent.PageParent;
import com._2lazy2name.notion.entity.property.page.AbstractPagePropertyValue;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.Map;

class NotionPageTest extends NotionTest {
    private final static String userId = "";
    private final static String databaseId = "c302f709af294024b8c4aeba6641913b";
    private final static String pageId = "a88272b1d272482cb9516468f6d54fe1";
    public static final String createdPageId = "5871f556ff2f4090b100a238555431ae";
    public static final String propertyId = "%3CTS%40";

    @Test @SneakyThrows
    public void test() {

    }


    @Test @SneakyThrows
    public void createPageWithPageParent() {
        PageParent parent = AbstractParent.buildPageParent(pageId);
        System.out.println(notion.createPage(parent, "Test Page", null, null, null));
    }

    @Test @SneakyThrows
    public void createPageWithDatabaseParent() {
        DatabaseParent parent = AbstractParent.buildDatabaseParent(createdPageId);
        AbstractPagePropertyValue title = AbstractPagePropertyValue.buildTitleValue("Test Page");
        AbstractPagePropertyValue select = AbstractPagePropertyValue.buildCheckboxValue(true);
        System.out.println(notion.createPage(parent, Map.of("Name", title, "Tags", select), null, null, null));
    }

    @Test @SneakyThrows
    public void retrievePagePropertyValue() {
        System.out.println(notion.retrievePageProperty(pageId, propertyId));
    }
}