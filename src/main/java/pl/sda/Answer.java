package pl.sda;

public enum Answer {
    YES("tak"), RATHER_YES("raczej tak"), RATHER_NO("raczej nie"), NO("nie");

    private String displayText;

    Answer(String displayText) {
        this.displayText = displayText;
    }

    String getDisplayText() {
        return displayText;
    }

    @Override
    public String toString() {
        return displayText;
    }
}
