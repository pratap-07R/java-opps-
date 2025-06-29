// package com.pratap.javaoops.methods;

class computer 
{
    public void PlayMusic(){
        System.out.println("playing music");

    }

    public String getMeAPen(int cost)
    {
        return "pen";
    }

}

public class demo{
    public static void main(String[] args) {
        
        computer obj = new computer();
        obj.PlayMusic();
        obj.getMeAPen(12);


    }
}

/*
 METHOD OVERLOADING
 => When you have 2 or more than two methods with same parameter or diffrent parameter with same name that is called method 
 overloading 

 => every methods have their own stack
 
 */

