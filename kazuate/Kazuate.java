package kazuate;

public class Kazuate {

    private int collectSuzi;

    public Kazuate(int suzi){
        this.collectSuzi = suzi;
    }

    public void showMenu(){
        int suzi;
        for(int count=0;count < 5;count++){
            
            System.out.println("\n"+(count+1) + "回目");
            System.out.print("数字を入力してください(10~99):");
            suzi = KeyBoard.inputNumber();
            while(suzi < 10 || suzi >99){
                System.out.print("受け付けられない数字です．10~99の数字を入力してください:");
                suzi = KeyBoard.inputNumber();
            }

            if(Math.abs(suzi - collectSuzi) == 0){
                System.out.println("当たり!");
                return;
            }
            else if(suzi - collectSuzi > 0){
                System.out.println("正解より大きいです．");
            }
            else {
                System.out.println("正解より小さいです．");
            }
            
            if(Math.abs(suzi - collectSuzi) >= 20){
                System.out.println("20以上の差があります．");
            }
            
        }

        System.out.println("終了!正解は"+ collectSuzi+"です．");
        return;
        
    }
}
