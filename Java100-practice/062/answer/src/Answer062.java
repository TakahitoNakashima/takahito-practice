import java.util.Map;
import java.util.Collections;

/**
 * 062�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer062 {
    
    /**
     * Answer062�̃C���X�^���X�𐶐�����.
     */
    Answer062() {
        
    }
    
    /**
     * 062�̉𓚂ł�.
     * 
     * @param arguments �g�p���܂���.
     */
    @SuppressWarnings("unchecked")
    public static void main(final String[] args) {
        /* �C�ӂ̃f�[�^���i�[�\�ȃL�[�o�����[�`����Map.(1) */
        /* �o�^�ł���L�[�̐����ő�100�̃}�b�v�C���X�^���X�𐶐�.(2) */
        final Map<String, String> cacheMap = Collections.synchronizedMap(new LruHashMap(100));
        
        // �f�[�^���i�[.
        cacheMap.put("key111", "value111");
        cacheMap.put("key222", "value222");
        cacheMap.put("key333", "value333");
        
        // ���ɑ��݂���key�̏ꍇ�͏㏑��.
        cacheMap.put("key111", "value1111");
        displayAllElements(cacheMap);
        
        /* �f�[�^�̎擾�\.(3) */
        System.out.println(cacheMap.get("key333") + "\n");
        
        /* �f�[�^�̑}���\. (4) */
        cacheMap.put("key444", "value444");
        
        /* ���ꂽ�f�[�^�͏����Ȃ�. ��Ɏc�葱����.(6),(7) */
        displayAllElements(cacheMap);
        
        /* �����f�[�^�����x���擾�\.(7) */
        System.out.println(cacheMap.get("key333"));
        
        /* �}�b�v�ɗv�f��101�i�[���A�������폜����Ă��邩�m�F.(5) */
        insertMaxAndCheckOperation(cacheMap);
    }
    
    /**
     * �S�Ă�key,Value�̑g�ݍ��킹��W���o�͂���.
     * map�Ɋi�[����Ă���l���Ȃ��ꍇ�́A�����\�����Ȃ�.
     * 
     * @param map cacheMap
     */
    public static void displayAllElements(Map<String, String> map) {
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("");
    }
    
    /**
     * �}�b�v�ɗv�f��100�i�[���A1�Ԗڂ̗v�f���Q�Ƃ���.
     * ����101�Ԗڂ̗v�f���i�[���A2�Ԗڂ̗v�f���폜����Ă��邱�Ƃ��m�F����.
     * 
     * @param map cacheMap
     */
    public static void insertMaxAndCheckOperation(Map<String, String> map) {
        // �}�b�v���N���A.
        map.clear();
        
        // �v�f��100�}��.
        for (int i = 0; i < 100; i++) {
            map.put("key" + i, "value" + i);
        }
        
        // �}�b�v�̐擪�̒l���Q��.
        map.get("key0");
        
        // 101�Ԗڂ̗v�f��ǉ�.
        map.put("key100", "value100");
        
        // �}�b�v�̗v�f���������100�ł��邩�m�F.
        assert map.size() == 100 : "�}�b�v�̗v�f��������Ă��܂�.";
        // �ł������Q�Ƃ���Ă��Ȃ��v�f���폜����Ă��邱�Ƃ��m�F.
        assert map.get("key1") == null : "�ł��������p����Ă��Ȃ����̂��폜����Ă��܂���B";
    }
}

