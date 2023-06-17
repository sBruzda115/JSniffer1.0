import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class OpenFile {
    
    
    public void opening() {
        
        JFileChooser jFileChooserOpen =new JFileChooser();
      
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files","txt");
        jFileChooserOpen.addChoosableFileFilter(filter);
        int resultOpen = jFileChooserOpen.showOpenDialog(null);

            switch (resultOpen) {
                case JFileChooser.APPROVE_OPTION:
                    File file = jFileChooserOpen.getSelectedFile();

                    try
                    {
                        FileReader reader = new FileReader( file );
                        BufferedReader IN = new BufferedReader(reader);
                        MainFrame.jTextArea.read( IN, null );

                        IN.close();
                        MainFrame.jTextArea.requestFocus();
                        JOptionPane.showMessageDialog(null, "Data loaded successfully");
                    }
                    catch(IOException X) {
                        JOptionPane.showMessageDialog(null, "Data loaded ERROR");
                    }

                    break;
                case JFileChooser.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(null, "Data load CANCELED");
                    break;
                case JFileChooser.ERROR_OPTION:
                    JOptionPane.showMessageDialog(null, "Data loaded ERROR");
                    break;


        }         
    }   
}   
