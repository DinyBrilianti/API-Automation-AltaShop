package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Getproductratings {
    protected static String url = "https://altashop-api.fly.dev/api/products/12887/ratings";

    @Step("user is on the products rating GET page endpoint")
    public String userOnTheProductRatingPage(){
        return url;
    }
    @Step("user is on the request page with an endpoint and Get Method")
    public void userOnTheRequestPageEndpointAndMethod(){
        SerenityRest.given().get(userOnTheProductRatingPage());
    }
    @Step("user should receive a product rating")
    public void userShouldReceiveProductRating(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the response code 200ok")
    public void userReceiveResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
