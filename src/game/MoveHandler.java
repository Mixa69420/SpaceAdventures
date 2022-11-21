package game;

import gui.RenderManager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveHandler implements KeyListener {
    private final RenderManager renderManager;

    public MoveHandler(RenderManager renderManager) {
        this.renderManager = renderManager;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public RenderManager getRenderManager() {
        return renderManager;
    }
}
