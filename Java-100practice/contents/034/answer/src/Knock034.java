
/**
 * 034�F���\�b�h�Q��.
 * �ȉ��̃v���O�����́�������36�����ȓ��ŃR�[�h��}�����A`medals`�̓��e��1�s�ɂ�1���W���o�͂ɏo�͂���v���O�����ɂ���.
 * <pre>
 * public class Knock034 {
 *     public static void main(String[] arguments) {
 *         java.util.List<String> medals = new java.util.ArrayList<>();
 *         medals.add("gold");
 *         medals.add("silver");
 *         medals.add("bronze");
 *         ��
 *     }
 * }
 * </pre>
 *
 * @author toastkidjp
 *
 */
public class Knock034 {

    /**
     * main method.
     * @param args
     */
    public static void main(final String[] args) {
        final java.util.List<String> medals = new java.util.ArrayList<>();
        medals.add("gold");
        medals.add("silver");
        medals.add("bronze");
        medals.forEach(System.out::println);
    }

}
