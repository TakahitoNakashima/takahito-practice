import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 049�Ŏg�p���郆�[�e�B���e�B�N���X.
 *
 * @author jsfkdt
 */
public final class DateUtil {
    
    /**
     * ���ݎ�������v���X�}�C�i�X1���͈̔͂Ń����_���ȓ���������.
     *
     * @return ���ݎ�������v���X�}�C�i�X1���̃����_����Date�^����
     */    
    public final Date randomDayAndTime() {
        // Date�^�̓���.
        Date randomDate = new Date();
        
        // �����̓���.
        final Calendar oneAfterDay = Calendar.getInstance();
        oneAfterDay.add(Calendar.DATE, 1);
        
        // ����O�̓���.
        final Calendar oneBeforeDay = Calendar.getInstance();
        oneBeforeDay.add(Calendar.DATE, -1);
        
        // �����_���ȓ���
        final Calendar randomDay = Calendar.getInstance();
        
        // �~���b�̍����擾.
        final long timeDiff = oneAfterDay.getTimeInMillis() - oneBeforeDay.getTimeInMillis();
        
        // �~�����̒l�������_���Ŏw��.
        // ThreadLocalRandom�N���X��p���āA�w��͈͓���Long�^�����𐶐�����.
        final long randomDiffTime = ThreadLocalRandom.current().nextLong(timeDiff + 1L);
        
        // 1����̃~���b���烉���_�����������~���b�����Z.
        final long randomTime = oneAfterDay.getTimeInMillis() - randomDiffTime;
        
        // �擾�����~���b���J�����_�[�ɐݒ�.
        randomDay.setTimeInMillis(randomTime);
        
        // Calendar�^��Date�^�֕ϊ�.
        randomDate = randomDay.getTime();
        
        return randomDate;
    }
}