import java.util.Scanner;

class Quiz {

    private Scanner sc = new Scanner(System.in);
    private int score[] = new int[5];
    private int i = 0;

    void politics() {
        int result[] = { 1, 2, 3, 4, 4 };
        int count = 0;
        for (; i < 5; i++) {
            if (i == 0) {
                System.out.println(i + ".\twho is the chief minister,All the portfolios not allocated to any Minister of telangana");
                System.out.println("1.Sri Kalvakuntla Chandrashekar Rao \t2.Sri Md. Mohamood Ali \n3.Sri A. Indrakaran Reddy \t4.Sri Talasani Srinivas Yadav");
            } else if (i == 1) {
                System.out.println(i + ".\twho is the home minister,Prisons and Fire Services minister of telangana");
                System.out.println("1.Sri Kalvakuntla Chandrashekar Rao \t2.Sri Md. Mohamood Ali \n3.Sri A. Indrakaran Reddy \t4.Sri Talasani Srinivas Yadav");
           } else if (i == 2) {
                System.out.println(i + ".\twho is the Forest & Environment and S&T, Endowments and Law minister of telanganaa");
                System.out.println("1.Sri Kalvakuntla Chandrashekar Rao \t2.Sri Md. Mohamood Ali \n3.Sri A. Indrakaran Reddy \t4.Sri Talasani Srinivas Yadav");
            } else if (i == 3) {
                System.out.println(i + ".\twho is the Animal Husbandry, Fisheries, Dairy Development Corp. and Cinematography minister of telangana");
                System.out.println("1.Sri Kalvakuntla Chandrashekar Rao \t2.Sri Md. Mohamood Ali \n3.Sri A. Indrakaran Reddy \t4.Sri Talasani Srinivas Yadav");
            } else if (i == 4) {
                System.out.println(i + ".\twho is the Finance minister of telangana");
                System.out.println("1.kejriwal \t2.chandrashekar roa\n3.Jagan mohan \t 4.Sri Thanneeru Harish Rao");
            }

            score[i] = sc.nextInt();
            if (score[i] == result[i]) {
                System.out.println("\n" + i + ".True");
                count++;
            } else {
                System.out.println("\n" + i + ".False");
                count--;
            }
            // score[i].equalsto(result[i]) ? "true" + count + + : "false" + count - -;
        }
        System.out.println("Result is " + count);
    }

    private void movies() {
        int result[] = { 1, 2, 1, 3, 4 };
        int count = 0;
        for (; i < 5; i++) {
            if (i == 0) {
                System.out.println(i + ".\t what is the first movie of hero naga chaitanya");
                System.out.println("1.josh \t2. bezawada\n3.durga \t4.dhada");
            } else if (i == 1) {
                System.out.println(i + ".\t what is the first movie of hero mahesh babu");
                System.out.println("1.yuvaraja\t2.rajakumarudu\n3.murari \t 4.bobby");
            } else if (i == 2) {
                System.out.println(i + ".\twhat is the first movie of hero nithin");
                System.out.println("1.jayam \t2.dil \n3.hero\t 4.sambaram");
            } else if (i == 3) {
                System.out.println(i + ".\twhat is the first movie of hero ram charan");
                System.out.println("1.orange \t2.racha \n3.chirutha \t 4.magadheera");
            } else if (i == 4) {
                System.out.println(i + ".\twhat is the first movie of hero varun teja");
                System.out.println("1.loafer \t2.kanche \n3.hands up \t 4.mukunda");
            }

            score[i] = sc.nextInt();
            if (score[i] == result[i]) {
                System.out.println("\n" + i + ".True");
                count++;
            } else {
                System.out.println("\n" + i + ".False");
                count--;
            }
            // score[i].equalsto(result[i]) ? "true" + count + + : "false" + count - -;
        }
        System.out.println("Result is " + count);

    }

    private void pyschology() {

    }

    private void Gs() {

    }

    Quiz() {
        System.out.println(">>>  WELCOME TO QUIZ <<<");
        System.out.println("**\n1.politics\t\t2.movies\n3.General science\t4.Pyschology\n>>>>  SELECT ANY ONE <<<<");
        int input = sc.nextInt();
        Thread th = new Thread() {
            public void run() {
                try {
                    if (input == 1) {
                        politics();
                    } else if (input == 2) {
                        movies();
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
