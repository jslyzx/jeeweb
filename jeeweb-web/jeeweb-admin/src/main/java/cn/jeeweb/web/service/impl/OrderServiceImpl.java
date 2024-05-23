package cn.jeeweb.web.service.impl;

import cn.jeeweb.common.mybatis.mvc.service.impl.CommonServiceImpl;
import cn.jeeweb.web.service.IOrderService;
import cn.jeeweb.web.entity.Order;
import cn.jeeweb.web.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
* All rights Reserved, Designed By www.gzst.gov.cn
*
* @version V1.0
* @package cn.jeeweb.web.service.impl
* @title: order服务实现
* @description: order服务实现
* @author: Allen
* @date: 2019-02-26 11:27:21
* @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
*/
@Transactional
@Service("orderService")
public class OrderServiceImpl  extends CommonServiceImpl<OrderMapper,Order> implements  IOrderService {

}