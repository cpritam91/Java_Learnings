package com.practice.nestedclass;

//Driver class
public class StaticNestedClassDemo
{
 public static void main(String[] args)
 {
     // accessing a static nested class
     OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
      
     nestedObject.display();
      
 }
}