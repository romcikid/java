package com.company;
import java.util.Random;

public class omer2 {

    public  char[][] arr=new char[5][6];
        Random r=new Random();
        class  randomz{


            public void hi(){
                for (int i=0;i<5;i++){
                    for (int j=0;j<6;j++){
                        arr[i][j]=(char)(r.nextInt(26)+'a');
                    }

                }
            }
        }
        omer2 eli= new omer2();
        class Mas
        {

            public void zapl(){
                for (int i=0;i<5;i++){
                    for (int j=0;j<6;j++){
                        System.out.print(arr[i][j]);
                }
                System.out.println("");
            }

        }
        Mas elin= new Mas();
    }
}

