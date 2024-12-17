/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.config;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 *
 * @author emirh
 */
@Configuration
public class HibernateConfig {
      @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                       DataSource dataSource) {
        Map<String, String> properties = new HashMap<>();

        // Set Hibernate-specific properties
        properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        properties.put("hibernate.show_sql", "true"); // Enable SQL logging
        properties.put("hibernate.format_sql", "true"); // Pretty-print SQL logs
        properties.put("hibernate.hbm2ddl.auto", "update"); // Auto-update schema, change as needed

        return builder
                .dataSource(dataSource)
                .packages("com.gebzesosyalyardim.GebzeSosyalYardim.entities") // Scan for JPA entities
                .properties(properties)
                .build();
    }
}
