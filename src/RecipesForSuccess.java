import java.util.Scanner;
import java.text.*;
import java.util.*;

public class RecipesForSuccess
{
    // food #1 constants
    static final String FOOD_1_NAME = "strawberries";
    static final int FOOD_1_CALORIES_P100G = 32;  // in calories
    static final double FOOD_1_PROTEIN_P100G = 0.7;   // in grams
    static final double FOOD_1_SAT_FAT_P100G = 0.0;  // in grams
    static final double FOOD_1_SUGAR_P100G = 4.9;    //in grams
    static final double FOOD_1_CALCIUM_P100G = 16.0; // in milligrams
    static final double FOOD_1_VIT_C_P100G = 58.8;   // in milligrams
    // food #2 constants
    static final String FOOD_2_NAME = "kale";
    static final int FOOD_2_CALORIES_P100G = 50;  // in calories
    static final double FOOD_2_PROTEIN_P100G = 3.3;   // in grams
    static final double FOOD_2_SAT_FAT_P100G = 0.1;   // in grams
    static final double FOOD_2_SUGAR_P100G = 0.0;   // in grams
    static final double FOOD_2_CALCIUM_P100G = 135;  // in milligrams
    static final double FOOD_2_VIT_C_P100G = 120;   // in milligrams
    // food #3 constants
    static final String FOOD_3_NAME = "plain greek yogurt";
    static final int FOOD_3_CALORIES_P100G = 52;  // in calories
    static final double FOOD_3_PROTEIN_P100G = 8.8;   // in grams
    static final double FOOD_3_SAT_FAT_P100G = 0.0;   // in grams
    static final double FOOD_3_SUGAR_P100G = 4.0;   // in grams
    static final double FOOD_3_CALCIUM_P100G = 110;  // in milligrams
    static final double FOOD_3_VIT_C_P100G = 0.0;   // in milligrams
    // food #4 constants
    static final String FOOD_4_NAME = "crumbled goat cheese";
    static final int FOOD_4_CALORIES_P100G = 268;  // in calories
    static final double FOOD_4_PROTEIN_P100G = 18.5;   // in grams
    static final double FOOD_4_SAT_FAT_P100G = 14.6;   // in grams
    static final double FOOD_4_SUGAR_P100G = 0.9;   // in grams
    static final double FOOD_4_CALCIUM_P100G = 140;  // in milligrams
    static final double FOOD_4_VIT_C_P100G = 0.0;   // in milligrams
    // food #5 constants
    static final String FOOD_5_NAME = "almond slices";
    static final int FOOD_5_CALORIES_P100G = 581;  // in calories
    static final double FOOD_5_PROTEIN_P100G = 21.8;   // in grams
    static final double FOOD_5_SAT_FAT_P100G = 3.9;   // in grams
    static final double FOOD_5_SUGAR_P100G = 5.0;   // in grams
    static final double FOOD_5_CALCIUM_P100G = 216;  // in milligrams
    static final double FOOD_5_VIT_C_P100G = 0.0;   // in milligrams
    // food #6 constants
    static final String FOOD_6_NAME = "focaccia bread";
    static final int FOOD_6_CALORIES_P100G = 249;  // in calories
    static final double FOOD_6_PROTEIN_P100G = 8.8;   // in grams
    static final double FOOD_6_SAT_FAT_P100G = 0.9;   // in grams
    static final double FOOD_6_SUGAR_P100G = 1.8;   // in grams
    static final double FOOD_6_CALCIUM_P100G = 35.0; // in milligrams
    static final double FOOD_6_VIT_C_P100G = 0.0;   // in milligrams
    static final String INDENT = "   ";
    static final String SEPARATOR = "\n";
    public static void main(String[] args)
    {
        String recipeName, userInputStr;
        int userInputInt, userServingInt;
        double totalCals, totalProtein, totalSatFat, totalSugar, totalCalcium,
                totalVitC;
        Scanner inputStream = new Scanner(System.in);
        boolean userValidInput;
        userValidInput = true;
        // initialize accumulator variables
        totalCals =  0;
        totalProtein = 0.;
        totalSatFat =  0;
        totalSugar = 0;
        totalCalcium = 0;
        totalVitC = 0;
        // print menu
        System.out.println("­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­");
        System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
        System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
        System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
        System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
        System.out.println(INDENT + "Food #5: " + FOOD_5_NAME);
        System.out.println(INDENT + "Food #6: " + FOOD_6_NAME + SEPARATOR);
        // name of recipe
        System.out.print("What are you calling this recipe ? ");
        recipeName  = inputStream.nextLine();
        //number of servings
        System.out.print("How many servings are you making ? ");
        userInputStr = inputStream.nextLine();
        userServingInt = Integer.parseInt(userInputStr);
        if(userServingInt < 1 || userServingInt > 10)
        {
            userValidInput = false;
            System.out.print(SEPARATOR + 
                    "Sorry, serving size is invalid.");
        }      

        // food #1 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
        if(userValidInput == true)
        {
            System.out.print("How many grams of " + FOOD_1_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {
                // update accumulators
                totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_1_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_1_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_1_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_1_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_1_VIT_C_P100G / 100.);
            }
            else
            {
                userValidInput = false;
                System.out.print(SEPARATOR + 
                        "Sorry, you selected an invalid number of grams."); 
            }
        }
        
        // food #2 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­                
        if(userValidInput == true)
        {          
            System.out.print("How many grams of " + FOOD_2_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {   
                // update accumulators
                totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_2_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_2_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_2_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_2_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_2_VIT_C_P100G / 100.);
            }
            else
            {
                userValidInput = false;
                System.out.print(SEPARATOR + 
                        "Sorry, you selected an invalid number of grams.");
            }
        }
        
        // food #3 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
        if(userValidInput == true)
        {
            System.out.print("How many grams of " + FOOD_3_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {
                // update accumulators
                totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_3_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_3_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_3_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_3_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_3_VIT_C_P100G / 100.);
            }
            else
            {
                userValidInput = false;
                System.out.print(SEPARATOR + 
                        "Sorry, you selected an invalid number of grams.");
            }
        }
        
        // food #4 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
        if(userValidInput == true)
        {
            System.out.print("How many grams of " + FOOD_4_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {
                // update accumulators
                totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_4_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_4_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_4_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_4_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_4_VIT_C_P100G / 100.);
            }
            else
            {
                userValidInput = false;
            System.out.print(SEPARATOR + 
                    "Sorry, you selected an invalid number of grams.");
            }
        }

                            
        // food #5 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
        if(userValidInput == true)
        {
            System.out.print("How many grams of " + FOOD_5_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {   
                // update accumulators
                totalCals += userInputInt * (FOOD_5_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_5_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_5_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_5_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_5_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_5_VIT_C_P100G / 100.);                   
            }
            else
            {
                userValidInput = false;
                System.out.print(SEPARATOR + 
                        "Sorry, you selected an invalid number of grams.");  
            }
        }
        
        // food #6 ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­                
        
        if(userValidInput == true)
        {
            System.out.print("How many grams of " + FOOD_6_NAME + "? ");
            userInputStr = inputStream.nextLine();
            userInputInt = Integer.parseInt(userInputStr);
            
            if(userInputInt >= 0 && userInputInt <= 1000)
            {
                // update accumulators
                totalCals += userInputInt * (FOOD_6_CALORIES_P100G / 100.);
                totalProtein  += userInputInt * (FOOD_6_PROTEIN_P100G / 100.);
                totalSatFat  += userInputInt * (FOOD_6_SAT_FAT_P100G / 100.);
                totalSugar  += userInputInt * (FOOD_6_SUGAR_P100G / 100.);
                totalCalcium  += userInputInt * (FOOD_6_CALCIUM_P100G / 100.);
                totalVitC  += userInputInt * (FOOD_6_VIT_C_P100G / 100.); 
                // serving size adjuster
                totalCals = totalCals / userServingInt; 
                totalProtein = totalProtein / userServingInt; 
                totalSatFat  = totalSatFat / userServingInt;
                totalSugar  = totalSugar / userServingInt;
                totalCalcium  = totalCalcium / userServingInt;
                totalVitC  = totalVitC / userServingInt;
                inputStream.close();
                // report results ­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­
                System.out.println("\nNutrition data for " + recipeName + "­­­­­­­­­­­­");
                System.out.println(INDENT + "Servings: " + userServingInt + "­­­­­­­­­­­­");
                System.out.println(SEPARATOR + INDENT 
                        + "Nutritional value per serving:");
                NumberFormat truncate = NumberFormat.getInstance(Locale.US);
                truncate.setMaximumFractionDigits(1);
                System.out.println(SEPARATOR + INDENT + INDENT + "Calories: " 
                        + truncate.format(totalCals));
                System.out.println(INDENT + INDENT + "Protein: " 
                        + truncate.format(totalProtein) + " grams");
                System.out.println(INDENT + INDENT + "Saturated Fat: " 
                        + truncate.format(totalSatFat) + " grams");
                System.out.println(INDENT + INDENT + "Sugar: " 
                        + truncate.format(totalSugar) + " grams");
                System.out.println(INDENT + INDENT + "Calcium: " 
                        + truncate.format(totalCalcium) + " milligrams");
                System.out.println(INDENT + INDENT + "Vitamin: " 
                        + truncate.format(totalVitC) + " milligrams");
            }
            else
            {
                System.out.print(SEPARATOR + 
                        "Sorry, you selected an invalid number of grams.");
            }
        }  
    }
}
   

/* -------------- Sample Run 1 --------------------------------------------
­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Green Smoothie
How many servings are you making ? 2
How many grams of strawberries? 150
How many grams of kale? 60
How many grams of plain greek yogurt? 120
How many grams of crumbled goat cheese? 0
How many grams of almond slices? 40
How many grams of focaccia bread? 0

Nutrition data for Green Smoothie­­­­­­­­­­­­
   Servings: 2­­­­­­­­­­­­

   Nutritional value per serving:

      Calories: 186.4
      Protein: 11.2 grams
      Saturated Fat: 0.8 grams
      Sugar: 7.1 grams
      Calcium: 161.7 milligrams
      Vitamin: 80.1 milligrams
 * -------------------------------------------------------------------------*/ 


/* -------------- Sample Run 2 ---------------------------------------------
 List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Summer Kale Salad
How many servings are you making ? 4
How many grams of strawberries? 120
How many grams of kale? 120
How many grams of plain greek yogurt? 0
How many grams of crumbled goat cheese? 80
How many grams of almond slices? 60
How many grams of focaccia bread? 0

Nutrition data for Summer Kale Salad­­­­­­­­­­­­
   Servings: 4­­­­­­­­­­­­

   Nutritional value per serving:

      Calories: 165.3
      Protein: 8.2 grams
      Saturated Fat: 3.5 grams
      Sugar: 2.4 grams
      Calcium: 105.7 milligrams
      Vitamin: 53.6 milligrams
 * -------------------------------------------------------------------------*/ 


/* -------------- Sample Run 3 ----------------------------------------------
­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Simple Yogurt Bowl
How many servings are you making ? 1
How many grams of strawberries? 60
How many grams of kale? 0
How many grams of plain greek yogurt? 120
How many grams of crumbled goat cheese? 0
How many grams of almond slices? 30
How many grams of focaccia bread? 0

Nutrition data for Simple Yogurt Bowl­­­­­­­­­­­­
   Servings: 1­­­­­­­­­­­­

   Nutritional value per serving:

      Calories: 255.9
      Protein: 17.5 grams
      Saturated Fat: 1.2 grams
      Sugar: 9.2 grams
      Calcium: 206.4 milligrams
      Vitamin: 35.3 milligrams

 * -------------------------------------------------------------------------*/


/* -------------- Sample Run 4 -----------------------------------------------
­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Vegetarian Panini
How many servings are you making ? 6
How many grams of strawberries? 0
How many grams of kale? 100
How many grams of plain greek yogurt? 0
How many grams of crumbled goat cheese? 160
How many grams of almond slices? 0
How many grams of focaccia bread? 300

Nutrition data for Vegetarian Panini­­­­­­­­­­­­
   Servings: 6­­­­­­­­­­­­

   Nutritional value per serving:

      Calories: 204.3
      Protein: 9.9 grams
      Saturated Fat: 4.4 grams
      Sugar: 1.1 grams
      Calcium: 77.3 milligrams
      Vitamin: 20 milligrams
 * -------------------------------------------------------------------------*/ 


/* -------------- Sample Run 5 (with error message) --------------------------
­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Kale Dip
How many servings are you making ? 15

Sorry, serving size is invalid.
 * -------------------------------------------------------------------------*/


/* -------------- Sample Run 6 (with error message) --------------------------
 ­­­­­­­­­­ List of Possible Ingredients ­­­­­­­­­
   Food #1: strawberries
   Food #2: kale
   Food #3: plain greek yogurt
   Food #4: crumbled goat cheese
   Food #5: almond slices
   Food #6: focaccia bread

What are you calling this recipe ? Sauted Kale and Creamy Goat Cheese
How many servings are you making ? 10
How many grams of strawberries? 0
How many grams of kale? 1200

Sorry, you selected an invalid number of grams.
 * -------------------------------------------------------------------------*/






