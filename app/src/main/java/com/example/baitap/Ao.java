package com.example.baitap;

public class Ao {
    private String tenAo;
    private String gia;
    private int image;

    public Ao(String tenAo, String gia, int image) {
        this.tenAo = tenAo;
        this.gia = gia;
        this.image = image;
    }

    public String getTenAo() {
        return tenAo;
    }

    public void setTenAo(String tenAo) {
        this.tenAo = tenAo;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
