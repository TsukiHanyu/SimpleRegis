package simpleregresilinier;

public class SimpleregresiLinier {

    public static void main(String[] args) {
        float [][] data = {{1,100},{2,130},{3,120},{4,110},{5,90},
            {6,70},{7,75},{8,100},{9,140},{10,160},{11,170}};
        Training objek = new Training(data);   
       System.out.println("nilai y :" + objek.calculate_y(1));
    }
    
}
