package com.wanlong.gitOne;
import com.wanlong.gitOne.domain.OrderInfo;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class git1Test {
    @Test
    public void test1(){
      List<Long> list= new ArrayList<Long>();
      list.add(1l);
      list.add(1l);
        System.out.println(list);
      System.out.println(list.size());

    }

    @Test
    public void test2(){
        Set<Integer> set = new HashSet<Integer>();
        set.remove(1);
        System.out.println("111");
    }

    @Test
    public void test3(){
        int i=1;
        int j=1;
        boolean change = i==j;
        System.out.println(change);
    }

    @Test
    public void test4(){
        Map<Long,Integer> map = new HashMap<Long, Integer>();
        map.put(1l,1);
        Integer x = map.get(1l);
        System.out.println(x);
    }

    @Test
    public void test5(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setCurrent(1);
        if(orderInfo.getCurrent()!=3){
            orderInfo = new OrderInfo();
        }
        System.out.println(orderInfo);

        //取出sku以及count(也就是订单数量)
        Map<Long,Integer> skuCount = orderInfo.getSkuCount();
    }


    }



