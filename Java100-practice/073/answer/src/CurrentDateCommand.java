import java.util.Date;

/**
 * 073�ŗp���郉���_���Ȑ��l�擾�R�}���h.
 *
 * @author jsfkdt
 */
public class CurrentDateCommand extends AbstractCommand {
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Date executeInner() {
        return new Date();
    }
}