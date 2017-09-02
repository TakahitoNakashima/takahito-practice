import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 055�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer055 {
    /**
     * 055�̉𓚂ł�.
     * UTF-8�̃e�L�X�g�t�@�C����ǂݍ��݁A�e�s�̕������̍��v���o�͂���.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �e�L�X�g�t�@�C����ǂݍ���
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("Answer055.txt"))) {
            /* �������̍��v. */
            AtomicInteger sum = new AtomicInteger(0);
            
            // ��s���̕��������擾���A{@code sum}�ɑ����Ă���.
            reader.lines().parallel().forEach(line -> sum.addAndGet(line.length()));
            
            // ���������J�E���g���A�W���o�͂���.
            System.out.println(sum + "����");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}