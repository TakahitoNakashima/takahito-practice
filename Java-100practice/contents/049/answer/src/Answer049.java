import java.util.Date;

/**
 * 049�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer049 {
    
    /**
     * 049�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // ���ݓ��t����}1���̃����_���ȓ������擾.
        final Date randomDate = new DateUtil().randomDayAndTime();
        
        // �擾����������W���o��.
        System.out.println(randomDate);
    }
}
