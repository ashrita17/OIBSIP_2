import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    static int min=1;
    static int max=100;
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int score=0;
        System.out.println("*****WELCOME TO NUMBER GUESSING GAME*****");
        boolean play=true;
        while(play){
            play=false;
            System.out.println("CHOOSE THE LEVEL OF DIFFICULTY \n1.EASY \n2.MEDIUM \n3.HARD");
            System.out.print("Enter your choice:");
            int lev=sc.nextInt();
            int number=rd.nextInt(max) + min;
            if(lev==1){
                int total_attempts=10;
                int atmt=0;
                System.out.println("\nGuess the Number between " + min + " and " + max);
                while(atmt<total_attempts){
                    int guess=sc.nextInt();
                    atmt++;
                    if(guess==number){
                       score=total_attempts-atmt;
                        System.out.println("CONGRATULATIONS!!!, You Have Guessed the Number Successfully. The Random Number is "+ number + "\nScore= "+ score + "\nAttempts= "+ atmt);
                        break;
                    }
                    else if(guess>number){
                        System.out.println("The Number is Less than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    else if(guess<number){
                        System.out.println("The Number is Greater than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    if(atmt==(total_attempts)){
                    System.out.println("Better Luck Next Time. You have Failed to  Guess the Number.The Random Number is "+ number);
                    }
                }
            }  
            else if(lev==2){
                int total_attempts=5;
                int atmt=0;
                System.out.println("Guess the Number between " + min + " and " + max);
                while(atmt<total_attempts){
                    int guess=sc.nextInt();
                    atmt++;
                    if(guess==number){
                       score=2*(total_attempts-atmt);
                        System.out.println("CONGRATULATIONS!!!, You Have Guessed the Number Successfully. The Random Number is "+ number + "\nScore= "+ score + "\nAttempts= "+ atmt);
                        break;
                    }
                    else if(guess>number){
                        System.out.println("The Number is Less than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    else if(guess<number){
                        System.out.println("The Number is Greater than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    if(atmt==(total_attempts)){
                    System.out.println("Better Luck Next Time. You have Failed to  Guess the Number.The Random Number is " + number);
                    }
                }
            }  
            else if(lev==3){
                int total_attempts=3;
                int atmt=0;
                System.out.println("Guess the Number between " + min + " and " + max);
                while(atmt<total_attempts){
                    int guess=sc.nextInt();
                    atmt++;
                    if(guess==number){
                       score=3*(total_attempts-atmt);
                        System.out.println("CONGRATULATIONS!!!, You Have Guessed the Number Successfully. The Random Number is "+ number + "\nScore= "+ score + "\nAttempts= "+ atmt);
                        break;
                    }
                    else if(guess>number){
                        System.out.println("The Number is Less than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    else if(guess<number){
                        System.out.println("The Number is Greater than "+guess+". Attempts Left = "+ (total_attempts - atmt));
                    }
                    if(atmt==(total_attempts)){
                    System.out.println("Better Luck Next Time. You have Failed to  Guess the Number.The Random Number is "+ number);
                    }
                }
            }  
            else{
                System.out.println("Invalid Input");
            }

            System.out.println("Do you want to play again?\n 1.Yes 2.No");
            System.out.print("Enter Your Choice:");
            int cont=sc.nextInt();
            if(cont==1){
                play=true;
            }
            else if(cont!=2){
                System.out.println("Invalid Input");
            }

        }
        System.out.println("GAME OVER");

    }

}