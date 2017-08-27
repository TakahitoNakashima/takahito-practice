import java.util.Date;

/**
 * 073�ŗp����Command�����N���X.
 *
 * @author jsfkdt
 */
public abstract class AbstractCommand<T> implements Command<T> {
    
    /* �t���O�̏�����. */
    private Status flag = Status.NONE;
    
    /* ��O�̏�����. */
    private Throwable error = null;
    
    /* ���s���ʂ̏�����(�����s���̏��). */
    private T result = null;
    
    /**
     * �������s���A�I�u�W�F�N�g��ԋp����.
     *
     * @return �������ʂ̃I�u�W�F�N�g.
     */
    protected abstract T executeInner();
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        // ���s��ԃt���O��ݒ�.
        flag = Status.EXECUTING;
        
        try {
            // ���ʃ��\�b�h�̎��s(�{����)
            result = executeInner();
            
            // �����t���O��ݒ�.
            flag = Status.SUCCESS;
            
        } catch (Throwable error) {
            // �G���[�t���O��ݒ�.
            flag = Status.ERROR;
            // ���s���ʂ�null�ɐݒ�.
            result = null;
            // ��O��ݒ�.
            this.error = error;
            
            // Error�N���X�̗�O�ł���΃X���[����.
            if (error instanceof Error) {
                throw error;
            }
            
            return;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Status getStatus() {
        return flag;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public T getResult() {
        return result;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Throwable getException() {
        return error;
    }
}