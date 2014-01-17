/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maraby
 */
@Entity
@Table(name = "diares_weight")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiaresWeight.findAll", query = "SELECT d FROM DiaresWeight d"),
    @NamedQuery(name = "DiaresWeight.findByIddiaresWeight", query = "SELECT d FROM DiaresWeight d WHERE d.iddiaresWeight = :iddiaresWeight"),
    @NamedQuery(name = "DiaresWeight.findByData", query = "SELECT d FROM DiaresWeight d WHERE d.data = :data"),
    @NamedQuery(name = "DiaresWeight.findByWeght", query = "SELECT d FROM DiaresWeight d WHERE d.weght = :weght"),
    @NamedQuery(name = "DiaresWeight.findByDiaresWeightcol", query = "SELECT d FROM DiaresWeight d WHERE d.diaresWeightcol = :diaresWeightcol")})
public class DiaresWeight implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddiares_weight")
    private Integer iddiaresWeight;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "weght")
    private BigDecimal weght;
    @Size(max = 45)
    @Column(name = "diares_weightcol")
    private String diaresWeightcol;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;

    public DiaresWeight() {
    }

    public DiaresWeight(Integer iddiaresWeight) {
        this.iddiaresWeight = iddiaresWeight;
    }

    public Integer getIddiaresWeight() {
        return iddiaresWeight;
    }

    public void setIddiaresWeight(Integer iddiaresWeight) {
        this.iddiaresWeight = iddiaresWeight;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getWeght() {
        return weght;
    }

    public void setWeght(BigDecimal weght) {
        this.weght = weght;
    }

    public String getDiaresWeightcol() {
        return diaresWeightcol;
    }

    public void setDiaresWeightcol(String diaresWeightcol) {
        this.diaresWeightcol = diaresWeightcol;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiaresWeight != null ? iddiaresWeight.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiaresWeight)) {
            return false;
        }
        DiaresWeight other = (DiaresWeight) object;
        if ((this.iddiaresWeight == null && other.iddiaresWeight != null) || (this.iddiaresWeight != null && !this.iddiaresWeight.equals(other.iddiaresWeight))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DiaresWeight[ iddiaresWeight=" + iddiaresWeight + " ]";
    }
    
}
