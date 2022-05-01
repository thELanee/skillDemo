public class skillDemo {

    public static String getInitials(String name) {
        String firstInitial = Character.toString(name.charAt(0));
        String lastInitial = Character.toString(' ');

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                lastInitial = Character.toString(name.charAt(i + 1));
                break;
            }
        }
        return firstInitial + "." + lastInitial + ".";
    }
}
