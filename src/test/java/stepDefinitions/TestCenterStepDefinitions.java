package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.checked;
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

    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {

//      eger text = Checkbox1 ve checkbox1 secili degilse, checkbox1 e tikla

        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
//      Assert.assertTrue(testCenterPage.checkbox1.isSelected()); junit
//      testCenterPage.checkbox1.shouldBe(Condition.checked); selenide uzun versiyon
            testCenterPage.checkbox1.shouldBe(checked); // selenide kisa versiyon--> secili ise true olacak, bunu kontrol ediyor

        }
        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.shouldNotBe(checked); // secili olmadigini dogrulamak icin kullanilir
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);

        }
        if(text.equals("Red") && !testCenterPage.red.isSelected()){
            testCenterPage.red.shouldNotBe(checked);
            testCenterPage.red.click();
            testCenterPage.red.shouldBe(checked);

        }
        if(text.equals("Football") && !testCenterPage.football.isSelected()){
            testCenterPage.football.shouldNotBe(checked);
            testCenterPage.football.click();
            testCenterPage.football.shouldBe(checked);
        }


    }

}
