public class CharacterPattern {
    public static void main(String[] args) {
        int character = 65;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(" "+(char)character);
                character++;
            }
            System.out.println(" ");
        }
    }
}