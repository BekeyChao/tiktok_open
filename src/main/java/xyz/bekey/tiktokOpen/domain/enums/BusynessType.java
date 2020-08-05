package xyz.bekey.tiktokOpen.domain.enums;

/**
 * b_type 枚举（暂无应用）
 */
public enum BusynessType {

    Out(0), Huo_Shan(1), Dou_Yin(2), Tou_Tiao(3),
    Xi_Gua(4), Wei_Xin(5), Shan_Gou(6), Tou_Tiao_Lite(7),
    Dong_Che_Di(8), Pi_Pi_Xia(9);

    private int code;

    BusynessType(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
