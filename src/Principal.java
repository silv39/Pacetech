
import VISAO.jFrTela;

/**
 *
 * @author CB RODRIGO SILVA
 */
public class Principal {
    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
        
    }
    
}
