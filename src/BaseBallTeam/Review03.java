package BaseBallTeam;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam BT1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BT1.report();

        BaseBallTeam BT2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BT2.report();

        BaseBallTeam BT3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BT3.report();

        BaseBallTeam BT4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BT4.report();

        BaseBallTeam BT5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BT5.report();

        BaseBallTeam BT6 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        BT6.report();
    }

}
