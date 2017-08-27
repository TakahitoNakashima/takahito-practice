/**
 * 073�ŗp����Command�C���^�t�F�C�X.
 *
 * @author jsfkdt
 */
public interface Command<T> {
    
    /**
     * �R�}���h���s��Ԃ̃X�e�[�^�X���Ǘ�.
     */
    enum Status {
            NONE,
            EXECUTING,
            SUCCESS,
            ERROR;
    }
    
    /**
     * ���������s����.
     */
    public void execute();
    
    /**
     * �����󋵂��擾����.
     * 
     * @return �X�e�[�^�X. �����l��NONE.
     */
    public Status getStatus();
    
    /**
     * �R�}���h�̎��s���ʂ��擾����.
     *
     * @return �R�}���h���s���ʂ̃I�u�W�F�N�g. �����s����G���[����null.
     */
    public T getResult();
    
    /**
     * �R�}���h���s���̗�O���擾����.
     *
     * @return ��O. ����������null.
     */
    public Throwable getException();
}