public enum Spinner {

    CHERRY(10),
    BAR(20),
    BELL(30),
    SEVEN(40);

    private final int winnings;

    Spinner(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return winnings;
    }
}
