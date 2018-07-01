package cn.yirenzhuang.service.impl;

import cn.yirenzhuang.mapper.GoodsMapper;
import cn.yirenzhuang.model.TBGoods;
import cn.yirenzhuang.model.VO.GoodsListVO;
import cn.yirenzhuang.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    GoodsMapper goodsMapper;
    /**
     * 根据分类id查询商品列表
     * @param categroyId
     * @return
     */
    @Override
    public List<GoodsListVO> getGoodsByCategory(int categroyId){
        return goodsMapper.getGoodsByCategory(categroyId);
    }
}