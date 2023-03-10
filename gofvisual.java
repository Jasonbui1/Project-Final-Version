import java.util.Scanner;
public class gofvisual {
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    gof square = new gof(400); //specify size of the grid
    int a = 0;
    System.out.println("This program includes 3 'Game of Life' visual effects.");

    while (a == 0){
        System.out.println("Enter: 1 to display Cross Center.\n       2 to display Pentadecathlon.\n       3 to display Figure Eight.");
        int b = in.nextInt();
        
        if (b == 1){
            CrossCenter.Visual1(square);
            gof.printdash(square);
            int x=4;
            while(x == 4){   
                System.out.println("\nEnter: 4 to see the next generation.\n       5 to stop and select another effect.");
                int y = in.nextInt();
                x=y;
                
                if(x==5){
                    gof.clearAll(square); //clear all the + signs before choosing a new effect
                    break;
                }

                int[] AsteriskIndex = gof.findIndexOfAsterisk(square);2
                int[] CountAsterisk = gof.changeIndex1(square, AsteriskIndex);
                int[] DashIndex = gof.findIndexOfDash(square);
                int[] CountDash = gof.changeIndex2(square, AsteriskIndex, DashIndex);           
                gof.aRoundOfGof(square, AsteriskIndex, CountAsterisk, DashIndex, CountDash );
                System.out.println("");
                gof.printdash(square);           
            }

            
        }
        if (b == 2){
            Pentadecathlon.Visual2(square);
            gof.printdash(square);
            int x=4;
            while(x == 4){   
                System.out.println("\nEnter: 4 to see the next generation.\n       5 to stop and select another effect.");
                int y = in.nextInt();
                x=y;

                if(x==5){
                    gof.clearAll(square);
                    break;
                }

                int[] AsteriskIndex = gof.findIndexOfAsterisk(square);
                int[] CountAsterisk = gof.changeIndex1(square, AsteriskIndex);
                int[] DashIndex = gof.findIndexOfDash(square);
                int[] CountDash = gof.changeIndex2(square, AsteriskIndex, DashIndex);           
                gof.aRoundOfGof(square, AsteriskIndex, CountAsterisk, DashIndex, CountDash );
                System.out.println("");
                gof.printdash(square);            
            }
            
        }
        if (b == 3){
            FigureEight.Visual3(square);
            gof.printdash(square);
            int x=4;
            while(x == 4){   
                System.out.println("\nEnter: 4 to see the next generation.\n       5 to stop and select another effect.");
                int y = in.nextInt();
                x=y;

                if(x==5){
                    gof.clearAll(square);
                    break;
                }

                int[] AsteriskIndex = gof.findIndexOfAsterisk(square);
                int[] CountAsterisk = gof.changeIndex1(square, AsteriskIndex);
                int[] DashIndex = gof.findIndexOfDash(square);
                int[] CountDash = gof.changeIndex2(square, AsteriskIndex, DashIndex);           
                gof.aRoundOfGof(square, AsteriskIndex, CountAsterisk, DashIndex, CountDash );
                System.out.println("");
                gof.printdash(square);
            }
            
        }
    
        

        }

        }
    
    
    }
    
    
    
    
    

    




