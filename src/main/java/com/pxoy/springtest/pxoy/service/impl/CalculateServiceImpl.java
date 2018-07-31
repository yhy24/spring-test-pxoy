package com.pxoy.springtest.pxoy.service.impl;

import com.pxoy.springtest.pxoy.service.CalculateService;

/**
 * @Author: yhy
 * @Date: 2018/7/31 17:09
 * @Version 1.0
 */
public class CalculateServiceImpl implements CalculateService{

    @Override
    public int addTest(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int productTest(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int jianTest(int i, int j) {
        int result = i - j;
        return result;
    }

}
