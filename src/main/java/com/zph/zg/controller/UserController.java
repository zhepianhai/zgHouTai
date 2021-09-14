package com.zph.zg.controller;

import com.alibaba.druid.util.StringUtils;
import com.zph.zg.base.controller.BaseController;
import com.zph.zg.base.setting.BaseResponse;
import com.zph.zg.model.User;
import com.zph.zg.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "BIS USer", tags = "BIS User")
@RestController
@RequestMapping("/bis/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<User> login(@RequestBody User userParam) {
        User user = userService.login(userParam);
        if (user == null) {
            return buildFailResponse("用户不存在");
        }
        System.out.println(":--->");
        if (userParam.getPsd().equals(user.getPsd())) {
            return buildSuccessResponse(user);
        } else {
            return buildFailResponse("密码不正确");
        }
    }


    @ApiOperation(value = "注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResponse<User> register(@RequestBody User userParam) {
        if (StringUtils.isEmpty(userParam.getPhone())) {
            return buildFailResponse("手机号不能为空");
        }
        List<User> list = userService.findAll();
        boolean falgT = false;
        for (User item : list) {
            if (item.getPhone().equals(userParam.getPhone())) {
                falgT = true;
                break;
            }
        }
        if (falgT) {
            return buildFailResponse("手机号已存在，不能注册！");
        }
        userService.insert(userParam);
        return buildSuccessResponse(userParam);

    }

    @ApiOperation(value = "查询所有User")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public BaseResponse<List<User>> findAll() {
        System.out.println("-->");
        List<User> list = userService.findAll();
        return buildSuccessResponse(list);
    }
}
