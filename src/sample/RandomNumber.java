package sample;

public class RandomNumber {
    private int i=0;
    private int randnum;

    RandomNumber() {
        randnum = (int) (Math.random() * 20);
        System.out.println(randnum);
    }

    public String compare(int num) {
        if (i==5){
            return "Поражение!";
        }
        if (num > randnum) {
            i++;
            return "Поменьше";
        }
        else if (num < randnum) {
            i++;
            return "Побольше";
        }
        else {
            i++;
            return "Победа!!!";
        }
    }
}