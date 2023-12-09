package course.methods;

public class Main10 {

    public static void main(String[] args) {
        System.out.println(footballWin(3,0, 2,1));

    }
     public static String footballWin(int teamAAsGuest, int teamAAsHost, int teamBAsGuest, int teamBAsHost) {
        int teamAPoints = calculatePointsOfTwoMatch(teamAAsGuest, teamAAsHost);
        int teamBPoints = calculatePointsOfTwoMatch(teamBAsGuest, teamBAsHost);
        if (teamAPoints > teamBPoints) {
            return "1";
        } else if (teamBPoints > teamAPoints) {
            return "2";
         } else return "X";
    }

    private static int calculatePointsOfTwoMatch (int awayPoints, int hostPoints) {
        int guestFactor = 2;
        if (awayPoints > 0) {
            awayPoints *= guestFactor;
        }
        return awayPoints + hostPoints;
        }
}
