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

    private void Java() {

        int result[] = { 1, 4, 3, 2, 2 };
        int count = 0;
        for (; i < 5; i++) {
            if (i == 0) {
                System.out.println(i + ".\t Who is the father of java?");
                System.out.println("1.James Gosling \t2. mike sheridan \n3.Partrick Naughton \t4.all the above");
            } else if (i == 1) {
                System.out.println(i + ".\t who initated the java programming language?");
                System.out.println("1.James Gosling \t2. mike sheridan \n3.Partrick Naughton \t4.all the above");

            } else if (i == 2) {
                System.out.println(i + ".\tWhen was the first first java programming language releases ( JDK ALPHA AND BETA) ?");
                System.out.println("1.1993 \t2.1994 \n3.1995 \t 4.1996 ");
            } else if (i == 3) {
                System.out.println(i + ".\t When was the first java stable version created? ");
                System.out.println("1. 29 feb 1995 \t2.23 jan 1996 \n3. 8 dec 1996 \t 4. 6 feb 1995");
            } else if (i == 4) {
                System.out.println(i + ".\t present now what JAVA SE version we are using?");
                System.out.println("1.JAVA SE 15 \t2.JAVA SE 16 \n3.JAVA SE 17 \t 4.NONE");
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

    private void Science() {




        int result[] = { 3, 4, 2, 2, 1 };
        int count = 0;
        for (; i < 5; i++) {
            if (i == 0) {
                System.out.println(i + ".\t How many Indian astronauts have been selected for India’s first human space mission?");
                System.out.println("1.2 \t2. 3 \n3.4 \t4.5");
            } else if (i == 1) {
                System.out.println(i + ".\t A National level Rural Technical Festival called ‘Antahpragnya 2020’ was recently organised in which Indian state/UT? ");
                System.out.println("1.New Delhi \t2. Telangana  \n3. Andra Pradesh \t4.Odisha ");

            } else if (i == 2) {
                System.out.println(i + ".\tWhich country has begun the first human trial to evaluate vaccine against COVID-19?");
                System.out.println("1.China  \t2. USA \n3.INDIA  \t 4. UK ");
            } else if (i == 3) {
                System.out.println(i + ".\t Which technological firm launched a COVID-19 chatbot on its messaging platform in partnership with the Union Health Ministry and MyGov? ");
                System.out.println("1.GOOGLE \t2.23 FACEBOOK \n3. TELEGRAM \t 4. MICROSOFT ");
            } else if (i == 4) {
                System.out.println(i + ".\t The ‘COVID-19 Sample Collection Kiosk’ (COVSACK), which was seen in news recently, was developed by the laboratory of which institution?");
                System.out.println("1. Defence Research and Development Organisation \t2.Hindustan Aeronautics Limited \n3.Bharat Electronics Limited \t 4.Bharat Heavy Electricals Limited");
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

    Quiz() {
        System.out.println("    >>>>>>    WELCOME TO QUIZ    <<<<<<    ");
        System.out.println("**\n1.  JAVA  \t\t2.  SCIENCE  \n3.  MOVIES  \t\t4.  POLITICS   \n    >>>>>>>    SELECT ANY ONE   <<<<<<");
        int input = sc.nextInt();
        Thread th = new Thread() {
            public void run() {
                try {
                    if (input == 1) {
                        Java();
                    } else if (input == 2) {
                        Science();
                    } else if (input == 3) {
                        movies();
                    } else {
                        politics();
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
