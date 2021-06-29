package xyz.bekey.tiktokOpen.domain;

public class Address {

    private Addr city;

    private String detail;

    private Addr province;

    private Addr town;

    private Addr street;

    private String encrypt_detail;

    public static class Addr {
        private Long id;
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public Addr getCity() {
        return city;
    }

    public void setCity(Addr city) {
        this.city = city;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Addr getProvince() {
        return province;
    }

    public void setProvince(Addr province) {
        this.province = province;
    }

    public Addr getTown() {
        return town;
    }

    public void setTown(Addr town) {
        this.town = town;
    }

    public Addr getStreet() {
        return street;
    }

    public void setStreet(Addr street) {
        this.street = street;
    }

    public String getEncrypt_detail() {
        return encrypt_detail;
    }

    public void setEncrypt_detail(String encrypt_detail) {
        this.encrypt_detail = encrypt_detail;
    }
}
