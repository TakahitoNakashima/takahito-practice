/**
 * 023�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer023 {
    /**
     * 023�̉𓚂ł�.
     * int�^��float�^�������Ɏ������̃��\�b�h���g�p���A
     * String�^�̌��ʂ��擾����.
     * 
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        System.out.println(convertToString(100));
        System.out.println(convertToString(100f));
    
    }
    
    /**
     * int�^�œn���ꂽ������String�^�ɕϊ����ԋp����.
     *
     * @param word int�^�̈���
     * @return int�^����String�^�֕ϊ���������.
     */
    private static String convertToString(final int word) {
        return String.valueOf("int�^����String�^�֕ϊ��������ʁF" + word);
    }
    
    /**
     * float�^�œn���ꂽ������String�^�ɕϊ����ԋp����.
     *
     * @param word float�^�̈���
     * @return float�^����String�^�֕ϊ���������.
     */
    private static String convertToString(final float word) {
        return String.valueOf("float�^����String�^�֕ϊ��������ʁF" + word);
    }
}