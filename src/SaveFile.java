import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class SaveFile {
    
    
    public void saving() {
        
          String data = MainFrame.jTextArea.getText();
            JFileChooser jFileChooserSave = new JFileChooser();
                
                int resultSave = jFileChooserSave.showSaveDialog(null);

            switch (resultSave) {
                case JFileChooser.APPROVE_OPTION:

                    try {
                        File DATA = new File(jFileChooserSave.getSelectedFile() + ".txt");
                        FileOutputStream fileOutputStream = new FileOutputStream(DATA);
                        PrintStream OUT = new PrintStream(fileOutputStream);

                        OUT.println(data);
                        OUT.close();

                        fileOutputStream.close();
                        JOptionPane.showMessageDialog(null, "Data saved successfully");
                    } catch (Exception X) {
                        JOptionPane.showMessageDialog(null, "Data saving ERROR,");

                    }

                    break;
                case JFileChooser.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(null, "Data save CANCELED");
                    break;
                case JFileChooser.ERROR_OPTION:
                    JOptionPane.showMessageDialog(null, "Data saving ERROR");
                    break;
        }
    }   
}   
