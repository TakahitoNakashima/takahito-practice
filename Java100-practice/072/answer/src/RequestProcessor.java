/**
 * �e�N���X�̃��\�b�h�W�񂵂��C���^�[�t�F�C�X.
 *
 * @author jsfkdt
 */
public interface RequestProcessor {
    /**
     * �ȗ�.
     */
    public void process(HttpServletRequest req, HttpServletResponse res)
    throws Exception;
    
}