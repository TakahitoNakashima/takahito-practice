/**
 * 041�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer041 extends Thread {
    /**
     * 041�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */    
    public static void main(final String[] args) {
        final MethodForThread calcAndOutput = new MethodForThread();
        new Thread() {
            /**
             * �X���b�hA�����s����.
             */
            public void run() {
                
                try {
                    System.out.println("�X���b�hA�ł��B 2�b����܂��E�E�E");
                    sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                // ���Z���\�b�h�����s.
                calcAndOutput.calc();
            }
        }.start();
        
        new Thread() {
            /**
             * �X���b�hB�����s����.
             */            
            public void run() {
                try {
                    sleep(500L);
                    System.out.println("1����10000�܂ł̍��v���v�Z���܂��I");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                // �o�͌��ʕ\�����\�b�h�����s.
                calcAndOutput.output();
            }
        }.start();
    }
}