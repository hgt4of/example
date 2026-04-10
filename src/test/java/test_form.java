import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class test_form {


        @Test
        public void test_form() {
            open("https://demoqa.com/automation-practice-form");
            $("[id='firstName']").setValue("Ruslan");
            $("[id='lastName']").setValue("Mironov");
            $("[id='userEmail']").setValue("r.miron@test.com");
            $("[id='gender-radio-2']").click();
            $("[id='userNumber']").setValue("1234567890");
            $("[id='dateOfBirthInput']").click();
            $("[class='react-datepicker__month-select']").click();
            $("[class='react-datepicker__month-select']").selectOptionByValue("7");
            $("[class='react-datepicker__year-select']").click();
            $("[class='react-datepicker__year-select']").selectOptionByValue("1999");
            $("[class='react-datepicker__day react-datepicker__day--003']").click();
            $("[class='subjects-auto-complete__input-container css-19bb58m']").click();
            $("[id='subjectsInput']").setValue("B").pressEnter();
            $("[id='subjectsInput']").setValue("P").pressEnter();
            $("[id='hobbies-checkbox-1']").click();
            $("[id='hobbies-checkbox-3']").click();
            $("[id='uploadPicture']").uploadFile(new File("src/test/resources/avatar.jpg"));
            $("[id='currentAddress']").setValue("456 Maple Avenue, Apt 78, New York, NY 10001, USA");
            $("[id='react-select-3-input']").setValue("N").pressEnter();
            $("[id='react-select-4-input']").setValue("D").pressEnter();
            $("[id='submit']").scrollTo().click();
            $("[id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));        }
}