/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleregresilinier;

/**
 *
 * @author Administrator
 */
public class Training {
    private double a;
    private double b;
    
    final private Proses obj;
    
    public Training (float [][]data){
        this.obj = new Proses(data);
        this.calculate_a();
        this.calculate_b();
        
       
        System.out.println("nilai a =" + this.a);
        System.out.println("nilai b =" + this.b);
        
    }
    public void calculate_a(){
        double temp1 = obj.get_sumY()*obj.get_sumX2();
        double temp2 = obj.get_sumX()*obj.get_sumXY();
        double temp3 = (obj.get_nData()*obj.get_sumX2())-obj.get_powersumX2();
        this.a = (temp1 - temp2)/temp3;
    }
    public void calculate_b(){
        double temp1 = (obj.get_nData()*obj.get_sumXY());
        double temp2 = obj.get_sumX()*obj.get_sumY();
        double temp3 = (obj.get_nData()*obj.get_sumX2())-obj.get_powersumX2();
        this.b = (temp1 - temp2)/temp3;
    }
    public double calculate_y(double x){
        double y = this.a+(this.b*x);
        double z = y - x;
        return y;
    }
}