import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.io.IOException;

/**
 * 059�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer059 {
    
    /**
     * 059�̉𓚂ł�.
     * �����Ɏw�肳�ꂽURL�ɃA�N�Z�X���A
     * ���X�|���X�R�[�h��W���o��.
     * URL�̃w�b�_��{�f�B�̓��e�̓t�@�C���ɏo�͂���.
     *
     * ���A�l 0:����I��
     *        1:�����Ɏw�肵��URL���������ĉ�����.
     *        2:�����Ɏw�肵��URL�̃z�X�g�܂���DNS�ݒ���������ĉ�����.
     *        3:�ēx�ڑ��������ĉ�����.
     *
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        /* ���A�l. */
        int errorCode = 0;
        
        
        //�z��ɒl�������Ă��Ȃ��ꍇ�A�����I��.
        if (args.length < 1 ) {
            System.err.println("������ URL ���w�肵�A�Ď��s���Ă��������B");
            System.exit(1);
        }
        
        try {
            
            // URL�̐ݒ�.
            final URL url = new URL(args[0]);
            
            // �ڑ��I�u�W�F�N�g�̐���.
            HttpURLConnection connect = (HttpURLConnection)url.openConnection();
            
            // URL�v�����\�b�h��ݒ�.
            connect.setRequestMethod("GET");
            
            // ���_�C���N�g�������ŋ����Ȃ��ݒ�.
            connect.setInstanceFollowRedirects(false);
            
            /* ���X�|���X�R�[�h�̏o��. */
            final int responseCode = connect.getResponseCode();
            System.out.println("/***���X�|���X�R�[�h***/\n" + responseCode + "\n");
            
            /* �w�b�_�t�@�C�����쐬. */
            makeHeaderFile(connect);
            System.out.println("/***���X�|���X�w�b�_���ȉ��t�@�C���ɏo�͂��܂���***/");
            System.out.println("header.txt\n");
            
            /* �{�����쐬. */
            makeBodyFile(connect);
            System.out.println("/***���X�|���X�{�f�B���ȉ��t�@�C���ɏo�͂��܂���***/");
            System.out.println("body.txt");
            
        } catch (MalformedURLException e) {
            errorCode = 1;
            // �s���Ȍ`����URL.
            e.printStackTrace();
            
        } catch (UnknownHostException e) {
            errorCode = 2;
            // �z�X�g��IP�A�h���X�擾�s��.
            e.printStackTrace();
            
        } catch (IOException e) {
            errorCode = 3;
            e.printStackTrace();
        } finally {
            System.exit(errorCode);
        }
    }
    
    /**
     * �ǂݍ���URL�̃w�b�_�����t�@�C���֏o�͂��܂�.
     *
     * @param connectHeader URL�ڑ��I�u�W�F�N�g
     */
    public final static void makeHeaderFile(HttpURLConnection connectHeader) {
        try (final BufferedWriter output = new BufferedWriter(new FileWriter("header.txt"))) {
            // �w�b�_���擾.
            final Map headers = connectHeader.getHeaderFields();
            
            // Iterator��ݒ�.
            final Iterator header = headers.keySet().iterator();
            
            // Iterator�ɂ�鑖��.
            while(header.hasNext()){
                final String headerKey = (String)header.next();
                
                // �t�@�C���֏����o��.
                output.write("  " + headerKey + ": " + headers.get(headerKey));
                output.newLine();
            }
            
            System.out.println(headers.get("Content-Length"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * �ǂݍ���URL�̖{�����t�@�C���֏o�͂��܂�.
     *
     * @param connectHeader URL�ڑ��I�u�W�F�N�g
     */
    public final static void makeBodyFile(HttpURLConnection connectBody) {
        try (final BufferedInputStream input = new BufferedInputStream(connectBody.getInputStream());
             final BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("body.txt"))){
                
                /* �ǂݍ��񂾃o�C�g������̒���. */
                int byteLength;
                /* ��x�ɓǂݍ��߂�ő��byte�i�[��. */
                byte[] maxbyte = new byte[1024];
                
                // {@code maxbyte}�̕������ǂݍ��݁A���̕������t�@�C���ɏ�������.
                // �ǂݍ��ރf�[�^���Ȃ��Ȃ������_��while���𔲂���.
                while ((byteLength = input.read(maxbyte)) != -1) {
                    output.write(maxbyte, 0, byteLength);
                }
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
