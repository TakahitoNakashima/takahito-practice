import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * 009�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer009 {
    /**
     * 009�̉𓚂ł��B
     * @param arguments �g�p���܂���B
     */
    public static void main (String[] args) {

        Properties properties = new Properties();
        
        //�z��ɒl�������Ă��Ȃ��ꍇ�A�����I��
        if (args.length < 1 ) {
            System.err.println("�����Ƀt�@�C���p�X���w�肵�A�Ď��s���ĉ�����");
            System.exit(1);
        }
        String file = args[0];
        
        try (InputStream inputStream = new FileInputStream(file)) {
            System.out.println(file+"��ǂݍ��񂾌���... ");
            //�ǂݍ��񂾃t�@�C�����v���p�e�B�փ��[�h
            properties.load(inputStream);

            //�l�̎擾
            System.out.println(properties);
            System.out.println();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
