package shinde;

public class StringClass {
    private String value;

    public StringClass(String value) {
        this.value = value;
    }

    // Method to check if two StringClass objects have equal string values
    public boolean equals(StringClass another) {
        return this.value.equals(another.value);
    }

    // Method to reverse the string value
    public StringClass reverse() {
        String reversed = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reversed += value.charAt(i);
        }
        return new StringClass(reversed);
    }

    // Method to change the case of the string value
    public StringClass changeCase() {
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new StringClass(new String(chars));
    }

    @Override
    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        StringClass myString = new StringClass("HelloWorld");
        
        // Test equals method
        System.out.println(myString.equals(new StringClass("HelloWorld"))); // true
        System.out.println(myString.equals(new StringClass("helloWorld"))); // false

        // Test reverse method
        System.out.println(myString.reverse()); // dlroWolleH

        // Test changeCase method
        System.out.println(myString.changeCase()); // hELLOwORLD
    }
}
