package infonpm;


public class InfoNpm {

    private String npm;
    private String tahun;
    private String KodeFakultas;
    private String KodeProdi;
    private String namaprodi;
    private String NomorUrut;

    public InfoNpm(String npm) {
        this.npm = npm;
        this.tahun = npm.substring(0, 2);
        this.KodeFakultas = npm.substring(2, 4);
        this.KodeProdi = npm.substring(4, 6);
        this.NomorUrut = npm.substring(6, 10);
        this.namaprodi = determineNamaProdi(this.KodeProdi);
    }

    private String determineNamaProdi(String KodeProdi) {
        switch (KodeProdi) {
            case "01":
                return "Teknik Informatika";
            case "02":
                return "Sistem informasi";
            default:
                return "prodi tidak ditemukan";
        }

    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getKodeFakultas() {
        return KodeFakultas;
    }

    public void setKodeFakultas(String KodeFakultas) {
        this.KodeFakultas = KodeFakultas;
    }

    public String getKodeProdi() {
        return KodeProdi;
    }

    public void setKodeProdi(String KodeProdi) {
        this.KodeProdi = KodeProdi;
    }

    public String getNamaprodi() {
        return namaprodi;
    }

    public void setNamaprodi(String namaprodi) {
        this.namaprodi = namaprodi;
    }

    public String getNomorUrut() {
        return NomorUrut;
    }

    public void setNomorUrut(String NomorUrut) {
        this.NomorUrut = NomorUrut;
    }
    
    @Override
    public String toString(){
        return "NPM: " + npm + "\n" +
               "Tahun: 20" +tahun + "\n" +
               "Kode Fakultas: " + KodeFakultas +"\n"+
               "Kode Prodi: " + KodeProdi +"\n"+
               "Nama Prodi: " + namaprodi +"\n"+
               "Nomor Nrut: " + NomorUrut;
        
    }

}
