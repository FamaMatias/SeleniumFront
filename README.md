# SeleniumFront

## <u> Automation Linkedin </u>


:pushpin: Automation was created in linkedin where a new job is added


### Table of Contents
1. [What I am going to do?](#general-info)
2. [Tools](#tools)
3. [Execution](#execution)
4. [How to see reports?](#reports)


<a name="general-info"></a>
1. What I am going to do? :mag_right:

***

#### _In this repository we will be automated 2 scenarios:_
 <ul>
<li>Login
<li>New Charge
</ul>

#### _In this work i used:_
* gherkin lenguage to make more understandable all scenarios
* Implement BDD (Behavior Driven Development)
* In compliance with the pattern <u>SOLID</u>

```bash
src 
 |--main
 |    |--java
 |        |--com.speedup.qa
 |                  |-- interaction
 |                  |        . ScrollDown
 |                  |        . WaitInteraction
 |                  |-- models
 |                  |        . CredentialData
 |                  |        . DataJob
 |                  |-- questions
 |                  |        . Login
 |                  |-- tasks
 |                  |        . AddNewJob
 |                  |        . LoginUser
 |                  |        . OpenBrowser
 |                  |-- userinterface
 |                           . AddJob 
 |                           . Login 
 |--test
 |    |--java
 |    |    |--com.speedup.qa
 |    |             |-- runners
 |    |             |        . loginRunners
 |    |             |        . newChargeRunners
 |    |             |--stepdefinitios
 |    |                      . loginStepDefinitions
 |    |                      . newChargeStepDefinitions
 |    |--feature
 |           . login.feature
 |           . newCharge.feature
 |--target
      |--site
          . index.html  
```
***
<a name="tools"></a>
2. Tools :briefcase:

* [Intellij IDEA](https://www.jetbrains.com/es-es/idea/)
* [POM]()


```bash
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>automation_frontend</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <serenity.version>2.0.17</serenity.version>
        <serenity.screenplay.webdriver>2.0.17</serenity.screenplay.webdriver>
        <serenity.screenplay>2.0.17</serenity.screenplay>
        <serenity.cucumber.version>1.9.20</serenity.cucumber.version>
        <webdriver.driver>chrome</webdriver.driver>
        <poi.version>3.15</poi.version>
    </properties>

    <dependencies>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-server</artifactId>
            <version>3.14.0</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
            <version>${serenity.screenplay}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay-webdriver</artifactId>
            <version>${serenity.screenplay.webdriver}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity.version}</version>
        </dependency>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber</artifactId>
            <version>${serenity.cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.15</version>
        </dependency>

        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.4</version>
        </dependency>

        <dependency>
            <groupId>com.microsoft.sqlserver</groupId>
            <artifactId>mssql-jdbc</artifactId>
            <version>7.2.1.jre8</version>
        </dependency>

        <dependency>
            <groupId>com.codoid.products</groupId>
            <artifactId>fillo</artifactId>
            <version>1.14</version>
        </dependency>

        <dependency>
            <groupId>com.documents4j</groupId>
            <artifactId>documents4j-local</artifactId>
            <version>1.0.3</version>
        </dependency>

        <dependency>
            <groupId>com.documents4j</groupId>
            <artifactId>documents4j-transformer-msoffice-word</artifactId>
            <version>1.0.3</version>
        </dependency>
        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>

    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>2.22.1</version>
                <configuration>
                    <includes>
                        <include>**/*.java</include>
                    </includes>
                    <argLine>-Xmx512m</argLine>
                    <systemPropertyVariables>
                        <webdriver.driver>${webdriver.driver}</webdriver.driver>
                    </systemPropertyVariables>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.version}</version>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```
  #### Lenguague

* [Java](https://www.java.com/en/): Version 1.8_333

```bash
OS : Windos 10
```
***
<a name="execution"></a>
3. Execution :keyboard:

In compliance with the SOLID principles, we must carry out the execution according to the functionality that we want to see:

| Runner (Java Class) | Feature           |
|---------------------|-------------------|
| loginRunners        | login.feature     |
| newCharge           | newCharge.feature |
***
<a name="reports"></a>
4. How to see reports? :computer:

To see the report we must place the following command in the terminal
```bash
mvn clean verify serenity:aggregate
```
After that:

:one: We go to the Target folder and expand it

:two: We display the folder "site"

:three: Right click on the file "index.html", select "Open in", "Browser" and select the browser.