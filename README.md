# Spring 4 WebMVC Skeleton project

This is a skeleton project you can just clone from github and start writing your own controller and view file if you gonna 
develop a web application of your own.

Here, Hibernate integration with JPA (Java Persistence API) has been configured. You just have to create a database
  in your local MySQL server and provide corresponding access information at `resources/persistence-mysql.properties` file.

List of full technology stack used here:

1. Spring 4.0.5.RELEASE
2. Servlet 3.0
3. Thymeleaf 2.1.3
3. JPA/Hibernate 4.3.5
4. Junit 4.11
5. spring-test 4.0.5.RELEASE (Spring MVC Test Framework)
6. Mockito 1.9.5
7. Slf4j/Log4j 1.7.5
8. Gradle 1.11
9. Tomcat 7.0.54 (Embedded)

Note: starting from Spring 3.1, you can configure Servlet Context programatically with no web.xml and no xml at all. But
I didn't feel natural with this approach. So, I used xml based configuration approach in this project. But if you like
to be xml free, do that by yourself. Can follow [this](http://blog.codeleak.pl/2011/06/spring-31-mvc-xml-free-configuration-in.html) tutorial.

## Quick start

First clone this project from github and navigate there from your command line/terminal.

**If you have gradle already installed**, just run `gradle build`
then you will find a **war** file in your projects **/build/libs/** folder. Deploy it in your favorite container e.g. tomcat.

**If you don't have gradle installed**, well, there is a awesome news for you! You don't need to download/install gradle to 
build this project! Here, [gradle wrapper](http://java.dzone.com/articles/use-gradle-wrapper-and-stop) is used to make your life easier ;)
All you have to do to run script, e.g. if you want to build this project, just execute following command from your terminal

* `./gradlew build ` (from Unix)
* `gradlew.bat build ` (from Windows)

This script will automatically determine your gradle installation or download & install gradle if required & then execute 
the gradle task, e.g. build war file for above command. To see the list of tasks available, use `./gradlew tasks` or `gradlew.bat tasks` 


## Quick development -> direct deploy app on embedded tomcat
Well, building project and deploying manually in app container sometimes become pain as these are repetitive work. To make 
your life easier, here embedded tomcat container has been integrated. Just type `gradle tomcatRunWar` in your command line 
and your project will build and run automatically on a tomcat container within a minute. You just have to go **http://localhost:8080/** from 
your browser to see it running. Cool...right? ;)

