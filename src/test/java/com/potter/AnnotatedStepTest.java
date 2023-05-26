package com.potter;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class AnnotatedStepTest {

    @Step("Открываем главную страницу")
    public void openMainPage(){
        open("https://github.com");
    }
    @Step("Ищем репозиторий")
    public void findRepository(String repository){
        $("input[name='q']").setValue(repository).pressEnter();
    }
    @Step("Переходим в репозиторий")
    public void goToRepository(String repository){
        $(linkText(repository)).click();
    }
    @Step("Переходим в Issues")
    public void goToIssues(){
        $(partialLinkText("Issues")).click();
    }
    @Step("Проверяем наличие привественной надписи")
    public void checkWelcomeMessage(String message){
        $(byText(message));
    }
}
