package question20;

//20. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Question20 {

  public static void main(String[] args) {

   Question20 que = new Question20();
   que.p1();

  }
  public void p1(){
   int[] n1 ={ 1252,5641,2314,1752,1359,1863};
   String[]n2 ={"Java","C++","Python","PHP","C#","C programming"};

   System.out.println("Original numeric array : "+ Arrays.toString(n1));
   Arrays.sort(n1);
   System.out.println("Sorted numeric array : "+Arrays.toString(n1));

   System.out.println("Original string array : "+Arrays.toString(n2));
   Arrays.sort(n2);
   System.out.println("Sorted string array : "+Arrays.toString(n2));
  }
}

