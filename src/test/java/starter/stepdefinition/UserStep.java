package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.GetUserInformation;
import starter.Authentication.Login;
import starter.Authentication.Register;
import starter.ProductCategories.Createcategory;
import starter.ProductCategories.Deletecategory;
import starter.ProductCategories.Getallcategories;
import starter.ProductCategories.GetcategorybyID;
import starter.Products.*;

public class UserStep {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    GetUserInformation getUserInformation;
    @Steps
    Getallproducts getallproducts;
    @Steps
    Createnewproduct createnewproduct;
    @Steps
    GetproductbyID getproductbyID;
    @Steps
    Deleteproduct deleteproduct;
    @Steps
    Assignproductrating assignproductrating;
    @Steps
    Getproductratings getproductratings;
    @Steps
    Createcategory createcategory;
    @Steps
    GetcategorybyID getcategorybyID;
    @Steps
    Getallcategories getallcategories;
    @Steps
    Deletecategory deletecategory;
    @Steps
    Createcommentforproduct createcommentforproduct;
    @Steps
    Getproductcomments getproductcomments;

    //====================Post new register====================\\
    @Given("user is on the register POST page endpoint")
    public void userIsOnTheRegisterPOSTPageEndpoint() {
        register.userIsOnTheRegisterEndpoint();
    }

    @When("user is on the request page with the endpoint, POST method and JSON format body")
    public void userIsOnTheRequestPageWithTheEndpointPOSTMethodAndJSONFormatBody() {
        register.userRequestEndpointMethodandBody();
    }

    @Then("i receive response code 200 OK")
    public void iReceiveResponseCodeOK200() {
        register.newLoginCreatedandResponseCode200OK();
    }

    @And("the new login data that was just created")
    public void theNewLoginDataThatWasJustCreated() {
    }


    //==================Post new login=======================\\
    @Given("user is on the login POST page endpoint")
    public void userIsOnTheLoginPOSTPageEndpoint() {
        login.userOnLoginPageEnpoint();
    }

    @When("user makes request page with the endpoint, POST method and JSON format body")
    public void userMakesRequestPageWithTheEndpointPOSTMethodAndJSONFormatBody() {
        login.userRequestEndpointwithMethodandBody();
    }

    @Then("user get the data bearer token")
    public void userGetTheDataBearerToken() {
        login.usertGetBearerToken();
    }

    @And("user receive the response code 200 ok")
    public void userReceiveTheResponseCode200Ok() {
        login.userReceiveResponseCode200OK();
    }


    //===================Get user information===================\\
    @Given("user is on the get info user page endpoint")
    public void userIsOnTheGetInfoUserPageEndpoint() {
        getUserInformation.userOnTheGetInfoUserPage();
    }

    @When("user is on the request page with an endpoint and a GET method")
    public void userIsOnTheRequestPageWithAnEndpointAndAGETMethod() {
        login.userOnLoginPageEnpoint();
        login.userRequestEndpointwithMethodandBody();
        String token = login.usertGetBearerToken();
        getUserInformation.userRequestEndpointAndGetMethod(token);
    }

    @Then("user get information data")
    public void userGetInfoData() {
        getUserInformation.userGetInfoData();
    }

    @And("user receive response code 200 OK")
    public void userReceiveResponseCodeOK200() {
        getUserInformation.userReceiveresponseCode200OK();
    }

    //============Get all products=================\\
    @Given("user is on the products GET page endpoint")
    public void userIsOnTheProductsGETPageEndpoint() {
        getallproducts.userOnTheProductsGetPageEndpoint();
    }

    @When("user is on the request page with an endpoint and GET method")
    public void userIsOnTheRequestPageWithAnEndpointAndGETMethod() {
        getallproducts.userRequestPageWithEndpointAndGetMethod();
    }

    @Then("user should receive a list of products")
    public void userShouldReceiveAListOfProducts() {
        getallproducts.userShouldReceiveListProduct();
    }

    @And("user receive the response code 200 OK")
    public void userReceiveTheResponseCode200OK() {
        getallproducts.userReceiveTheResponseCode200Ok();
    }

    //=================Post New Product====================\\
    @Given("user is on the product POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        createnewproduct.userOnTheProductPostPageEndpoint();
    }

