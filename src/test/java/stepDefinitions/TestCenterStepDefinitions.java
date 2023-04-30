package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.visible;

public class TestCenterStepDefinitions {

    TestCenterPage testCenterPage = new TestCenterPage();
    @Given("kullanici adini gir")
    public void kullanici_adini_gir() {
        testCenterPage.kullaniciAdi.setValue("techproed");
    }
    @Given("kullanici sifresini gir")
    public void kullanici_sifresini_gir() {
        testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");
    }
    @When("submit butonuna tikla")
    public void submit_butonuna_tikla() {
        testCenterPage.submitButton.click();
    }
    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
//      Assert.assertTrue(testCenterPage.girisMesaji.isDisplayed())
//      testCenterPage.girisMesaji.shouldBe(Condition.visible); --> JUnit assertion
        testCenterPage.girisMesaji.shouldBe(visible); // SELENIDE ASSERTION --> test failed olursa otomatik ekran görüntüsü alır
    }
}
