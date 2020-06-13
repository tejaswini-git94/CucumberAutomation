$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/Search.feature");
formatter.feature({
  "name": "FlipKart - Search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ClassicRegressionSuite"
    }
  ]
});
formatter.scenarioOutline({
  "name": "SearchTest3",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchtest1"
    }
  ]
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user search for \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on the first product",
  "keyword": "When "
});
formatter.step({
  "name": "product details page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on BuyNow Button",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "tv"
      ]
    },
    {
      "cells": [
        "refrigerator"
      ]
    }
  ]
});
formatter.scenario({
  "name": "SearchTest3",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ClassicRegressionSuite"
    },
    {
      "name": "@searchtest1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_opens_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"tv\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDefs.user_serach_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepdefs.search_results_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the first product",
  "keyword": "When "
});
formatter.match({
  "location": "SearchResultsStepdefs.user_click_on_the_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product details page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailsPageStepDefs.product_details_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on BuyNow Button",
  "keyword": "When "
});
formatter.match({
  "location": "ProductDetailsPageStepDefs.user_click_on_the_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "SearchTest3",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ClassicRegressionSuite"
    },
    {
      "name": "@searchtest1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_opens_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"refrigerator\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDefs.user_serach_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepdefs.search_results_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the first product",
  "keyword": "When "
});
formatter.match({
  "location": "SearchResultsStepdefs.user_click_on_the_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product details page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailsPageStepDefs.product_details_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on BuyNow Button",
  "keyword": "When "
});
formatter.match({
  "location": "ProductDetailsPageStepDefs.user_click_on_the_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});