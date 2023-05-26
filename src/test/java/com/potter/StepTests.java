package com.potter;

import org.junit.jupiter.api.Test;

public class StepTests {
    private final static String REPOSITORY = "theswanmaiden/github-tests";
    private final static String ISSUE_PAGE = "Welcome to issues!";

    @Test
    public void findIssuesOnGithub(){
        AnnotatedStepTest steps = new AnnotatedStepTest();
        steps.openMainPage();
        steps.findRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.goToIssues();
        steps.checkWelcomeMessage(ISSUE_PAGE);
    }
}
