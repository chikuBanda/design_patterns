package com.chiku;

import com.chiku.interfaces.IOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("clientAnn")
public class Client {

    @Autowired
    @Qualifier("ioperationMultiplicationImpl")
    private IOperation operation;

    /*public Client(IOperation operation) {
        this.operation = operation;
    }*/

    public Client(){
        System.out.println(">> Client: inside default constructor");
    }

    public int execute(int num1, int num2){
        return this.operation.doOperation(num1, num2);
    }
}
