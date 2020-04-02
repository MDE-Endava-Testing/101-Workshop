# 101-Workshop

## Setup Instructions
1. This project already has a chromedriver under the java/test/resources folder that works fine with MacOS. Make sure 
to download the chrome driver version you need in https://sites.google.com/a/chromium.org/chromedriver/downloads 
2. Make sure to change your chrome driver path in the Driver class located in the utils package. This line 
```
System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
```

## Plugins
You can use some of IntelliJ plugins to add Cucumber support to the IDE.
In IntelliJ go to preferences/plugins and look for Cucumber in the search bar, Install the following plugins:
- Cucumber for Java
- Gherkin
