
package message_hash_demo;


public class Message_Hash_Demo {

    public static void main(String[] args) {
     String messageID = "0763369799";
        int messageNumber = 1;
        String message = " Hi there, thanks ";

        String hash = HashMessage.createMessageHash(messageID, messageNumber, message);
        System.out.println("Generated hash is: " + hash);
    
}
}
