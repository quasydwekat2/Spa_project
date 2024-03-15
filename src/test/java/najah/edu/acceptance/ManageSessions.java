package najah.edu.acceptance;

import Controller.ClientController;
import Entities.Employee;
import database.Appointment_DB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ManageSessions {
    ClientController clientController;
    public ManageSessions() {
        clientController = new ClientController();
    }

    @Given("the client is logged into their account")
    public void theClientIsLoggedIntoTheirAccount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the chosen massage session {string} slot is available for the selected available {string} and available employee {string}")
    public void theChosenMassageSessionSlotIsAvailableForTheSelectedAvailableAndAvailableEmployee(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client schedules a new massage session specifying the date and time")
    public void theClientSchedulesANewMassageSessionSpecifyingTheDateAndTime() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("the chosen massage session {string} slot is already booked for the selected {string} and available employee {string}")
    public void theChosenMassageSessionSlotIsAlreadyBookedForTheSelectedAndAvailableEmployee(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client attempts to schedule a new massage session for this time slot")
    public void theClientAttemptsToScheduleANewMassageSessionForThisTimeSlot() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the chosen sawna session {string} slot is available for the selected available {string} and available employee {string}")
    public void theChosenSawnaSessionSlotIsAvailableForTheSelectedAvailableAndAvailableEmployee(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client schedules a new sawna session specifying the date and time and employee")
    public void theClientSchedulesANewSawnaSessionSpecifyingTheDateAndTimeAndEmployee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the session should be successfully booked, ensuring the time and date slots are reserved")
    public void theSessionShouldBeSuccessfullyBookedEnsuringTheTimeAndDateSlotsAreReserved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("the chosen sawna session {string} slot is already booked for the selected {string} and available employee {string}")
    public void theChosenSawnaSessionSlotIsAlreadyBookedForTheSelectedAndAvailableEmployee(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client attempts to schedule a new sawna session for this time slot")
    public void theClientAttemptsToScheduleANewSawnaSessionForThisTimeSlot() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system should prevent the booking and alert about the time and date slots unavailability")
    public void theSystemShouldPreventTheBookingAndAlertAboutTheTimeAndDateSlotsUnavailability() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @When("I choose to view the appointments")
    public void iChooseToViewTheAppointments() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the appointments should show up according to the client who log in")
    public void theAppointmentsShouldShowUpAccordingToTheClientWhoLogIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the new chosen time slot is available")
    public void theNewChosenTimeSlotIsAvailable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client reschedules the session with the new {string} and {string}")
    public void theClientReschedulesTheSessionWithTheNewAnd(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the session should be successfully updated, and the new time slot reserved")
    public void theSessionShouldBeSuccessfullyUpdatedAndTheNewTimeSlotReserved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("the client wants to change the time of an existing spa session")
    public void theClientWantsToChangeTheTimeOfAnExistingSpaSession() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the new chosen {string} and {string} slots are unavailable")
    public void theNewChosenAndSlotsAreUnavailable(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client attempts to reschedule the session to this time slot")
    public void theClientAttemptsToRescheduleTheSessionToThisTimeSlot() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system should prevent the update and alert about the time slot unavailability")
    public void theSystemShouldPreventTheUpdateAndAlertAboutTheTimeSlotUnavailability() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the client has an existing spa session they wish to cancel")
    public void theClientHasAnExistingSpaSessionTheyWishToCancel() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the client chooses to cancel this session")
    public void theClientChoosesToCancelThisSession() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the session should be removed from their list of scheduled sessions, freeing up the time slot")
    public void theSessionShouldBeRemovedFromTheirListOfScheduledSessionsFreeingUpTheTimeSlot() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
