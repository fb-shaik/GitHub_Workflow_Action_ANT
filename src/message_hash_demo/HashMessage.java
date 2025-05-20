
package message_hash_demo;

public class HashMessage {

    // Method for hashing
    public static String createMessageHash(String messageId, int messageNumber, String messageContent) {
        // Trim the message
        messageContent = messageContent.trim();

        // Extract first word
        String firstword = messageContent.substring(0, messageContent.indexOf(" "));

        // Extract last word
        String lastword = messageContent.substring(messageContent.lastIndexOf(" ") + 1);

        // Build and return the hash in uppercase
        return messageId.substring(0, 2) + " : " + messageNumber + " : " + (firstword + lastword).toUpperCase();
    }
}
