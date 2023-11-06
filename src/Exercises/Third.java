package Exercises;

//The method to return the value of the maximum cost by buying a piece from both keyboard and drivers that can be purchased with a given budget

public class Third {
    public static void main(String[] args) {

        int[]keyboards = {40,50,60};
        int[]drivers = {5,8,12};
        int budget = 64;

        System.out.println(getMoneySpent(keyboards,drivers,budget));
    }
    static int getMoneySpent(int[]keyboards, int[]drives, int budget){
        int moneySpent = -1;

        for(int w : keyboards){
            for(int h :drives){
                if(h+w>=moneySpent && h+w<=budget){
                    moneySpent = h+w;
                }
            }
        }
        return moneySpent;
    }
}
