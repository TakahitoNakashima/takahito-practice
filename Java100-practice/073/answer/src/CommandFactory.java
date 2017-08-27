import java.util.Date;

/**
 * 073�ŗp����CommandFactory.
 *
 * @author jsfkdt
 */
public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();
    
    /**
     * �C���X�^���X������Ȃ����߂̏C���q��t�^�����R���X�g���N�^.
     */
    private CommandFactory() {
    }
    
    /**
     * �{�N���X�̃C���X�^���X���擾����.
     */
    public static CommandFactory getInstance() {
        return INSTANCE;
    }
    
    // ���t�擾�C���X�^���X 
    
    
    /**
     * ���ݓ�����\�����\�b�h�����N���X�̃C���X�^���X���擾.
     *
     * @return ���ݓ�����\�����\�b�h�����N���X�̃C���X�^���X.
     */
    @SuppressWarnings("unchecked")
    public Command<Date> createCurrentCommand() {
        return (Command<Date>) new CurrentDateCommand();
    }
    
    /**
     * �����_���Ȑ��l��Ԃ����\�b�h�����N���X�̃C���X�^���X���擾.
     *
     * @return �����_���Ȑ��l��Ԃ����\�b�h�����N���X�̃C���X�^���X.
     */
    @SuppressWarnings("unchecked")
    public Command<Integer> createRandomIntegerCommand() {
        return (Command<Integer>) new RandomIntegerCommand();
    }
}