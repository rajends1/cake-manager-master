#EveryDay-Report

Test of Code to bank

## Introduction

Clone the repository and import it to a Spring Tool Suite IDE and press "Run as Java Application"

### Prerequisites
Spring is used to generate the sample data.
For sample data, one need to create them as model in the file /src/main/java/com/bank/service/beans.xml
The name of this model must be trade1, trade2, ..... tradeN
```
<bean id="trade1" class="com.bank.model.Trade">
		<property name="cur" ref="currencyUSD"></property>
		<property name="ent" ref="entityFoo"></property>
		<property name="tt" ref="buyTradeType"></property>
		<property name="instructionDate" value="01 Jan 2016 "></property>
		<property name="settlementDate" value="02 Jan 2016 "></property>
		<property name="units" value="300"></property>
		<property name="pricePerUnit" value="100.25"></property>		
</bean>
```

##software dependency
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://projects.spring.io/spring-framework/) - Java Framework
* [JUnit](http://junit.org/junit4/) - Unit test

