package BaseBallTeam;

public class BaseBallTeam {
    String name;
    int win;
    int lose;
    int drow;

    BaseBallTeam(String n, int w, int l, int d) {
        this.name = n;
        this.win = w;
        this.lose = l;
        this.drow = d;
    }

    double getRate() {
        double rate =(double) win / (win + lose);
        return rate;
    }

    void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.drow + "分" + "、" + "勝率は" + getRate() + "です。");
    }

}
