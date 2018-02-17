package com.practice.nestedclass;

class OuterClass
{ 
    // static member
    static int outer_x = 10;
     
    // instance(non-static) member
    int outer_y = 20;
     
    // private member
    private static int outer_private = 30;
     
    // static nested class
    static class StaticNestedClass
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
             
            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
             
            // The following statement will give compilation error
            // as static nested class cannot directly access non-static members
            // System.out.println("outer_y = " + outer_y);
            
            //To access non-static members, we need to create an object of the enclosing class
            //and access the member variable through that object.
            OuterClass obj = new OuterClass();            
            System.out.println("outer_y = " + obj.outer_y);
         
        }
    }
}