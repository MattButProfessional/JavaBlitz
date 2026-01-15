public class forLoop {
    public static void main(String[] args) {
        /*
        syntax: for(initialization;condition;update)
         */
        for (int i=0; i<50; i++){
            System.out.printf("%d: fxcgfcvcvbv\n",i);
        }

        // break and continue
        for (int i=0; i<25; i++){
            //skip 13
            if(i == 13){
                continue;
            }
            //stop at 20
            if(i == 20){
                break;
            }
            System.out.println(i);
        }
    }
}
