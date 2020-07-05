package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CrudProcess;
import pages.ProcessShow;
import support.BaseSteps;

public class CreateProcessoSteps extends BaseSteps {

    private static CrudProcess crudProcess = new CrudProcess(driver);
    private ProcessShow processShow = new ProcessShow(driver);
    private String codigoProcesso;

    public String getCodigoProcesso() {
        return codigoProcesso;
    }

    public void setCodigoProcesso(String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }

    @Given("^user would like to create a process$")
    public void userWouldLikeToCreateAProcess() {
        crudProcess.openPage();
    }

    @Given("^user clicks on New Process button$")
    public void userClicksOnNewProcessButton() {
        crudProcess.clickNewProcess();
    }

    @And("^user fills vara equal \"([^\"]*)\"$")
    public void userFillsVaraEqual(String value) {
        crudProcess.fillVara(value);
    }

    @And("^user fills numero equal \"([^\"]*)\"$")
    public void userFillsNumeroEqual(String value) {
        crudProcess.fillNumero(value);
    }

    @And("^user fills natureza equal \"([^\"]*)\"$")
    public void userFillsNaturezaEqual(String value) {
        crudProcess.fillNatureza(value);
    }

    @And("^user fills partes equal \"([^\"]*)\"$")
    public void userFillsPartesEqual(String value) {
        crudProcess.fillPartes(value);
    }

    @And("^user selects urgency equal \"([^\"]*)\"$")
    public void userSelectsUrgencyEqual(String value) {
        crudProcess.selectUrgency(value);
    }

    @And("^user clicks on abritramento equal \"([^\"]*)\"$")
    public void userClicksOnAbritramentoEqual(String value) {
        crudProcess.clickArbitramento(value);
    }

    @And("^user fills assistente equal \"([^\"]*)\"$")
    public void userFillsAssistenteEqual(String value) {
        crudProcess.fillAssistente(value);
    }

    @And("^user fills entrada equal \"([^\"]*)\"$")
    public void userFillsEntradaEqual(String value) {
        crudProcess.fillEntrada(value);
    }

    @And("^user fills saida equal \"([^\"]*)\"$")
    public void userFillsSaidaEqual(String value) {
        crudProcess.fillSaida(value);
    }

    @And("^user fills agendamento equal \"([^\"]*)\"$")
    public void userFillsAgendamentoEqual(String value) {
        crudProcess.fillAgendamento(value);
    }

    @And("^user fills status equal \"([^\"]*)\"$")
    public void userFillsStatusEqual(String value) {
        crudProcess.fillStatus(value);
    }

    @And("^user fills observacao equal \"([^\"]*)\"$")
    public void userFillsObservacaoEqual(String value) {
        crudProcess.fillObservacao(value);
    }

    @When("^the user clicks on save button$")
    public void theUserClicksOnSaveButton() {
        crudProcess.clickSaveProcess();
    }

    @Then("^the user should see \"([^\"]*)\" into process page$")
    public void theUserShouldSeeIntoProcessPage(String message) {
        Assert.assertEquals(message, processShow.getNotice());
    }

    @And("^the user should see the code for the created process$")
    public void theUserShouldSeeTheCodeForTheCreatedProcess() {
        setCodigoProcesso(processShow.getCode());
    }

    @When("^the user clicks on show button$")
    public void theUserClicksOnShowButton() {
        crudProcess.clickMostrar(getCodigoProcesso());
    }

    @When("^the user clicks on back button$")
    public void theUserClicksOnBackButton() {
        crudProcess.clickVoltar();
    }

    @And("^the user clicks on update button$")
    public void theUserClicksOnUpdateButton() {
        crudProcess.clickEditar();
    }

    @And("^the user clicks on delete button$")
    public void theUserClicksOnDeleteButton() {
        crudProcess.clickDelete(getCodigoProcesso());
    }

    @And("^the user confirms delete$")
    public void theUserConfirmsDelete() {
        crudProcess.clickConfirmDelete();
    }

    @Then("^the user should not see last code$")
    public void theUserShouldNotSeeLastCode() {
        Assert.assertFalse("ERROR: There is a process with the code " + getCodigoProcesso(), processShow.getGridCode(getCodigoProcesso()));
    }
}
