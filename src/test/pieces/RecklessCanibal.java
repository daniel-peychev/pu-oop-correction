package test.pieces;

import java.awt.*;

public class RecklessCanibal extends Piece{
    public RecklessCanibal(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.attackPoints = 4;
        this.defencePoints = 6;
        this.magicPoints = 8;
        this.Speed = 10;
        this.pieceColour = Color.GRAY;
    }
}
