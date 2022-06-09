package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Font;

public class TimeShareFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeShareFrame frame = new TimeShareFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TimeShareFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel timeShareLabel = new JLabel("공부시간 공유");
		timeShareLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		timeShareLabel.setBounds(12, 10, 147, 27);
		contentPane.add(timeShareLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 47, 231, 407);
		contentPane.add(scrollPane);
		
		JList chatlist = new JList();
		scrollPane.setViewportView(chatlist);
		
		JButton shareButton = new JButton("공유");
		shareButton.setFont(new Font("함초롬돋움", Font.PLAIN, 13));
		shareButton.setBounds(164, 12, 79, 23);
		contentPane.add(shareButton);
	}
}
