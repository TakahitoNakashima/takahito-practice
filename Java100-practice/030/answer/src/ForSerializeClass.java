import java.io.Serializable;
/**
 * 030�p�̃C���X�^���X�ϐ������N���X�ł�.
 *
 * @author jsfkdt
 */
public class ForSerializeClass implements Serializable {
    /* int�^�̃C���X�^���X�ϐ� */
    private int intInstance = 1;
    /* String�^�̃C���X�^���X�ϐ� */
    private String stringInstance = "Answer30";
    
    /**
     * int�^�C���X�^���X�ϐ��̒l��ݒ肷��.
     *
     * @param intInstance int�^�̈���
     */
    public void setIntInstance(int intInstance) {
        this.intInstance = intInstance;
    }
    
    /**
     * int�^�C���X�^���X�ϐ��̒l���擾����.
     *
     * @return int�^�C���X�^���X�ϐ��̒l
     */
    public int getIntInstance() {
        return this.intInstance;
    }
    
    /**
     * String�^�C���X�^���X�ϐ��̒l��ݒ肷��.
     *
     * @param stringInstance String�^�̈���
     */
    public void setStringInstance(String stringInstance) {
        this.stringInstance = stringInstance;
    }
    
    /**
     * String�^�C���X�^���X�ϐ��̒l���擾����.
     *
     * @return String�^�C���X�^���X�ϐ��̒l
     */
    public String getStringInstance() {
        return this.stringInstance;
    }
}