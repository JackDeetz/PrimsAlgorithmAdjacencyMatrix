public class main
{
    public static void main(String[] args)
    {
        MST minimumSpanningTree = new MST() ;

        System.out.println("\t\t~~~Prim's Minimum Spanning Tree~~~");
        System.out.println("~~~~~Find the minimum sum of weight to have every vertex connected~~~");
        System.out.println("~~~(is not start to finish continuous route but a minimum connection of 1 and no cycles)~~~");
        System.out.println("~~~(one vertex can have any number of connections)~~~");


        System.out.println("1) start at an arbitrary vertex, travel to any adjacent Vertex with the smallest edge weight");
        System.out.println("2) of all edges available to un-touched vertexes from any of the already touched vertexes, travel the smallest edge weight path");
        System.out.println("3) keep sum of all edges traversed");
        System.out.println("4) repeat step 2 until all vertexes have been visited.\n\n");

        int[][] array = new int[9][9] ;
        for (int i = 0 ; i <= 8 ; i ++)         //set all default values to 0
            for (int j = 0 ; j <= 8 ; j++)
                array[i][j] = 0 ;

        //fill the adjacent matrix
        array[0][1] = 4 ;
        array[0][7] = 8 ;
        array[1][2] = 8 ;
        array[1][7] = 11 ;
        array[1][0] = 4 ;
        array[2][1] = 8 ;
        array[2][3] = 7 ;
        array[2][5] = 4 ;
        array[2][8] = 2 ;
        array[3][2] = 7 ;
        array[3][4] = 9 ;
        array[3][5] = 10 ;
        array[4][3] = 9 ;
        array[4][5] = 10 ;
        array[5][2] = 4 ;
        array[5][3] = 14 ;
        array[5][4] = 10 ;
        array[5][6] = 2 ;
        array[6][5] = 2 ;
        array[6][7] = 1 ;
        array[6][8] = 6 ;
        array[7][0] = 8 ;
        array[7][1] = 11 ;
        array[7][6] = 1 ;
        array[7][8] = 7 ;
        array[8][2] = 2 ;
        array[8][6] = 6 ;
        array[8][7] = 7 ;

        minimumSpanningTree.primMST(array);
    }
}
