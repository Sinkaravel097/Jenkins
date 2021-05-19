$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Amazon/AmazonLogin.feature");
formatter.feature({
  "name": "To validate Amazon login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To verify with invalid credential of amazon login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the browser and hit amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmzInvalidCredential.user_to_launch_the_browser_and_hit_amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the invalid email or phone number",
  "keyword": "When "
});
formatter.match({
  "location": "AmzInvalidCredential.user_has_to_enter_the_invalid_email_or_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmzInvalidCredential.user_has_to_click_the_continue_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the invalid password inn password field",
  "keyword": "And "
});
formatter.match({
  "location": "AmzInvalidCredential.user_has_to_enter_the_invalid_password_inn_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the sign btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmzInvalidCredential.user_has_to_click_the_sign_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the entire browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmzInvalidCredential.user_has_to_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify with valid credential of amazon login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Feature1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the browser and hit amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmzInvalidCredential.user_to_launch_the_browser_and_hit_amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid email or phone number",
  "keyword": "When "
});
formatter.match({
  "location": "AmzValidCredential.userHasToEnterTheValidEmailOrPhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click the continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmzValidCredential.userToClickTheContinueBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid password inn password field",
  "keyword": "And "
});
formatter.match({
  "location": "AmzValidCredential.userHasToEnterTheValidPasswordInnPasswordField()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#ap_password\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-PT93KTGA\u0027, ip: \u0027192.168.43.200\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\VISHAL\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55729}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 58daf31938d5816c302ece33536215bb\n*** Element info: {Using\u003did, value\u003dap_password}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat org.bas.BaseClass.fillText(BaseClass.java:59)\r\n\tat org.stepdefinition.AmzValidCredential.userHasToEnterTheValidPasswordInnPasswordField(AmzValidCredential.java:26)\r\n\tat ✽.User has to enter the valid password inn password field(src/test/resources/Amazon/AmazonLogin.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User to click the sign btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmzValidCredential.userToClickTheSignBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmzValidCredential.userToCloseTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Login/FbLogin.feature");
formatter.feature({
  "name": "To validate fb login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_the_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to enter the invalid email in email fields",
  "rows": [
    {
      "cells": [
        "username1",
        "username2",
        "username3"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "selenium@gmail.com",
        "devops@gmail.com"
      ]
    },
    {
      "cells": [
        "j456va@gmail.com",
        "seghjnium@gmail.com",
        "delkjhps@gmail.com"
      ]
    },
    {
      "cells": [
        "j987a@gmail.com",
        "syc56nium@gmail.com",
        "de672ps@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_invalid_email_in_email_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the invalid password in password fields",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "ja4562",
        "sele977667",
        "345674567"
      ]
    },
    {
      "cells": [
        "j562",
        "7667",
        "345674"
      ]
    },
    {
      "cells": [
        "j62",
        "se667",
        "3457"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_invalid_password_in_password_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to logged in the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_logged_in_the_home_page_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLogin.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_the_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has to enter the valid email in email field",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin2.user_has_to_enter_the_valid_email_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin2.user_has_to_enter_the_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to click login btn",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin2.user_to_click_login_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to close the entire browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLogin2.user_to_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});