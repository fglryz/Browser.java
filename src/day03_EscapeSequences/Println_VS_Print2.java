package day03_EscapeSequences;

public class Println_VS_Print2 {
    public static void main(String[] args) {
        System.out.println("Knock Knock");//first it prints knock knock,then it append a new line.
        System.out.println("Who is this?");

        System.out.println("This is Java.");
        System.out.println("-----------------");
        System.out.print("Knock Knock.");
        System.out.print("Who is this?");

        System.out.print("This is Java.");
        System.out.println();
        System.out.println("-----------------");

        System.out.println("hello everyone?"
                + "How are you all today?" +
                "today we will learn Escape Sequences," +
                "and next week we will be Variables");

        System.out.print("Hello everyone ,How are you all today?");
        System.out.print("today we will learn Escape Sequences and" +
                " next week we will be Variables");
        System.out.println();}}



    //single line comment goes here.
    /*
    Topics:
    println method
    print method
    comments*/