    @When("user is on the request page with the endpoint, method POST and JSON format body")
    public void userIsOnTheRequestPageWithTheEndpointMethodPOSTAndJSONFormatBody() {
        createnewproduct.userRequestPageWithEndpointMethodAndBody();
    }

    @Then("i receive the response code 200 OK")
    public void iReceiveTheResponseCode200OK() {
        createnewproduct.iReceiveTheResponseCode200OK();
    }

    @And("the post add new product that was just created")
    public void thePostAddNewProductThatWasJustCreated() {
    }

    //=================Get Product By ID=====================\\
    @Given("User is on the product by ID GET page endpoint")
    public void userIsOnTheProductByIDGETPageEndpoint() {
        getproductbyID.userOnTheProductByIdGetEndpoint();

    }

    @When("user is on the request page with an endpoint and get method")
    public void userIsOnTheRequestPageWithAnEndpointAndGetMethod() {
        getproductbyID.userOnTheRequestPageWithEndpointGetMethod();
    }

    @Then("user should receive a product by ID")
    public void userShouldReceiveAProductByID() {
        getproductbyID.userShouldReceiveProductbyID();
    }

    @And("user receive response code 200 ok")
    public void userReceiveResponseCode200Ok() {
        getproductbyID.userReceiveResponseCode2000k();
    }

    //===============Delete a Product===================\\
    @Given("user wants to delete post category with valid ID")
    public void userWantsToDeletePostCategoryWithValidID() {
        deleteproduct.userDeletePostCategoryWithValidID();
    }

    @When("user is on the request page with an endpoint with ID and DELETE method")
    public void userIsOnTheRequestPageWithAnEndpointWithIDAndDELETEMethod() {
        deleteproduct.userRequestPageWithEndpointIDAndDeleteMethode();
    }

    @Then("user receive response code 200 ok and data is null")
    public void userReceiveResponseCode200OkAndDataIsNull() {
        deleteproduct.userReceiveResponseCode200AndDataNull();
    }

    @And("post data with ID {int} has been deleted")
    public void postDataWithIDHasBeenDeleted(int arg0) {
    }

    //===============Post Product Rating===================\\
    @Given("user is on the product rating POST page endpoint")
    public void userIsOnTheProductRatingPOSTPageEndpoint() {
        assignproductrating.userOnProductRatingPostEndpoint();

    }

    @When("user is on the request page with the endpoint and POST method")
    public void userIsOnTheRequestPageWithTheEndpointPOSTMethod() {
        login.userOnLoginPageEnpoint();
        login.userRequestEndpointwithMethodandBody();
        String token = login.usertGetBearerToken();
        assignproductrating.userRequestPageEndpointAndMethodePost(token);
    }

    @Then("user add product rating in body format JSON")
    public void userAddProductRatingInBody() {
        assignproductrating.userAddProductRatingInBody();
    }

    @And("i receive the response code 200ok")
    public void iReceiveTheResponseCode200Ok() {
        assignproductrating.iReceiveResponseCode200ok();
    }

    //=============Get Product Ratings====================\\
    @Given("user is on the products rating GET page endpoint")
    public void userIsOnTheProductsRatingGETPageEndpoint() {
        getproductratings.userOnTheProductRatingPage();
    }

    @When("user is on the request page with an endpoint and Get Method")
    public void userOnTheRequestPageWithAnEndpointAndGetMethod() {
        getproductratings.userOnTheRequestPageEndpointAndMethod();

    }

    @Then("user should receive a product rating")
    public void userShouldReceiveAProductRating() {
        getproductratings.userShouldReceiveProductRating();
    }

    @And("user receive the response code 200ok")
    public void userReceiveTheResponseCode200ok() {
        getproductratings.userReceiveResponseCode200();
    }

    //================Post Comment Product==================\\
    @Given("user is on the product comment POST page endpoint")
    public void userIsOnTheProductCommentPOSTPageEndpoint() {
        createcommentforproduct.userOnTheProductCommentPostEndpoint();
    }

    @When("user on the request page with the endpoint, POST method, bearer token and JSON format body")
    public void userOnTheRequestPageWithTheEndpointPOSTMethodBearerTokenAndJSONFormatBody() {
        createcommentforproduct.userRequestEndpointAndMethodPage();

    }

