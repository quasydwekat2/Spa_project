package najah.edu.acceptance;

import controller.ClientController;
import database.ClientDB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientsignupTest {
    ClientController app;

    public ClientsignupTest() {
        app = new ClientController();
        clientId="";
        clientName="";
        password="";
    }

    String clientId ;
    String clientName ;
    String password ;

    @Given("the client does not have an account")
    @Test
    public void theClientDoesNotHaveAnAccount() {
        assertFalse(app.isLoggedUp());
    }

    @When("the client provides a valid ID {string}")
    public void theClientProvidesAValidID(String id) {
        this.clientId = id;
    }

    @When("the client provides a valid name {string}")
    public void theClientProvidesAValidName(String name) {
        this.clientName = name;
    }

    @When("a valid password {string}")
    public void aValidPassword(String pass) {
        this.password = pass;
    }

    @Then("their account should be created and they should be logged in automatically")
    @Test
    public void theirAccountShouldBeCreatedAndTheyShouldBeLoggedInAutomatically() {
            assertTrue(ClientDB.addClient(clientId, clientName, password));
    }

    @Given("the client provides an ID that is already associated with another account {string}")
    public void theClientProvidesAnIDThatIsAlreadyAssociatedWithAnotherAccount(String id) {
        this.clientId = id;
    }

    @When("the client attempts to sign up")
    public void theClientAttemptsToSignUp() {
        assertFalse(app.isLoggedUp());
    }

    @Then("they should be shown an error message indicating the ID is already in use")
    public void theyShouldBeShownAnErrorMessageIndicatingTheIDIsAlreadyInUse() {
        assertFalse(ClientDB.addClient(clientId, clientName, password));}
}


