import java.net.InetAddress;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.IPPacket;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;


public class Sniff {
    
    
    jpcap.NetworkInterface[] NETWORK_INTERFACE;
    public static boolean isSniffing = false;
    Sniff.SniffingWorker sniffingWorker;
    JpcapCaptor CAP;
    
    
    Sniff() {
        sniffingWorker = this.sniffingWorker;
    }
 
//New_Thres________________________________________________________________________________________________________________________________________________________________    
                     
                            public class SniffingWorker extends SwingWorker<Void, Packet> {
                                
                                protected Void doInBackground() throws Exception {
                                    while (isSniffing) {
                                        Packet packet = CAP.getPacket();
                                        if (packet != null) {
                                            publish(packet);
                                        }
                                    }
                                    return null;
                                }

                              protected void process(List<Packet> packets) {
                                  
                            for (Packet packet : packets) {

                                if (packet instanceof IPPacket) {
                            IPPacket ipPacket = (IPPacket) packet;


                            if (ipPacket instanceof TCPPacket) {
                                
                                TCPPacket tcpPacket = (TCPPacket) ipPacket;
                                int packetSize = tcpPacket.length;
                                int srcPort = tcpPacket.src_port;
                                int dstPort = tcpPacket.dst_port;
                                InetAddress srcIP = tcpPacket.src_ip;
                                InetAddress dstIP = tcpPacket.dst_ip;

                                // Wypisanie portów TCP
                                MainFrame.jTextArea.append("\nProtocol: TCP\n");
                                MainFrame.jTextArea.append("Packet Size: " + packetSize + " bytes\n");
                                MainFrame.jTextArea.append("Source Port: " + srcPort+ "\n");
                                MainFrame.jTextArea.append("Destination Port: " + dstPort+ "\n");
                                MainFrame.jTextArea.append("Source IP: " + srcIP+ "\n");
                                MainFrame.jTextArea.append("Destination IP: " + dstIP+ "\n");  

                            } else if (ipPacket instanceof UDPPacket) {
                                
                                UDPPacket udpPacket = (UDPPacket) ipPacket;
                                int packetSize = udpPacket.length;
                                int srcPort = udpPacket.src_port;
                                int dstPort = udpPacket.dst_port;
                                InetAddress srcIP = udpPacket.src_ip;
                                InetAddress dstIP = udpPacket.dst_ip;

                                // Wypisanie portów UDP
                                MainFrame.jTextArea.append("\nProtocol: UDP\n");
                                MainFrame.jTextArea.append("Packet Size: " + packetSize + " bytes\n");
                                MainFrame.jTextArea.append("Source Port: " + srcPort+ "\n");
                                MainFrame.jTextArea.append("Destination Port: " + dstPort+ "\n");
                                MainFrame.jTextArea.append("Source IP: " + srcIP+ "\n");
                                MainFrame.jTextArea.append("Destination IP: " + dstIP+ "\n");

                                         } 
                                     }        
                                 }    
                             }    
                         }      
                            
    //____________________________________________________________________________________________________________________________________________________________________________
   
                            
                            
                            
  public void sniffing(){
         
          NETWORK_INTERFACE = JpcapCaptor.getDeviceList();
                
                String input = MainFrame.jTextField.getText();
                
                
                if (input.equals("") ) {
                    JOptionPane.showMessageDialog(null, "Choose Interface Index");
                 } else if (!input.matches("\\d")) {
                    JOptionPane.showMessageDialog(null, "Invalid Interface Index", "Warning", JOptionPane.ERROR_MESSAGE);
                 } else {
       
        int interfaceIndex = Integer.parseInt(input) - 1;
       
         
        if (interfaceIndex >= 0 && interfaceIndex < NETWORK_INTERFACE.length-1) {
            
            try {
                NetworkInterface chosenInterface = NETWORK_INTERFACE[interfaceIndex];
                CAP = JpcapCaptor.openDevice(chosenInterface, 65535, false, 40);
                
                MainFrame.jTextArea.append("\n_________________________________________________________________________\n");
                MainFrame.jTextArea.append("\nStart sniffing on Interface " + (interfaceIndex + 1));
                MainFrame.jTextArea.append("\n_________________________________________________________________________\n");
                

                isSniffing = true;
                sniffingWorker = new Sniff.SniffingWorker();
                sniffingWorker.execute();
            } catch (Exception ex) {
                ex.printStackTrace();
                }
        }  else {
            JOptionPane.showMessageDialog(null, "Invalid Interface Index", "Warning", JOptionPane.ERROR_MESSAGE);
             
              }
           }                  
        }    
     }   
   
