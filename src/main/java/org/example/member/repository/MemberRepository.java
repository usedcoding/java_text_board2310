package org.example.member.repository;

import org.example.member.entity.Member;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<Member> memberList = new ArrayList<>();

    public MemberRepository () {
        Member member1 = new Member(1, "user1", "1234",  Util.nowDateTime());
        memberList.add(member1);
        Member member2 = new Member(2, "user2", "1234",  Util.nowDateTime());
        memberList.add(member2);
        Member member3 = new Member(3, "user3", "1234",  Util.nowDateTime());
        memberList.add(member3);
    }


    public Member getMemberFindByUserId(String userId) {
        for (int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
            if (member.getUserId().equals(userId)) {
                return member;
            }
        }
        return null;
    }

    public void join(String userId, String password) {
        Member member = new Member(userId, password, Util.nowDateTime());
        memberList.add(member);
    }
}
