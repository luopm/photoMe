package com.luopm.photome.dao;

import com.luopm.photome.model.UserDetail;
import com.luopm.photome.model.UserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailMapper {
    int countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer photomeUserdetailId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer photomeUserdetailId);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByUserName(UserDetail record);

    int updateByPrimaryKey(UserDetail record);

    List<UserDetail> selectALLDetail();

    List<UserDetail> selectDetailByUserName(String userName);
}