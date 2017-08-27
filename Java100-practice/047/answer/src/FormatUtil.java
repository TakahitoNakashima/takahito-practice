import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 047�Ŏg�p���郆�[�e�B���e�B�N���X.
 *
 * @author jsfkdt
 */
public final class FormatUtil {
    
    /**
     * ��߂�ꂽ�t�H�[�}�b�g�œ�����ԋp����
     *
     * @param  date  Date�^�ϐ�
     * @return ��߂��t�H�[�}�b�g�ł̓���.������null�̏ꍇ��null��ԋp.
     */    
    public final String dayAndTime(final Date date) {
        if (date == null) {
            return null;
        }
        
        // �t�H�[�}�b�g���߂�.
        final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        
        //��߂��t�H�[�}�b�g�ŕԋp.
        return df.format(date);
    }
}