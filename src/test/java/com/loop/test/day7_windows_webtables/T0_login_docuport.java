package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class T0_login_docuport extends TestBase {

    @Test
    public void test_login_logout(){
        DocuportUtils.loginDocuport(driver, DocuportConstant.SUPERVISOR);
        DocuportUtils.logOut(driver);
    }

}
