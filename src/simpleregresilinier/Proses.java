package simpleregresilinier;
import java.lang.Math;

public class Proses {
    private float [][]nilai;
        
    public Proses(float [][] data){
        this.nilai = data;          //atribut atau method pada class ini        
    }
    public void Cekdata(){
        int baris = this.nilai.length;
        int kolom = this.nilai[0].length;
        for (int i = 0; i<kolom; i++){
            for (int j = 0; j<baris; j++){
                System.out.print(this.nilai[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public float get_nData(){
        return this.nilai.length;
    }
    private float get_sum(int index){
        int baris = this.nilai.length;
        float sum = 0;
        for (int i = 0; i < baris ; i ++){
            sum = sum +  this.nilai[i][index];
        }
        return sum;
    }
    public float get_sumY(){
        return (this.get_sum(1));
    }
    public float get_sumX(){
        return (this.get_sum(0));
    }
    public double get_sumX2(){
        int baris = this.nilai.length;
        double sum = 0;
        for (int i = 0; i < baris ; i ++){
            
            sum = sum +  Math.pow(this.nilai[i][0], 2);
        }
        return sum;
    }
    public double get_sumXY(){
        int baris = this.nilai.length;
        double sum = 0;
        for (int i = 0; i < baris ; i ++){
            double x = this.nilai[i][0];
            double y = this.nilai[i][1];
            sum = sum +(x * y);
        }
        return sum;
    }
    public double get_powersumX2(){
        return Math.pow(this.get_sumX(), 2);
    }
}
