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

