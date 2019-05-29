package PracticeGroupStudy;
import java.util.*;
	/**
	 * represents basic Color class example
	 */
	public class Color {
	    //rgb array with 3 ints is used to hold r,g,b values
	    private int[] rgb = new int[3];

	    /**
	     * Available colors - ready with rgb code
	     */
	    
	    public final static int[] WHITE     = new int[]{255, 255, 255};
	    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
	    public final static int[] GRAY      = new int[]{128, 128, 128};
	    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
	    public final static int[] BLACK     = new int[]{0, 0, 0};
	    public final static int[] RED       = new int[]{255, 0, 0};
	    public final static int[] PINK      = new int[]{255, 175, 175};
	    public final static int[] ORANGE    = new int[]{255, 200, 0};
	    public final static int[] YELLOW    = new int[]{255, 255, 0};
	    public final static int[] GREEN     = new int[]{0, 255, 0};
	    public final static int[] MAGENTA   = new int[]{255, 0, 255};
	    public final static int[] CYAN      = new int[]{0, 255, 255};
	    public final static int[] BLUE      = new int[]{0, 0, 255};

//	String []colors ={"WHITE", "LIGHT_GRAY", "GRAY", "DARK_GRAY", "BLACK", "RED", "PINK", "ORANGE", "YELLOW", "GREEN", "MAGENTA", "CYAN", "BLUE"};
//	String [] colorNames = //{"white", "light gray", "gray", "dark gray", "black", "red", "pink", "orange", "yellow", "green", "magenta", "cyan", "blue"};

	    /**
	     * Public constructor accepts 3 ints that represent color code.
	     * assign 3 int parameters to rgb array indexes(0,1,2)
	     * @param r
	     * @param g
	     * @param b
	     */
	    public Color(int r, int g, int b){
	       //TODO
	       rgb[0] = r;
	       rgb[1] = g;
	       rgb[2] = b;
	    }

	    /**
	     * Public no- args constructor: sets default color as "white" (255,255,255)
	     * try to use this() keyword to call above constructor to set white color
	     */
	    public Color() {
	        //TODO
	       this(255, 255, 255);
	    }

	    /**
	     * Override toString(from Object class).
	     * Provides string description of the color like "red" ,"blue" based on
	     * rgb value.
	     * Compare value of rgb array with static color code arrays
	     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
	     * to compare 2 int arrays
	     * @returns a String color name like
	     * "white" or "blue"
	     * If rgb values does not match any available combinations, return "n/a"
	     *
	     * Ex:
	     * Color color = new Color();
	     * System.out.println(color.toString() ) ; // prints "white"
	     *
	     * Color color = new Color(255, 0, 0);
	     * System.out.println(color.toString() ) ; // prints "red"
	     * 
	     * Color color4 = new Color(192, 192, 192); 
	       System.out.println(color4 ) ; // prints "light gray"
	     */
	    public String toString() {
	    	String colorName ="";
	      for (int i = 0; i < rgb.length; i++) {
			if(Arrays.equals(rgb, WHITE )) {
				System.out.println("white");
				colorName="white";
			}else if(Arrays.equals(rgb, LIGHT_GRAY )) {
				System.out.println("light gray");
				colorName="light gray";
			}else if(Arrays.equals(rgb, GRAY )) {
				System.out.println("gray");	
				colorName="gray";
			}else if(Arrays.equals(rgb, DARK_GRAY )) {
				System.out.println("dark gray");
				colorName="dark gray";
			}else if(Arrays.equals(rgb, BLACK )) {
				System.out.println("black");
				colorName="black";
			}else if(Arrays.equals(rgb, RED )) {
				System.out.println("red");
				colorName="red";
			}else if(Arrays.equals(rgb, PINK )) {
				System.out.println("pink");
				colorName="pink";
			}else if(Arrays.equals(rgb, ORANGE )) {
				System.out.println("orange");
				colorName="orange";
			}else if(Arrays.equals(rgb, YELLOW )) {
				System.out.println("yellow");
				colorName="yellow";
			}else if(Arrays.equals(rgb, GREEN )) {
				System.out.println("green");
				colorName="green";
			}else if(Arrays.equals(rgb, MAGENTA )) {
				System.out.println("magenta");
				colorName="magenta";
			}else if(Arrays.equals(rgb, CYAN )) {
				System.out.println("cyan");
				colorName="cyan";
			}else if(Arrays.equals(rgb, BLUE )) {
				System.out.println("blue");
				colorName="blue";
			}else {
				colorName="n/a";
			}
		}
	     
	        
	        return colorName; //change this to return colors
	    }

	}


	  


