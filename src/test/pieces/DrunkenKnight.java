package test.pieces;

import java.awt.*;

public class DrunkenKnight extends Piece{
    public DrunkenKnight(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.magicPoints = 5;
        this.attackPoints = 5;
        this.defencePoints = 5;
        this.Speed = 5;
        this.pieceColour = Color.YELLOW;
    }
}
