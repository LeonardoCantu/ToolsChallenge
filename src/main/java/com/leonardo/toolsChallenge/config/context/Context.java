package com.leonardo.toolsChallenge.config.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.support.Repositories;

import java.util.Optional;

@Configuration
public class Context<T> implements ApplicationContextAware {

    private static Repositories repositories;

    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        this.repositories = new Repositories(applicationContext);
    }

    public Optional<Object> getRepositoryFromClass(final Class<T> domainClass) {
        return repositories.getRepositoryFor(domainClass);
    }
}
