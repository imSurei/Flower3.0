package com.sure.dao.member;

import com.sure.bean.member.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MemberDao {
    // Read
    @Select("SELECT * FROM member WHERE account = #{account}")
    Member findMemberByAccount(String account); // 註冊時先查找用戶名是否存在、重複

    @Select("SELECT * FROM member WHERE account = #{account} AND email = #{email}")
    Member findMemberByAccountAndEmail(@Param("account") String account, @Param("email") String email); // 忘記密碼時，驗證帳戶和信箱是否存在、正確

    @Select("SELECT * FROM member WHERE account = #{account} AND password = #{password}")
    Member findMemberByAccountAndPassword(@Param("account") String account, @Param("password") String password); // 登陸時驗證用戶名及密碼

    @Select("SELECT * FROM member")
    List<Member> findAllMembers();

    // Create
    @Insert("INSERT INTO member VALUES(null, #{name}, #{account}, #{password}, #{email}, #{birthDate}, " +
            "#{gender}, #{address}, #{phone}, #{status})")
    int insertMember(Member m);

    // Update
    @Update("UPDATE member SET name = #{name}, account = #{account}, password = #{password}, email = #{email}, " +
            "birthDate = #{birthDate}, gender = #{gender}, address = #{address}, phone = #{phone}, " +
            "status = #{status} WHERE id = #{id}")
    int updateMember(Member m);

    // Delete
    @Delete("DELETE FROM member WHERE id = #{id}")
    void deleteMember(int id);
}
