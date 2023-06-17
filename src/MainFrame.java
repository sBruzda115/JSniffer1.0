import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;



public class MainFrame extends JFrame {
    
    JFrame jFrame = new JFrame();
    JButton buttonPlay = new JButton();
    JButton buttonStop = new JButton();
    JButton buttonClean = new JButton();
    JButton buttonInterfaces = new JButton();
    JButton buttonSaveFile = new JButton();
    JButton buttonOpenFile = new JButton();
    JPanel jPanel = new JPanel();
    JLabel jLabel = new JLabel();
    public static JTextArea jTextArea = new JTextArea();
    public static JTextField jTextField = new JTextField(4);
    JScrollPane jScrollPane = new JScrollPane(jTextArea);
  
   
    


 public void mainGui() {

        jFrame.add(buttonPlay);
        jFrame.add(buttonStop);
        jFrame.add(buttonClean);
        jFrame.add(buttonInterfaces);
        jFrame.add(buttonSaveFile);
        jFrame.add(buttonOpenFile);
        jFrame.add(jScrollPane);
        jFrame.add(jPanel);

//Frame_________________________________________________________________________________________________________________
         
        jFrame.setSize(1000, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setTitle("JSniffer 1.0");
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(new Color(0x67676C));
        jFrame.setLayout(null);
        ImageIcon icon = new ImageIcon("dog-nose.png");
        jFrame.setIconImage(icon.getImage());
        
//JPanel_&_JTextField_&_JLabel______________________________________________________________________________________________       
        
        jLabel.setText("Select Interface");
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jTextField.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.setBackground(new Color(0x9BA0AA));
        jPanel.setBounds(5, 555, 232, 105);
        Border borderPanel = BorderFactory.createLineBorder(new Color(0x007D1B), 3);
        jPanel.setBorder(borderPanel);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        
//JTextAre_&_JScrollPanel_____________________________________________________________________________________________

        jTextArea.setLineWrap(true);
        jTextArea.setFont(new Font("Arial", Font.ITALIC, 20));
        jTextArea.setBackground(new Color(0xBFC7CC));
        jTextArea.setForeground(new Color(0x000000));
        
        jScrollPane.setBounds(5,5,862,535);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

//buttonPlay____________________________________________________________________________________________________________

        ImageIcon iconPlay = new ImageIcon("play-circle.png");
        buttonPlay.setBounds(702, 555, 285, 105);
        buttonPlay.setText("START");
        buttonPlay.setIcon(iconPlay);
        buttonPlay.setHorizontalTextPosition(buttonPlay.CENTER);
        buttonPlay.setVerticalTextPosition(buttonPlay.BOTTOM);
        buttonPlay.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlay.setFocusable(false);
        buttonPlay.setBackground(new Color(0x007D1B));
        buttonPlay.setOpaque(true);
        buttonPlay.setToolTipText("Start Sniffing");
        Border borderPlay = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonPlay.setBorder(borderPlay);
        buttonPlay.setForeground(new Color(0x000000));

//buttonStop____________________________________________________________________________________________________________

        ImageIcon iconStop = new ImageIcon("pause-circle.png");
        buttonStop.setBounds(552, 555, 135, 105);
        buttonStop.setText("STOP");
        buttonStop.setIcon(iconStop);
        buttonStop.setHorizontalTextPosition(buttonStop.CENTER);
        buttonStop.setVerticalTextPosition(buttonStop.BOTTOM);
        buttonStop.setFont(new Font("Arial", Font.BOLD, 20));
        buttonStop.setFocusable(false);
        buttonStop.setBackground(new Color(0xA10014));
        buttonStop.setOpaque(true);
        buttonStop.setToolTipText("Stop Sniffing");
        Border borderStop = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonStop.setBorder(borderStop);
        buttonStop.setForeground(new Color(0x000000));

//buttonInterfaces______________________________________________________________________________________________________

        ImageIcon iconInterfaces = new ImageIcon("globe.png");
        buttonInterfaces.setBounds(402, 555, 135, 105);
        buttonInterfaces.setText("Interfaces");
        buttonInterfaces.setIcon(iconInterfaces);
        buttonInterfaces.setHorizontalTextPosition(buttonInterfaces.CENTER);
        buttonInterfaces.setVerticalTextPosition(buttonInterfaces.BOTTOM);
        buttonInterfaces.setFont(new Font("Arial", Font.BOLD, 20));
        buttonInterfaces.setFocusable(false);
        buttonInterfaces.setBackground(new Color(0x013DD3));
        buttonInterfaces.setOpaque(true);
        buttonInterfaces.setToolTipText("List Web Interfaces");
        Border borderInterfaces = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonInterfaces.setBorder(borderInterfaces);
        buttonInterfaces.setForeground(new Color(0x000000));
        
//buttonClean___________________________________________________________________________________________________________

        ImageIcon iconClean = new ImageIcon("magic-wand.png");
        buttonClean.setBounds(252, 555, 135, 105);
        buttonClean.setText("Clean");
        buttonClean.setIcon(iconClean);
        buttonClean.setHorizontalTextPosition(buttonClean.CENTER);
        buttonClean.setVerticalTextPosition(buttonClean.BOTTOM);
        buttonClean.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClean.setFocusable(false);
        buttonClean.setBackground(new Color(0x9BA0AA));
        buttonClean.setOpaque(true);
        buttonClean.setToolTipText("Clean Text Area");
        Border borderClean = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonClean.setBorder(borderClean);
        buttonClean.setForeground(new Color(0x000000));

//buttonSaveFile____________________________________________________________________________________________________

        ImageIcon DownloadFile = new ImageIcon("file-download.png");
        buttonSaveFile.setBounds(882, 5, 105, 260);
        buttonSaveFile.setIcon(DownloadFile);
        buttonSaveFile.setText("Save\nFile");
        buttonSaveFile.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSaveFile.setHorizontalTextPosition(buttonSaveFile.CENTER);
        buttonSaveFile.setVerticalTextPosition(buttonSaveFile.BOTTOM);
        buttonSaveFile.setFocusable(false);
        buttonSaveFile.setBackground(new Color(0x9BA0AA));
        buttonSaveFile.setOpaque(true);
        buttonSaveFile.setToolTipText("Download Text File");
        Border borderSaveFile = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonSaveFile.setBorder(borderSaveFile);
        buttonSaveFile.setForeground(new Color(0x000000));

//buttonDownloadFile____________________________________________________________________________________________________

        ImageIcon OpenFile = new ImageIcon("folder-open.png");
        buttonOpenFile.setBounds(882, 280, 105, 260);
        buttonOpenFile.setText("Open\nFile");
        buttonOpenFile.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOpenFile.setIcon(OpenFile);
        buttonOpenFile.setHorizontalTextPosition(buttonOpenFile.CENTER);
        buttonOpenFile.setVerticalTextPosition(buttonOpenFile.BOTTOM);
        buttonOpenFile.setFocusable(false);
        buttonOpenFile.setBackground(new Color(0x9BA0AA));
        buttonOpenFile.setOpaque(true);
        buttonOpenFile.setToolTipText("Open Text File"); 
        Border borderOpenFile = BorderFactory.createLineBorder(new Color(0x000000), 3);
        buttonOpenFile.setBorder(borderOpenFile);
        buttonOpenFile.setForeground(new Color(0x000000));
        
//buttonPlay_ActionListener_____________________________________________________________________________________________

        buttonPlay.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Sniff sniff = new Sniff();
                sniff.sniffing();
                
            }
        });

//buttonStop_ActionListener_____________________________________________________________________________________________

        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Sniff sniff = new Sniff();
                 Sniff.isSniffing = false;
               
        if (sniff.sniffingWorker != null && !sniff.sniffingWorker.isDone()) {
            sniff.sniffingWorker.cancel(true);
            
              }              
            }
        });

//buttonInterface_ActionListener________________________________________________________________________________________

        buttonInterfaces.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ListInterface listInterface = new ListInterface();
                listInterface.list();
                
            } 
        });

//buttonClen_ActionListener_____________________________________________________________________________________________

        buttonClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextArea.setText("");
                
            }
        });

//buttonSaveFile_ActionListener_____________________________________________________________________________________

        buttonSaveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               SaveFile saveFile = new SaveFile();
               saveFile.saving();
                     
            }
        });

//buttonOpenFile_ActionListener_________________________________________________________________________________________

        buttonOpenFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                OpenFile openFile = new OpenFile();
                openFile.opening();
                                     
            }
        });

//______________________________________________________________________________________________________________________

        
         
    }
}   


    

