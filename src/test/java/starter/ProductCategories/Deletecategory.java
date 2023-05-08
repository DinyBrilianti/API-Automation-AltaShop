package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Deletecategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories/11311";

    @Step("user want to delete post category with valid ID")
    public String userWantDeletePostCategoryWithId(){
        return url;
    }
    @Step("user on the request page with an endpoint with ID and DELETE method")
    public void userRequestEndpointWithIDAndDeleteMethod() {
        SerenityRest.given().delete(userWantDeletePostCategoryWithId());
    }
    @Step("I receive response code 200 ok and Data is null")
    public void iReceiveResponseCode200OkAndDataNull() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
