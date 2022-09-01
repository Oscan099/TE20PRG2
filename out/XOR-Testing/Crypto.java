
class XORtest1
{

    static String encryptDecrypt(String inputString)
    {

        char xorKey = 'P';

        String outputString = "";

        int len = inputString.length();

        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
                    ((char) (inputString.charAt(i) ^ xorKey));
        }

        System.out.println(outputString);
        return outputString;
    }

    public static void main(String[] args)
    {
        String sampleString = "Shojo = stoopid";


        System.out.println("Encrypted String");
        String encryptedString = encryptDecrypt(sampleString);


        System.out.println("Decrypted String");
        encryptDecrypt(encryptedString);
    }
}
