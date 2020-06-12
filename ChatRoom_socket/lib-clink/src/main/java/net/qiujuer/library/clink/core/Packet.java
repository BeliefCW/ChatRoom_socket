package net.qiujuer.library.clink.core;

/**
 * 公共的数据封装
 * 提供了类型以及基本的长度的定义
 */
public class Packet {
    //数据类型
    protected byte type;
    //数据长度
    protected int length;

    public int length(){
        return length;
    }

    public byte type(){
        return type;
    }
}
