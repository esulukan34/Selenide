Feature: checkbox ve radio button

  @checkbox
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
    And   "Checkbox 1" secili degilse sec
    And   "Checkbox 2" secili degilse sec
    And   sayfayi acik tutar

  @radio
  Scenario: TC02 radio
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And   "Red" secili degilse sec
    And   sayfayi acik tutar

  @football
  Scenario: TC03 football
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And   "Football" secili degilse sec
    And   sayfayi acik tutar
