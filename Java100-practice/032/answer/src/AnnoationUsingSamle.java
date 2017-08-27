import java.lang.reflect.Field;

/**
 * 032�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class AnnoationUsingSamle {

    /**
     * 032�̉𓚂ł�.
     * �A�m�e�[�V������p���āA
     * �����Ɏw�肳�ꂽ�l��3�̔{���ł��邩�ǂ����̃`�F�b�N���s��.
     *
     * @param arguments
     */
    public static void main(final String[] args) throws Exception {

        // �z��ɒl�������Ă��Ȃ��ꍇ�A�����I��
        if (args.length < 1) {
            System.err.println("�����ɐ��l���w�肵�A�Ď��s���ĉ������B");
            System.exit(1);
        }

        try {
            User user = getUser(Integer.parseInt(args[0]));
            checkUserInfo(user);
            System.out.println("3�̔{���ł��B");
        } catch (NumberFormatException e) {
            System.err.println("�����ɐ��l���w�肵�A�Ď��s���ĉ������B");
            e.printStackTrace();
        }
    }

    /**
     * ������3�̔{�����ǂ����𔻒肷��.
     *
     * @param user User�^�I�u�W�F�N�g
     */
    private static void checkUserInfo(User user) throws Exception {
        // �t�B�[���h�̎擾
        Field[] fields = user.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Constraint.class)) {

                int number = (int) field.get(user);

                // 3�̔{���`�F�b�N�N���X�̃C���X�^���X�𐶐�.
                MultipleThreeValidator checkMultipleThree = new MultipleThreeValidator();

                // 3�̔{�����ǂ����𔻒�.
                if(!checkMultipleThree.isValid(number)) {
                    System.err.println("3�̔{���ł͂���܂���B");
                    throw new IllegalStateException();
                }
            }
        }
    }

    /**
     * User�^�̃I�u�W�F�N�g��ԋp����.
     *
     * @param number �w��̈���
     * @return User�^�̃I�u�W�F�N�g
     */
    private static User getUser(int number) {
        User user = new User();
        user.number = number;
        return user;
    }
}