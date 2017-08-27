import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * 056�̉𓚂ł�.InputStream��ǂݍ��ރX���b�h�N���X.
 *
 * @author jsfkdt
 */
public class InputStreamThread extends Thread {
    /* BufferedReader�̃v���C�x�[�g�ϐ�. */
    private BufferedReader bufferReader;
    
    /* �W���o�́E�G���[���e�̊i�[�p���X�g.  */
    private List<String> outputList = new ArrayList<String>();
    
    /**
     * BufferedReader�Ɋi�[����.
     *
     * @param day InputStream
     */
    public InputStreamThread(final InputStream stream) {
        this.bufferReader = new BufferedReader(new InputStreamReader(stream));
    }
    
    /**
     * �o�́E�G���[���e��List�ϐ��Ɋi�[����.
     */
    @Override
    public void run() {
        try {
            // �o�͓��e���o�͗p�z��ɓǂݍ���.
            bufferReader.lines().forEach(line -> outputList.add(line));
            
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * �o�͕�������擾����.
     *
     * @return �o�͕�����̃��X�g.
     */
    public List<String> getStringList() {
        return outputList;
    }
}