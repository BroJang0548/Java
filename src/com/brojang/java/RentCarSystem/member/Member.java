package com.brojang.java.RentCarSystem.member;

public interface Member {

    // 정보 등록
    public void regMember() throws MemberException;

    // 정보 조회
    public String viewMember() throws MemberException;

    // 정보 수정
    public void modifyMember() throws MemberException;

    // 정보 삭제
    public void deleteMember() throws MemberException;

//    // id value
//    private String memId;
//
//    // password value
//    private String memPassword;
//
//    // name value
//    private String memName;
//
//    // address value
//    private String memAddress;
//
//    // phone value
//    private String memPhone;
//
//    public String getMemId() {
//        return memId;
//    }
//
//    public void setMemId(String memId) {
//        this.memId = memId;
//    }
//
//    public String getMemPassword() {
//        return memPassword;
//    }
//
//    public void setMemPassword(String memPassword) {
//        this.memPassword = memPassword;
//    }
//
//    public String getMemName() {
//        return memName;
//    }
//
//    public void setMemName(String memName) {
//        this.memName = memName;
//    }
//
//    public String getMemAddress() {
//        return memAddress;
//    }
//
//    public void setMemAddress(String memAddress) {
//        this.memAddress = memAddress;
//    }
//
//    public String getMemPhone() {
//        return memPhone;
//    }
//
//    public void setMemPhone(String memPhone) {
//        this.memPhone = memPhone;
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "memId='" + memId + '\'' +
//                ", memPassword='" + memPassword + '\'' +
//                ", memName='" + memName + '\'' +
//                ", memAddress='" + memAddress + '\'' +
//                ", memPhone='" + memPhone + '\'' +
//                '}';
//    }
//
//    //새로운 회원등록을 하는 메소드
//    public void regMember() {
//        System.out.println("회원 가입합니다.");
//    }
//
//    //기존 회원의 정보를 조회하는 메소드
//    public String viewMemeber() {
//        return null;
//    }
//
//    //기존 회원의 정보를 수정하는 메소드
//    public void modMember() {
//
//    }
//
//    //기존 회원의 정보를 삭제하는 메소드
//    public void delMember() {
//
//    }

}
