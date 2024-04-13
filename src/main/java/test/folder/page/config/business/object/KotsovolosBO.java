package test.folder.page.config.business.object;

import test.folder.page.config.pageobjects.KotsovolosHomePO;
import test.folder.page.config.pageobjects.KotsovolosProductPO;
import test.folder.page.config.pageobjects.KotsovolosResultsPO;

public class KotsovolosBO {

    KotsovolosHomePO kotsovolosHomePO = new KotsovolosHomePO();
    KotsovolosResultsPO kotsovolosResultsPO = new KotsovolosResultsPO();
    KotsovolosProductPO kotsovolosProductPO = new KotsovolosProductPO();

    public void searchIPhone13()throws InterruptedException{
        kotsovolosHomePO.setSearchBarInput();
        kotsovolosResultsPO.cookiesBar();
        kotsovolosResultsPO.clickScreenWidth();
        kotsovolosResultsPO.clickInchSelection();
        kotsovolosResultsPO.clickPhoneModelSelection();
        kotsovolosProductPO.clickPhoneSpecs();
    }

    public void verifyProductNameBO(){
        kotsovolosProductPO.verifyProductName();
    }

    public void verifyConnectionNetworkBO(){
        kotsovolosProductPO.verifyConnectionNetWork();
    }
}
