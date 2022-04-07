public enum Symbols {

    CHERRY(0, 10, "cherry"),
    BAR(1, 20, "bar"),
    BELL(2, 30, "bell"),
    SEVEN(3, 40, "seven");

    private final int winnings;
    private final int index;
    private final String name;

    Symbols(int index, int winnings, String name) {
        this.winnings = winnings;
        this.index = index;
        this.name = name;
    }

    public int getWinnings() {
        return winnings;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }


}
