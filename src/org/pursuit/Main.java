package org.pursuit;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    private static int[] numbers = new int[5];  //this is how you create a new int Array
    private static ArrayList<String> myArrayList = new ArrayList<>();   //this is how you create an ArrayList
    private static Set<Integer> numberSet = new HashSet<>();  //this is how you create a new HashSet
    private static Map<String, Integer> numberMap = new HashMap<>();   //this is how you create a new HashMap
    private static Set<Character> letterrSet = new HashSet<>();  //this is how you create a new HashSet
    private static Map<Character, Integer> letterMap = new HashMap<>();   //this is how you create a new HashMap


    //Example of HashMap
//    private static void printEvenValues(Map<Integer, String> inputMap){  // Prompt: Given a Hashmap, if an Integer typed key is divisible by 2, print out its value
//        for(int key : inputMap.keySet()) {  //iterates through the set of keys
//            if (key % 2 == 0) {  //if key is divisible by 2
//                System.out.println(inputMap.get(key));  //this prints out its values
//            }
//        }
//        for (String value : inputMap.values()) {  //iterates through the collection of values
//            //do stuff
//        }
//    }

    public static void main(String[] args) {




//        printEvenValues(2, "hello");  //idk what is wrong

//        letterMap.clear();
//        printNumOfChars("Hello my name is Lola");  //a, 2
                                                         //e, 2   etc

//  Exercises - HashMaps and HashSets Question 1
//        ArrayList<Character> myArrayChar = new ArrayList<>();
//        myArrayChar.add('A');
//        myArrayChar.add('B');
//        myArrayChar.add('C');
//        myArrayChar.add('D');
//        myArrayChar.add('E');
//        myArrayChar.add('F');
//        myArrayChar.add('G');
//        myArrayChar.add('H');
//        myArrayChar.add('I');
//        myArrayChar.add('J');
//        myArrayChar.add('K');
//        myArrayChar.add('L');
//        myArrayChar.add('M');
//        myArrayChar.add('N');
//        myArrayChar.add('O');
//        myArrayChar.add('P');
//        myArrayChar.add('Q');
//        myArrayChar.add('R');
//        myArrayChar.add('S');
//        myArrayChar.add('T');
//
//        System.out.println(myArrayChar.contains('X'));

      //  Exercises - HashMaps and HashSets Question 2
//        HashMap<String, Character> myHashMap = new HashMap<>();
//        myHashMap.put("one", '1');
//        myHashMap.put("two", '2');
//        myHashMap.put("three", '3');
//        myHashMap.put("four", '4');
//        myHashMap.put("five", '5');
//        myHashMap.put("six", '6');
//        myHashMap.put("seven", '7');
//        myHashMap.put("eight", '8');
//        myHashMap.put("nine", '9');
//        myHashMap.put("ten", '0');

        //  Exercises - HashMaps and HashSets Question 3
//        HashMap<String, Integer> myHashMap = new HashMap<>();
//        myHashMap.put("one", 1);
//        myHashMap.put("two", 2);
//        myHashMap.put("three", 3);
//        myHashMap.put("four", 4);
//        myHashMap.put("five", 5);
//        myHashMap.put("six", 6);
//        myHashMap.put("seven", 7);
//        myHashMap.put("eight", 8);
//        myHashMap.put("nine", 9);
//        myHashMap.put("ten", 10);
//        myHashMap.put("eleven", 11);
//        myHashMap.put("twelve", 12);
//        myHashMap.put("thirteen", 13);
//        myHashMap.put("fourteen", 14);
//        myHashMap.put("fifteen", 15);
//
//        for(String newString : myHashMap.keySet()){  //this is a for each loop
//            if(newString.length() % 2 == 0){
//                System.out.println(myHashMap.get(newString));
//            }
//        }

        //  Exercises - HashMaps and HashSets Question 4
//        HashMap<Integer, String> greaterThan10 = new HashMap<>();
//        greaterThan10.put(1,"one");
//        greaterThan10.put(2,"two");
//        greaterThan10.put(3,"three");
//        greaterThan10.put(4,"four");
//        greaterThan10.put(5,"five");
//        greaterThan10.put(6,"six");
//        greaterThan10.put(7,"seven");
//        greaterThan10.put(8,"eight");
//        greaterThan10.put(9,"nine");
//        greaterThan10.put(10,"ten");
//        greaterThan10.put(11,"eleven");
//        greaterThan10.put(12,"twelve");
//        greaterThan10.put(13,"thirteen");
//        greaterThan10.put(14,"fourteen");
//        greaterThan10.put(15,"fifteen");
//        greaterThan10.put(16,"sixteen");
//        greaterThan10.put(17,"seventeen");
//        greaterThan10.put(18,"ighteen");
//        greaterThan10.put(19,"nineteen");
//        greaterThan10.put(20,"twenty");
//
//        for(Integer myInt: greaterThan10.keySet()){
//            if(myInt > 10){
//                System.out.println(greaterThan10.get(myInt));
//            }
//        }


//        int[] numbers = new int[5];
//        numbers[0] = 5;  //this is how you add values into an array
//        numbers[1] = 4;
//       // System.out.println(numbers);  //prints 5
//
//        numberSet.add(Integer.valueOf(5));   //this adds 5 to numberSet
//        numberSet.add(Integer.valueOf(10));
//        //System.out.println(numberSet);
//
//
//        numberMap.put("Lola", 29);  //use .put for HashMaps
//        numberMap.put("Student2", 29);
//        numberMap.put("Lola", 10);  //this will replace the original value of 29 that was originally set and now Lola is 15
//        Integer value = (Integer) numberMap.get("Lola");
////        System.out.println(value);  //prints 10
//
//        HashMap<String, String> animalFoods = new HashMap<>();
//        animalFoods.put("chipmunks", "seeds");
//        animalFoods.put("squirrels", "acorns");
//        animalFoods.put("bats", "mosquitoes");
//        animalFoods.put("park pigeons", "human souls");

//        for (String animal : animalFoods.keySet()){   // .keySet is used to get the keys
//            System.out.println(animalFoods.get(animal));  //this prints the value of the key; if you print 'animals' it will print the keys; if you print 'animalFoods' it will print both key and values
//        }


        // Exercises - Arrays and Arraylists Question 1
//        int[] intArray = new int[5];
//        char[] charArray = new char[10];
//        String[] stringArray = new String[7];

        // Exercises - Arrays and Arraylists Question 2
//        int[] intArray =  {1,2,3,4,5};
//        System.out.println(intArray.length);

        // Exercises - Arrays and Arraylists Question 3
//        int[] intArray = new int[1,2,3,4,5,6,7,8,9];
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

        // Exercises - Arrays and Arraylists Question 4
//        ArrayList<String> myArrayList = new ArrayList<>();
//        myArrayList.add("value 1");
//        myArrayList.add("value 2");
//        myArrayList.add("value 3");
//        myArrayList.add("value 4");
//        myArrayList.add("value 5");
//        myArrayList.add("value 6");
//        myArrayList.add("value 7");
//        myArrayList.add("value 8");
//        myArrayList.add("value 9");
//        myArrayList.add("value 10");
//        System.out.println(myArrayList);   myArrayIngteger.add(i+1);  //can change i+1 to anything you want like i*2 etc
//       //or try below like question 5 with the for loop

        // Exercises - Arrays and Arraylists Question 5
//        ArrayList<Integer> myArrayIngteger = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            myArrayIngteger.add(i+1);
//        }
//        System.out.println(myArrayIngteger);




        //Example of int ARRAY Class
//        int numberArray[] = {42, 21, 33, 98, 76};  //this is an array with 1 element
//
//        System.out.println(numberArray.length);      // .length is a property out Array that we can access that tells you how many elements are in the array
//        System.out.println(numberArray[0]);
//
//        int[] numberArray2 = new int[5];  //this int array is declared, and initialized with an array of exactly 5 int elements
//        System.out.println(numberArray2.length);
//
//        for (int i = 0; i < numberArray2.length; i++) {  //try to write your for loop to end with .length
//            System.out.println(numberArray2[i]);    //prints 0,0,0,0,0 bc java saves a place holder when the values aren't declared
//        }
//
//        for (int i = numberArray.length-1; i >= 0; i--) {  //this is how you pint it backwards
//            System.out.println(numberArray[i]);
//        }
//
//        Object[] objects = new Object[10];  // creating an instance of an object of array
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);  //prints out null 10 time because java saved the space for an object
//        }
//
//        for (int i = 0; i < numberArray2.length; i++) {
//            numberArray2[i] = (i * 7);
//            System.out.println(numberArray2[i]);
//        }
//
//        for (int i = 0; i < numberArray2.length; i++) {
//            System.out.println(numberArray2[i]);
//        }

