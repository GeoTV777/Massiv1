public class MassivTrio {
    public static void main(String[] args) {
//      int[][][] threeD = new int [3][4][5];
//      int i, j, k;
//
//      for (i=0; i<3; i++)
//          for (j = 0; j < 4; j++)
//              for (k = 0; k < 5; k++)
//                  threeD[i][j][k] = i * j * k;
//      for (i = 0; i < 3; i++) {
//          for (j = 0; j < 4; j++) {
//             for (k = 0; k < 5; k++)
//                 System.out.print(threeD[i][j][k] + " ");
//              System.out.println();
//          }
//          System.out.println();


            class Mass{
                double[][] m = {{0 * 0, 1 * 0, 2 * 0, 3 * 0}, {0 * 1, 1 * 1, 2 * 1, 3 * 1}, {0 * 2, 1 * 2, 2 * 2, 3 * 2}, {0 * 3, 1 * 3, 2 * 3, 3 * 3}
                };
                int i, j;
        for (i=0; i<4; i++) {
           for (j = 0; j < 4; j++) {
              System.out.print(m[i][j] + " ");
             }
             System.out.println();
                }
            }
        }

    }



