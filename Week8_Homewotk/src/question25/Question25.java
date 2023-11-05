package question25;

//Declare one method with return type and parameter and print your name in console.

public class Question25 {
    public static void main(String[] args) {
        String Name = "Harita";
        String reversedStr = "";
        System.out.println(" Name : " + Name);

        for (int i = 0; i < Name.length(); i++) {
            reversedStr = Name.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}
