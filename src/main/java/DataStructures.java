public class DataStructures {
    public static void main(String[] args) {
        int M = 10, N = 10;
        /**
         * Set Original Generation
         */
        String [][] square = {
                {"+","#","#","+","+","+","+","#","#","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","#","#","+","+","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","+","+","#","#","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
                {"+","+","+","+","+","+","+","+","+","+"},
        };
        System.out.println("Original Generation");
        /**
         * Print Original Generation
         */
        for(int i = 0; i<10;i++) {
            for(int j = 0; j<10;j++){
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

    nextGeneration(square, M, N);
}

    /**
     * Set Next Generation
     */
    static void nextGeneration(String square[][], int M, int N) {
        String[][] future ;
        System.out.println("Next Generation");

                for (int i = 0; i < M - 1; i++) {
                    for (int j = 0; j < N - 1; j++) {
                        if(square[i][j].matches("#")&& square[i][j+1].matches("#")){
                            square[i+1][j+1]="#";
                        }
                        else if ((square[i][j].matches("#")&& square[i][j+1].matches("#")) && square[i][j+2].matches("#")) {
                            square[i][j+2].replace("#","+");
                        }
                    }
                }
                future=square;
        /**
         * Print Next Generation
         */
                for(int i =0;i<M;i++) {
                    for (int j = 0; j <M ; j++) {
                        System.out.print(future[i][j]);
                    }
                    System.out.println();
                }
            }
        }