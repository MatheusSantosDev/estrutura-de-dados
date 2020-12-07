/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

/**
 *
 * @author anacris
 * 
 * fib(n) = 0, se n = 1
 * fib(n) = 1, se n = 2
 * fib(n) = fib(n-1) + fib(n-2), se n > 2
 * 
 * 0 1 1 2 3 5 8 13 21 34 55 ...
* 
* 
 */
public class Ex_03_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int n) {
       if (n == 1)
           return 0;
       
       if (n == 2)
           return 1;
       
       return fibonacci(n-1) + fibonacci(n-2);
       
    }
    
}
