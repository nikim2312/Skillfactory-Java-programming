public class Calculate {
    public static int calculating(int operand1, int operand2, char operation)
    {
        int res = 0;

        switch (operation)
        {
            case ('+'):
                res = operand1 + operand2;
                break;
            case ('-'):
                res = operand1 - operand2;
                break;
            case ('*'):
                res = operand1 * operand2;
                break;
            case ('/'):
                res = operand1 / operand2;
                break;
        }
        return res;
    }
}
