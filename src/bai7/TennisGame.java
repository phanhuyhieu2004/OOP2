package bai7;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int pointNumber1, int pointNumber2) {
        final String LOVE_ALL = "Love-All";
        final String FIFTEEN_ALL = "Fifteen-All";
        final String THIRTY_ALL = "Thirty-All";
        final String FORTY_ALL = "Forty-All";
        final String DEUCE = "Deuce";
        final String ADVANTAGE_PLAYER_1 = "Advantage player1";
        final String ADVANTAGE_PLAYER_2 = "Advantage player2";
        final String WIN_FOR_PLAYER_1 = "Win for player1";
        final String WIN_FOR_PLAYER_2 = "Win for player2";

        String score = "";
        int tempScore = 0;

        boolean isDeuce = pointNumber1 == pointNumber2;
        boolean isAdvantage = pointNumber1 >= 4 || pointNumber2 >= 4;
        int scoreDifference = pointNumber1 - pointNumber2;
        boolean isPlayer1Advantage = scoreDifference == 1;
        boolean isPlayer2Advantage = scoreDifference == -1;
        boolean isPlayer1Win = scoreDifference >= 2;
        boolean isPlayer2Win = scoreDifference <= -2;

        if (isDeuce) {
            if (pointNumber1 == 3) {
                score = DEUCE;
            } else {
                switch (pointNumber1) {
                    case 0:
                        score = LOVE_ALL;
                        break;
                    case 1:
                        score = FIFTEEN_ALL;
                        break;
                    case 2:
                        score = THIRTY_ALL;
                        break;
                }
                score += "-All";
            }
        } else if (isAdvantage) {
            if (isPlayer1Advantage) {
                score = ADVANTAGE_PLAYER_1;
            } else if (isPlayer2Advantage) {
                score = ADVANTAGE_PLAYER_2;
            } else if (isPlayer1Win) {
                score = WIN_FOR_PLAYER_1;
            } else {
                score = WIN_FOR_PLAYER_2;
            }
        } else {
            score = formatScore(pointNumber1) + "-" + formatScore(pointNumber2);
        }

        return score;
    }

    private static String formatScore(int pointNumber) {
        switch (pointNumber) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
}

//@RunWith(Parameterized.class)
//class TennisGameTest {
//
//    private int player1Score;
//    private int player2Score;
//    private String expectedScore;
//
//    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
//        this.player1Score = player1Score;
//        this.player2Score = player2Score;
//        this.expectedScore = expectedScore;
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getAllScores() {
//        return Arrays.asList(new Object[][] {
//                { 0, 0, "Love-All" },
//                { 1, 1, "Fifteen-All" },
//                { 2, 2, "Thirty-All"},
//                { 3, 3, "Forty-All"},
//                { 4, 4, "Deuce"},
//
//                { 1, 0, "Fifteen-Love"},
//                { 0, 1, "Love-Fifteen"},
//                { 2, 0, "Thirty-Love"},
//                { 0, 2, "Love-Thirty"},
//                { 3, 0, "Forty-Love"},
//                { 0, 3, "Love-Forty"},
//                { 4, 0, "Win for player1"},
//                { 0, 4, "Win for player2"},
//
//                { 2, 1, "Thirty-Fifteen"},
//                { 1, 2, "Fifteen-Thirty"},
//                { 3, 1, "Forty-Fifteen"},
//                { 1, 3, "Fifteen-Forty"},
//                { 4, 1, "Win for player1"},
//                { 1, 4, "Win for player2"},
//
//                { 3, 2, "Forty-Thirty"},
//                { 2, 3, "Thirty-Forty"},
//                { 4, 2, "Win for player1"},
//                { 2, 4, "Win for player2"},
//
//                { 4, 3, "Advantage player1"},
//                { 3, 4, "Advantage player2"},
//                { 5, 4, "Advantage player1"},
//                { 4, 5, "Advantage player2"},
//                { 15, 14, "Advantage player1"},
//                { 14, 15, "Advantage player2"},
//
//                { 6, 4, "Win for player1"},
//                { 4, 6, "Win for player2"},
//                { 16, 14, "Win for player1"},
//                { 14, 16, "Win for player2"},
//        });
//    }
//
//    @Test
//    public void checkAllScores() {
//        int highestScore = Math.max(this.player1Score, this.player2Score);
//        int m_score1 = 0;
//        int m_score2 = 0;
//        for (int i = 0; i < highestScore; i++) {
//            if (i < this.player1Score)
//                m_score1 += 1;
//            if (i < this.player2Score)
//                m_score2 += 1;
//        }
//        assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", m_score1, m_score2));
//    }
//}