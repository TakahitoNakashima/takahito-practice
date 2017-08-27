import java.util.Date;
/**
 * 073�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer073 {
    /**
     * 073�̉𓚂ł�.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args){
        // Date�R�}���h�����s
        output("Date", CommandFactory.getInstance().createCurrentCommand());
        // Random�R�}���h�����s
        output("Random", CommandFactory.getInstance().createRandomIntegerCommand());
    }
    
    public static void output(String commandName, Command command) {
        System.out.println(commandName + "�R�}���h�̎��s");
        System.out.println("���s�O�X�e�[�^�X�F" + command.getStatus());
        command.execute();
        System.out.println("���s��X�e�[�^�X�F" + command.getStatus());
        System.out.println("���s���ʁF" + command.getResult());
        System.out.println("��O�F" + command.getException());
        System.out.println();
    }
}