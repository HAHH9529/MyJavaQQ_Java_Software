/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 10248
 */
@Entity
@Table(name = "Table_User")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableUser.findAll", query = "SELECT t FROM TableUser t")
    , @NamedQuery(name = "TableUser.findByUserNumber", query = "SELECT t FROM TableUser t WHERE t.userNumber = :userNumber")
    , @NamedQuery(name = "TableUser.findByUserNickname", query = "SELECT t FROM TableUser t WHERE t.userNickname = :userNickname")
    , @NamedQuery(name = "TableUser.findByUserPassword", query = "SELECT t FROM TableUser t WHERE t.userPassword = :userPassword")
    , @NamedQuery(name = "TableUser.findByUserSex", query = "SELECT t FROM TableUser t WHERE t.userSex = :userSex")
    , @NamedQuery(name = "TableUser.findByUserBirthday", query = "SELECT t FROM TableUser t WHERE t.userBirthday = :userBirthday")
    , @NamedQuery(name = "TableUser.findByUserAddress", query = "SELECT t FROM TableUser t WHERE t.userAddress = :userAddress")
    , @NamedQuery(name = "TableUser.findByUserPhone", query = "SELECT t FROM TableUser t WHERE t.userPhone = :userPhone")
    , @NamedQuery(name = "TableUser.findByRegisterDate", query = "SELECT t FROM TableUser t WHERE t.registerDate = :registerDate")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "User_Number")
    private Integer userNumber;
    @Basic(optional = false)
    @Column(name = "User_Nickname")
    private String userNickname;
    @Basic(optional = false)
    @Column(name = "User_Password")
    private String userPassword;
    @Column(name = "User_Sex")
    private String userSex;
    @Column(name = "User_Birthday")
    @Temporal(TemporalType.DATE)
    private Date userBirthday;
    @Column(name = "User_Address")
    private String userAddress;
    @Column(name = "User_Phone")
    private String userPhone;
    @Basic(optional = false)
    @Column(name = "Register_Date")
    @Temporal(TemporalType.DATE)
    private Date registerDate;

    public User() {
    }

    public User(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public User(Integer userNumber, String userNickname, String userPassword, Date registerDate) {
        this.userNumber = userNumber;
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.registerDate = registerDate;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userNumber != null ? userNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userNumber == null && other.userNumber != null) || (this.userNumber != null && !this.userNumber.equals(other.userNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.TableUser[ userNumber=" + userNumber + " ]";
    }
    
}
