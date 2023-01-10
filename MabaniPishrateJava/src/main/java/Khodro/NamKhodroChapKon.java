package Khodro;

public class NamKhodroChapKon {
    Khodro[] khodroha;
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha=khodroha;
    }
    public String execute(){
        String namkhodroha="";
        for (int neshanegar=0; neshanegar<khodroha.length ; neshanegar++){
            Khodro khodro = khodroha[neshanegar];
            if (neshanegar != khodroha.length -1){
                namkhodroha=namkhodroha+ khodro.getmark() + "-";
            }else{
                namkhodroha=namkhodroha+ khodro.getmark();
            }
        }
        return namkhodroha;

    }
}
