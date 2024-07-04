package com.linsir.saas.enums;

/**
 * description:
 *
 * @author [linsir]
 * @version 0.0.1
 * @date 2022/08/30 18:02:59
 */
public enum Continent {

    Asia("亚洲",1),
    Europe("欧洲",2),
    Africa("非洲",3),
    NorthAmerica("北美洲",4),
    SouthAmerica("南美洲",5),
    Oceania("大洋洲",6),
    Antarctica("南极洲",156)
    ;
    private String label;
    private int value;

    Continent(String label, int value)
    {
        this.label =label;
        this.value =value;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}
