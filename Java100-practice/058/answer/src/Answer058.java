import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * 058�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer058 {
    
    /**
     * 058�̉𓚂ł�.
     * �R�}���h�������Ɏw�肳�ꂽ�e�L�X�g�t�@�C����ǂݍ��݁A
     * ���̃e�L�X�g�t�@�C����BOM�t�����ǂ����𔻒肷��.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �z��ɒl�������Ă��Ȃ��ꍇ�A�����I��.
        if (args.length < 1 ) {
            System.err.println("�����Ƀe�L�X�g�t�@�C�������w�肵�A�Ď��s���Ă��������B");
            System.exit(1);
        }
        
        try {
            // �t�@�C�����e���o�C�g�\�L�Ŏ擾.
            final byte[] fileContentBytes = Files.readAllBytes(Paths.get(args[0]));
            
            // �o�C�g����3�����̏ꍇ.
            if (fileContentBytes.length < 3){
                System.out.println("BOM�����t�@�C���ł��B");
                System.exit(0);
            }            
            
            // BOM����.
            if (fileContentBytes[0] == (byte)0xEF && fileContentBytes[1] == (byte)0xBB
                    && fileContentBytes[2] == (byte)0xBF) {
                
                System.out.println("BOM�t���t�@�C���ł��B");
                System.exit(1);
            } else {
                System.out.println("BOM�����t�@�C���ł��B");
                System.exit(0);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}