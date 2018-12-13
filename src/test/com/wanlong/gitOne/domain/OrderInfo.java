package com.wanlong.gitOne.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 当前时间的订单信息
 * @author wl
 * @date 2018/12/12
 */
public class OrderInfo {
    int current;
    Map<Long,Integer> skuCount = new HashMap<Long, Integer>();
    Set<Long> topSku = new HashSet<Long>();
    Map<Long,Double> skuTotalValue = new HashMap<Long, Double>();

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public Map<Long, Integer> getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Map<Long, Integer> skuCount) {
        this.skuCount = skuCount;
    }

    public Set<Long> getTopSku() {
        return topSku;
    }

    public void setTopSku(Set<Long> topSku) {
        this.topSku = topSku;
    }

    public Map<Long, Double> getSkuTotalValue() {
        return skuTotalValue;
    }

    public void setSkuTotalValue(Map<Long, Double> skuTotalValue) {
        this.skuTotalValue = skuTotalValue;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "current=" + current +
                ", skuCount=" + skuCount +
                ", topSku=" + topSku +
                ", skuTotalValue=" + skuTotalValue +
                '}';
    }
}
