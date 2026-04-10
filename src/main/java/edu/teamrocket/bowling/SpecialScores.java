package edu.teamrocket.bowling;

public enum SpecialScores {
    STRIKE("X", 10),
    SPARE("/", 10),
    NO_PINS("-", 0);
    private final String scoreType;
    private final int score;

    SpecialScores(String scoreType, int score){
        this.scoreType = scoreType;
        this.score = score;
    }

    public String getScoreType() {
        return this.scoreType;
    }

    public int getScore() {
        return this.score;
    }
}