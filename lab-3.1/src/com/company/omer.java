package com.company;

import java.util.Random;

public class omer {
    private char simvol;
    Random r=new Random();
    class  randomz{

        private char simvol;
        public void hi(){
            simvol = (char)(r.nextInt(26)+'a');
        }
    }
    class Mas
    {
        public  char[][] arr=new char[5][6];
        public void zapl(){
            for (int i=0;i<30;i++){
                if (i%4==0)
                    System.out.print(simvol);
                else
                    System.out.println(simvol);
                }
            }

        }
    Mas eli=new Mas();
    }


