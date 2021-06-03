//import org.json.simple.JSONObject;
import java.util.Scanner;

class Quiz {

    private Scanner sc = new Scanner(System.in);
    private int score[] = new int[5];
    private int i = 0;

    /*
     * org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
     * 
     * String name = (String) jsonObject.get("name"); double salary = (Double)
     * jsonObject.get("salary"); long age = (Long) jsonObject.get("age");
     * System.out.println(name+" "+salary+" "+age);
     */
    void Enterntainment() {
        int result[] = { 1, 2, 1, 3, 4, 5 };
        int count = 0;
        String question = "question";
        String questionoption = "1.one\t2.tw\n3.three\t4.four";
        for (; i < 5; i++) {

            System.out.println("Question " + i + "\n " + question + ":\n1." + questionoption + "\nEnter an option");
            score[i] = sc.nextInt();
            System.out.printf("", score[i] == result[i] ? "true" + count + 1 : "false" + count--);

        }
        System.out.println("Result is " + count);
    }

    private void Sports() {
        int result[] = { 1, 2, 1, 3, 4, 5 };
        int count = 0;
        String question = "question";
        String questionoption = "1.one\t2.tw\n3.three\t4.four";
        for (; i < 5; i++) {

            System.out.println("Question " + i + "\n " + question + ":\n1." + questionoption + "Enter an option");
            score[i] = sc.nextInt();
            System.out.printf("", score[i] == result[i] ? "true" + count + 1 : "false" + count--);

        }
        System.out.println("Result is " + count);
    }

    private void pyschology() {
        int result[] = { 1, 2, 1, 3, 4, 5 };
        int count = 0;
        String question = "question";
        String questionoption = "1.one\t2.tw\n3.three\t4.four";
        for (; i < 5; i++) {

            System.out.println("Question " + i + "\n " + question + ":\n1." + questionoption + "Enter an option");
            score[i] = sc.nextInt();
            System.out.printf("", score[i] == result[i] ? "true" + count + 1 : "false" + count--);

        }
        System.out.println("Result is " + count);
    }

    private void Gs() {
        int result[] = { 1, 2, 1, 3, 4, 5 };
        int count = 0;
        String question = "question";
        String questionoption = "1.one\t2.tw\n3.three\t4.four";
        for (; i < 5; i++) {

            System.out.println("Question " + i + "\n " + question + ":\n1." + questionoption + "Enter an option");
            score[i] = sc.nextInt();
            System.out.printf("", score[i] == result[i] ? "true" + count + 1 : "false" + count--);

        }
        System.out.println("Result is " + count);
    }

    Quiz() {
        System.out.println("QUiz application");
        System.out.println(
                "*******>>\n1.Entertainment\t\t2.Sports\n3.General science\t4.Pyschology\n>>>>**<<<<");
        int input = sc.nextInt();
        Thread th = new Thread() {
            public void run() {
                try {
                    if (input == 1) {
                        Enterntainment();
                    } else if (input == 2) {
                        Sports();
                    } else if (input == 3) {
                        Gs();
                    } else {
                        pyschology();
                    }
                    new Quiz();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }

    public static void main(String args[]) {
        new Quiz();
    }
}