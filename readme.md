SpringCloud alibaba 学习
### (mic-spring-cloud)父工程构建
#### pom.xml 
```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.itan.mic-spring-cloud</groupId>
  <artifactId>mic-spring-cloud</artifactId>
  <version>1.0-SNAPSHOT</version>
  <!--父工程只留一个pom-->
  <packaging>pom</packaging>


  <!--统一管理jar包版本-->
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <juint.version>4.12</juint.version>
    <log4j.version>1.2.17</log4j.version>
    <lombok.version>1.18.16</lombok.version>
    <mysql.version>8.0.22</mysql.version>
    <druid.version>1.1.16</druid.version>
    <mybatis.spring.boot.version>2.1.4</mybatis.spring.boot.version>
  </properties>

  <dependencyManagement>
    <dependencies>
      <!--springcloud verison  Spring Boot >=2.2.0.M4 and <2.3.8.BUILD-SNAPSHOT",-->
      <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-denpendencies</artifactId>
        <version>Hoxton.SR9</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>

      <!--springboot verison-->
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>2.2.12.RELEASE</version>
      </dependency>
      <!--springcloud alibaba "Spring Boot >=2.2.0.RELEASE and <2.3.0.M1"-->
      <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-alibaba-dependencies</artifactId>
        <version>2.2.1.RELEASE</version>
      </dependency>


      <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>${mysql.version}</version>
      </dependency>

      <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid</artifactId>
        <version>${druid.version}</version>
      </dependency>

      <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>${mybatis.spring.boot.version}</version>
      </dependency>
    </dependencies>
  </dependencyManagement>
</project>
```
> `dependencyManagement` 和`denpendencies` 的区别
1. `dependencies即使在子项目中不写该依赖项，那么子项目仍然会从父项目中继承该依赖项（全部继承）`
2. `dependencyManagement里只是声明依赖，并不实现引入，因此子项目需要显示的声明需要用的依赖。如果不在子项目中声明依赖，是不会从父项目中继承下来的；只有在子项目中写了该依赖项，并且没有指定具体版本，才会从父项目中继承该项，并且version和scope都读取自父pom;另外如果子项目中指定了版本号，那么会使用子项目中指定的jar版本。`


