package com.chiku.implementations;

import com.chiku.interfaces.IOperation;
import org.springframework.stereotype.Component;

@Component
public class IOperationMultiplicationImpl implements IOperation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
