package style;

public class Style {
    public static final long MAX_POSITION = 1000;

    private class Inner {
        public static int position = 0;

        Inner() {
            System.out.println("Build Inner");
        }

        private void methodA() {
            System.out.println("Doing Method A");
        }

        private void methodB(String command) {
            System.out.println("Doing Method B");

            switch (command) {
                case "left":
                    position -= 1;
                    break;
                case "right":
                    position += 1;
                    System.out.println("Doing Method B");
                    break;
                default:
                    System.out.println("Unkown command");
            }

            if (position > MAX_POSITION) {
                System.out.println(
                        "position too big. " +
                                "Position: " + position +
                                "Max position: " + MAX_POSITION
                );
            } else {
                System.out.println("It's OK");
            }
        }
    }
}