package com.company;

public class Main {

    public static void main(String[] args) {
       //99乘法表
        int count=1;
        for(int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
   }
}
