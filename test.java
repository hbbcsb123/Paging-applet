package com.comm.mytest;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        int pageNum=2,pageSize=4;
        List<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);

        List<String> res = new ArrayList<>();
        int total = list.size();
        int subPageTotal = (total / pageSize) + ((total % pageSize > 0) ? 1 : 0);
        for (int i = 0, len = subPageTotal - 1; i <= len; i++) {
            // 分页计算
            int fromIndex = i * pageSize;
            int toIndex = ((i == len) ? total : ((i + 1) * pageSize));
            List<String> strings = list.subList(fromIndex, toIndex);
//            System.out.println(strings);
            if (pageNum-1==i)
                res = strings;
        }

        System.out.println(res);


    }
}
