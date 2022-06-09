package boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class StudyFrame extends JFrame{
   String userId;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	StudyFrame window = new StudyFrame("dasol");
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
   public StudyFrame(String userId) {
      this.userId = userId;
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      this.setForeground(new Color(240, 230, 140));
      this.getContentPane().setForeground(new Color(255, 255, 255));
      this.setSize(900, 700);
      this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      this.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(240, 230, 140));
      panel.setForeground(new Color(0, 0, 0));
      panel.setBounds(0, 0, 886, 663);
      this.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("TUDY CHAT");
      lblNewLabel.setBackground(new Color(255, 215, 0));
      lblNewLabel.setBounds(12, 10, 147, 30);
      lblNewLabel.setForeground(new Color(0, 0, 255));
      lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
      panel.add(lblNewLabel);
      
      TodoFrame todoframe = new TodoFrame();
      todoframe.setBounds(12, 50, 283, 603);
      panel.add(todoframe);
      //todoframe.setVisible(true);
      
      ChattingFrame chatframe = new ChattingFrame();
      chatframe.setBounds(307, 50, 567, 603);
      panel.add(chatframe);
   }
   
}
