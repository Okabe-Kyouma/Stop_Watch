package JDBC;

import java.util.Scanner;

public class Sql {

    public static void main(String[] args) throws Exception {


        int h1=0,h2=0,m1=0,m2=0,s1=0,s2=0;

        for(int a = 1;;a++){

            Thread.sleep(10);
            System.out.println(h1 + "" + h2+":"+m1+""+m2+":"+s1+""+ s2++);

            if(a%9==0){
                Thread.sleep(10);
                System.out.println(h1 + "" + h2+":"+m1+""+m2+":"+s1+""+ s2++);
                s2=0;
                s1++;

            }

            if(s1==6&& a%9==0 && m2<9){

                s1=0;
                s2=0;
                m2++;
            }

            if(s1==6 && a%9==0 && m2==9 && h2<9){
                m2=0;
                m1++;
                s1=0;
                s2=0;

            }

            if(m1==6){

                m1=0;
                h2++;
            }

            if(m1==0 && m2==0 && s1==0 && s2==0 && h2==9){

                h2=0;
                h1++;

            }

        }



        }
    }

