package ie.tudublin;

import C22414306.ConorVisual;
import example.CubeVisual;
import example.MyVisual;
import stayinit.stayinit;

public class Main  {
    
    public void startUI() 
    {
        String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new stayinit());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startUI();
    }
}
