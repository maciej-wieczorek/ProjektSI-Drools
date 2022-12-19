public class Odpowiedz{
    public String pytanie;
    public String odpowiedz;

    public String getPytanie() {
        return pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public Odpowiedz() {
    }

    public Odpowiedz(String odpowiedz, String pytanie) {
        this.odpowiedz = odpowiedz;
        this.pytanie = pytanie;
    }
}
