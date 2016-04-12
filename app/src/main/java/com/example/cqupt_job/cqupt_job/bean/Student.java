package com.example.cqupt_job.cqupt_job.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by android_chen on 2016/4/12.
 */
public class Student implements Parcelable {
    private String stuid;

    private String userid;

    private String classid;

    private String stuname;

    private String studentid;

    private String idcard;

    private String sex;

    private Date dateofbirth;

    private String ethnicgroup;

    private String politicalstatus;

    private String education;

    private String specializedfield;

    private String specializedsubject;

    private Short lenofschool;

    private String trainingmode;

    private String orientationfirm;

    private String normalschoolflag;

    private String normalschooltype;

    private String difficultiestype;

    private String subsidyflag;

    private String candidateno;

    private Date admissiontime;

    private Date graduationtime;

    private String censustype;

    private String areastudent;

    private String weixin;

    private String stuqq;

    private String stuphone;

    private String stuemail;

    private String stuaddress;

    private String stuhomephone;

    private String specialgroup;

    private String zipcode;

    private String maritalstatus;

    private String reportcardno;

    private Date reporttime;

    private String reportoper;

    private String reportno;

    private String reportcomment;

    private String stustatus;

    private Date createtime;

    private String creator;

    private Date edittime;

    private String wishfill;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.stuid);
        dest.writeString(this.userid);
        dest.writeString(this.classid);
        dest.writeString(this.stuname);
        dest.writeString(this.studentid);
        dest.writeString(this.idcard);
        dest.writeString(this.sex);
        dest.writeLong(dateofbirth != null ? dateofbirth.getTime() : -1);
        dest.writeString(this.ethnicgroup);
        dest.writeString(this.politicalstatus);
        dest.writeString(this.education);
        dest.writeString(this.specializedfield);
        dest.writeString(this.specializedsubject);
        dest.writeValue(this.lenofschool);
        dest.writeString(this.trainingmode);
        dest.writeString(this.orientationfirm);
        dest.writeString(this.normalschoolflag);
        dest.writeString(this.normalschooltype);
        dest.writeString(this.difficultiestype);
        dest.writeString(this.subsidyflag);
        dest.writeString(this.candidateno);
        dest.writeLong(admissiontime != null ? admissiontime.getTime() : -1);
        dest.writeLong(graduationtime != null ? graduationtime.getTime() : -1);
        dest.writeString(this.censustype);
        dest.writeString(this.areastudent);
        dest.writeString(this.weixin);
        dest.writeString(this.stuqq);
        dest.writeString(this.stuphone);
        dest.writeString(this.stuemail);
        dest.writeString(this.stuaddress);
        dest.writeString(this.stuhomephone);
        dest.writeString(this.specialgroup);
        dest.writeString(this.zipcode);
        dest.writeString(this.maritalstatus);
        dest.writeString(this.reportcardno);
        dest.writeLong(reporttime != null ? reporttime.getTime() : -1);
        dest.writeString(this.reportoper);
        dest.writeString(this.reportno);
        dest.writeString(this.reportcomment);
        dest.writeString(this.stustatus);
        dest.writeLong(createtime != null ? createtime.getTime() : -1);
        dest.writeString(this.creator);
        dest.writeLong(edittime != null ? edittime.getTime() : -1);
        dest.writeString(this.wishfill);
    }

    public Student() {
        super();
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEthnicgroup() {
        return ethnicgroup;
    }

    public void setEthnicgroup(String ethnicgroup) {
        this.ethnicgroup = ethnicgroup;
    }

    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpecializedfield() {
        return specializedfield;
    }

    public void setSpecializedfield(String specializedfield) {
        this.specializedfield = specializedfield;
    }

    public String getSpecializedsubject() {
        return specializedsubject;
    }

    public void setSpecializedsubject(String specializedsubject) {
        this.specializedsubject = specializedsubject;
    }

    public Short getLenofschool() {
        return lenofschool;
    }

    public void setLenofschool(Short lenofschool) {
        this.lenofschool = lenofschool;
    }

    public String getTrainingmode() {
        return trainingmode;
    }

    public void setTrainingmode(String trainingmode) {
        this.trainingmode = trainingmode;
    }

    public String getOrientationfirm() {
        return orientationfirm;
    }

    public void setOrientationfirm(String orientationfirm) {
        this.orientationfirm = orientationfirm;
    }

    public String getNormalschoolflag() {
        return normalschoolflag;
    }

    public void setNormalschoolflag(String normalschoolflag) {
        this.normalschoolflag = normalschoolflag;
    }

    public String getNormalschooltype() {
        return normalschooltype;
    }

    public void setNormalschooltype(String normalschooltype) {
        this.normalschooltype = normalschooltype;
    }

    public String getDifficultiestype() {
        return difficultiestype;
    }

    public void setDifficultiestype(String difficultiestype) {
        this.difficultiestype = difficultiestype;
    }

    public String getSubsidyflag() {
        return subsidyflag;
    }

    public void setSubsidyflag(String subsidyflag) {
        this.subsidyflag = subsidyflag;
    }

    public String getCandidateno() {
        return candidateno;
    }

    public void setCandidateno(String candidateno) {
        this.candidateno = candidateno;
    }

    public Date getAdmissiontime() {
        return admissiontime;
    }

    public void setAdmissiontime(Date admissiontime) {
        this.admissiontime = admissiontime;
    }

    public Date getGraduationtime() {
        return graduationtime;
    }

    public void setGraduationtime(Date graduationtime) {
        this.graduationtime = graduationtime;
    }

    public String getCensustype() {
        return censustype;
    }

    public void setCensustype(String censustype) {
        this.censustype = censustype;
    }

    public String getAreastudent() {
        return areastudent;
    }

    public void setAreastudent(String areastudent) {
        this.areastudent = areastudent;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getStuqq() {
        return stuqq;
    }

    public void setStuqq(String stuqq) {
        this.stuqq = stuqq;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone;
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress;
    }

    public String getStuhomephone() {
        return stuhomephone;
    }

    public void setStuhomephone(String stuhomephone) {
        this.stuhomephone = stuhomephone;
    }

    public String getSpecialgroup() {
        return specialgroup;
    }

    public void setSpecialgroup(String specialgroup) {
        this.specialgroup = specialgroup;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getReportcardno() {
        return reportcardno;
    }

    public void setReportcardno(String reportcardno) {
        this.reportcardno = reportcardno;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getReportoper() {
        return reportoper;
    }

    public void setReportoper(String reportoper) {
        this.reportoper = reportoper;
    }

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno;
    }

    public String getReportcomment() {
        return reportcomment;
    }

    public void setReportcomment(String reportcomment) {
        this.reportcomment = reportcomment;
    }

    public String getStustatus() {
        return stustatus;
    }

    public void setStustatus(String stustatus) {
        this.stustatus = stustatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getWishfill() {
        return wishfill;
    }

    public void setWishfill(String wishfill) {
        this.wishfill = wishfill;
    }

    protected Student(Parcel in) {
        this.stuid = in.readString();
        this.userid = in.readString();
        this.classid = in.readString();
        this.stuname = in.readString();
        this.studentid = in.readString();
        this.idcard = in.readString();
        this.sex = in.readString();
        long tmpDateofbirth = in.readLong();
        this.dateofbirth = tmpDateofbirth == -1 ? null : new Date(tmpDateofbirth);
        this.ethnicgroup = in.readString();
        this.politicalstatus = in.readString();
        this.education = in.readString();
        this.specializedfield = in.readString();
        this.specializedsubject = in.readString();
        this.lenofschool = (Short) in.readValue(Short.class.getClassLoader());
        this.trainingmode = in.readString();
        this.orientationfirm = in.readString();
        this.normalschoolflag = in.readString();
        this.normalschooltype = in.readString();
        this.difficultiestype = in.readString();
        this.subsidyflag = in.readString();
        this.candidateno = in.readString();
        long tmpAdmissiontime = in.readLong();
        this.admissiontime = tmpAdmissiontime == -1 ? null : new Date(tmpAdmissiontime);
        long tmpGraduationtime = in.readLong();
        this.graduationtime = tmpGraduationtime == -1 ? null : new Date(tmpGraduationtime);
        this.censustype = in.readString();
        this.areastudent = in.readString();
        this.weixin = in.readString();
        this.stuqq = in.readString();
        this.stuphone = in.readString();
        this.stuemail = in.readString();
        this.stuaddress = in.readString();
        this.stuhomephone = in.readString();
        this.specialgroup = in.readString();
        this.zipcode = in.readString();
        this.maritalstatus = in.readString();
        this.reportcardno = in.readString();
        long tmpReporttime = in.readLong();
        this.reporttime = tmpReporttime == -1 ? null : new Date(tmpReporttime);
        this.reportoper = in.readString();
        this.reportno = in.readString();
        this.reportcomment = in.readString();
        this.stustatus = in.readString();
        long tmpCreatetime = in.readLong();
        this.createtime = tmpCreatetime == -1 ? null : new Date(tmpCreatetime);
        this.creator = in.readString();
        long tmpEdittime = in.readLong();
        this.edittime = tmpEdittime == -1 ? null : new Date(tmpEdittime);
        this.wishfill = in.readString();
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
