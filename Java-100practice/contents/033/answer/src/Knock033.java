import java.util.Arrays;
import java.util.List;

/**
 * 033�F�����_��.
 * 0�`9�̐�����1��������10��v�f�Ɏ����X�g�ɑ΂��āA�������W���o�͂���v���O�����������_����p���Ď�������B
 *
 * @author toastkidjp
 *
 */
public class Knock033 {

    /**
     * main method.
     * @param args
     */
    public static void main(final String[] args) {
        final List<Integer> zeroToNine = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        zeroToNine.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
    }
}
