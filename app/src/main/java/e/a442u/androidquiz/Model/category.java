package e.a442u.androidquiz.Model;

public class category {
    private String Image;
    private String Nama;

    public category() {
    }

    public category(String image, String nama) {
        this.Image = image;
        Nama = nama;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
