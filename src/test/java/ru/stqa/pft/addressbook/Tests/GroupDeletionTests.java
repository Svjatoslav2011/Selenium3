package ru.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Test
    public void testGroupDeletion() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
