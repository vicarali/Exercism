class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";

        StringBuilder proverb = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            proverb.append("For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n");
        }
        proverb.append("And all for the want of a " + words[0] + ".");

        return proverb.toString();
    }

}
