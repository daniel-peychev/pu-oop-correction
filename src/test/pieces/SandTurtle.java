package test.pieces;

import java.awt.*;

public class SandTurtle extends Piece{
    public SandTurtle(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.attackPoints = 5;
        this.defencePoints = 10;
        this.magicPoints = 1;
        this.Speed = 4;
        this.pieceColour = Color.RED;
    }
}
