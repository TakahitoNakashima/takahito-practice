/**
 * page�������r���s���A�e������s���N���X�̃C���X�^���X�𐶐�����.
 *
 * @author jsfkdt
 */
public RequestProcessorFactory implements RequestConstants {
    
    /**
     * �ȗ�.
     */
    private RequestProcessorFactory() {
    }
    
    /**
     * �ȗ�.
     */
    public static RequestProcessor createRequestProcessor(String page) {
        if (page == null) {
            // page��null�̏ꍇ�Anull��ԋp.
            return null;
        }
        
        switch (page) {
        case OPERATION_ALL:
            return new AllRequestProcessor();
        case OPERATION_UPDATE:
            return new UpdateRequestProcessor();
        case OPERATION_DELETE:
            return new DeleteRequestProcessor();
        case OPERATION_COMPARE:
            return new CompareRequestProcessor();
        case OPERATION_TEMPLATE:
            return new TemplateRequestProcessor();
        case OPERATION_NEXTTARGET:
            return new NextTargetRequestProcessor();
        case OPERATION_VERSIONS:
            return new VersionsRequestProcessor();
        case OPERATION_ISSUE:
            return new IssueRequestProcessor();
        default:
            // page��������Ȃ��ꍇ�Anull��ԋp.
            return null;
        
        }
    }
}