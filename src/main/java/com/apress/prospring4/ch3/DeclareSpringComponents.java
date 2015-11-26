package com.apress.prospring4.ch3;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.containsBean("messageProvider"));
        MessageProvider messageProvider = ctx.getBean("messageProvider",
                MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}