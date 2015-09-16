import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Tetris extends JFrame{
	private GameView game;

    public Tetris() {
        TetrisInit();
    }
    
    public void TetrisInit(){
        game = new GameView();
        game.GameViewInit();
        getContentPane().add(game);
        
//        ��L�ƥ�B�z
        addKeyListener(new KeyListener(){
            public void keyReleased(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                if(game != null){
                    game.keyCode(e.getKeyCode());
                }
            }
            public void keyTyped(KeyEvent e) {}
        });
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.setTitle("�Xù�����V1.2 by:�N�L��");
        tetris.setSize(350, 480 + 20);
        tetris.setLocation(350,50);
        tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tetris.setResizable(false);//������j���s�L��
        tetris.setVisible(true);

    }

}

