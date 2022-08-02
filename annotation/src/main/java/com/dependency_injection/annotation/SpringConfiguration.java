package com.dependency_injection.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component(value = "com.dependency_injection.DependencyInjection.*")
public class SpringConfiguration {

}
