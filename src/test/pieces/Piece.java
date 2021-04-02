package test.pieces;

import java.awt.*;

public abstract class Piece {

    protected int row;
    protected int col;
    protected Color colour;
    protected Color pieceColour;
    protected int attackPoints;
    protected int defencePoints;
    protected int magicPoints;
    protected int Speed;

    public void render(Graphics g){
        g.setColor(this.pieceColour);
        g.fillOval(this.col * 100 + 25,this.row * 100 + 25,50,50);

        g.setColor(this.colour);
        g.fillOval(this.col * 100 + 25,this.row * 100 + 25,20,20);
    }

    public int getCol() {
        return col;
    }

    public int getRow(){
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}