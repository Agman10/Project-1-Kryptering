public class CMDInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        }
        if (args.length == 1) {
            System.out.println("Så du säger " + args[0] + ".");
        }
        try {
            if (args.length == 2) {
                int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
                System.out.print(args[0] + " + " + args[1] + " = ");
                System.out.println(result);

            }

        } catch (NumberFormatException result) {
            System.out.println("Du måste använda siffror.");
        }


        if (args.length == 3) {
            System.out.println(args[2] + " " + args[1] + " " + args[0]);
        }

        if (args.length >= 4) {
            System.out.println("Jag orkar inte, jag stänger ner");
        }

        System.out.println();

        System.out.print("Dina argument: ");

        if(args.length == 0){
            System.out.print("du har inga argument.");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

    }
}