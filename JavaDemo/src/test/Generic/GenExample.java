
// A Simple Java program to show working of user defined Generic classes 
   
// We use < > to specify Parameter type 

package test.Generic;

class TestGeneric<T> 
{ 
    T obj; // An object of type T is declared 
  
    TestGeneric(T ob)  // constructor 
    {  
    	this.obj = ob;  
    } 
    
    public TestGeneric() {}
    
    public void display() 
    {
    	System.out.println("This type of object is\t"+obj.getClass().getName());
    }
    
    public T getObject()  
    { 
    	return this.obj; 
    } 
} 
   
// Driver class to TestGeneric above 
class GenExample 
{ 
    public static void main (String[] args) 
    { 
        TestGeneric t1= new  TestGeneric();
        
        TestGeneric<TestGeneric> tg= new TestGeneric(t1);
        
    	// instance of Integer type 
        TestGeneric <Integer> iObj = new TestGeneric<Integer>(15); 
        iObj.display();
        System.out.println(iObj.getObject()); 

        // instance of String type 
        TestGeneric <String> sObj = new TestGeneric<String>("Hello"); 
        sObj.display();
        System.out.println(sObj.getObject());        
       
        // instance of Double type 
        TestGeneric <Double> tObj = new TestGeneric<Double>(2.3); 
        tObj.display();
        System.out.println(tObj.getObject());       
    } 
}
