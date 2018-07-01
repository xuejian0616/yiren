package cn.yirenzhuang.service.impl;

import cn.yirenzhuang.mapper.GoodsCategoryMapper;
import cn.yirenzhuang.model.VO.GoodsCategoryVO;
import cn.yirenzhuang.service.GoodsCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xuhao
 *
 * @Date：Created on 2018/7/1 18:30.
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    GoodsCategoryMapper goodsCategoryMapper;

    /**
     * 获取服装的二级分类
     * @return  List<GoodsCategoryVO>
     */
    @Override
    public List<GoodsCategoryVO> getGoodsSubCategory(){

        List<GoodsCategoryVO> goodsCategoryList = goodsCategoryMapper.getGoodsSubCategory(1);

        goodsCategoryList.forEach(goodsCategory ->{
            int goodsCategoryId = goodsCategory.getId();
            List<GoodsCategoryVO> sunGoodsCategoryList = goodsCategoryMapper.getGoodsSubCategory(goodsCategoryId);
            goodsCategory.setSubGoodsCategoryList(sunGoodsCategoryList);
        });
        //现在只显示衣服的分类信息
        return goodsCategoryList;
    }
}