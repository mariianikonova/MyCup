//package spring;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.Map;
//
////Controller for index.jsp
//
//@Controller("/app/auth/loginPage.jsp")
//public class LoginController {
//    private static final Logger log = LoggerFactory.getLogger(LoginController.class.getName());
//
//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView provideWelcomePage(Map<String, ?> model) {
//        log.info("Conroller WORKS!!!!");
//        return new ModelAndView("WEB-INF/view/auth/loginPage.jsp", model);
//
//    }
//}





//<!--<?xml version="1.0" encoding="UTF-8"?>-->
//<!--<beans:beans xmlns="http://www.springframework.org/schema/security"-->
//<!--xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"-->
//<!--xsi:schemaLocation="http://www.springframework.org/schema/beans-->
//<!--http://www.springframework.org/schema/beans/spring-beans-3.0.xsd-->
//<!--http://www.springframework.org/schema/security-->
//<!--http://www.springframework.org/schema/security/spring-security-3.0.xsd">-->
//
//<!--&lt;!&ndash;<http pattern="/css/**" security="none" />&ndash;&gt;-->
//
//<!--<http auto-config="true">-->
//<!--<intercept-url pattern="/secure/**" access="ROLE_USER" />-->
//<!--<intercept-url pattern="/admin/**" access="ROLE_ADMIN" />-->
//<!--</http>-->
//
//<!--<authentication-manager>-->
//<!--<authentication-provider>-->
//<!--<user-service>-->
//<!--<user name="admin" password="adminpassword" authorities="ROLE_USER, ROLE_ADMIN" />-->
//<!--<user name="user" password="userpassword" authorities="ROLE_USER" />-->
//<!--</user-service>-->
//<!--</authentication-provider>-->
//<!--</authentication-manager>-->
//<!--</beans:beans>-->
//



//<!--<filter>-->
//<!--<filter-name>springSecurityFilterChain</filter-name>-->
//<!--<filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>-->
//<!--</filter>-->
//
//<!--<filter-mapping>-->
//<!--<filter-name>springSecurityFilterChain</filter-name>-->
//<!--<url-pattern>/view/userTargets/*
//</url-pattern>-->
//  <!--</filter-mapping>-->
//
//  <!-- Deprecated Configuration -->
//  <!--<filter>-->
//    <!--<filter-name>AuthFilter</filter-name>-->
//    <!--<filter-class>auth.AuthFilter</filter-class>-->
//  <!--</filter>-->
//
//  <!--<filter-mapping>-->
//    <!--<filter-name>AuthFilter</filter-name>-->
//    <!--<url-pattern>/view/userTargets/*</url-pattern>-->
//  <!--</filter-mapping>-->
//
//  <!--<filter>-->
//    <!--<filter-name>OffCacheFilter</filter-name>-->
//    <!--<filter-class>auth.OffCacheFilter</filter-class>-->
//  <!--</filter>-->
//
//  <!--<filter-mapping>-->
//    <!--<filter-name>OffCacheFilter</filter-name>-->
//    <!--<url-pattern>/view/userTargets/*</url-pattern>-->
//  <!--</filter-mapping>-->
//
//  <!--<servlet>-->
//    <!--<servlet-name>LoginServlet</servlet-name>-->
//    <!--<servlet-class>auth.LoginServlet</servlet-class>-->
//  <!--</servlet>-->
//  <!--<servlet-mapping>-->
//    <!--<servlet-name>LoginServlet</servlet-name>-->
//    <!--<url-pattern>/auth/LoginServlet</url-pattern>-->
//  <!--</servlet-mapping>-->
//
//  <!--<servlet>-->
//    <!--<servlet-name>LogoutServlet</servlet-name>-->
//    <!--<servlet-class>auth.LoginServlet</servlet-class>-->
//  <!--</servlet>-->
//  <!--<servlet-mapping>-->
//    <!--<servlet-name>LogoutServlet</servlet-name>-->
//    <!--<url-pattern>/auth/LogoutServlet</url-pattern>-->
//  <!--</servlet-mapping>-->


//<!--&lt;!&ndash; Spring Security &ndash;&gt;-->
//<!--<dependency>-->
//<!--<groupId>org.springframework.security</groupId>-->
//<!--<artifactId>spring-security-core</artifactId>-->
//<!--<version>3.0.0.RELEASE</version>-->
//<!--</dependency>-->
//
//<!--<dependency>-->
//<!--<groupId>org.springframework.security</groupId>-->
//<!--<artifactId>spring-security-web</artifactId>-->
//<!--<version>3.0.0.RELEASE</version>-->
//<!--</dependency>-->
