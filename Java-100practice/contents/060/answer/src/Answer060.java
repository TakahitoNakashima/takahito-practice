import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.io.IOException;

/**
 * 060�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer060 {
    
    /**
     * 060�̉𓚂ł�.
     * ���}�V���Ƀo�C���h����Ă��邷�ׂẴA�h���X�ɂ��āA
     * FQDN��IP�A�h���X��MAC�A�h���X�̃Z�b�g��\������.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        try {
            // �}�V����̑S�ẴC���^�t�F�[�X���擾.
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            
            // �C���^�[�t�F�C�X��������΁A�X�L�b�v.
            if (interfaces != null) {
                
                // �S�C���^�[�t�F�C�X�𑖍�.
                while (interfaces.hasMoreElements()) {
                    
                    /* Mac�A�h���X. */
                    String macAddress = "";
                    
                    // �C���^�t�F�[�X��1���擾���A���O��\��.
                    NetworkInterface nextInterface = (NetworkInterface) interfaces.nextElement();
                    System.out.println("\n*�l�b�g���[�N�C���^�[�t�F�C�X�y" + nextInterface.getDisplayName() + "�z");
                    
                    // ���̃C���^�t�F�[�X�Ƀo�C���h���ꂽ�S�Ă�InetAddresses���擾.
                    Enumeration addresses = nextInterface.getInetAddresses();
                    
                    while (addresses.hasMoreElements()) {
                        // InetAddress���P���擾.
                        InetAddress address = (InetAddress)addresses.nextElement();
                        
                        /* FQDN. */
                        System.out.println("getCanonicalHostName = [" + address.getCanonicalHostName() + "]");
                        
                        /* IP�A�h���X. */
                        System.out.println("getHostAddress       = [" + address.getHostAddress() + "]");
                        
                        // Mac�A�h���X�擾.
                        byte[] byteMacAddresses = nextInterface.getHardwareAddress();
                        
                        // Mac�A�h���X�̃o�C�g�����񂩂�o�͗p������ɕϊ�.
                        if (byteMacAddresses != null) {
                            for (int i = 0; i < byteMacAddresses.length - 1; i++) {
                                macAddress += String.format("%02X:", byteMacAddresses[i]);
                            }
                            macAddress += String.format("%02X", byteMacAddresses[byteMacAddresses.length - 1]);
                        }
                        /* Mac�A�h���X */
                        System.out.println("getMacAddress        = [" + macAddress + "]" + "\n");
                    }
                }
            } else {
                System.out.println("�C���^�[�t�F�C�X������܂���B");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}