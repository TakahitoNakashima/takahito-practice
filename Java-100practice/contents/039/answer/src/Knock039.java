
/**
 * 039�F��O(1).
 * ���̃v���O�������R���p�C���E���s����Ƃǂ��Ȃ邩�H�i���ۂɎ��s�������ɉ𓚂��邱�Ɓj
 *
 * @author jswaf
 */
public class Knock039 {

    /**
     * main method.
     * @args arguments
     */
    public static void main(String[] arguments) {
        try {
            try {
                throw new Exception("1st");
            } finally {
                throw new Exception("2nd");
            }
        } catch (Exception happened) {
            System.out.println(happened.getMessage());
        }
    }
}
