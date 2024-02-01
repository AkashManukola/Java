public class Nqueens {
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='_';
                
            }
        }
        nquee(board, 0);
    }
    public static void printboard(char board[][]){
        System.out.println("******Chess*******");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nquee(char board[][],int rows){
        //base case
        if(rows==board.length){
            printboard(board);
            return;
        }
        //kaam
        for(int k=0;k<board.length;k++){
            board[rows][k]='Q';
            nquee(board, rows+1);//kaam
            board[rows][k]='_';//back track

        }
    }
    
}
