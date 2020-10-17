package com.casciences.maintenance;

import com.casciences.maintenance.entity.EquipInfo;

/**
 * @author lijie
 * @date 2020-10-15 12:37
 */
public class ABTest {

    private static class Singleton{
        private static final EquipInfo instance = new EquipInfo("sdf","",true,"1");
    }

    public static EquipInfo getInstance(){
        return Singleton.instance;
    }

    public static void main(String[] args) {
        EquipInfo e = ABTest.getInstance();
        System.out.println(e.getEquipName());
    }
}
