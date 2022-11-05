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
		
		seat[0].setLocation(125,100);
		c.add(seat[0]);
		seat[1].setLocation(205,100);
		c.add(seat[1]);
		seat[2].setLocation(285,100);
		c.add(seat[2]);
		seat[3].setLocation(365,100);
		c.add(seat[3]);
		seat[4].setLocation(445,100);
		c.add(seat[4]);
		seat[5].setLocation(525,100);
		c.add(seat[5]);
		seat[6].setLocation(605,100);
		c.add(seat[6]);
		seat[7].setLocation(685,100);
		c.add(seat[7]);
		seat[8].setLocation(765,100);
		c.add(seat[8]);
		seat[9].setLocation(845,100);
		c.add(seat[9]);

		seat[10].setLocation(125,150);
		c.add(seat[10]);
		seat[11].setLocation(205,150);
		c.add(seat[11]);
		seat[12].setLocation(285,150);
		c.add(seat[12]);
		seat[13].setLocation(365,150);
		c.add(seat[13]);
		seat[14].setLocation(445,150);
		c.add(seat[14]);
		seat[15].setLocation(525,150);
		c.add(seat[15]);
		seat[16].setLocation(605,150);
		c.add(seat[16]);
		seat[17].setLocation(685,150);
		c.add(seat[17]);
		seat[18].setLocation(765,150);
		c.add(seat[18]);
		seat[19].setLocation(845,150);
		c.add(seat[19]);

		seat[20].setLocation(125,300);
		c.add(seat[20]);
		seat[21].setLocation(205,300);
		c.add(seat[21]);
		seat[22].setLocation(285,300);
		c.add(seat[22]);
		seat[23].setLocation(365,300);
		c.add(seat[23]);
		seat[24].setLocation(445,300);
		c.add(seat[24]);
		seat[25].setLocation(125,350);
		c.add(seat[25]);
		seat[26].setLocation(205,350);
		c.add(seat[26]);
		seat[27].setLocation(285,350);
		c.add(seat[27]);
		seat[28].setLocation(365,350);
		c.add(seat[28]);
		seat[29].setLocation(445,350);
		c.add(seat[29]);

		seat[30].setLocation(125,500);
		c.add(seat[30]);
		seat[31].setLocation(205,500);
		c.add(seat[31]);
		seat[32].setLocation(285,500);
		c.add(seat[32]);
		seat[33].setLocation(365,500);
		c.add(seat[33]);
		seat[34].setLocation(445,500);
		c.add(seat[34]);
		seat[35].setLocation(125,570);
		c.add(seat[35]);
		seat[36].setLocation(205,570);
		c.add(seat[36]);
		seat[37].setLocation(285,570);
		c.add(seat[37]);
		seat[38].setLocation(365,570);
		c.add(seat[38]);
		seat[39].setLocation(445,570);
		c.add(seat[39]);

		seat[40].setLocation(845,370);
		c.add(seat[40]);
		seat[41].setLocation(925,370);
		c.add(seat[41]);
		seat[42].setLocation(845,420);
		c.add(seat[42]);
		seat[43].setLocation(925,420);
		c.add(seat[43]);
		seat[44].setLocation(845,470);
		c.add(seat[44]);
		seat[45].setLocation(925,470);
		c.add(seat[45]);
		seat[46].setLocation(845,520);
		c.add(seat[46]);
		seat[47].setLocation(925,520);
		c.add(seat[47]);
		seat[48].setLocation(845,570);
		c.add(seat[48]);
		seat[49].setLocation(925,570);
		c.add(seat[49]);

		seat[50].setLocation(1075, 120);
		c.add(seat[50]);
		seat[51].setLocation(1075, 170);
		c.add(seat[51]);
		seat[52].setLocation(1075, 220);
		c.add(seat[52]);
		seat[53].setLocation(1075, 270);
		c.add(seat[53]);
		seat[54].setLocation(1075, 320);
		c.add(seat[54]);
		seat[55].setLocation(1075, 370);
		c.add(seat[55]);
		seat[56].setLocation(1075, 420);
		c.add(seat[56]);
		seat[57].setLocation(1075, 470);
		c.add(seat[57]);
		seat[58].setLocation(1075, 520);
		c.add(seat[58]);
		seat[59].setLocation(1075, 570);
		c.add(seat[59]);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new table();
	}

}
