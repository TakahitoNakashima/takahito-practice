import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * 040�p�̃G���[�o�̓N���X.
 *
 * @author jsfkdt
 */
public class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {
    
    /**
     * �L���b�`����Ȃ�������O���擾���A
     * �g���[�X���ƌ��ݎ�����W���o�͂��āA�����I�����܂�.
     *
     * @param thread �X���b�h���
     * @param throwable �G���[���
     */
    public void uncaughtException(Thread thread, Throwable throwable) {
        //�A�v���P�[�V�����̏I��
        System.out.println("��O���������܂����B\n");
        
        /* ���ݎ����̎擾 */
        String time = nowTime();
        
        /* ���ݎ�����W���G���[�o�� */
        System.err.println(time);
        
        /* �G���[�̃g���[�X�����o�� */
        throwable.printStackTrace();
        
        /* �����I�� */
        System.exit(1);
    }
    
    /**
     * ���ݎ�����Ԃ����\�b�h.
     * 
     * @return ���ݎ���
     */
    public String nowTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        
        return df.format(calendar.getTime());
    }
}