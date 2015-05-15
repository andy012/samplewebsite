package com.doo.md5server.domain;

import com.doo.md5server.util.MyJspUtil;
import org.springframework.security.crypto.codec.Base64;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 15-4-27.
 */

@Entity
@Table(name="MDFIVE")
public class MDFIVE implements Domain{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DETAIL", nullable = false)
    private String detail;

    @Size(max = 32)
    @Column(name = "MD5", nullable = false, length = 32)
    private String md5;
    @Column(name = "CREATE_TIME", nullable = false)
    private Timestamp time;

    @Column(name="FLAG",nullable = false)
    private int FLAG;




    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    public int getFLAG() {
        return FLAG;
    }
    public void setFLAG(int FLAG) {
        this.FLAG = FLAG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailBase64() throws UnsupportedEncodingException {
        return MyJspUtil.bytes2String(Base64.encode(detail.getBytes("utf-8")));
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Boolean compareTo(Object x, Object y) {
        return null;
    }

    @Override
    public Object copy(Object x, Object y) {
        return null;
    }
}
