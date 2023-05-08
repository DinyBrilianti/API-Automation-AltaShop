package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetcategorybyID {
    protected static String url = "https://altashop-api.fly.dev/api/categories/12533";

    @Step("user is on the category GET page endpoint")
    public String userOnTheCategoryGetPageEndpoint(){
        return url;
    }
    @Step("user is on the request page with an endpoint with ID and GET method")
    public void userRequestEndpointWithIDAndGetMethod(){
        SerenityRest.given().get(userOnTheCategoryGetPageEndpoint());
    }
    @Step("user should receive a category by ID")
    public void userShouldReceiveCategoryById(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the Response code 200 OK")
    public void userReceiveTheResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
