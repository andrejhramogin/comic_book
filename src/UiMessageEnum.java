public enum UiMessageEnum {

    Y("Y"),
    N("N"),
    SEP("; "),
    YES ("Yes"),
    NO ("No"),
    QUANTITY("Quantity: ");

    private final String str;

    UiMessageEnum(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
