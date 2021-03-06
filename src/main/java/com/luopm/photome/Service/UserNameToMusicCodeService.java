package com.luopm.photome.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luopm.photome.dao.UserNameToMusicCodeMapper;
import com.luopm.photome.model.ResponseUtil;
import com.luopm.photome.model.UserNameToMusicCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userNameToMusicCodeService")
public class UserNameToMusicCodeService {

    @Autowired
    private UserNameToMusicCodeMapper userNameToMusicCodeMapper;


    public ResponseUtil addUTC(UserNameToMusicCode userNameToMusicCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userNameToMusicCodeMapper.insert(userNameToMusicCode) >= 1){
                responseUtil.setResponseUtil(1,"注册UNTMC成功",
                        userNameToMusicCode,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil deleteByUTC(UserNameToMusicCode userNameToMusicCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            int deleteNum = userNameToMusicCodeMapper.deleteByUTC(userNameToMusicCode);
            if ( deleteNum >= 1){
                responseUtil.setResponseUtil(1,"删除记录数："+ deleteNum,
                        deleteNum,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil updateByUTC(UserNameToMusicCode userNameToMusicCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            if (userNameToMusicCodeMapper.updateByUTC(userNameToMusicCode) >= 1){
                responseUtil.setResponseUtil(1,"Get UMTMC Success",
                        userNameToMusicCode,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    public ResponseUtil getByUTC(UserNameToMusicCode userNameToMusicCode){
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            List<UserNameToMusicCode> list = userNameToMusicCodeMapper.selectByUTC(userNameToMusicCode);
            if (list.size() >= 1){
                responseUtil.setResponseUtil(1,"Get UNTMC Success",list,null);
            }
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    public ResponseUtil getAllUser(int pageNum, int pageSize, UserNameToMusicCode userNameToMusicCode) {
        ResponseUtil responseUtil = new ResponseUtil();
        try {
            //将参数传给这个方法就可以实现物理分页了，非常简单。
            PageHelper.startPage(pageNum, pageSize);
            List<UserNameToMusicCode> list = userNameToMusicCodeMapper.selectByUTC(userNameToMusicCode);
            PageInfo result = new PageInfo(list);
            responseUtil.setResponseUtil(1,"Get All UNTMC Success",result,null);
        }catch (Exception e){
            responseUtil.setResultMsg(e.getMessage());
        }
        return responseUtil;
    }
}