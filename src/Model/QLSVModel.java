package Model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<SinhVien> dsSinhVien;
    private String luaChon;
    private String tenFile;

    public QLSVModel() {
        this.dsSinhVien = new ArrayList<SinhVien>();
        this.luaChon = "";
        this.tenFile="";
    }

    public QLSVModel(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public ArrayList<SinhVien> getDsThiSinh() {
        return dsSinhVien;
    }

    public void setDsThiSinh(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public void insert(SinhVien sinhVien) {
        this.dsSinhVien.add(sinhVien);
    }

    public void delete(SinhVien sinhVien) {
        this.dsSinhVien.remove(sinhVien);
    }

    public void update(SinhVien sinhVien) {
        this.dsSinhVien.remove(sinhVien);
        this.dsSinhVien.add(sinhVien);
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    public boolean kiemTraTonTai(SinhVien sinhVien) {
        for(SinhVien thiSinh: dsSinhVien) {
            if(thiSinh.getMaSinhVien() == sinhVien.getMaSinhVien())
                return true;
        }
        return false;
    }


}