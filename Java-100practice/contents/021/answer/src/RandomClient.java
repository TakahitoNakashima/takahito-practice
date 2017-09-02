import java.rmi.Naming;

/**
 * 021�̉𓚂ł�. �N���C�A���g�������ʂ��擾����.
 *
 * @author jsfkdt
 */
public class RandomClient {
    /**
     * 021�̉𓚂ł�. 
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(String[] args) {
        RandomRmi random;
        
        try {
            random = (RandomRmi)Naming.lookup("rmi://localhost/RandomObject");
            
            System.out.println(random.returnRandom());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}