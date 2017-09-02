/**
 * 022�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer022 {
    /**
     * 022�̉𓚂ł�.
     * ��߂�ꂽ�����̈�����W���o�͂���.
     * 
     * @param arguments
     */
    public static void main(final String[] args) {
        /** �����̌� **/
        final int len = args.length;
        
        if (len == 3) {
            listNames(args[0], args[1]);
        } else if (len == 5) {
            listNames(args[1], args[2], args[4]);
        } else if (len == 7) {
            listNames(args[0], args[3], args[5], args[6]);
        } else {
            // USAGE���o��.
            System.err.println("Usage : �����̐���3�A5�A7�̂����ꂩ�ɂ��čĎ��s���Ă�������");
            // �I���R�[�h��2�Ƃ��āA�����I��.
            System.exit(2);
        }
    }
    
    /**
     * ���͂��ꂽ�����̈ꕔ��W���o�͂���.
     *
     * @param  names �����̒l
     */
    private static void listNames(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}