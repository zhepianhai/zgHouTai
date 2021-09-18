package com.zph.zg.controller;

import com.zph.zg.base.controller.BaseController;
import com.zph.zg.base.setting.BaseResponse;
import com.zph.zg.model.Tracked;
import com.zph.zg.service.TrackedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "BIS Tracked", tags = "BIS Tracked")
@RestController
@RequestMapping("/bis/tracked")
public class TrackedController extends BaseController {

    @Autowired
    private TrackedService trackedService;

    @ApiOperation(value = "根据手机号获取")
    @RequestMapping(value = "/getBy/{phone}", method = RequestMethod.POST)
    public BaseResponse<List<Tracked>> getBy(@PathVariable String phone) {
        List<Tracked> list=trackedService.getBy(phone);
        return buildSuccessResponse(list);
    }


    @ApiOperation(value = "批量添加")
    @RequestMapping(value = "/listInsert", method = RequestMethod.POST)
    public BaseResponse<List<Tracked>> listInsert(@RequestBody List<Tracked> list) {
        for (Tracked item : list) {
            trackedService.insert(item);
        }
        return buildSuccessResponse();
    }
}
