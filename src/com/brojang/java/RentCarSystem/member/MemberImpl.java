package com.brojang.java.RentCarSystem.member;

import com.brojang.java.RentCarSystem.base.Base;

public class MemberImpl extends Base implements Member {

    // Member ID
    private String memberId;

    // Member Password
    private String memberPassword;

    // Member Name
    private String memberName;

    // Member Address
    private String memberAddress;

    // Member Phone Number
    private String memberPhoneNumber;

    // create
    @Override
    public void regMember() throws MemberException {
        memberName = "bro";
        if (memberName == null || memberName.isEmpty()) {
            throw new MemberException("이름은 필수 입력 사항");
        } else {
            System.out.println("register Member Time: " + showTime());
            System.out.println("Member Join");
        }
    }

    // search
    @Override
    public String viewMember() throws MemberException {
        System.out.println("Member Search Time: " + showTime());
        return "조회된 회원 정보";
    }

    // modify
    @Override
    public void modifyMember() throws MemberException {
        System.out.println("Member Modify Time: " + showTime());
        System.out.println("Member Modify");
    }

    // delete
    @Override
    public void deleteMember() throws MemberException {
        System.out.println("Member Delete Time: " + showTime());
        System.out.println("Member Delete");
    }
}
