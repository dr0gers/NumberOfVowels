/************************************************************************
* Name: Derrick Rogers                                          CSC 156
* Date: 03/11/2023                                              Lab 3   
*************************************************************************
* Statement: This is a GUI based program that asks a user to input a string
and then extracts that string using an input dialog. After that the program
will determine the number of characters in the string, the total number of
each type of vowel in the string (includeing lowercase and uppercase instances)
and then display the string, the number of characters and the number of each
type of vowel in an output dialog. The program will then ask the user if they
want to enter another string and if they do, it will display the same
information (user's string, number of characters and number of each type of vowel)
in an output dialog. The program will continue to ask the if the user wants to enter
another string until the user enters 'No' or 'no.'
* 
* Specifications:
*
* Input: User's String
*  
* Output: Graphic User Interface dialog box for program information, user input and 
program output
User's String
Number of characters in userString of type String and int
Number of each type of vowel in userString as type String and type int
* 
************************************************************************/

// header files for JOptionPane methods
import javax.swing.JOptionPane;

// declaration of the class
public class Vowels
{
    
    // declaration of the main program
    
    public static void main(String[] args)
    {
        String userString;
        int numberOfChars;
        String userStringLower;
        int numberOfA = 0;
        int numberOfE = 0;
        int numberOfI = 0;
        int numberOfO = 0;
        int numberOfU = 0;
        String searchAgain;

        JOptionPane.showMessageDialog(null, "This program ask you for a sentence or string. It then searches that string"
                                        + " for all vowles and displays the number of times each vowel appears in the"
                                        + " string as well as the total number of characters in the string.", "Vowels Project", JOptionPane.INFORMATION_MESSAGE);
        
        do{
            userString = JOptionPane.showInputDialog(null, "Enter the string to be searched:", "Input", JOptionPane.QUESTION_MESSAGE);
            userStringLower = userString.toLowerCase();
            numberOfChars = userString.length();

            for(int x = 0; x < userStringLower.length(); x++){
                char c = userStringLower.charAt(x); 
                if(c == 'a'){
                    numberOfA++;
                }
                else if(c == 'e'){
                    numberOfE++;
                }
                else if(c == 'i'){
                    numberOfI++;
                }
                else if(c == 'o'){
                    numberOfO++;
                }
                else if(c == 'u'){
                    numberOfU++;
                }
            }


            JOptionPane.showMessageDialog(null, '"' + userString + '"' + " has " + numberOfChars + " characters."
                                            + System.lineSeparator() + " "
                                            + System.lineSeparator() + "There are :"
                                            + System.lineSeparator() + numberOfA + " a's"
                                            + System.lineSeparator() + numberOfE + " e's"
                                            + System.lineSeparator() + numberOfI + " i's"
                                            + System.lineSeparator() + numberOfO + " o's"
                                            + System.lineSeparator() + numberOfU + " u's.", "Output", JOptionPane.INFORMATION_MESSAGE);

            searchAgain = JOptionPane.showInputDialog(null, "Would you like to search another string? ('Yes' or 'No')", "Input", JOptionPane.QUESTION_MESSAGE);
            numberOfA = 0;
            numberOfE = 0;
            numberOfI = 0;
            numberOfO = 0;
            numberOfU = 0;
            

        } while(!searchAgain.equalsIgnoreCase("No"));



    } // end of main
}// end of class

