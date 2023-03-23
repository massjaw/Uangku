package com.cashmanager.uangku;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UangkuApplicationContext {
    ApplicationContext context = new AnnotationConfigApplicationContext(CashManagerConfiguration.class);

}
