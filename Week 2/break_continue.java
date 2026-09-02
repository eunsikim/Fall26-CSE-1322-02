public class break_continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i != 3){
                System.out.println(i);
            }
            else{
                continue;
            }
            

            if(i == 5){
                break;
            }
        }
    }
}
