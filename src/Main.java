public class Main {
    /*

    На шахматной доске расставить 8 ферзей так,
    чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8

0x000000
0000x000
00x00000
     */

    public static void main(String[] args) {
        int[] queens = new int[8];
        Library.findPosition(0, queens);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("x ");
                } else {
                    System.out.print("o ");
                }
            }
            System.out.println();


        }
    }
}