
class Article 
{
     
    // static variable
    public static double rating;
    
    public static void main(String[] args) {
     

        // We don't need to create object ot access the static variable..
        // we just have to write - class_name.variable_name;

        Article.rating = 4.5;
        System.out.println("Static Vriable Declaration as rating = " + Article.rating);
    }

}