public class hollowRectangle {
    public static void hollowRec(int row, int col) {
        //OUTER LOOP
        for(int i = 1; i<= row;i++){
            //INNER COLUMNS
            for(int j = 1; j<=col;j++){
                //CELL
                if(i == 1|| i == row || j == 1 || j == col){
                    //BOUNDARY CELLS
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollowRec(5, 4);
    }
    
}
