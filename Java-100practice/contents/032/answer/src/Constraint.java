/**
 * 3�̔{���`�F�b�N�������A�m�e�[�V����.
 *
 * @author jsfkdt
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Constraint{
    int number() default 1;
} 
