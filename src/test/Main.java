package test;

import test.board.Board;
import test.loader.Loader;
import test.renderer.Renderer;

public class Main {

    public static void main(String[] args) {
        Loader loader = new Loader();
        Board gameBoard = new Board(loader.load());
        Renderer renderer = new Renderer(gameBoard);
    }
}
