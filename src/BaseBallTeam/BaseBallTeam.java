package BaseBallTeam;

public class BaseBallTeam {
    String name;
    int win;
    int lose;
    int drow;

    BaseBallTeam(String n, int w, int l, int d) {
        name = n;
        win = w;
        lose = l;
        drow = d;
    }

    double getrate() {
        double rate = win / (win + lose);
        return rate;
    }

    void report() {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + drow + "分" + "、" + "勝率は" + getrate() + "です。");
    }

}