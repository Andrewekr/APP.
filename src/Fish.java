public class Fish extends Pet {
        int currentDepth = 0;
        public int drive(int howDeep){
            currentDepth=currentDepth+howDeep;
            System.out.println("Нырять на глубину" + howDeep + " футов");
            System.out.println("Я на глубине" + currentDepth + "футов ниже уровня моря");
            return currentDepth;
        }
        public void say(){System.out.println("Рыбки не разговаривают.");}
    }

 