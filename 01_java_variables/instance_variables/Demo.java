class Demo {


   // This is a instance variable.
   // This variable in in a class not inside any function
    int engMarks;

    public static void main(String[] args) {

        // Creating the object
        Demo obj1 = new Demo();
     
        // giving value to object by calling  them
        obj1.engMarks = 50;


        // Displaying marks for obj1
        System.out.println("English marks are : " + obj1.engMarks);


    }

}