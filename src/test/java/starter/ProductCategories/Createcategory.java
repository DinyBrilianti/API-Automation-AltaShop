package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Createcategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("user on the product POST page endpoint")
    public String userOnTheProductPostPage(){
        return url;
    }
    @Step("user on the request page with the endpoint, POST method and JSON format body")
    public void userRequestEndpointMethodPost(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Batagor Woku");
        requestBody.put("description","Cemilan sehat lezat bergizi");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnTheProductPostPage());
    }
    @Step("I receive the response Code 200 ok")
    public void iReceiveResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
