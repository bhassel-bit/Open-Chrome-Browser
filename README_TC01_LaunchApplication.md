# TC01 – Launch Application (Selenium WebDriver)

## Project Overview
This beginner-friendly Java automation test uses **Selenium WebDriver** to launch Google Chrome, navigate to an online store, verify the page title, and close the browser. It demonstrates a basic **UI smoke test**: checking that the application opens and displays the expected title.

## Test Scenario
**Test case:** `TC01_LaunchApplication`

**Application under test:** https://cloudberrystore.services/

**Expected page title:** `Your store of fun`

### Test Steps
1. Launch the Chrome browser using `ChromeDriver`.
2. Navigate to `https://cloudberrystore.services/`.
3. Maximize the browser window.
4. Retrieve the page title using `driver.getTitle()`.
5. Compare the actual title with `Your store of fun`.
6. Print `Test Passed` if the titles match, or `Test Failed` if they do not.
7. Close the browser session using `driver.quit()`.

## Technologies Used
- **Java** – test logic and conditional statements
- **Selenium WebDriver** – browser automation
- **Google Chrome / ChromeDriver** – browser execution

## Prerequisites
- Java Development Kit (JDK) installed
- Google Chrome installed
- Selenium Java dependencies configured in your Java project (for example, using Maven or Gradle)
- A compatible ChromeDriver available through Selenium Manager or your WebDriver configuration
- Internet access to reach the test website

## How to Run
1. Add `TC01_LaunchApplication.java` to the `day5` package in a Java project configured with Selenium.
2. Open the project in your Java IDE (such as Eclipse or IntelliJ IDEA).
3. Run `TC01_LaunchApplication` as a Java application.
4. Observe the Chrome browser launching and the result printed in the console.

> **Note:** This is a standalone Java program using `main()`, not a JUnit or TestNG test. The current code prints the result to the console rather than generating a test report or failing a test framework assertion.

## Expected Console Output
When the title matches:

```text
Test Passed
```

When the title does not match:

```text
Test Failed
```

## How the Code Works
- `new ChromeDriver()` starts a Chrome browser session.
- `driver.get(...)` opens the application URL.
- `driver.manage().window().maximize()` maximizes the browser window.
- `driver.getTitle()` retrieves the current page title.
- `title.equals("Your store of fun")` performs an exact, case-sensitive comparison.
- An `if/else` statement prints the appropriate result.
- `driver.quit()` closes the browser session.

## Skills Practiced
- Setting up browser automation with Selenium WebDriver
- Navigating to a website programmatically
- Validating expected versus actual results
- Using Java variables and `if/else` conditions
- Managing a browser session

## Future Improvements
- Use **JUnit or TestNG assertions** so the test can produce formal pass/fail results.
- Add **explicit waits** for elements or conditions relevant to the page.
- Use `try/finally` to ensure the browser closes even when an exception occurs.
- Record the actual title in the failure message to simplify troubleshooting.
- Move URLs and expected results into configuration or test data for reuse.

## Project File
`TC01_LaunchApplication.java`

This is an introductory Selenium automation exercise focused on launching an application and validating its page title.
