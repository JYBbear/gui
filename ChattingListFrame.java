package teamp;

import javax.swing.JPanel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ChattingListFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChattingListFrame() {
		setBounds(35, 66, 589, 517);
		setBounds(307, 50, 567, 603);
		setLayout(null);
		
		JList chattingList = new JList();
		chattingList.setBounds(29, 54, 511, 526);
		add(chattingList);
	      
	    JLabel chatLabel = new JLabel("\uB300\uD654\uBC29\uBAA9\uB85D");
	    chatLabel.setForeground(new Color(0, 0, 255));
	    chatLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
	    chatLabel.setBounds(0, 1, 163, 39);
	    add(chatLabel);
	      
	    JButton addChatButton = new JButton("\uB300\uD654\uBC29\uC0DD\uC131");
	    addChatButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
	    addChatButton.setBackground(new Color(240, 230, 140));
	    addChatButton.setForeground(new Color(0, 0, 255));
	    addChatButton.setBounds(429, 10, 126, 29);
	    add(addChatButton);
	    
	    addChatButton.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  AddChattingFrame add = new AddChattingFrame();
	    		  add.setVisible(true);
	    	  }
	      });
	}
}
