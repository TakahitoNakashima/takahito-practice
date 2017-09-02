import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Cloneable;
import java.lang.InternalError;
/**
 * 037�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer037 implements Cloneable {
    /* Date�^���X�g */
    private List<Date> dateList = new ArrayList<Date>();
    
    /**
     * 037�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    @Deprecated
    public static void main(final String[] args) throws ParseException {
        SimpleDateFormat yearMonthDay = new SimpleDateFormat("yyyy/mm/dd");
        
        /* Date�^ �ߋ����t */
        String pastDay = "2015/01/17";
        Date pastDate = yearMonthDay.parse(pastDay);
        
        /* Date�^ �������t */
        String furtureDay = "2017/06/06";
        Date futureDate = yearMonthDay.parse(furtureDay);
        
        /* Date�^ �������t */
        Date today = new Date();
        
        // �C���X�^���X�𐶐��i�R�s�[���j.
        Answer037 dateInstance = new Answer037();
        
        // ���X�g��DATE�^�I�u�W�F�N�g���i�[.
        dateInstance.dateList.add(pastDate);
        dateInstance.dateList.add(today);
        dateInstance.dateList.add(futureDate);
        
        // �f�B�[�v�R�s�[���s��.
        Answer037 deepCopyDateInstance = dateInstance.clone();
        
        // �V�����[�R�s�[���s��.
        List<Date> shallowDateList = shallowCopy(dateInstance.dateList);
        
        // ���f�[�^�̏�������
        dateInstance.dateList.get(0).setDate(1);
        
        // �f�B�[�v�R�s�[�f�[�^�̕W���o��.
        if (deepCopyDateInstance == null) {
            System.out.println(deepCopyDateInstance);
        } else {
            System.out.println(deepCopyDateInstance.dateList.get(0).getDate());
        }
        
        // �V�����[�R�s�[�f�[�^�̕W���o��.
        if (shallowDateList == null) {
            System.out.println(shallowDateList);
        } else {
            System.out.println(shallowDateList.get(0).getDate());
        }
        
    }
    
    /**
     * �I�u�W�F�N�g�̃f�B�[�v�R�s�[���s���A�R�s�[��I�u�W�F�N�g��ԋp����.
     *
     * @return Answer037�I�u�W�F�N�g.�I�u�W�F�N�g��dateList��null�̏ꍇ�̓I�u�W�F�N�g��ԋp.
     */ 
    @Override
    public Answer037 clone() {
        try {
            // �X�[�p�[�N���X��clone���\�b�h���Ă�.
            Answer037 result = (Answer037)super.clone();
            
            // �V�K���X�g�̍쐬.
            List<Date> copiedDateList = new ArrayList<Date>();
            
            if (result.dateList == null) {
                // null�̏ꍇ�́A�I�u�W�F�N�g��ԋp.
                return result;
                
            }
            
            // Date�^�̗v�f���擾���A���X�g�֑��.
            for (Date dateInstance : result.dateList) {
                if (dateInstance == null) {
                    copiedDateList.add(null);
                } else {
                    copiedDateList.add(new Date(dateInstance.getTime()));
                }
            }
            
            // ���X�g���̂��̂��㏑������.
            result.dateList = copiedDateList;
            
            // ���ʂ�Ԃ�.
            return result;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
    
    /**
     * �I�u�W�F�N�g�̃V�����[�R�s�[���s���A�R�s�[�ナ�X�g��ԋp����.
     *
     * @return Date�^���X�g. ������null�̎��́Anull��ԋp.
     */
    public static List<Date> shallowCopy(List<Date> shallowList) {
        // null�̏ꍇ�́Anull��ԋp.
        if (shallowList == null) {
            return null;
        }
        return new ArrayList<Date> (shallowList);
    }
}