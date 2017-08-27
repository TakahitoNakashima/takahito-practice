public class Knock072 extends HttpServlet {
    private final static Logger logger = Logger.getLogger("SampleCodeLogger");

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // ���N�G�X�g�p�����^�ɃG���R�[�h�w����s��
        req.setCharacterEncoding("UTF-8");
        // ���X�|���X�ɃR���e���c�^�C�v���Z�b�g
        res.setContentType("application/json; charset=UTF-8");
        
        String page = req.getParameter("page");
        RequestProcessor processor = RequestProcessorFactory.createRequestProcessor(page);
        
        if (processor == null) {
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            
            logger.log(Level.WARNING, "param error!");
            res.getWriter().write(
                        new ErrorJson("param error:" + page).toJson());
        }
        
        try {
            // �v���Z�X�����s.
            processor.process(req, res);
            
            // ���^�[���R�[�h�̐ݒ�.
            res.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            // ���^�[���R�[�h�̐ݒ�.
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}