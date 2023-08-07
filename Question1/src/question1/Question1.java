/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import java.util.Scanner;
//import java.util.
/**
 *
 * @author l2v79z957
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[20];
        int wordCount = 0;
        
         
         for(int i = 0; i < words.length; ++i){
         System.out.print("Enter Student name: ");
         words[i] = input.next();
         }
         
         
         showWords(words);
         
         howManyWords(words, wordCount);
         
    }
    
    public static void showWords(String[] words){
       for(int i = 0; i < 20; ++i){
           //String names = words[i];
           String word = words[i];
           System.out.println(word);
        }
    }
    
    public static void howManyWords(String[] words, int moreThanFour){
        for(int i = 0; i < 20; ++i){
            //System.out.print(characters);
            if(words[i].length() > 4){
                moreThanFour = moreThanFour + 1;
            }       
        }
        System.out.print("Number of names with more than four characters: " 
                + moreThanFour);
    }
}
