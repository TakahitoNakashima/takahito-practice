import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 021�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public interface RandomRmi extends Remote {
    
    /**
     * 021�̉𓚂ł�.0�`7�̔C�ӂ̐�����Ԃ��܂�.
     * @return 0�`7�̔C�ӂ̐����i�����_���j
     */
    int returnRandom() throws RemoteException;
}