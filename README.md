# 🛒 OpenCart Automation Testing Framework – Hybrid (Selenium + Java + TestNG)

This is a real-time **Hybrid Automation Framework** developed to automate the OpenCart eCommerce application using **Selenium WebDriver**, **Java**, and **TestNG**. I built this project to gain hands-on experience in test automation, framework design, and CI/CD integration.

---

## 📌 Project Highlights

- ✅ Built using **Hybrid Framework** combining Page Object Model + Data-Driven Testing
- ✅ Automates key OpenCart flows: Registration, Login, Product Search, Add to Cart, and Checkout
- ✅ Excel-driven test inputs using **Apache POI** + TestNG’s `@DataProvider`
- ✅ Centralized logging with **Log4j2**
- ✅ HTML reporting with **ExtentReports**
- ✅ Integrated with **Maven**, **Jenkins (CMD-based)**, and **GitHub**
- ✅ Cross-browser execution using **Selenium Grid + Docker (via CMD and YAML)**

---

## 🧩 Project Structure

OpencartV121/
│
├── src/
│ ├── test/java/
│ │ ├── pageObjects/ # Page classes (POM)
│ │ │ ├── LoginPage.java
│ │ │ ├── RegistrationPage.java
│ │ │ ├── HomePage.java
│ │ │ ├── CheckoutPage.java
│ │ │ ├── SearchPage.java
│ │ │ ├── MyAccountPage.java
│ │ │ ├── ShoppingCartPage.java
│ │ │ └── BasePage.java
│ │ ├── testBase/ # Setup & teardown
│ │ │ └── BaseClass.java
│ │ ├── testCases/ # Functional test scripts
│ │ │ ├── TC001_AccountRegistrationTest.java
│ │ │ ├── TC002_LoginTest.java
│ │ │ ├── TC003_LoginDDT.java
│ │ │ ├── TC004_SearchProductTest.java
│ │ │ ├── TC005_AddToCartPageTest.java
│ │ │ └── TC006_EndToEndTest.java
│ │ ├── utilities/ # Reusable functions
│ │ │ ├── DataProviders.java
│ │ │ ├── ExcelUtility.java
│ │ │ └── ExtentReportManager.java
│ ├── test/resources/
│ │ ├── config.properties # App & browser settings
│ │ └── log4j2.xml # Logging configuration
│
├── testData/ # Excel input for DDT
├── test-output/ # TestNG reports & suite XMLs
│ ├── master.xml
│ ├── grouping.xml
│ ├── crossbrowsertesting.xml
│ ├── grid-docker.xml
│ ├── Grid-Standalone.xml
│ └── docker-compose.yaml
├── reports/ # ExtentReport HTML output
├── screenshots/ # Screenshots on test failures
├── logs/ # Log4j2 logs with timestamps
├── run.bat # Batch file for Jenkins or local CLI execution
├── pom.xml # Maven dependencies and plugins
└── target/ # Compiled output

---

## ✅ Test Coverage

- **User Registration** – Validations for both positive and negative inputs
- **Login Testing** – Static and dynamic (Excel-based) credential tests
- **Product Search** – Search functionality validations
- **Add to Cart** – UI behavior and cart summary checks
- **End-to-End Flow** – Login → Search → Add to Cart → Checkout

---

## 🧪 Tools & Technologies Used

| Tool              | Purpose                                 |
|------------------|------------------------------------------|
| **Selenium WebDriver** | UI automation across browsers       |
| **Java**              | Core programming language            |
| **TestNG**            | Organizing and executing tests       |
| **Apache POI**        | Reading Excel files for input        |
| **ExtentReports**     | Detailed HTML reports with logs      |
| **Log4j2**            | Runtime logging and debugging        |
| **Maven**             | Project build and dependencies       |
| **Jenkins (CMD)**     | Automated CI/CD execution via CLI    |
| **Selenium Grid**     | Remote and parallel execution        |
| **Docker (CMD + YAML)**| Containerized test environments     |

---

## 🚀 How to Run the Project

### ▶️ 1. Run via Maven
```bash
mvn clean test

▶️ 2. Run via TestNG XML
bash
# Example
mvn test -DsuiteXmlFile=test-output/master.xml

▶️ 3. Run via Command Prompt (Jenkins or local)
bash
run.bat

▶️ 4. Run Docker + Grid Setup
bash
# Launch Grid and Nodes
docker-compose -f docker-compose.yaml up

# Then trigger tests via grid-docker.xml
mvn test -DsuiteXmlFile=test-output/grid-docker.xml
📈 Reporting & Logs
📁 /reports – Rich HTML report from ExtentReports

📁 /screenshots – Captured on test failure

📁 /logs – Centralized logs using Log4j2

👤 Author
Madhu Mallabathula
Fresher QA Engineer with strong hands-on skills in automation, framework development, and continuous integration.
📧 madhurgukt691@example.com
🔗 https://www.linkedin.com/in/madhumallabathula/


