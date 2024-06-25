class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UseException {
    public void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Invalid Age");
        } else {
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        UseException u = new UseException();
        try {
            u.checkAge(18);
        } catch(InvalidAgeException e) {
            System.out.println(e);
        }
    }
}