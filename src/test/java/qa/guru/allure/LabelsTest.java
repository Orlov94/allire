package qa.guru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int PULL_REQUEST = 91;

    @Test
    @Feature("Pull в репозитории")
    @Story("Создание Pull")
    @Owner("Кто-то")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "nnn")
    @DisplayName("Создание Pull для авторизированного пользователя")
    public void testStaticLabels() {

    }

    @Test
    public void testDynamicLabels(){

    }
}

