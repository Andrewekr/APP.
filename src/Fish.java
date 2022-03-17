public class Fish extends Pet {
    public static void main(String[] args){
        Fish myLittleFish = new Fish();
        myLittleFish.sleep();
    }
    int currentDepth = 0;
    public int drive(int howDeep){
        currentDepth=currentDepth+howDeep;
        System.out.println("Нырять на глубину" + howDeep + " футов");
        System.out.println("Я на глубине" + currentDepth + "футов ниже уровня моря");
        return currentDepth;
    }
}

 