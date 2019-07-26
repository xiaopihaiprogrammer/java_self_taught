public class TestRandomCharacter {
    public static void main(String[]args){
        final int NUM_PER_LINE = 20;
        final int TOTAL = 170;
        RandomCharacter randomNum = new RandomCharacter();
        for (int count = 0;count<=TOTAL;count++){
            char ch = RandomCharacter.getRandomCharacter();
            if ((count+1) % NUM_PER_LINE == 0){
                System.out.println(ch);
            }else{
                System.out.print(ch);
            }
        }
    }
}
