/**
 * 023�F�I�[�o�[���[�h.
 * ����̖��̂ŁAint�^1�������Ɏ�郁�\�b�h��float�^1�������Ɏ�郁�\�b�h���쐬���A
 * ���ꂼ��̃��\�b�h�ł͓n���ꂽ�����𕶎���ɕϊ����ĕԂ��悤�Ɏ�������.
 *
 * @author Toast kid
 *
 */
public class Knock023 {

    /**
     * toString passed int value.
     * @param i
     * @return string
     */
    private static String convertString(final int i) {
        return String.valueOf(i);
    }

    /**
     * toString passed float value.
     * @param f
     * @return string
     */
    private static String convertString(final float f) {
        return String.valueOf(f);
    }

    /**
     * main method.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("i: int   = " + convertString(1));
        System.out.println("f: float = " + convertString(1f));
    }
}
