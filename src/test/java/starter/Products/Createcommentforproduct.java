package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Createcommentforproduct {

    public String url = "https://altashop-api.fly.dev/api/products/11318/comments";

    @Step("user is on the product comment POST page endpoint")
    public String userOnTheProductCommentPostEndpoint(){
        return url;
    }
    @Step("user on the request page with the endpoint, POST method, bearer token and JSON format body")
    public void userRequestEndpointAndMethodPage() {
    }
    @Step("user add product comment in body format JSON")
    public void userAddProductCommentInBody(String token){
        String content = "the furniture is good using high quality raw materials";
        String body =  "{\n"+
                " \"content\":" + content + "\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " +token).body(reqBody.toString()).post(userOnTheProductCommentPostEndpoint());
    }
    @Step("i receive the response code 200 ok")
    public void iReceiveTheResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
