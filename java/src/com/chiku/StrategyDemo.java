package com.chiku;

import com.chiku.implementations.IOperationAdditionImpl;
import com.chiku.implementations.IOperationSubtractionImpl;
import com.chiku.interfaces.IOperation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrategyDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // IOperation operation = new IOperationAdditionImpl();

        // Client client = new Client(operation);

        Client client = context.getBean("clientAnn", Client.class);

        System.out.println(client.execute(5, 1));

        context.close();
    }
}
