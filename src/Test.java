public class Test {
    public static String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
        Validate_Email validate = new Validate_Email();
        for(String element: validEmail){
            boolean isValid = validate.validateEmail(element);
            System.out.println("Email: "+ element+ " is "+ validate.result(isValid));
        }
        for(String element: invalidEmail){
            boolean isValid = validate.validateEmail(element);
            System.out.println("Email: "+ element+ " is "+validate.result(isValid));
        }
    }
}
