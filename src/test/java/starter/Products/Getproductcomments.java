package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Getproductcomments {
    protected static String url = "https://altashop-api.fly.dev/api/products/11318/comments";

    @Step("user is on the products comments GET page endpoint")
    public String userOnTheProductsCommentsEndpoint(){
        return url;
    }
    @Step("user on The request page with an endpoint and GET method")
    public void userRequestEndpointGet(){
        SerenityRest.given().get(userOnTheProductsCommentsEndpoint());
    }
    @Step("user should receive a list of products comments")
    public void userShouldReceiveListProductComments(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200OK")
    public void userReceiveResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
