package exercise.federicoGarciaLorca;

public class Main {
    private static String[] correctParams = {"Federico", "GarcíaLorca"};
    private static Lorca lorca = new Lorca();
    private static NotAuthorized notAuthorized = new NotAuthorized();
    public static void main(String[] args) {
        access(new String[]{"Federico", "GarcíaLorca"});
    }

    private static void access(String[] params) {
        if(areParamsValid(params)) {
            lorca.printPoem();
        } else {
            notAuthorized.printBadParamsMessage();
        }
    }

    private static boolean areParamsValid(String[] params) {
        return params[0].equals(correctParams[0]) && params[1].equals(correctParams[1]);
    }
}
