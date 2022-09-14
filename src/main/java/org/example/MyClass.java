package org.example;

public class MyClass {
    private int xVar;
    private int yVar;
    public MyClass(int x, int y){
        xVar = x;
        yVar = y;
    }
    public int getxVar(){
        return xVar;
    }
    public int getyVar(){
        return yVar;
    }
    public int sumXY(){
        return xVar + yVar;
    }

}
