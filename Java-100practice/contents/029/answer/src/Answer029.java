import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
/**
 * 029�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer029 {
    /**
     * 029�̉𓚂ł�.
     * ���t���N�V������p���āAStringBuffer�N���X�̃C���X�^���X�𐶐����A
     * append(String)���\�b�h���Ăяo��.
     * Answer029��W���o�͂Ŏ擾����.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        try {
            /* �W�F�l���N�X��p���āA�Ăяo���N���X��������. */
            Class<?> stringBufferClass = null;
            
            /* �Ăяo�����\�b�h�̏�����. */
            Method appendMethod = null;
            
            // �g�p����N���X�𖾎����A�Ăяo��.
            stringBufferClass = Class.forName("java.lang.StringBuffer");
            
            // append���\�b�h���g�p����.������String�^�ł��邱�Ƃ𖾎�����.
            appendMethod = stringBufferClass.getMethod("append", String.class);
            
            // StringBuffer�N���X�̃C���X�^���X�𐶐�.
            StringBuffer sb = (StringBuffer) stringBufferClass.newInstance();
            
            // �l�̑}��.
            appendMethod.invoke(sb, "A");
            appendMethod.invoke(sb, "n");
            appendMethod.invoke(sb, "s");
            appendMethod.invoke(sb, "w");
            appendMethod.invoke(sb, "e");
            appendMethod.invoke(sb, "r");
            appendMethod.invoke(sb, "029");
            
            // �A�����ꂽ�l�̕W���o�͂��s��.
            System.out.println(sb.toString());
        } catch (NullPointerException e) {
            // null�G���[.
            e.printStackTrace ();
        } catch (ClassNotFoundException e) {
            // �N���X�����݂��Ȃ�.
            e.printStackTrace ();
        } catch (NoSuchMethodException e) {
            // ���\�b�h�����݂��Ȃ�.
            e.printStackTrace();
        } catch (InstantiationException e) {
            // �C���X�^���X�쐬�s��.
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // �Ăяo��:�A�N�Z�X�ᔽ�A�ی삳��Ă���.
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // �Ăяo��:�������قȂ�.
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // �^�[�Q�b�g�ƂȂ郁�\�b�h���g�̗�O����.
            e.printStackTrace();
        }
    }
}