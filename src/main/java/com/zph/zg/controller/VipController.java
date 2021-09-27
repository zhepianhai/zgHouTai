package com.zph.zg.controller;

import com.zph.zg.base.controller.BaseController;
import com.zph.zg.base.setting.BaseResponse;
import com.zph.zg.model.Msg;
import com.zph.zg.model.Vip;
import com.zph.zg.service.VipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "BIS VIP", tags = "BIS Vip")
@RestController
@RequestMapping("/bis/vip")
public class VipController extends BaseController {

    @Autowired
    VipService service;

    @ApiOperation(value = "根据手机号获取")
    @RequestMapping(value = "/getBy/{phone}", method = RequestMethod.POST)
    public BaseResponse<Vip> getBy(@PathVariable String phone) {
        Vip list = service.getBy(phone);
        return buildSuccessResponse(list);
    }


    @ApiOperation(value = "")
    @RequestMapping(value = "/addOrUp", method = RequestMethod.POST)
    public BaseResponse<Vip> add(@RequestBody Vip vip) {
        if(vip.getPhone().length()==0){
            return buildFailResponse("手机号不能为空！");
        }
        Vip list = service.getBy(vip.getPhone());
        if(list==null){
            service.insert(vip);
        }else {
            vip.setId(list.getId());
            System.out.println("-->"+vip.toString());
            service.update(vip);
        }
        return buildSuccessResponse(vip);
    }
}
