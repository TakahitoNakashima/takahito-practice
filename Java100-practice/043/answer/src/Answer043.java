import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Cloneable;
import java.lang.InternalError;
/**
 * 043�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer043 implements Cloneable {    
    /* Date�^�C���X�^���X */
    Date targetDay = new Date(1421453545000L);
    
    /**
     * 043�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    @Deprecated
    public static void main(final String[] args) {
        
        // �C���X�^���X�̐���.
        Answer043 answer043 = new Answer043();
        
        // �f�B�[�v�R�s�[���s��.
        Answer043 deepCopyDateInstance = answer043.clone();
        
        // ���f�[�^�̏�������
        answer043.targetDay.setTime(1476423938529L);
        
        // �f�B�[�v�R�s�[�f�[�^�̕W���o��.
        if (deepCopyDateInstance == null) {
            System.out.println(deepCopyDateInstance);
        } else {
            // ���������O�f�[�^�̃C���X�^���X�����������o��.
            System.out.println("�C���X�^���X���������u"
                    + convertToTime(deepCopyDateInstance.targetDay) + "�v");
        }
        
        // ����������f�[�^�̎������o��.
        System.out.println("����������̎����u"
                + convertToTime(answer043.targetDay) + "�v");
    }
    
    /**
     * �I�u�W�F�N�g�̃f�B�[�v�R�s�[���s���A�R�s�[��I�u�W�F�N�g��ԋp����.
     *
     * @return Answer043�I�u�W�F�N�g.
     */
    @Override
    public Answer043 clone() {
        try {
            // �X�[�p�[�N���X��clone���\�b�h���Ă�.
            Answer043 result = (Answer043)super.clone();
            
            // Date�^�C���X�^���X�𐶐�.
            Date copiedDate = new Date();
            
            // ���������C���X�^���X�Ō��f�[�^���㏑��.
            result.targetDay = copiedDate;
            
            // ���ʂ�Ԃ�.
            return result;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
    
    /**
     * Date�^�ϐ����ۗL��������������\���ɕϊ�����.
     *
     * @param target Date�^�ϐ�
     * @return ����. Date�^�ϐ���null�̏ꍇ��null��ԋp.
     */    
    public static String convertToTime(Date target) {
        // �����t�H�[�}�b�g.
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        if (target == null) {
            return null;
        } else {
            return df.format(target);
        }
    }
}