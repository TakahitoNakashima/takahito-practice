import java.util.Date;

/**
 * 047�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer047 {
    
    /**
     * 047�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // ��߂�ꂽ�t�H�[�}�b�g��ԋp���郆�[�e�B���e�B���g�p.
        final String dayAndTime = new FormatUtil().dayAndTime(new Date());
        
        // ������W���o��.
        System.out.println(dayAndTime);
    }
}
