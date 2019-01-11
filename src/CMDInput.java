public class CMDInput {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        }
        if(args.length == 1) {
            System.out.println("Så du säger " + args[0] + ".");
        }

        if(args.length == 2) {
            int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println(result);

        }

        if(args.length == 3) {
            System.out.println(args[2] + " " + args[1] + " " + args[0]);
        }

        if(args.length >= 4){
            System.out.println("Jag orkar inte, jag stänger ner");
        }

        for(int i = 0 ; i < args.length ; i++){
            System.out.println(args[i]);
        }
    }
}
