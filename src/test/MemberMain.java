package test;

import lang.immutable.address.ImmutableAddress;

public class MemberMain {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("부산");
        Member member = new Member("박주형", address);

        member.setAddress(new ImmutableAddress("서울"));

        System.out.println("member = " + member);
    }
}
