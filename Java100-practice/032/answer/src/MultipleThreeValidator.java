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
         return number % 3 == 0;
    }
}