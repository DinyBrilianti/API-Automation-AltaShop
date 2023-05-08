package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Assignproductrating {

    public String url = "https://altashop-api.fly.dev/api/products/12887/ratings";

    @Step("user is on the product rating POST page endpoint")
    public String userOnProductRatingPostEndpoint(){
        return url;
    }
    @Step("user is on the request page with the endpoint and POST method")
    public void userRequestPageEndpointAndMethodePost(String token){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(userOnProductRatingPostEndpoint());
    }
    @Step("user add product rating in body format JSON")
    public void userAddProductRatingInBody() {
        String count = "3";
        String body = "{\n" +
                " \"count\":" + count + "\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
    }
    @Step("i receive the response code 200ok")
    public void iReceiveResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
