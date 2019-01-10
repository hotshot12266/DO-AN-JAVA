/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uilt;

/**
 *
 * @author nhuta
 */
public class CheckDataEntity {
    public static boolean  InputDataString(String input){
        if(input.equals("")||input == null){
            return false; 
        }else
            return true; 
    }
     public  static boolean  InputDataInt(int input){
        if(input < 0){
            return false; 
        }else
            return true; 
    }
}
