/**
 * 041�p�̃��\�b�h�������N���X�ł�.
 *
 * @author jsfkdt
 */
public class MethodForThread {
    
    /**
     * 1����10000�܂ł̉��Z���ʂ�ϐ��֊i�[����.
     */
    public synchronized void calc() {
        
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // ���Z����.
        for(int num = 0; num < 10001; num++) {
            GlobalVariable.sum += num;
        }
        
        // wait���Ă���X���b�h�ɒm�点��.
        notify();
    }
    
    /**
     * ���Z���ʂ�W���o�͂���.
     */
    public synchronized void output() {
        
        try {
            System.out.println("�X���b�hA�Ōv�Z����������܂ő҂��܂��E�E�E");
            
            // ���Z�����������������Ƃ��m�F���A�ēx���s���J�n.
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // ���Z���ʂ�\������.
        System.out.println("�v�Z���ʁF" + GlobalVariable.sum);
    }
}