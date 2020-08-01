package com.example.spring7;

import org.springframework.stereotype.Component;

@Component
public class Sample {

   private  int data = 20;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
