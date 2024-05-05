import java.util.ArrayList;
import java.util.List;

public abstract class Task2_2 {
    protected final String sportType;
    protected final Integer resultA;
    protected final Integer resultB;

    public Task2_2(String sportType, Integer resultA, Integer resultB) {
        this.sportType = sportType;
        this.resultA = resultA;
        this.resultB = resultB;
    }

    public String getSportType() {
        return sportType;
    }

    public Integer getResultA() {
        return resultA;
    }

    public Integer getResultB() {
        return resultB;
    }

    // Метод для визначення переможця
    public abstract Character getWinnerOfGame();

    @Override
    public String toString() {
        String winner = getWinnerOfGame().toString();
        return "Team A " + resultA + " : " + resultB + " Team B" + "\n" + winner + " — is winner!";
    }
}

class FootballWinner extends Task2_2 {
    public FootballWinner(Integer resultA, Integer resultB) {
        super("Football", resultA, resultB);
    }

    @Override
    public Character getWinnerOfGame() {
        if (getResultA() > getResultB()) {
            return 'A';
        } else if (getResultA() < getResultB()) {
            return 'B';
        } else {
            return '-'; // Нічия
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<FootballWinner> footballMatches = new ArrayList<>();
        footballMatches.add(new FootballWinner(3, 1111));
        footballMatches.add(new FootballWinner(2, 122));
        footballMatches.add(new FootballWinner(1, 12));

        footballMatches.forEach(match -> System.out.println(match));
    }
}
