/**
 * 032�ŗp����3�̔{�����葕�u.
 *
 * @author jsfkdt
 */
public class MultipleThreeValidator implements Validator {
    
    /**
     * {@inheritDoc}
     */
    public boolean isValid(int number) {
         if(number % 3 != 0) {
            return false;
         } else {
            return true;
         }
    }
}