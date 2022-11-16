# List of dependancies to add to a spring project directly

### Resources

- (NotNull VS NotBlank VS NotEmpty)[https://stackoverflow.com/questions/17137307/in-hibernate-validator-4-1-what-is-the-difference-between-notnull-notempty#:~:text=%40NotNull%20%3A%20The%20CharSequence%2C%20Collection,length%20is%20greater%20than%20zero.]

### Model Setup
```java
@Entity
@Table(name = "")
public class TEMP {
    // ========== Primary Key ===================

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    // ========== Member Variables ==============



    // ========== Data Creation Trackers ========

    @Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

    // ========== Relationships =================



    // ========== Constructors ===================



    // ========== Data Creation Event ===========

    @PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
    // ========== Getters and Setters ===========
}

```

### Comment Snippets
```java
    // ========== Register and Login ============



	// ========== Create / Update ===============



	// ========== Read ==========================



	// ========== Delete ========================



	// ========== Relationships =================



    // ========== Display =======================
    // ========== Action ========================
```

### Relationships

```java
// One to One
// left class
@OneToOne(mappedBy = "attribute_in_other_class", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
// right class
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "other_class_id")

// One to Many
// left class
@OneToMany(mappedBy = "attribute_in_other_class", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
// right class
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "other_class_foreign_key")

// Many to Many without middle model
// left class
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
    name = "name_of_middle_table",
    joinColumns = @JoinColumn(name = "foreign_key_of_current_class"),
    inverseJoinColumns = @JoinColumn(name = "foreign_key_of_other_class")
)
// right class
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
    name = "name_of_middle_table",
    joinColumns = @JoinColumn(name = "foreign_key_of_current_class"),
    inverseJoinColumns = @JoinColumn(name = "foreign_key_of_other_class")
)

// Many to Many with middle model
// left class
@OneToMany(mappedBy = "attribute_in_other_class", fetch = FetchType.LAZY)
// middle class
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "left_class_id")

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "right_class_id")
// right class
@OneToMany(mappedBy = "attribute_in_other_class", fetch = FetchType.LAZY)
```


### jsp imports
```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) --> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- Functions --> 
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
   
</body>
</html>
```

### application.properties
```
# Where are your jsp files?
spring.mvc.view.prefix=/WEB-INF/
# Data Persisence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA>>
spring.datasource.username=root
spring.datasource.password=rootroot
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
# Update and Delete Method hidding inputs
spring.mvc.hiddenmethod.filter.enabled=true 

    # <form action="URL" method="post">
    #     <input type="hidden" name="_method" value="delete>
    #     <input type="submit" value="Delete">
    # </form>
// no longer needed - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Spring Starter Dependancies
```
Spring Boot Dev Tools
Spring Data JPA
MySQL Driver
Spring Web
```

### pom.xml
```xml
<dependencies>
    <!-- DEPENDENCIES FOR STARTING SPRING PROJECTS -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>		
    </dependency>

     <!-- DEPENDENCIES FOR INTEGRATING SQL DATABASE AND USING JPA -->
        <!-- Note: Project will not run until a schema has been created and the 
            proper settings in application properties are present for 
            connecting to a database. -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- DEPENDENCY FOR USING BCRYPT  -->
    <dependency>
        <groupId>org.mindrot</groupId>
        <artifactId>jbcrypt</artifactId>
        <version>0.4</version>
    </dependency>

    <!-- DEPENDENCIES FOR BOOTSTRAP -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>webjars-locator</artifactId>
        <version>0.30</version>
    </dependency>
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>bootstrap</artifactId>
        <version>5.0.1</version>
    </dependency>
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>jquery</artifactId>
        <version>3.6.0</version>
    </dependency>
</dependencies> 
```


### display delete form as an <a> tag
```css
form input[type="submit"] {
    background: none;
    border: none;
    color: blue;
    text-decoration: underline;
    cursor: pointer;
}
```