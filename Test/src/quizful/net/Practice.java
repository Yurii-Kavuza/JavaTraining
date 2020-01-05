package quizful.net;

import java.util.*;

public class Practice implements A, B { 
    public static void main(String[] args) { 
    	System.out.println(A.text); //Выведет "a" 
    	System.out.println(B.text); //Выведет "b" 
    } 
} 
interface A { 
    String text = "a"; 
} 
 
interface B { 
    String text = "b"; 
} 
 