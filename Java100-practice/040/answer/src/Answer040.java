/**
 * 040�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer040 implements Runnable {
    
    /**
     * 040�̉𓚂ł�.
     * �L���b�`����Ȃ���O�̃X�^�b�N�g���[�X��
     * ���ݎ����ƂƂ��ɕW���G���[�o�͂���.
     * 
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        Thread thread = new Thread(new Answer040());
        
        // UncaughtExceptionHandler�����������n���h����setUncaughtException���\�b�h�œo�^.
        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        
        // ���C���X���b�h�̎��s.
        thread.start();
    }
    
    /**
     * �X���b�h�����s.
     */
    public void run() {
        // �X���[�v.
        try {
             Thread.sleep(500L);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
        
        Thread subThread = new Thread(new SubThread());
        
        // UncaughtExceptionHandler�����������n���h�����T�u�X���b�h�ɕR�t����.
        subThread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        
        // �T�u�X���b�h�̎��s.
        subThread.start();
    }
}