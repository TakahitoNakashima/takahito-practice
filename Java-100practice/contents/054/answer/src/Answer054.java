import java.util.stream.IntStream;
/**
 * 054�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer054 {
    /**
     * 054�̉𓚂ł�.
     * java.util.stream��API��p���āA
     * 1����100�܂ł̐����Ɋ܂܂��������������Z�������ʂ����߂�.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        /* IntStream��p���āA1�`100�̂������������𒊏o���A���v��W���o��. */
        System.out.println(IntStream.range(1, 100).filter(x -> x % 2 == 0).sum());
    }
}