/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RegistrationLoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login key = new Login();
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username ");
        String name = scan.nextLine();
        if(key.checkUserName(name)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("Enter password ");
        String password = scan.nextLine();
        if(key.checkPasswordComplexity(password)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        
        System.out.println("Enter cellNumber ");
        String cellnumber = scan.nextLine();
        if(key.checkCellPhoneNumber(cellnumber)){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
            
        
        //checking whether the registration is successful or not
        
        String registractionMessage = key.registerUser(name, password, cellnumber);
        
        System.out.println(registractionMessage);
        if(registractionMessage=="User registered successfully."){
         
            
            //asking the user to login
            
            System.out.println("-----------------------");
            System.out.println("LOGIN");
             System.out.println("-----------------------");
             
             System.out.println("ENTER YOUR USERNAME: ");
             String loginUsername =scan.nextLine();
             
             System.out.println("ENTER YOUR PASSWORD: ");
             String loginPassword =scan.nextLine();
             
             boolean login = key.loginUser(loginUsername, loginPassword);
             
             String LoginInStatus = key.returnLoginStatus(login);
             
             System.out.println(LoginInStatus);
        }
        
             
    }
       
}
