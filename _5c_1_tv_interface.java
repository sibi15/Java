import java.util.*;

interface tv_methods {
    public void setChannel(int newChannel);
    public void setVolume(int newVolume);
}

class TV implements tv_methods {
    int power,channel,volume,new_channel,new_volume;
    
    TV () {
        power=0;
        channel=0;
        volume=0;
    }
    
    void turnOn() {
        power=1;
    }
    
    void turnOff() {
        power=0;
    }
        
    public void setChannel(int new_channel) {
        channel=new_channel;
    }
    public void setVolume(int new_volume) {
        volume=new_volume;
    }
    
    void channelUp() {
        channel+=1;
    }
    
    void channelDown() {
        channel-=1;
    }
    
    void volumeUp() {
        volume+=1;
    }
    
    void volumeDown() {
        volume-=1;
    }
}

public class _5c_1_tv_interface {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TV[] tv = new TV[2];
        int choice1,choice2;
        
        //creating two TV Objects:
        for(int i=0; i<2; i++) {
            tv[i] = new TV();
            System.out.println("\nTV " + (i+1) + " On(1) or Off(0):");
            tv[i].power = s.nextInt();
            System.out.println("\nEnter channel number for TV " + (i+1) + ":");
            tv[i].new_channel = s.nextInt();
            
            // checking if tv on and channel number in range and setting it:
            if (tv[i].power==1) {
                if (tv[i].new_channel>0 && tv[i].new_channel<=100) {
                    tv[i].setChannel(tv[i].new_channel);
                }
                else {
                    System.out.println("\nWrong channel input.");
                }
            }
            
            System.out.println("\nEnter volume to set for TV " + (i+1) + ":");
            tv[i].new_volume = s.nextInt();
            
            // checking if tv on and volume in range and setting it:
            if (tv[i].power==1) {
                if (tv[i].new_volume>=0 && tv[i].new_volume<=100) {
                    tv[i].setVolume(tv[i].new_volume);
                }
                else {
                    System.out.println("\nWrong volume input.");
                }
            }
        }
        
        while(true) {
            System.out.println("\nEnter  choice: \n1. TV 1\n2. TV 2\n3. Exit");
            choice1=s.nextInt();
            if (choice1 == 3) {
                break;
            }
            else if (choice1 == 1 || choice1 == 2) {
                while(true) {
                    if ((tv[choice1-1].power) == 1) {
                        System.out.println("\nOptions for TV " + choice1 + ":\n1. Channel Up\n2. Channel down\n3. Volume up\n4. Volume down\n5. Exit");
                        choice2 = s.nextInt();
                            
                        if (choice2==1) {
                            tv[choice1-1].channelUp();
                        }
                        else if (choice2==2) {
                            tv[choice1-1].channelDown();
                        }
                        else if (choice2==3) {
                            tv[choice1-1].volumeUp();
                        }
                        else if (choice2==4) {
                            tv[choice1-1].volumeDown();
                        }
                        else if (choice2==5) {
                            break;
                        }
                    }
                    else {
                        System.out.println("\nPower of TV " + choice1 + " is OFF.");
                        break;
                    }
                }
            }
            else {
                System.out.println("\nEnter correct choice (1-3) ");
            }
        }
        
        //Printing details of both TVs:
        for (int i=0; i<2; i++) {
            System.out.println("\nTV " + (i+1) + " details:\nPower = " + tv[i].power + "\nChannel = " + tv[i].channel + "\nVolume = " + tv[i].volume);
        }
    }
}