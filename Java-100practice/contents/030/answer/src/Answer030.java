import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 * 030�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer030 {
    /**
     * 030�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        // �N���X���V���A���C�Y���ăt�@�C���ɕۑ�.
        try (ObjectOutputStream outputObject = new ObjectOutputStream(new FileOutputStream("Sample.txt"))) {
            
            // �V���A���C�Y�N���X�̃C���X�^���X�𐶐�.
            ForSerializeClass serializeClass = new ForSerializeClass();
            
            // �I�u�W�F�N�g�̃C���X�^���X�ϐ��ɒl��ݒ肷��.
            serializeClass.setIntInstance(100);
            serializeClass.setStringInstance("Answer030");
            
            // �V���A���C�Y�Ώۂ̃N���X�̏�������
            outputObject.writeObject(serializeClass);
            
        } catch (IOException e) {
            // ���o�̓G���[.
            e.printStackTrace();
        }
        
        // �t�@�C�����f�V���A���C�Y���A�C���X�^���X�ϐ���W���o��.
        try (ObjectInputStream inputObject = new ObjectInputStream(new FileInputStream("Sample.txt"))) {
            
            // �I�u�W�F�N�g�̓ǂݍ���.
            ForSerializeClass serializeClass = (ForSerializeClass) inputObject.readObject();
            
            // �ǂݍ��񂾃I�u�W�F�N�g�̃C���X�^���X�ϐ��̑Ó������`�F�b�N.
            assert serializeClass.getIntInstance() == 100
                : "�f�V���A���C�Y�Ɏ��s���܂����Bint�^�ϐ��̒l�F" + serializeClass.getIntInstance();
            
            assert serializeClass.getStringInstance().equals("Answer030")
                : "�f�V���A���C�Y�Ɏ��s���܂����BString�^�ϐ��̒l�F" + serializeClass.getStringInstance();
            
        } catch (IOException  e) {
            // ���o�̓G���[.
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // �N���X�����݂��Ȃ�.
            e.printStackTrace();
        }
    }
}
