import java.lang.Comparable;
import java.lang.NullPointerException;
import java.util.Date;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * 044�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer044 implements Comparable<Answer044> {
    /* Date�^�ϐ�. */
    private Date day;
    
    /**
     * Date�^�ϐ��Ɋi�[����.
     *
     * @param day Date�^�ϐ�
     */
    Answer044 (Date day) {
        this.day = day;
    }
    
    /**
     * 044�̉𓚂ł�.
     * Date�^�C���X�^���X�𐶐����A�N���X�̃I�u�W�F�N�g�𐶐�����.
     * ���������I�u�W�F�N�g�����X�g�Ɋi�[���A
     * ���X�g����Date�^�C���X�^���X���\�[�g����.
     *
     * @param arguments �g�p���܂���.
     */
    @Deprecated
    public static void main(final String[] args) {
        /* Date���X�g. */
        final List<Answer044> dateList = new ArrayList<Answer044>();
        
        /* ���X�g��Date�C���X�^���X��ۗL����I�u�W�F�N�g���i�[. */
        dateList.add(new Answer044(new Date()));
        dateList.add(new Answer044(new Date(1476423938529L)));
        dateList.add(new Answer044(new Date(1421453545000L)));
        dateList.add(new Answer044(null));
        
        // null�����݂��Ă����ꍇ�A�G���[���o�͂���.
        try {
            System.out.println("�\�[�g�O");
            
            // �\�[�g�O��Date���X�g�̓�����W���o�͂���.
            for (Answer044 date : dateList) {
                System.out.println(date.day);
            }
            
            // �\�[�g���s��.
            Collections.sort(dateList);
            
            System.out.println("\n�\�[�g��");
            
            // �\�[�g���Date���X�g�̓�����W���o�͂���.
            for (Answer044 date : dateList) {
                System.out.println(date.day);
            }
            
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Date�C���X�^���X���ۗL����������r���A
     * �����̏����\�[�g���s��.
     *
     * @param object Answer044�I�u�W�F�N�g
     * @return Date�^�C���X�^���X�̓�����r����
     * @exception NullPointerException object��null�̏ꍇ.
     */
    @Override
    public int compareTo(Answer044 object) {
        Answer044 dayInstance = object;
        
        if (this.day == null && dayInstance.day == null) {
            return 0;
        } else if (this.day == null) {
            return -1;
        } else if (dayInstance.day == null) {
            return 1;
        } else {
            return this.day.compareTo(dayInstance.day);
        }
    }
}
