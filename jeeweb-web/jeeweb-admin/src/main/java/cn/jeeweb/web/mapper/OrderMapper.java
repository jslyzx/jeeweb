package cn.jeeweb.web.mapper;

import cn.jeeweb.web.entity.Order;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
 * All rights Reserved, Designed By www.gzst.gov.cn
 *
 * @version V1.0
 * @package cn.jeeweb.web.mapper
 * @title: order数据库控制层接口
 * @description: order数据库控制层接口
 * @author: Allen
 * @date: 2019-02-26 11:27:21
 * @copyright: 2018 www.gzst.gov.cn Inc. All rights reserved.
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    
}