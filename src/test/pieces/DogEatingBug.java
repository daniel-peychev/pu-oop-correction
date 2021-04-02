                package test.pieces;

import java.awt.*;

public class DogEatingBug extends Piece{
    public DogEatingBug(int row , int col, Color colour){
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.attackPoints = 10;
        this.defencePoints = 2;
        this.magicPoints = 8;
        this.Speed = 5;
        this.pieceColour = Color.GREEN;
    }
}
