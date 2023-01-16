package khodro;

public class NamKhodroChapKon {
    Khodro[] khodroha = {};

    // constructor
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }

    public String execute() {
        String namKhodroha = "";
        for (int neshanegar = 0; neshanegar < khodroha.length; neshanegar++) {
            Khodro khodro = khodroha[neshanegar];
            if (neshanegar != khodroha.length -1) {
                namKhodroha = namKhodroha + khodro.getmark() + "-";
            } else {
                namKhodroha = namKhodroha + khodro.getmark();
            }
        }
        return namKhodroha;
    }
}

