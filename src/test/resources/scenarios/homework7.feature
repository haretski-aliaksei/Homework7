Feature: Homework #7

  Background: Я нахожусь на главной странице сайта
    Given Открываем сайт "https://www.onliner.by/"

  Scenario: Scenario #1
    When Наводим на пункт автобарахолка
    Then Проверяем что в подменю автобарахолки есть все пункты

  Scenario: Scenario #2
    When Наводим на пункт дома и квартиры
    Then Проверяем что в подменю есть все пункты
