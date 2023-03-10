import java.util.ArrayList;


public class gof{
 
    private String[] dash;
// fill our array with -
public gof(int numDash){
    
    this.dash = new String[numDash];
    for (int i = 0; i < numDash; i++){
        this.dash[i] = "-";
    }
   }
// method to print our array as a square nxn
public static void printdash(gof array){
    int nrow = (int) Math.sqrt(array.dash.length);
    for (int i = 0; i <= Math.sqrt(array.dash.length) - 1; i++){
    for (int j = 0; j <= Math.sqrt(array.dash.length) - 1; j++){
        System.out.print(array.dash[i*nrow+j] + " ");
    }
    System.out.println();
    } 
    }
// specify a cell you want to make active
public static void beginGof(gof array, int index){
    for (int i = 0; i <= (array.dash.length) - 1; i++){
        if (i == index){
            array.dash[i] = "+";
        }
    }
    }
// find indices of active cells
public static int[] findIndexOfAsterisk(gof array){
      
    ArrayList<Integer> AsteriskIndex = new ArrayList<Integer>();

    for (int i = 0; i <= (array.dash.length) - 1; i++){
        if (array.dash[i] == "+"){
        AsteriskIndex.add(i);
        }
    }
    int[] result = new int[AsteriskIndex.size()];
    for (int i = 0; i < AsteriskIndex.size(); i++) {
        result[i] = AsteriskIndex.get(i);
    }
    return result;
    }
// find indices of inactive cells
public static int[] findIndexOfDash(gof array){
      
    ArrayList<Integer> DashIndex = new ArrayList<Integer>();

    for (int i = 0; i <= (array.dash.length) - 1; i++){
        if (array.dash[i] == "-"){
        DashIndex.add(i);
        }
    }
    int[] result = new int[DashIndex.size()];
    for (int i = 0; i < DashIndex.size(); i++) {
        result[i] = DashIndex.get(i);
    }
    return result;
    }


// method to count how many active cells around an active cells, then store it in an array
public static int[] changeIndex1(gof array, int[] AsteriskIndex){
    //constant and new array
        int nrow = (int) Math.sqrt(array.dash.length);
        ArrayList<Integer> changeResult1 = new ArrayList<Integer>();
    //count how many live cells nearby
    
    for (int i = 0; i < AsteriskIndex.length; i++){
        int count = 0;
        int p = AsteriskIndex[i];
        int p1 = p-nrow-1;
        int p2 = p-nrow;
        int p3 = p-nrow+1;
        int p4 = p+1;
        int p5 = p+nrow+1;
        int p6 = p+nrow;
        int p7 = p+nrow-1;
        int p8 = p-1;
        for (int j = 0; j < AsteriskIndex.length; j++){
            if (AsteriskIndex[j] == p1||AsteriskIndex[j] == p2||AsteriskIndex[j] == p3||AsteriskIndex[j] == p4||
                AsteriskIndex[j] == p5||AsteriskIndex[j] == p6||AsteriskIndex[j] == p7||AsteriskIndex[j] == p8){
                count = count + 1;
            }}
        changeResult1.add(count); 
    }
    
    int[] changeResult = new int[changeResult1.size()];
    for (int i = 0; i < changeResult1.size(); i++) {
        changeResult[i] = changeResult1.get(i);
    }
    
    return changeResult;
    }
 // method to count how many active cells around an inactive cells 
public static int[] changeIndex2(gof array, int[] AsteriskIndex, int[] DashIndex){
    //constant and new array
    int nrow = (int) Math.sqrt(array.dash.length);
    ArrayList<Integer> changeResult2 = new ArrayList<Integer>();
    //count how many live cells nearby
    for (int i = 0; i < DashIndex.length; i++){
        int count = 0;
        int p = DashIndex[i];
        int p1 = p-nrow-1;
        int p2 = p-nrow;
        int p3 = p-nrow+1;
        int p4 = p+1;
        int p5 = p+nrow+1;
        int p6 = p+nrow;
        int p7 = p+nrow-1;
        int p8 = p-1;
        for (int j = 0; j < AsteriskIndex.length; j++){
            if (AsteriskIndex[j] == p1||AsteriskIndex[j] == p2||AsteriskIndex[j] == p3||AsteriskIndex[j] == p4||
                AsteriskIndex[j] == p5||AsteriskIndex[j] == p6||AsteriskIndex[j] == p7||AsteriskIndex[j] == p8){
                count = count + 1;
        }}
        changeResult2.add(count);
    }

    int[] changeResult = new int[changeResult2.size()];
    for (int a = 0; a < changeResult2.size(); a++) {
        changeResult[a] = changeResult2.get(a);
    }
    
    return changeResult;

}
//micro rules of game of life: https://www.researchgate.net/figure/Some-transition-rules-for-the-Game-of-Life_fig1_268437334

public static void aRoundOfGof(gof array, int[] AsteriskIndex, int[] CountAsterisk, int[] DashIndex, int[] CountDash){
    for (int i = 0; i < AsteriskIndex.length; i++){
        if (CountAsterisk[i] == 1||CountAsterisk[i] == 0){
            array.dash[AsteriskIndex[i]] = "-";
        }
        if (CountAsterisk[i] >= 4){
            array.dash[AsteriskIndex[i]] = "-";
        }
        if (CountAsterisk[i] == 3){
            array.dash[AsteriskIndex[i]] = "+";
        }
    }

    for (int j = 0; j < DashIndex.length; j++){
        if (CountDash[j] == 3){
            array.dash[DashIndex[j]] = "+";
        }
    }
}
//reset our grid
public static void clearAll(gof array){
        for (int i = 0; i < array.dash.length; i++){
            array.dash[i] = "-";
        }


}

}




    





