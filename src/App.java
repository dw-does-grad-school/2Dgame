import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame window = new JFrame(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        // Ensure the game panel regains focus when window is activated
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                gamePanel.requestFocusInWindow();
            }
        });

        window.pack();

        window.setLocationRelativeTo(null); 
        window.setVisible(true);
        
        gamePanel.startGameThread();
    }
}
