package com.potter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {
    @BeforeAll
    static void beforeAll(){
        open("https://github.com");
    }

    @Test
    void findIssuesOnGithub(){
        $("input[name='q']").setValue("theswanmaiden/github-tests").pressEnter();
        $(linkText("theswanmaiden/github-tests")).click();
        $(partialLinkText("Issues")).click();
        $(byText("Welcome to issues!"));
    }
}
