package com.luopm.photome.Controller;


import com.luopm.photome.Service.UserService;
import com.luopm.photome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/addUser" )
    public int addUser(User user){
        return userService.addUser(user);
    }
    @ResponseBody
    @RequestMapping(value = "/deleteUser" )
    public int deleteUser(User user){
        return userService.deleteUser(user);
    }
    @ResponseBody
    @RequestMapping(value = "/updateUser" )
    public int updateUser(User user){
        return userService.updateUser(user);
    }
    @ResponseBody
    @RequestMapping(value = "/getUser" )
    public User getUser(User user){
        return userService.getUser(user);
    }
    @ResponseBody
    @RequestMapping(value = "/getAllUser")
    public Object findAllUser(
            @RequestParam(name="pageNum",required = false,defaultValue = "1")
                    int pageNum,
            @RequestParam(name="pageSize",required = false,defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/getUsersByUserName")
    public Object getUsersByUserName(
            @RequestParam(name="userName",required = true )
                    String UserName){
        return userService.getUsersByUserName(UserName);
    }
}