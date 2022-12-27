package com.jap;

public class MaxAge {
    int highest;

    public int getMaxAge(int [] age){
        for(int i=0;i<age.length;i++) {
            if (age[i] > highest) {
                highest = age[i];
            }
        }
        return highest;

    }

    public static void main(String[] args) {
                MaxAge obj=new MaxAge();
                int[] age={23,34,33,24,25,26,31};
                int x=obj.getMaxAge(age);
System.out.println("Oldest Player :"+ x);
    }
}
