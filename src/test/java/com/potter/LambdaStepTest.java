package com.potter;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {
    private final static String REPOSITORY = "theswanmaiden/github-tests";
    private final static String ISSUE_PAGE = "Welcome to issues!";

    @Test
    public void findIssuesOnGithub() {
        step("Открываем главную страницу",() -> {
            open("https://github.com");
        });
        step("Ищем репозиторий", () -> {
            $("input[name='q']").setValue(REPOSITORY).pressEnter();
        });
        step("Переходим в репозиторий", () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Переходим в раздел Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
        step("Проверяем наличие привественной надписи", () -> {
            $(byText(ISSUE_PAGE));
        });


    }
}
