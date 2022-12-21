
import javax.swing.*;

public class Screen extends JFrame{

    public Screen(){
        setTitle("Game");
        setSize(1024,728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void main(String[] strings)
    {
        new Screen();
    }
}