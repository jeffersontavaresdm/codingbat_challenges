package strings_1;

/**
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye"
 * returns "HiByeByeHi".
 * <p>
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class MakeAbba {

  public static void main(String[] args) {
    System.out.println(makeAbba("Hi", "Bye"));
    System.out.println(makeAbba("Yo", "Alice"));
    System.out.println(makeAbba("Yo", "Alice"));
  }

  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}
