/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author Maga
 */
public class Cordinate {
    public static final float XMIN =-10.0f;
    public static final float XMAX =20.0f;
    public static final float YMIN =-10.0f;
    public static final float YMAX =20.0f;
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200 ;
    public static final int toScreenX(float X){
        return (int) ((XMIN - X)*WIDTH/(XMIN-XMAX));
            
    }
        
            
        
    public static final int toScreenY(float Y){
        return (int) ((YMAX-Y)*HEIGHT/(YMAX-YMIN));
            
        }
    }


