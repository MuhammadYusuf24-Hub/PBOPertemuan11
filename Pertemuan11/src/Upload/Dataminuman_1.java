/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Upload;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "dataminuman")
@NamedQueries({
    @NamedQuery(name = "Dataminuman_1.findAll", query = "SELECT d FROM Dataminuman_1 d"),
    @NamedQuery(name = "Dataminuman_1.findByIdMinuman", query = "SELECT d FROM Dataminuman_1 d WHERE d.idMinuman = :idMinuman"),
    @NamedQuery(name = "Dataminuman_1.findByNama", query = "SELECT d FROM Dataminuman_1 d WHERE d.nama = :nama"),
    @NamedQuery(name = "Dataminuman_1.findByKategori", query = "SELECT d FROM Dataminuman_1 d WHERE d.kategori = :kategori"),
    @NamedQuery(name = "Dataminuman_1.findByHarga", query = "SELECT d FROM Dataminuman_1 d WHERE d.harga = :harga"),
    @NamedQuery(name = "Dataminuman_1.findByUkuran", query = "SELECT d FROM Dataminuman_1 d WHERE d.ukuran = :ukuran")})
public class Dataminuman_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_minuman")
    private Integer idMinuman;
    @Column(name = "nama")
    private String nama;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "ukuran")
    private String ukuran;

    public Dataminuman_1() {
    }

    public Dataminuman_1(Integer idMinuman) {
        this.idMinuman = idMinuman;
    }

    public Integer getIdMinuman() {
        return idMinuman;
    }

    public void setIdMinuman(Integer idMinuman) {
        this.idMinuman = idMinuman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMinuman != null ? idMinuman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dataminuman_1)) {
            return false;
        }
        Dataminuman_1 other = (Dataminuman_1) object;
        if ((this.idMinuman == null && other.idMinuman != null) || (this.idMinuman != null && !this.idMinuman.equals(other.idMinuman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pereacs.Dataminuman_1[ idMinuman=" + idMinuman + " ]";
    }
    
}
