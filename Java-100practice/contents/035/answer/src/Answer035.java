/**
 * 035�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public final class Answer035 implements Runnable {
    /* �X���b�h�O���[�vA. */
    private static ThreadGroup groupA = new ThreadGroup("GroupA");
    
    /* �X���b�h�O���[�vB. */
    private static ThreadGroup groupB = new ThreadGroup("GroupB");
    
    /**
     * �O���[�vA,B�̃X���b�h���e100�X���b�h���s����.
     */
    @Override public void run() {
        for (int i = 0; i < 100; i++) {
            new Thread(groupA, new ThreadRun(), "thread" + i).start();
        }
        
        for (int i = 0; i < 100; i++) {
            new Thread(groupB, new ThreadRun(), "thread" + i).start();
        }
    }
    
    /**
     * �e�X���b�h�O���[�v�ɂ�����A�N�e�B�u�X���b�h�����o�͂���.
     *
     * @param point �J�E���g��
     */
    public static void printActiveCount(int point) {
        System.out.println("Active Threads in Thread Group " + groupA.getName() +
            " at point(" + point + "):" + " " + groupA.activeCount());
    
        System.out.println("Active Threads in Thread Group " + groupB.getName() +
            " at point(" + point + "):" + " " + groupB.activeCount());
    }
    
    /**
     * 035�̉𓚂ł�.
     * �X���b�h�O���[�v���ƂɃX���b�h�����s���A
     * �e�X���b�h�ɂăA�N�e�B�u�ł���X���b�h����W���o�͂���.
     *
     * @param arguments �g�p���܂���.
     */    
    public static void main(String[] args) throws InterruptedException {
        /* �V�����X���b�h�����蓖�Ă�. */
        Thread thread = new Thread(new Answer035());
        
        /* �X���b�h�����s����. */
        thread.start();
        
        // �A�N�e�B�u�X���b�h�����o�͂���.
        for (int i = 1 ;; i++) {
            printActiveCount(i);
            thread.sleep(1000L);
            
            // �A�N�e�B�u�X���b�h��0�ɂȂ����Ƃ��Ƀ��[�v�𔲂���.
            if (groupA.activeCount() == 0 && groupB.activeCount() == 0) {
                break;
            }
        }
    }
}