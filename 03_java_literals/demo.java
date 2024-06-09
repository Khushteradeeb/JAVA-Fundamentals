class demo
{
    public static void main(String[] args) {


        // Here 100 is a constant/literal.
          int a = 100; 


        //   Integral literals
        //   For Integral data types (byte, short, int, long), we can specify literals in 4 ways:- 
        //   Decimal literals (Base 10): In this form, the allowed digits are 0-9.
            int b = 101;          
          
        
           // Octal literals (Base 8): In this form, the allowed digits are 0-7.
           // The octal number should be prefix with 0.
             int c = 0146; 




          // Hexa-decimal literals (Base 16): In this form, the allowed digits are 0-9, and characters are a-f. We can use both uppercase and lowercase characters as we know that java is a case-sensitive programming language, but here java is not case-sensitive.
          // The hexa-decimal number should be prefix
          // with 0X or 0x.
           int d = 0X123Face; 

           

          // Binary literals: From 1.7 onward, we can specify literal value even in binary form also, allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B.
           int e = 0b1111;

           


          //Floating-Point literal

          //For Floating-point data types, we can specify literals in only decimal form, and we cant specify in octal and Hexadecimal forms. 
          //Decimal literals(Base 10): In this form, the allowed digits are 0-9. 
           double f = 123.456;





          // Char literals
          //For char data types, we can specify literals in 4 ways: 
          // Single quote: We can specify literal to a char data type as a single character within the single quote.
          char g = 'a';
             



          //Char literal as Integral literal: 
          //we can specify char literal as integral literal, which represents the Unicode value of the character, and that integral literal can be specified either in Decimal, Octal, and Hexadecimal forms. But the allowed range is 0 to 65535.
          char h = 062;
          
         


         // Unicode Representation: 
         //We can specify char literals in Unicode representation ‘\uxxxx’. Here xxxx represents 4 hexadecimal numbers.
         char i = '\u0061';    // Here /u0061 represent a.


         
        // Escape Sequence: 
        //Every escape character can be specified as char literals.
         char j = '\n';


            
       System.out.println(a+" "+ b+" "+c+" "+d+" "+e+" "+" Char starts from here"+f+" "+g+" "+h+" "+i+" "+j );

    } 
}