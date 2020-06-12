package net.qiujuer.library.clink.core;

/**
 * 接收的数据调度封装
 * 把一份或者多份IoArgs组合程一份Packet
 */
public interface ReceiveDispatcher {
    void start();

    void stop();

    interface RceivePacketCallback{
        void onReceivePacketComplated(ReceivePacket packet);
    }
}
