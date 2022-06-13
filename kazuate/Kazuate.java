package kazuate;

public class Kazuate {

    private int collectSuzi;

    public Kazuate(int suzi){
        this.collectSuzi = suzi;
    }

    public void showMenu(){
        int suzi;
        for(int count=0;count < 5;count++){
            System.out.print("数字を入力してください(0~99):");
            suzi = KeyBoard.inputNumber();
            if(Math.abs(suzi - collectSuzi) == 0){
                System.out.println("正解!");
                return;
            }
            if(Math.abs(suzi - collectSuzi) > 20){
                System.out.println("20以上の差があります．");
            }
            else if(Math.abs(suzi - collectSuzi) <= 20){
                System.out.println("20以内に正解があります．");
            }
        }

        System.out.println("終了!正解は"+ collectSuzi+"です．");
        return;
        
    }
}