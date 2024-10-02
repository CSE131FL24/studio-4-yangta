package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setCanvasSize(500,500);
		StdDraw.setPenColor(255, 175, 175);
		StdDraw.filledEllipse(0.5, 0.5, 0.35, 0.22);
		StdDraw.filledRectangle(0.3, 0.3, 0.04, 0.1);
		StdDraw.filledRectangle(0.7, 0.3, 0.04, 0.1);
		StdDraw.filledCircle(0.2, 0.62, 0.2);
		
		
		double[] x = {0.23, 0.38, 0.4};
		double[] y = {0.8, 0.7, 0.85};
		StdDraw.filledPolygon(x,y);

		double[] a = {0.17, 0.02, 0};
		double[] b = {0.8, 0.7, 0.85};
		StdDraw.filledPolygon(a,b);
		
		StdDraw.setPenColor(255, 150, 150);
		
		double[] c = {0.28, 0.35, 0.37};
		double[] d = {0.8, 0.73, 0.81};
		StdDraw.filledPolygon(c,d);

		double[] e = {0.11, 0.05, 0.03};
		double[] f = {0.8, 0.73, 0.81};
		StdDraw.filledPolygon(e,f);
		
		StdDraw.filledEllipse(0.2, 0.59, 0.1, 0.05);
		
		StdDraw.setPenColor();
		StdDraw.filledCircle(0.12, 0.69, 0.03);
		StdDraw.filledCircle(0.26, 0.69, 0.03);
		
		StdDraw.setPenColor();
		StdDraw.filledCircle(0.12, 0.69, 0.03);
		StdDraw.filledCircle(0.26, 0.69, 0.03);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.13, 0.68, 0.009);
		StdDraw.filledCircle(0.27, 0.68, 0.009);

		StdDraw.setPenColor(255, 100, 100);
		StdDraw.filledEllipse(0.175, 0.59, 0.008, 0.018);
		StdDraw.filledEllipse(0.225, 0.59, 0.008, 0.018);
		
		
		//Drawing the tail
		StdDraw.setPenColor();
		StdDraw.arc(0.1, 0.1, 0.5, 0.1, 0.1);


		




		
	}
}