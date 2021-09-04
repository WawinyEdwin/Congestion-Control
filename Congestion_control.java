/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congestion_control;
import java.util.Scanner;
/**
 *
 * @author edw1n
 */
public class Congestion_control {
int stayHours;
int standardHours;
int congestionFee;
int hourOfDay;
int dayOfWeek;
int extraHours;
int flatFee = 200;
int pwd;
String carPlate;

Scanner sc = new Scanner(System.in);
    public void userInput(){
        System.out.println("ENTER THE CAR REGISTRATION NUMBER");
        carPlate = sc.nextLine();
        System.out.println("ENTER THE DAY OF THE WEEK");
        dayOfWeek = sc.nextInt();
        System.out.println("ENTER THE HOUR OF THE DAY");
        hourOfDay = sc.nextInt();
        System.out.println("ENTER THE NUMBERS OF HOURS EXPECTED TO STAY IN THE CITY");
        stayHours = sc.nextInt();
        System.out.println("ARE YOU A PERSON WITH DISABILIT");
        pwd = sc.nextInt();
    }
    public void calcCongestion(){
        if (pwd==0){
            if (stayHours<=3){
                congestionFee = (flatFee + (stayHours*150));
            }else if (stayHours>3){
                extraHours = stayHours - standardHours;
                congestionFee = (flatFee + (standardHours*150) + (extraHours*300));
            }else{
                System.out.println("invalid");
            }
        }else if (pwd==1){
            System.out.println("persons with disability not billed!");
        }else{
            System.out.println("invalid");
        }
    }
    public void printTicket(){
        System.out.println("------------KISII COUNTY TRAFFIC CONTROL------------");
        System.out.println("CAR PLATE NUMBER:" + carPlate);
        System.out.println("DAY OF THE WEEK:" + dayOfWeek);
        System.out.println("HOUR OF THE DAY:" + hourOfDay);
        System.out.println("NUMBER OF HOURS IN THE CITY:" + stayHours);
        System.out.println("PWD STATUS:" + pwd);
        System.out.println("TIP:Travelling with a friend saves time!");
    }
    public static void main(String[] args) {
    new Congestion_control().userInput();
    new Congestion_control().calcCongestion();
    new Congestion_control().printTicket();
    }
    
}
