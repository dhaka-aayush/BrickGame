package brickbreaker;

import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {
		GamePlay gamePlay=new GamePlay();
		setBounds(10,10,700,600);
		setTitle("Breakout Ball");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    add(gamePlay);
	    addKeyListener(gamePlay);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Main();
                
		}


	}
