import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	int titleFontSize = 36;
	ArrayList<DrawnX> xList = new ArrayList<DrawnX>();
	ArrayList<DrawnO> OList = new ArrayList<DrawnO>();
	public TicTacToeBoard() {
		setSize(322,422);
		setBackground(Color.white);
		GrantsMouse j = new GrantsMouse();
		addMouseListener(j);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.setFont(new Font("Comic Sans MS", Font.PLAIN, titleFontSize ));
		DrawnX textX = new DrawnX(200,200);
		DrawnO textO = new DrawnO(100,200);
		g.drawString("Tic Tac Toe", 0, ((50- titleFontSize) /2 + titleFontSize ));
		
		
		for (TicTacToeBoard.DrawnX thisX : xList) {
			g.drawString("X", textX.xCoord, textX.yCoord);
		}
		for (TicTacToeBoard.DrawnO thisO : OList) {
			g.drawString("O", textO.xCoord, textO.yCoord);
		}

		
		
	}
	class GrantsMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX() +" "+e.getY());
			DrawnX x = new DrawnX(e.getX()-10,e.getY()+10);
			xList.add(x);
			repaint();
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class DrawnX{
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawnX(int xCoord,int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	class DrawnO{
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawnO(int xCoord,int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
}
