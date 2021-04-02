package test.board;
import test.pieces.Piece;
import java.awt.*;

public class Board {

    private Piece[][] pieceCollection;
    private Piece selectedPiece;

    public Board(Piece[][] pieceCollection) {
        this.pieceCollection = pieceCollection;
    }

    public Piece getSelectedPiece() {
        return selectedPiece;
    }


    public Piece getPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }


    public void setSelectedPiece(Piece selectedPiece) {
        this.selectedPiece = selectedPiece;
    }

      //moving the pieces

    public void move(int row, int col) {
        pieceCollection[row][col] = selectedPiece;
        pieceCollection[row][col].setCol(col);
        pieceCollection[row][col].setRow(row);
        pieceCollection[selectedPiece.getRow()][selectedPiece.getCol()] = null;
        selectedPiece = null;
    }

    public void renderGameTile(Graphics g, int row, int col) {
        if (pieceCollection[row][col] instanceof Piece)
            pieceCollection[row][col].render(g);
    }

}
