/**
 * 015�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer015 {

    private String name;
    
    /**
     * {@code no name}�𖼑O�Ɏ��C���X�^���X�𐶐�����B
     */
    Answer015(){
        this("no name");
    }
    
    /**
     * �R���X�g���N�^�Ŗ��O��ݒ肷��B
     *
     * @param iname �\�����閼�O
     */
    Answer015(String iname){
        this.name = iname;
    }
    
    /**
     * 015�̉𓚂ł��B
     * @param arguments �g�p���܂���B
     */
    public static void main(String[] args) {
        String withoutName = new Answer015().name;
        String withName = new Answer015("Answer015").name;
        System.out.println(withoutName);
        System.out.println(withName);
    }
}
