package test.pieces;

import java.awt.*;

public class SofisticatedSam extends Piece{
    public SofisticatedSam(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.attackPoints   = 10;
        this.defencePoints  = 5;
        this.magicPoints    = 4;
        this.Speed          = 1;
        this.pieceColour = Color.PINK;
    }
}