//        String[] stringArray = {"Hello" + "," + " World!"};
//        System.out.println(stringArray[stringArray.length-1]);  //or can use a for loop below to print it
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//        }   // or can print it like below for loop
//
//        String completeString = "";
//        for (int i = 0; i < stringArray.length; i++) {
//            completeString += stringArray[i];
//        }
//        System.out.println(completeString);
//
//        int[] intArray = new int[5];
//        intArray[2] = 99;  //this is how you add a value in an array
//        System.out.println(intArray[2]);   //prints 99
//
//        int[] intArrayToAddOn = new int[6];  //this is how you change the size of an array, MUST create a new array
//        for (int i = 0; i < intArray.length; i++) {
//            intArrayToAddOn[i] = intArray[i];
//        }
//        intArrayToAddOn[intArrayToAddOn.length-1] = 11;
//        intArray = intArrayToAddOn;
//        System.out.println(intArray);  //or can jus do below, cant figure out what im missing
//
//        ArrayList<Integer> numList = new ArrayList<>();
//        //System.out.println(numList.size()); //prints 0 because there are no values assigned yet
//        numList.add(1);
//        //System.out.println(numList.get(0));  //prints 1
//        numList.add(3);
////        System.out.println(numList.get(1));  //prints 3
////        System.out.println(numList.size());  //prints 2
//
//        numList.remove(1);  //this removes the element at index of 1 , so there's only 1  element left at index 0
//        //System.out.println(numList.get(0));  //or uses an array like below
//
//        numList.add(20);
//        numList.add(30);
//        for (int i = 0; i < numList.size(); i++) {
//            System.out.println(numList.get(i));  //prints 1,20,30 because i originally had 1 in the list then added 2 and 3
//            System.out.println(numList.size());  //prints 3, 3 times because there are 3 numbers in the list
//        }




