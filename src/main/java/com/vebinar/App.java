package com.vebinar;

import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.TestBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();

        System.out.println( "Hello World!" + name );
    }
}
