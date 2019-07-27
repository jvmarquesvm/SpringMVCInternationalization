 package com.padrao.spring.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class SpringMVCConfiguration extends WebMvcConfigurerAdapter {

		@Bean
		public MessageSource messageSource() {
			ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
			resource.setBasename("messages");
			return resource;
		}
		
		@Bean
		public SessionLocaleResolver localeResolver() {
			SessionLocaleResolver session = new SessionLocaleResolver();
			//Não foi possível encontrar locale para PT, foi necessário colocar o arquivo message como raiz - português
			//session.setDefaultLocale(Locale.US);
			session.setDefaultLocale(Locale.ROOT);
			return session;
		}
		
		@Bean
		public LocaleChangeInterceptor localeChangeInterceptor() {
			LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
			localeChangeInterceptor.setParamName("lang");
			return localeChangeInterceptor;
		}
		
		@Override
		public void addInterceptors(InterceptorRegistry interceptorRegistry) {
			interceptorRegistry.addInterceptor(localeChangeInterceptor());
		}
}
