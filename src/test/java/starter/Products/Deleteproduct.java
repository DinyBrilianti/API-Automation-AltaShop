package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Deleteproduct {
    protected static String url = "https://altashop-api.fly.dev/api/products/11316";

    @Step("user wants to delete post category with valid ID")
    public String userDeletePostCategoryWithValidID() {
        return url;
    }
    @Step("user is on the request page with an endpoint with ID and DELETE method")
    public void userRequestPageWithEndpointIDAndDeleteMethode() {
        SerenityRest.given().delete(userDeletePostCategoryWithValidID());
    }
    @Step("user receive response code 200 ok and data is null")
    public void userReceiveResponseCode200AndDataNull() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
