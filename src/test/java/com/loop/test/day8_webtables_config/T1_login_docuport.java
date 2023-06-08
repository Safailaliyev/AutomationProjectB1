package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstant;
import com.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class T1_login_docuport extends TestBase {

    @Test
    public void test_login_logout(){
        DocuportUtils.loginDocuport(driver, DocuportConstant.CLIENT);
        DocuportUtils.logOut(driver);

        DocuportUtils.loginDocuport(driver, DocuportConstant.ADVISOR);
        DocuportUtils.logOut(driver);

        DocuportUtils.loginDocuport(driver, DocuportConstant.SUPERVISOR);
        DocuportUtils.logOut(driver);

        DocuportUtils.loginDocuport(driver, DocuportConstant.EMPLOYEE);
        DocuportUtils.logOut(driver);
    }
}
