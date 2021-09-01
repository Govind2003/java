/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author S545524
 */
public class StringsAndNumbers {
    public static void main(String[] args){
     String string1 = "  Welcome    ";
     String string2 = " to ";
     String string3 = "  the first    ";
     String string4 = "Lab Activity ";
     String string5 = " in the   ";
     String string6 = " OOP Course ";
     
     String stringConcetenated = string1+string2+string3+string4+ string5+string6;
        System.out.println("OUTPUT:");
        System.out.println("************* String Class***********");
        System.out.println(stringConcetenated);
        String finalString = stringConcetenated.trim().replaceAll("\\s+", " ") + "!";
        System.out.println(finalString);
        System.out.println("Length of the above string is:" + finalString.length());
        String subString1 = finalString.substring(finalString.indexOf("L"),finalString.indexOf("y")+1);
        System.out.println("Retrieved: " + subString1);
        String capitalizedSubString = subString1.toUpperCase();
        System.out.println("Index of first I in 'LAB ACTIVITY' is at:" +capitalizedSubString.indexOf("I"));
     String string7 = "lab interesting activities are activities lab Interesting Lab Activities Are Interesting Lab activities Lab";
        System.out.println("First occurrence of Interesting is at:" +string7.indexOf("Interesting"));
     String string8 = "Object-Oriented-Programming 44542";
     String replacingString= string8.replaceAll("-", "_");
        System.out.println(replacingString);
     String replacedString= replacingString.replaceAll(" ", "-");
        System.out.println(replacedString);
     String string9 = "Computer";
     String string10 = "Science";
     String combinedString = string9.substring(0, 4)+ string10.substring(0, 3).toUpperCase()+ string9.length()+ string10.length();
        System.out.println("The ID is: " + combinedString);
     String string11 = "To learn java intensively";
        System.out.println("Why do you choose Applied Computer Science: " + string11);
        
     System.out.println("***************** Math Class ************");
     int value1= 9, value2= 13;
     double result = Math.sqrt(Math.pow(value1,2)+ Math.pow(value2,2));
        System.out.println("sqrt (value12 +value22):" +result);
     double euler = Math.exp(value1);
        System.out.println("exp (9):" + euler);
     double secant = 1/ Math.cos(value1);
        System.out.println("sec(9) :" + secant); 
     int myNumber = 27;
     double cubeRoot= Math.cbrt(myNumber);
        System.out.println("Cube root of 27.00:" + cubeRoot);
     double log= Math.log(myNumber);
        System.out.println("Logarithm value is:" + log);
     double tanTrignometry = Math.tan(60-45);
        System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) =" + tanTrignometry);
     double tanValue = Math.tan(90);
        System.out.println("Theoretical value of tan (90) is:" + tanValue);
     double cubeTanRoot= Math.abs(Math.cbrt(tanValue));
        System.out.println("Cubic root of modulus value of tan (90) is:" + cubeTanRoot);
     double cosecant30 = 1/ Math.sin(30);
     double secant30 = 1/ Math.cos(30);
        System.out.println("Cosecant of 30 is: " + cosecant30);
        System.out.println("secant of 30 is: " + secant30);
        System.out.println("Minimum value in Cosec (30) and Sec (30) is:" + Math.min(cosecant30,secant30));
        System.out.println("Maximum value in Cosec (30) and Sec (30) is:" + Math.max(cosecant30,secant30));
     int myNumber1= 45;
     int myNumber2= 27;
        System.out.println("Rounded Value of cos 45:" + Math.round(Math.cos(myNumber1)));
        System.out.println("Rounded Value of cos 27:" + Math.round(Math.cos(myNumber2)));
        System.out.println("Rounded Value of tan 45:" + Math.round(Math.tan(myNumber1)));
        System.out.println("Rounded Value of tan 27:" + Math.round(Math.tan(myNumber2)));
     double finalResult= Math.abs(8*Math.cos(myNumber2))* (Math.pow(Math.pow(7,4)+ (8*6*7*5), (double)1/4))/ Math.pow(Math.pow(5,2)- Math.pow(3,2),(double)1/8);
        System.out.println("The value of given equation is:" + finalResult);
     System.out.println("******************** RANDOM CLASS************");
     System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
     Random random= new Random();
     int random1 = random.nextInt(200);
     int random2=random.nextInt(200);
     int random3=random.nextInt(200);
     int random4=random.nextInt(200);
        System.out.println("First random integer value is" + random1+ " square of" + random1+ "is:" + Math.pow(random1,2));
        System.out.println("Second random integer value is" + random2+ " square of" + random2+ "is:" + Math.pow(random2,2));
        System.out.println("Third random integer value is" + random3+ " square of" + random3+ "is:" + Math.pow(random3,2));
        System.out.println("Fourth random integer value is" + random4+ " square of" + random4+ "is:" + Math.pow(random4,2));
        System.out.println("3 pseudo-random values with seed value and without bounds");
        System.out.println("Fifth random integer value is:" + random.nextInt());
        System.out.println("Sixth random integer value is:" + random.nextInt());
        System.out.println("Seventh random integer value is:" + random.nextInt());
     String randomResult="everytime got different result";
        System.out.println(randomResult);
     System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
     Random randomWithSeed= new Random(30);
     random1= randomWithSeed.nextInt(200);
     random2= randomWithSeed.nextInt(200);
     random3= randomWithSeed.nextInt(200);
     random4= randomWithSeed.nextInt(200);
         System.out.println("First random integer value is" + random1+ " square of" + random1+ "is:" + Math.pow(random1,2));
         System.out.println("First random integer value is" + random2+ " square of" + random2+ "is:" + Math.pow(random2,2));
         System.out.println("First random integer value is" + random3+ " square of" + random3+ "is:" + Math.pow(random3,2));
         System.out.println("First random integer value is" + random4+ " square of" + random4+ "is:" + Math.pow(random4,2));
         System.out.println("3 pseudo-random values with seed value and without bounds");
         System.out.println("Fifth random integer value is:" + randomWithSeed.nextInt());
         System.out.println("Sixth random integer value is:" + randomWithSeed.nextInt());
         System.out.println("Seventh random integer value is:" + randomWithSeed.nextInt());
         System.out.println("Got same results");
         System.out.println("Values never change when there is a seed in Random class");
        }
    }

    

