package C22414306;

public class Main
{

   public void helloProcessing()
   {
       String[] a = {"MAIN"};

       processing.core.PApplet.runSketch( a, new ConorVisual());
       
   }
   
   public static void main(String[] args)
   {
       System.out.println("Hello world");
    
       Main m = new Main();

       m.helloProcessing();
   }
   
}