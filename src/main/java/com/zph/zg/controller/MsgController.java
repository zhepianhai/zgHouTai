package com.zph.zg.controller;

import com.zph.zg.base.controller.BaseController;
import com.zph.zg.base.setting.BaseResponse;
import com.zph.zg.model.Msg;
import com.zph.zg.service.MsgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "BIS Msg", tags = "BIS Msg")
@RestController
@RequestMapping("/bis/msg")
public class MsgController extends BaseController {

    @Autowired
    private MsgService msgService;

    @ApiOperation(value = "根据手机号获取")
    @RequestMapping(value = "/getBy/{phone}", method = RequestMethod.POST)
    public BaseResponse<List<Msg>> getBy(@PathVariable String phone) {
        List<Msg> list = msgService.getBy(phone);
        return buildSuccessResponse(list);
    }

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResponse<Msg> insert(@RequestBody Msg msg) {
        msgService.insert(msg);
        return buildSuccessResponse(msg);
    }
    @ApiOperation(value = "列表查询")
    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public BaseResponse<List<Msg>> list() {
        List<Msg> list=msgService.findAll();
        return buildSuccessResponse(list);
    }
}
