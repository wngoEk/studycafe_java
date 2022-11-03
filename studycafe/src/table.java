import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class table extends JFrame {
	Color back = new Color(0x0E1D35);
	Color but = new Color(0xDDDEE5);
	Font font = new Font("맑은 고딕", Font.BOLD, 20);

	public table(){
		setTitle("스터디 카페");
		setSize(1300,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		Dimension frameSize = getSize();

        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2, //화면 중앙에 메인 프레임 띄우기
                (windowSize.height - frameSize.height) / 2);

		c.setBackground(back);		
		c.setLayout(null);
		
		JButton[] seat = new JButton[60];
		for(int i=0;i<60;i++) {
			seat[i] = new JButton(Integer.toString(i+1));
			seat[i].setFont(new Font("맑은 고딕", Font.BOLD, 12));
			seat[i].setSize(80,50);
			seat[i].setBackground(but);
			//seat[i].setLocation(50*(i+1),50*(i+1));
			//c.add(seat[i]);
			//setVisible(true);
		}
		seat[0].setLocation(50,50);
		c.add(seat[0]);
		seat[1].setLocation(130,50);
		c.add(seat[1]);
		seat[2].setLocation(210,50);
		c.add(seat[2]);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new table();
	}

}