//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);  //prints 0,0,99,0,0 because theres 5 places saved in storage and we assigns index of 2 to equal 99
//        }


//        Apple apple = new Apple();
//        apple.iAmAnApple();
//
//        Apple apple2 = new Apple(){   //this is an anonymous class and the runtime class is nameless/ anonymous
//
//        };                               //you put semi colon at the end to end that class that anonymous you created
//        System.out.println(apple.getClass());  //this tells you the dynamic type class; the class at run time for the object

//        Apple apple = new Apple();
//        Apple apple02 = new Apple() {
//            @Override
//            public void iAmAnApple() {
//                System.out.println("I'm obviously an apple, this was clearly unnecessary...");
//            }
//        };
//
//        apple.iAmAnApple();
//        System.out.println(apple.getClass());
//        apple02.iAmAnApple();
//        System.out.println(apple02.getClass());

//        SubClassedInterface subClassedInterface = new SubClassedInterface();
//        subClassedInterface.pleaseOverrideMe();
//
//        SomeInterface someInterface = new SomeInterface() {  //this is an anonymous class
//            @Override
//            public void pleaseOverrideMe() {
//                System.out.println("I am overriding this method on the fly, I just want to create this instance for right now, and although I can use this object ,multiple times");
//            }
//
//            public void thisIsWeird() {  //this is a method we created inside the anonymous class
//                System.out.println("This is weird though, right? " + this.getClass().toString());
//            }
//        };

//      // Exercises - Anonymous Classes Question 4
//        Flier bird = new Flier() {
//            @Override
//            public void fly() {
//                System.out.println("I am a Parrot, and I fly with colorful feathers on my wings! But I'm anonymous, so you probably didn't know that....");
//            }
//        };


//
//      Mogwai mogwai = new Mogwai();
//        System.out.println(mogwai.isGremlin());

        // Exercises - Anonymous Classes Question2
//        Mogwai gremlin = new Mogwai(){
//            @Override
//            public boolean isGremlin(){
//                System.out.println("I am now a Gremlin! Someone poured water on me, and fed me after midnight! Muahahahahaha!!!!!");
//                return true;
//            }
//        };
//        System.out.println(gremlin.isGremlin());
//        System.out.println(gremlin.getClass());




//	    Game pathFinderGame = new PathFinderGame();
//	    pathFinderGame.startGame();

//	    Game guessingGame = new GuessingGame();
//        guessingGame.startGame();

    }

    //}
//    System.out.println(letterMap);
//
//    }
//        letterMap.remove(' ');
//
//        }
//            letterMap.put(input.charAt(i), 1);
//        } else {
//            letterMap.put(letter, ++value);
//            int value = letterMap.get(letter);
//        if (letterMap.containsKey(letter)) {
//
//        char letter = input.charAt(i);
//    for (int i = 0; i <= input.length() - 1; i++) {
//
//    Map<Character, Integer> letterMap = new HashMap<>();
//private static void printNumOfChars(String input) {
//    }
//        System.out.println(letterMap);
//        }
//            letterMap.remove(' ');  //this remove the spaces before each
//            }
//                letterMap.put(input.charAt(i), 1);
//            }else{
//                letterMap.put(letter, ++value);
//                int value = letterMap.get(letter);
//            if(letterMap.containsKey(letter)){
//
//            char letter = input.charAt(i);
//
//        for (int i = 0; i <= input.length()-1; i++) {
//        Map<Character, Integer> letterMap = new HashMap<>();
//    private static void printNumOfChars(String input){

}
