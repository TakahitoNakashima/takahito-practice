import java.util.Random;

/**
 * 035�ŗp����X���b�h�̎��s�N���X�ł�.
 *
 * @author jsfkdt
 */
public final class ThreadRun implements Runnable {
    
    /**
     * 1�`5�b�̃����_���Ȏ��Ԃ����X���[�v���s���X���b�h�����s����.
     */    
    public void run() {
        /* Random�N���X�̃C���X�^���X��. */
        Random random = new Random();
        
        /* 1�`5�̃����_���Ȓl���擾. */
        int rand = random.nextInt(5) + 1;
        
        /* �ΏۃX���b�h�̃E�G�C�g���Ԃ��w��. */
        long sleepTime = rand * 1000L;
        
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}