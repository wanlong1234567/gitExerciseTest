package com.wanlong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wl
 * @date
 */
public class TESRE {
    public static void main(String[] args) {
       Map map = new HashMap();
       Map<Long,String> map2 = new HashMap<Long, String>();
       map2.put(Long.valueOf(100)+1,"fds");
        System.out.println(map2);
    }
}
