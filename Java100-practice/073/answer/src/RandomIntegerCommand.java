import java.util.Random;

/**
 * 073�ŗp���錻�ݓ����擾�R�}���h.
 *
 * @author jsfkdt
 */
public class RandomIntegerCommand extends AbstractCommand {
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer executeInner() {
        return new Integer(new Random().nextInt());
    }
}