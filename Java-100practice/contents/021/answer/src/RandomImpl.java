import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * 021�̉𓚂ł�. �T�[�o�������ʂ�ԋp����.
 *
 * @author jsfkdt
 */
public class RandomImpl extends UnicastRemoteObject implements RandomRmi {
    
    public RandomImpl() throws RemoteException {
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int returnRandom() {
        Random rand = new Random();
        int num = rand.nextInt(8);
        return num;
    }
    
    /**
     * 021�̉𓚂ł�. 
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(String[] args) {
        // �T�[�o�̋N��
        System.out.println("Server start");
        
        try {
            RandomRmi random = new RandomImpl();
            Naming.rebind("RandomObject", random);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
