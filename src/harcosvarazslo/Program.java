package harcosvarazslo;

import nezet.HarcosVarazsloGUI;

public class Program {
   public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HarcosVarazsloGUI().setVisible(true);
            }
        });
    }
    
}
