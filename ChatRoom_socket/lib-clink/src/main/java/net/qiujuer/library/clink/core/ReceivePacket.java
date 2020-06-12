package net.qiujuer.library.clink.core;

/**
 * 接收包的定义
 * 把接收的内容转化成对应得东西
 */
public abstract class ReceivePacket extends Packet {

    public abstract void save(byte[] bytes, int count);
}
