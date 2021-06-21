package com.maintest.main;

import java.util.stream.IntStream;

public class PrintingMultiples {
    public static void main(String[] args) {
        PrintingMultiples printingMultiples = new PrintingMultiples();
       // printingMultiples.simplePrintMultiples();
        printingMultiples.usingStreamPrintMultiples();
    }
    public void simplePrintMultiples(){

        for(int i=1;i<=100;i++){
            valueCheckerFizBuzz(i);
        }

    }
    private void usingStreamPrintMultiples(){
        IntStream.rangeClosed(1,100).forEach((i)->{
            valueCheckerFizBuzz(i);
        });
    }
    private void valueCheckerFizBuzz(int i) {
        if(i %3==0){
            if(i %5==0){
                System.out.println("FizzBuzz");
            }
            System.out.println("Fizz");
        }else if(i %5==0){
            if(i %3==0){
                System.out.println("FizzBuzz");
            }
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
    }


}
