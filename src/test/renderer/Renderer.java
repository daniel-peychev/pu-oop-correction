package test.renderer;
import test.board.Board;
import test.loader.Loader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Renderer extends JFrame implements MouseListener {

    Board gameBoardLogic;

    //set the board parameters

    public Renderer(Board gameBoardLogic) {

        this.gameBoardLogic = gameBoardLogic;

        this.setSize(1100, 1100);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    //basically or i would say sadly its a moving method

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getY() / 100;
        int col = e.getX() / 100;

        if (gameBoardLogic.getSelectedPiece() == null) {
            if (gameBoardLogic.getPiece(row, col) != null) {
                gameBoardLogic.setSelectedPiece(gameBoardLogic.getPiece(row, col));
                return;
            }

        } else {
            gameBoardLogic.move(row, col);
            repaint();
            return;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //render the game

    public void paint(Graphics g) {
        Loader.renderingTheSquares(g);

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 11; col++) {

                gameBoardLogic.renderGameTile(g, row, col);
            }
        }
    }

}