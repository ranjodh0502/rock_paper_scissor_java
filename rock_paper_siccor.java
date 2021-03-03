package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_siccor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper and 2 for scissor");
        int user= sc.nextInt();

        Random random = new Random();
        int comp= random.nextInt(3);

        if(user==comp){
            System.out.println("Its a draw game");
        }
        else if(user==0 && comp==2 || user==1 && comp==0 || user==2 && comp==1){
            System.out.println("You win");

        }
        else{
            System.out.println("Computer wins");
        }
        System.out.printf("Computer chose %d",comp);

    }
}