    @Then("user add product comment in body format JSON")
    public void userAddProductCommentInBody() {
        login.userOnLoginPageEnpoint();
        login.userRequestEndpointwithMethodandBody();
        String token = login.usertGetBearerToken();
        createcommentforproduct.userAddProductCommentInBody(token);
    }

    @And("i receive the response code 200 ok")
    public void iReceiveTheResponseCode200ok() {
        createcommentforproduct.iReceiveTheResponseCode200ok();
    }

    //===============Get Product Comments====================\\
    @Given("user is on the products comments GET page endpoint")
    public void userIsOnTheProductsCommentsGETPageEndpoint() {
        getproductcomments.userOnTheProductsCommentsEndpoint();
    }

    @When("user on The request page with an endpoint and GET method")
    public void userOnTheRequestPageWithEndpointAndGetMethod() {
        getproductcomments.userRequestEndpointGet();

    }

    @Then("user should receive a list of products comments")
    public void userShouldReceiveAListOfProductsComments() {
        getproductcomments.userShouldReceiveListProductComments();
    }

    @And("user receive response code 200OK")
    public void userReceiveResponseCode200OK() {
        getproductcomments.userReceiveResponseCode200ok();
    }

    //===============Post new category====================\\
    @Given("user on the product POST page endpoint")
    public void userOnTheProductPOSTPageEndpoint() {
        createcategory.userOnTheProductPostPage();
    }

    @When("user on the request page with the endpoint, POST method and JSON format body")
    public void userOnTheRequestPageWithTheEndpointPOSTMethodAndJSONFormatBody() {
        createcategory.userRequestEndpointMethodPost();
    }

    @Then("I receive the response Code 200 ok")
    public void iReceiveResponseCode200Ok() {
        createcategory.iReceiveResponseCode200ok();
    }

    @And("the post add new category that was just created")
    public void thePostAddNewCategoryThatWasJustCreated() {
    }

    //===============Get category by ID====================\\
    @Given("user is on the category GET page endpoint")
    public void userIsOnTheCategoryGETPageEndpoint() {
        getcategorybyID.userOnTheCategoryGetPageEndpoint();
    }

    @When("user is on the request page with an endpoint with ID and GET method")
    public void userIsOnTheRequestPageWithAnEndpointWithIDAndGETMethod() {
        getcategorybyID.userRequestEndpointWithIDAndGetMethod();
    }

    @Then("user should receive a category by ID")
    public void userShouldReceiveACategoryByID() {
        getcategorybyID.userShouldReceiveCategoryById();
    }

    @And("user receive the Response code 200 OK")
    public void userReceiveTheResponseCode200() {
        getcategorybyID.userReceiveTheResponseCode200();
    }

    //===============Get all categories====================\\
    @Given("user on the category GET page endpoint")
    public void userOnTheCategoryGETPageEndpoint() {
        getallcategories.userOnTheCategoryGetPageEndpoint();
    }

    @When("user on the request page with an endpoint and GET method")
    public void userOnTheRequestPageWithAnEndpointAndGETMethod() {
        getallcategories.userRequestEndpointAndGetMethode();
    }

    @Then("user should receive a list of categories product")
    public void userShouldReceiveAListOfCategoriesProduct() {
        getallcategories.userShouldReceiveListCategoriesProduct();
    }

    @And("I receive response code 200OK")
    public void iReceiveResponseCode200OK() {
        getallcategories.iReceiveResponseCode200ok();
    }

    //===============Delete a category====================\\
    @Given("user want to delete post category with valid ID")
    public void userWantToDeletePostCategoryWithValidID() {
        deletecategory.userWantDeletePostCategoryWithId();
    }

    @When("user on the request page with an endpoint with ID and DELETE method")
    public void userOnTheRequestPageWithAnEndpointWithIDAndDELETEMethod() {
        deletecategory.userRequestEndpointWithIDAndDeleteMethod();
    }

    @Then("I receive response code 200 ok and Data is null")
    public void iReceiveResponseCode200OkAndDataIsNull() {
        deletecategory.iReceiveResponseCode200OkAndDataNull();
    }

    @And("data POST with ID {int} has been deleted")
    public void dataPOSTWithIDHasBeenDeleted(int arg0) {
    }


}
