package test.loader;
import test.pieces.*;
import java.awt.*;

public class Loader {
    Piece[][] pieceCollection = new Piece[10][11];

    public Piece[][] load(){
        loadingWhiteOnes();
        loadingBlackOnes();
        return pieceCollection;
    }


     //White pieces loader

    private void loadingWhiteOnes(){
        pieceCollection[0][0] = new DogEatingBug(0,0, Color.WHITE);
        pieceCollection[0][2] = new DogEatingBug(0,2, Color.WHITE);
        pieceCollection[0][3] = new DrunkenKnight(0,3, Color.WHITE);
        pieceCollection[0][4] = new DrunkenKnight(0,4, Color.WHITE);
        pieceCollection[0][5] = new MagicCat(0,5, Color.WHITE);
        pieceCollection[0][6] = new MagicCat(0,6, Color.WHITE);
        pieceCollection[0][7] = new RecklessCanibal(0,7, Color.WHITE);
        pieceCollection[0][8] = new RecklessCanibal(0,8, Color.WHITE);
        pieceCollection[0][9] = new SandTurtle(0,9, Color.WHITE);
        pieceCollection[0][10] = new SandTurtle(0,10, Color.WHITE);
        pieceCollection[0][1] = new SofisticatedSam(0,1, Color.WHITE);

    }


     //black pieces loader

    private void loadingBlackOnes() {
        pieceCollection[9][0] = new DogEatingBug(9,0, Color.BLACK);
        pieceCollection[9][2] = new DogEatingBug(9,2, Color.BLACK);
        pieceCollection[9][3] = new DrunkenKnight(9,3, Color.BLACK);
        pieceCollection[9][4] = new DrunkenKnight(9,4, Color.BLACK);
        pieceCollection[9][5] = new MagicCat(9,5, Color.BLACK);
        pieceCollection[9][6] = new MagicCat(9,6, Color.BLACK);
        pieceCollection[9][7] = new RecklessCanibal(9,7, Color.BLACK);
        pieceCollection[9][8] = new RecklessCanibal(9,8, Color.BLACK);
        pieceCollection[9][9] = new SandTurtle(9,9, Color.BLACK);
        pieceCollection[9][10] = new SandTurtle(9,10, Color.BLACK);
        pieceCollection[9][1] = new SofisticatedSam(9,1, Color.BLACK);

    }

    public static void  renderingTheSquares(Graphics g){
        renderingBlackAndWhiteSquares(g);
    }

    private static void renderingBlackAndWhiteSquares(Graphics g){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 11; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLACK);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
                else {
                    g.setColor(Color.WHITE);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
            }
        }
    }

}
