import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.Paths;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.io.IOException;

/**
 * 057�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer057 {
    /**
     * 057�̉𓚂ł�.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �z��ɒl�������Ă��Ȃ��ꍇ�A�����I��.
        if (args.length < 1 ) {
            System.err.println("�����Ƀe�L�X�g�t�@�C�������w�肵�A�Ď��s���Ă��������B");
            System.exit(1);
        }
        
        // �e�L�X�g�t�@�C����ǂݍ���.
        try (Stream<String> txtFile = Files.lines(Paths.get(args[0]))) {
            
            // ��s���ɕW���o��.
            txtFile.map(line -> line).forEach(System.out::println);
            
            // {@code filesystem}�̎擾.
            final FileSystem fileSystem = FileSystems.getDefault();
            
            // �R�s�[���t�@�C���p�X���擾.
            final Path beforeFile = Paths.get(args[0]);
            
            // �R�s�[��̃p�X���擾.
            final Path afterFile = fileSystem.getPath(args[0] + ".read");
            
            // �t�@�C�����R�s�[.
            Files.copy(beforeFile, afterFile, REPLACE_EXISTING);
            
            // ���t�@�C���̍폜.
            Files.deleteIfExists(beforeFile);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}