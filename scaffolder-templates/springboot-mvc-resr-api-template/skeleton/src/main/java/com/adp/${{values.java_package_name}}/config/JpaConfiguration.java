package com.adp.${{values.java_package_name}}.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.adp.${{values.java_package_name}}.repository")
@EnableJpaAuditing
public class JpaConfiguration {



}
