package teamp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame{

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	MainFrame window = new MainFrame();
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public MainFrame() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      this.setForeground(new Color(240, 230, 140));
      this.getContentPane().setForeground(new Color(255, 255, 255));
      this.setSize(900, 700);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(240, 230, 140));
      panel.setForeground(new Color(0, 0, 0));
      panel.setBounds(0, 0, 886, 663);
      this.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel mainLabel = new JLabel("TUDY CHAT");
      mainLabel.setBackground(new Color(255, 215, 0));
      mainLabel.setBounds(12, 10, 147, 30);
      mainLabel.setForeground(new Color(0, 0, 255));
      mainLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
      panel.add(mainLabel);
      
      FriendFrame friendframe = new FriendFrame();
      panel.add(friendframe);
      friendframe.setVisible(true);
      
      ChattingListFrame chatlist = new ChattingListFrame();
      chatlist.setBounds(307, 50, 567, 603);
      panel.add(chatlist);
      
      JButton recallButton = new JButton("\uC0C8\uB85C\uACE0\uCE68");
      recallButton.setBackground(new Color(245, 245, 220));
      recallButton.setForeground(new Color(0, 0, 255));
      recallButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
      recallButton.setBounds(769, 10, 105, 30);
      panel.add(recallButton);
      
      JButton timerButton = new JButton("\uACF5\uBD80\uC2DC\uAC04\uCE21\uC815");
      timerButton.setForeground(new Color(0, 0, 255));
      timerButton.setBackground(new Color(245, 245, 220));
      timerButton.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
      timerButton.setBounds(12, 562, 283, 91);
      panel.add(timerButton);
      
      //새로고침 버튼 동작 시
      recallButton.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    	  }
      });
      //공부시간측정버튼 동작 시
      timerButton.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  /*TimerFrame timer = new TimerFrame();
    		  timer.setVisible(true);*/
    	  }
      });
   }
   
}
