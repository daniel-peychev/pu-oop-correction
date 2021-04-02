package test.pieces;

import java.awt.*;

public class MagicCat extends Piece{
    public MagicCat(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.attackPoints = 8;
        this.defencePoints = 5;
        this.magicPoints = 10;
        this.Speed = 1;
        this.pieceColour = Color.BLUE;
    }
}
