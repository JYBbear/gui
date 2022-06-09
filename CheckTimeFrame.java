package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class CheckTimeFrame extends JFrame{
	String studytime;
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               CheckTimeFrame window = new CheckTimeFrame("");
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   
   public CheckTimeFrame(String time) {
	  studytime=time;
      initialize();
   }

   
   private void initialize() {
      setBounds(100, 100, 613, 392);
      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(245, 245, 220));
      panel.setBounds(0, 0, 609, 366);
      getContentPane().add(panel);
      panel.setLayout(null);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBorder(new LineBorder(Color.black ,2));
      panel_1.setBackground(new Color(245, 245, 220));
      panel_1.setBounds(12, 20, 578, 320);
      panel.add(panel_1);
      panel_1.setLayout(null);
      
      JLabel timeInfoLabel = new JLabel("\uC624\uB298\uC758 \uACF5\uBD80\uC2DC\uAC04");
      timeInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
      timeInfoLabel.setFont(new Font("함초롬돋움", Font.BOLD, 34));
      timeInfoLabel.setForeground(new Color(0, 0, 0));
      timeInfoLabel.setBounds(12, 10, 284, 52);
      panel_1.add(timeInfoLabel);
      
      JButton shareButton = new JButton("\uACF5\uC720\uD558\uAE30");
      shareButton.setBorder(new LineBorder(Color.black ,2));
      shareButton.setBackground(new Color(245, 245, 220));
      shareButton.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
      shareButton.setBounds(398, 269, 162, 41);
      panel_1.add(shareButton);
      
      String hour, min, sec;
      hour=studytime.substring(0,2);
      min=studytime.substring(2,4);
      sec=studytime.substring(4);
      JLabel timeLabel = new JLabel(hour+":"+min+":"+sec);
      timeLabel.setFont(new Font("굴림", Font.BOLD, 90));
      timeLabel.setBounds(84, 88, 461, 147);
      panel_1.add(timeLabel);
      
      shareButton.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  TimeShareFrame share = new TimeShareFrame();
    		  share.setVisible(true);
    	  }
      });
   }
}