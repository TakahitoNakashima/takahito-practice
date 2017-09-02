import java.lang.ProcessBuilder;
import java.io.IOException;

/**
 * 056�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer056 {
    /**
     * 056�̉𓚂ł�.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        try {
            // �R�}���h��ݒ�.
            ProcessBuilder command = new ProcessBuilder("cmd", "/c", "dir");
            
            // �R�}���h�̎��s.
            Process process = command.start();
            
            // �X���b�h�C���X�^���X�̐���.
            InputStreamThread output = new InputStreamThread(process.getInputStream());
            InputStreamThread outputError = new InputStreamThread(process.getErrorStream());
            
            // �X���b�h�̊J�n.
            output.start();
            outputError.start();
            
            // �v���Z�X�̏I���҂�
            process.waitFor();
            
            // �X���b�h�I���҂�
            output.join();
            outputError.join();
            
            System.out.println("�߂�l�F" + process.exitValue());
            
            //�W���o�͂̓��e���o��
            for (String out : output.getStringList()) {
                System.out.println(out);
            }
            
            //�W���G���[�̓��e���o��
            for (String outError : outputError.getStringList()) {
                System.err.println(outError);
            }
            
        } catch (IOException e) {
            // ���o�̓G���[.
            e.printStackTrace();
        } catch (InterruptedException e) {
            // ���荞�݃G���[.
            e.printStackTrace();
        }
    }
}