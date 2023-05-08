package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Getallcategories {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("user on the category GET page endpoint")
    public String userOnTheCategoryGetPageEndpoint(){
        return url;
    }
    @Step("user on the request page with an endpoint and GET method")
    public void userRequestEndpointAndGetMethode(){
        SerenityRest.given().get(userOnTheCategoryGetPageEndpoint());
    }
    @Step("user should receive a list of categories product")
    public void userShouldReceiveListCategoriesProduct(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("I receive response code 200OK")
    public void iReceiveResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
