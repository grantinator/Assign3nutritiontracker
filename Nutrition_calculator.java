/*-----------
 Grant Baum
 Professor Harden
 Assignment 3
 1/29/2018
 CS1A
 Nutrition_calculator.java
 
 This program displays the user a menu of 5 food items (potato, tomato, cheddar cheese, celery, and butternut squash).
 The program requests from the user a name for their recipe, how many servings their recipe makes, and the number of
 grams for each of the five ingredients. The servings are error checked to be between 1-15, and the number of 
 grams for each ingredient are error checked to be between 0-1500g. After receiving the quantity of each ingredient 
 from the user, the program prints the nutritional breakdown of the selected nutrients for the recipe by serving.
 */
package assignment_3;
import java.util.Scanner;

public class Nutrition_calculator
	{
	   // food #1 constants
	   static final String FOOD_1_NAME = "potato";
	   static final int FOOD_1_CALORIES_P100G = 93;  // in calories
	   static final double FOOD_1_SOL_FIBER_P100G = 2.2;   // in grams
	   static final double FOOD_1_PROTEIN_P100G = 2.5; // in grams
	   static final double FOOD_1_FAT_P100G = 0.1; // in grams
	   static final double FOOD_1_CARB_P100G = 21.2; // in grams
	   
	   // food #2 constants
	   static final String FOOD_2_NAME = "tomato";
	   static final int FOOD_2_CALORIES_P100G = 18;  // in calories
	   static final double FOOD_2_SOL_FIBER_P100G = .12;   // in grams
	   static final double FOOD_2_PROTEIN_P100G = 0.9; // in grams
	   static final double FOOD_2_FAT_P100G = 0.2; // in grams
	   static final double FOOD_2_CARB_P100G = 3.9; // in grams
	   
	   // food #3 constants
	   static final String FOOD_3_NAME = "cheddar cheese";
	   static final int FOOD_3_CALORIES_P100G = 403;  // in calories
	   static final double FOOD_3_SOL_FIBER_P100G = 0.0;   // in grams
	   static final double FOOD_3_PROTEIN_P100G = 24.9; // in grams
	   static final double FOOD_3_FAT_P100G = 33.1; // in grams
	   static final double FOOD_3_CARB_P100G = 1.3; // in grams
	   
	   // food #4 constants
	   static final String FOOD_4_NAME = "celery";
	   static final int FOOD_4_CALORIES_P100G = 16;  // in calories
	   static final double FOOD_4_SOL_FIBER_P100G = 1.6;   // in grams
	   static final double FOOD_4_PROTEIN_P100G = 0.7; // in grams
	   static final double FOOD_4_FAT_P100G = 0.2; // in grams
	   static final double FOOD_4_CARB_P100G = 3.4; // in grams
	   
	   // food #5 constants
	   static final String FOOD_5_NAME = "butternut squash";
	   static final int FOOD_5_CALORIES_P100G = 45;  // in calories
	   static final double FOOD_5_SOL_FIBER_P100G = 2.0;   // in grams
	   static final double FOOD_5_PROTEIN_P100G = 1.0; // in grams
	   static final double FOOD_5_FAT_P100G = 0.1; // in grams
	   static final double FOOD_5_CARB_P100G = 11.7; // in grams
	   
	   //program constants
	   static final int MIN_SERVINGS = 1;
	   static final int MAX_SERVINGS = 15;
	   static final int MIN_INGREDIENT_GRAMS = 0;
	   static final int MAX_INGREDIENT_GRAMS = 1500;
	   
	   static final String INDENT = "   ";
	   static final String SEPARATOR = "\n";
	   
	   public static void main(String[] args)
	   {
		  // declare program variables
	      String recipeName, userInputStr;
	      int userInputInt, userInputServings;
	      double totalSolFiber, totalCals, totalProtein, totalFat, totalCarb;
	      Scanner inputStream = new Scanner(System.in);
	      
	      // initialize accumulator variables
	      totalSolFiber  = 0.;
	      totalCals =  0;
	      totalProtein = 0;
	      totalFat = 0;
	      totalCarb = 0;
	      
	      System.out.println("---------- List of Possible Ingredients ---------");
	      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
	      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
	      System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);      
	      System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
	      System.out.println(INDENT + "Food #5: " + FOOD_5_NAME + SEPARATOR);
	    
	      System.out.print("What are you calling this recipe ? ");
	      recipeName  = inputStream.nextLine();
	      
	      System.out.print("How many servings does this recipe make? ");
	      userInputStr = inputStream.nextLine();
	      userInputServings = Integer.parseInt(userInputStr);
	      if ((userInputServings < MIN_SERVINGS) || (userInputServings > MAX_SERVINGS))
	      {
	    	  	System.out.println("You enter an invalid number of servings.");
	    	  	return;
	      }
	      
	      System.out.print("How many grams of " + FOOD_1_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      
	      if ((userInputInt < MIN_INGREDIENT_GRAMS) || (userInputInt > MAX_INGREDIENT_GRAMS))
	      {
	    	  	System.out.println("You entered an invalid amount of " + FOOD_1_NAME);
	    	  	return;
	      }
	      
	    	  totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
	    	  totalSolFiber  += userInputInt * (FOOD_1_SOL_FIBER_P100G / 100.);
	    	  totalProtein += userInputInt * (FOOD_1_PROTEIN_P100G / 100.);
	    	  totalFat += userInputInt * (FOOD_1_FAT_P100G / 100.);
	    	  totalCarb += userInputInt * (FOOD_1_CARB_P100G / 100.);
	      
	      System.out.print("How many grams of " + FOOD_2_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      
	      if ((userInputInt < MIN_INGREDIENT_GRAMS) || (userInputInt > MAX_INGREDIENT_GRAMS))
	      {
	    	  	System.out.println("You entered an invalid amount of " + FOOD_2_NAME);
	    	  	return;
	      }
	      
	      totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
  	  	  totalSolFiber  += userInputInt * (FOOD_2_SOL_FIBER_P100G / 100.);
  	  	  totalProtein += userInputInt * (FOOD_2_PROTEIN_P100G / 100.);
  	  	  totalFat += userInputInt * (FOOD_2_FAT_P100G / 100.);
  	  	  totalCarb += userInputInt * (FOOD_2_CARB_P100G / 100.);
  	  	  
	      System.out.print("How many grams of " + FOOD_3_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      
	      if ((userInputInt < MIN_INGREDIENT_GRAMS) || (userInputInt > MAX_INGREDIENT_GRAMS))
	      {
	    	  	System.out.println("You entered an invalid amount of " + FOOD_3_NAME);
	    	  	return;
	      }
	      
	      totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
  	  	  totalSolFiber  += userInputInt * (FOOD_3_SOL_FIBER_P100G / 100.);
  	  	  totalProtein += userInputInt * (FOOD_3_PROTEIN_P100G / 100.);
  	  	  totalFat += userInputInt * (FOOD_3_FAT_P100G / 100.);
  	  	  totalCarb += userInputInt * (FOOD_3_CARB_P100G / 100.);
  	  	  
	      System.out.print("How many grams of " + FOOD_4_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      
	      if ((userInputInt < MIN_INGREDIENT_GRAMS) || (userInputInt > MAX_INGREDIENT_GRAMS))
	      {
	    	  	System.out.println("You entered an invalid amount of " + FOOD_4_NAME);
	    	  	return;
	      }
	      
	      totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
  	  	  totalSolFiber  += userInputInt * (FOOD_4_SOL_FIBER_P100G / 100.);
  	  	  totalProtein += userInputInt * (FOOD_4_PROTEIN_P100G / 100.);
  	  	  totalFat += userInputInt * (FOOD_4_FAT_P100G / 100.);
  	  	  totalCarb += userInputInt * (FOOD_4_CARB_P100G / 100.);
	      
	      System.out.print("How many grams of " + FOOD_5_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      
	      if ((userInputInt < MIN_INGREDIENT_GRAMS) || (userInputInt > MAX_INGREDIENT_GRAMS))
	      {
	    	  	System.out.println("You entered an invalid amount of " + FOOD_5_NAME);
	    	  	return;
	      }
	      
	      totalCals += userInputInt * (FOOD_5_CALORIES_P100G / 100.);
  	  	  totalSolFiber  += userInputInt * (FOOD_5_SOL_FIBER_P100G / 100.);
  	  	  totalProtein += userInputInt * (FOOD_5_PROTEIN_P100G / 100.);
  	  	  totalFat += userInputInt * (FOOD_5_FAT_P100G / 100.);
  	  	  totalCarb += userInputInt * (FOOD_5_CARB_P100G / 100.);
	      inputStream.close();
	      
	      totalCals /= userInputServings;
	      totalSolFiber /= userInputServings;
	      totalProtein /= userInputServings;
	      totalFat /= userInputServings;
	      totalCarb /= userInputServings;
	      
	      System.out.println(SEPARATOR + "Nutrition per serving for " + recipeName + "------------"); 
	      System.out.println(INDENT + "Calories: " + totalCals + "grams");
	      System.out.println(INDENT + "Soluble Fiber: " + totalSolFiber + " grams");   
	      System.out.println(INDENT + "Protein: " + totalProtein + "grams");
	      System.out.println(INDENT + "Fat: " + totalFat + "grams");
	      System.out.println(INDENT + "Carbs: " + totalCarb + "grams");
	   }
	}

/*----------sample runs-----------------
 ---------- List of Possible Ingredients ---------
   Food #1: potato
   Food #2: tomato
   Food #3: cheddar cheese
   Food #4: celery
   Food #5: butternut squash

What are you calling this recipe ? Grant's Special Dinner
How many servings does this recipe make? 4
How many grams of potato? 300
How many grams of tomato? 120
How many grams of cheddar cheese? 200
How many grams of celery? 400
How many grams of butternut squash? 725

Nutrition per serving for Grant's Special Dinner------------
   Calories: 374.2125grams
   Soluble Fiber: 6.9110000000000005 grams
   Protein: 17.107499999999998grams
   Fat: 17.06625grams
   Carbs: 42.326249999999995grams
   
---------- List of Possible Ingredients ---------
   Food #1: potato
   Food #2: tomato
   Food #3: cheddar cheese
   Food #4: celery
   Food #5: butternut squash

What are you calling this recipe ? potatos n cheese
How many servings does this recipe make? 3
How many grams of potato? 1000
How many grams of tomato? 275
How many grams of cheddar cheese? 420
How many grams of celery? 128
How many grams of butternut squash? 111

Nutrition per serving for potatos n cheese------------
   Calories: 914.1766666666667grams
   Soluble Fiber: 8.866 grams
   Protein: 44.687000000000005grams
   Fat: 46.979000000000006grams
   Carbs: 81.84133333333334grams
   
   
---------- List of Possible Ingredients ---------
   Food #1: potato
   Food #2: tomato
   Food #3: cheddar cheese
   Food #4: celery
   Food #5: butternut squash

What are you calling this recipe ? Veggie Pie
How many servings does this recipe make? 52
You enter an invalid number of servings.

---------- List of Possible Ingredients ---------
   Food #1: potato
   Food #2: tomato
   Food #3: cheddar cheese
   Food #4: celery
   Food #5: butternut squash

What are you calling this recipe ? Vegetable Combo
How many servings does this recipe make? 7
How many grams of potato? 223
How many grams of tomato? 111
How many grams of cheddar cheese? 92
How many grams of celery? 322
How many grams of butternut squash? 450

Nutrition per serving for Vegetable Combo------------
   Calories: 121.7357142857143grams
   Soluble Fiber: 2.7416000000000005 grams
   Protein: 5.176571428571428grams
   Fat: 4.570142857142857grams
   Carbs: 16.62842857142857grams

---------- List of Possible Ingredients ---------
   Food #1: potato
   Food #2: tomato
   Food #3: cheddar cheese
   Food #4: celery
   Food #5: butternut squash

What are you calling this recipe ? Fall Special Dinner
How many servings does this recipe make? 2
How many grams of potato? 100
How many grams of tomato? 158
How many grams of cheddar cheese? 72
How many grams of celery? 39
How many grams of butternut squash? 432

Nutrition per serving for Fall Special Dinner------------
   Calories: 306.12grams
   Soluble Fiber: 5.8268 grams
   Protein: 13.2215grams
   Fat: 12.379grams
   Carbs: 40.083999999999996grams

   
---------------------------------------------*/
