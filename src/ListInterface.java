import jpcap.JpcapCaptor;


public class ListInterface {
    
    
    public void list(){
          
            
                jpcap.NetworkInterface [] array ;
                array  = JpcapCaptor.getDeviceList();
                
                MainFrame.jTextArea.append("Available Interfaces: ");

         for (int i=1;  i<array.length ; i++)
                   
              {
                   MainFrame.jTextArea.append("\n_____________Interface Index: "+ i + "____________________________________________\n");
                   MainFrame.jTextArea.append("\nName: " + array[i].datalink_name);
                   MainFrame.jTextArea.append("\nDescription: " + array[i].description);   
                   MainFrame.jTextArea.append("\nDatalink_description: " + array[i].datalink_description);
                   
                   
                   byte [] R = array[i].mac_address;
                   MainFrame.jTextArea.append("\nMac_address: ");
                    for(int B = 0; B < R.length; B++)
                    { MainFrame.jTextArea.append(Integer.toHexString(R[B] & 0xff ));
                            if(B < R.length-1){ MainFrame.jTextArea.append(":");}
                            }
                    
                    jpcap.NetworkInterfaceAddress [] INT = array[i].addresses;
                    MainFrame.jTextArea.append("\nIP Adress: " + INT[0].address);
                    MainFrame.jTextArea.append("\nSubnet Mask: " + INT[0].subnet);
                    MainFrame.jTextArea.append("\nBroadcast: " + INT[0].broadcast + "\n");
                        
        } 
    }   
}   
