public class Friend extends Person {
    private String phoneNumber;

    public Friend(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isBlank()) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("The phone number is not valid");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void print() {
        System.out.println("Hi! My name is " + getFirstName() + ", and I am a friend");
    }
}
