package pages;

import utils.BasePage;

public class HomePage extends BasePage {

    //check Dell Logo
    public Boolean checkLogo(){
        Boolean a = elementExists("//a[@class='delltechLogoWrapper dynamic-link']");
        return a;
    }

    //check Search
    public Boolean checkSearchInput(){
        Boolean a = elementExists("//input[@id='mh-search-input']");
        return a;
}

    //check Banner
    public Boolean checkBanner(){
        Boolean a = elementExists("//div[@class='banner-order']");
        return a;
    }

//check Cart
//check Sign In
//check NZ/EN
//check Menus

    public void goToMenu(){
        hover("//span[contains(text(),'Products')]");
        hover("//span[contains(text(),'Products')]/../..//button[@role='menuitem'][contains(text(),'Laptops')]");
        hoverClick("//span[contains(text(),'Products')]/../..//button[@role='menuitem'][contains(text(),'Laptops')]/../..//a[@role='menuitem'][contains(text(),'View All Laptops')]");
    }

    //check Banner
    public Boolean checkAllLaptops(){
        Boolean a = elementExists("//div[@class='brand-compare-header-title'][contains(text(),'Which laptop is right for you?')]");
        return a;
    }

    public String getL1MenuText(){
        String a = getText("//nav[@class='breadcrumbs']//..//li[2]");
        return a;
    }

    public String getL2MenuText(){
        String a = getText("//nav[@class='breadcrumbs']//..//li[3]");
        return a;
    }

}
