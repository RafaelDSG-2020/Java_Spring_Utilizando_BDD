package cucumber.steps;

import br.com.mandacaru.livecodebdd.controller.ProductController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertTrue;



@CucumberContextConfiguration
public class StoreProdutcsSteps {
    @Given("I have more than {int} products in my store")
    public void iHaveMoreThanProductsInMyStore(int productNumber) {
        ProductController products = new ProductController();
        assertTrue("I have more than {int} products in my store",
                products.getAllProducts().size()>productNumber);
    }

    @And("One of these products is a CellPhone")
    public void oneOfTheseProductsIsACellPhone() {
        ProductController products  = new ProductController();
        assertTrue("ne of these products is a CellPhone",
                products.getAllProducts().contains("CellPhone"));
    }
    @Then("All product should be returned successfully")
    public void allProductShouldBeReturnedSuccessfully() {
        List<String> productToBeVerified = new ArrayList<>();
        productToBeVerified.add("Mouse");
        productToBeVerified.add("Keyboard");
        productToBeVerified.add("Pen");
        productToBeVerified.add("Screen");
        productToBeVerified.add("Notebook");
        productToBeVerified.add("CellPhone");
    }


}
