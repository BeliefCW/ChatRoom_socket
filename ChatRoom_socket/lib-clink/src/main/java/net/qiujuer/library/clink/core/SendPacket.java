package net.qiujuer.library.clink.core;

/**
 * 发送包的定义
 */
public abstract class SendPacket extends Packet {
    //发送的状态--》是否以及取消发送状态
    private boolean isCanceled;

    public abstract byte[] bytes();

    public boolean isCanceled() {
        return isCanceled;
    }
}
