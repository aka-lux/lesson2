public class Calculator {

    /*
    * Функция должна вернуть результат заданной операции (+,-,*,/)
    * или 0 если операция не возможна или указан неправильный оператор
    */
    public static int сalculator(int firstNumber, char operation, int secondNumber){
        if(operation == '*'){
            return firstNumber*secondNumber;
        }
        if(operation == '+'){
            return firstNumber+secondNumber;
        }
        if(operation == '-'){
            return firstNumber-secondNumber;
        }
        if(operation == '/' && secondNumber !=0 ){
            return firstNumber/secondNumber;
        }else{
            return 0;
        }
    }


}
