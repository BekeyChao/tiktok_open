package xyz.bekey.tiktokOpen.domain.enums;

public enum SortBy {
    ASC("0"),
    DESC("1");

    private String is_desc;

    SortBy(String is_desc) {
        this.is_desc = is_desc;
    }

    @Override
    public String toString() {
        return is_desc;
    }
}
