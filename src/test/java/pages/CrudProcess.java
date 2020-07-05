package pages;

import support.DriverQA;

public class CrudProcess extends BasePage{

    public CrudProcess(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void openPage() {
        String url = "http://agapito-server.herokuapp.com/processos";
        driver.openURL(url);
    }

    public void clickNewProcess(){
        driver.click("btn-novo");
    }

    public void fillVara(String value){
        driver.sendKeys(value,"processo_vara");
    }

    public void fillNumero(String value) {
        driver.sendKeys(value,"processo_numero_processo");
    }

    public void fillNatureza(String value) {
        driver.sendKeys(value, "processo_natureza");
    }

    public void fillPartes(String value) {
        driver.sendKeys(value, "processo_partes");
    }

    public void selectUrgency(String value) {
        driver.selectByText(value, "processo_urgente");
    }

    public void clickArbitramento(String value) {
        if (value.equals("Sim"))
            driver.click("processo_arbitramento_s");
        else
            driver.click("processo_arbitramento_n");
    }

    public void fillAssistente(String value) {
        driver.sendKeys(value, "processo_assistente_social");
    }

    public void fillEntrada(String value) {
        driver.sendKeys(value, "processo_data_entrada");
    }

    public void fillSaida(String value) {
        driver.sendKeys(value, "processo_data_saida");
    }

    public void fillAgendamento(String value) {
        driver.sendKeys(value, "processo_data_agendamento");
    }

    public void fillStatus(String value) {
        driver.sendKeys(value, "processo_status");
    }

    public void fillObservacao(String value) {
        driver.sendKeys(value, "processo_observacao");
    }

    public void clickSaveProcess() {
        driver.click(".ls-btn-primary", "css");
    }

    public void clickMostrar(String code) {
        driver.click("btn-show_" + code);
    }

    public void clickVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }

    public void clickEditar() {
        driver.click(".ls-btn", "css");
    }

    public void clickDelete(String code) {
        driver.click("btn-delete_" + code);
    }

    public void clickConfirmDelete() {
        driver.ChooseOkOnNextConfirmation();
    }
}
