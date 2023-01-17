import java.lang.Character;

class IsAlphabet{
   public static void main(String[] args) {
      String name = "Shereen";
      boolean ans = name.chars().allMatch(Character::isLetter);
      System.out.println("This name contains only alphabets?  "+ans);
   }
}