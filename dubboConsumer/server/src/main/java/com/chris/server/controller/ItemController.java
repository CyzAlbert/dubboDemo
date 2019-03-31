package com.chris.server.controller;

import com.chris.api.response.BaseResponse;
import com.chris.api.service.IDubboItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    public static final Logger log= LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private IDubboItemService itemService;

    @GetMapping("/list")
    public BaseResponse getItemList(){
        BaseResponse res= itemService.listItems();
        return res;
    }
}
