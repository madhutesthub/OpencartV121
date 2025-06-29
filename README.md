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
├── src/
│ ├── test/java/
│ │ ├── pageObjects/ # Page classes using POM
│ │ ├── testBase/ # Setup and teardown logic
│ │ ├── testCases/ # All test scripts
│ │ └── utilities/ # Reusable utilities like Excel & reporting
│ ├── test/resources/ # Configuration and logging files
│
├── testData/ # Excel files for data-driven testing
├── test-output/ # TestNG reports and XML suites
│ ├── master.xml
│ ├── grid-docker.xml
│ ├── docker-compose.yaml
│ └── others...
├── reports/ # ExtentReports HTML output
├── screenshots/ # Failure screenshots
├── logs/ # Log4j2 logs
├── pom.xml # Maven dependencies
├── run.bat # Batch file to run tests via CMD/Jenkins
└── target/ # Compiled output

css
Copy
Edit

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


