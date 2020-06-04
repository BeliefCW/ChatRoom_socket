package net.qiujuer.library.clink.core;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

//对数据的封装   防止缓冲区无节制的创建
public class IoArgs {
    private byte[] byteBuffer = new byte[256];
    private ByteBuffer buffer = ByteBuffer.wrap(byteBuffer);

    public int read(SocketChannel channel) throws IOException {
        buffer.clear();
        return channel.read(buffer);
    }

    public int write(SocketChannel channel) throws IOException {
        return channel.write(buffer);
    }

    public String bufferString() {
        // 丢弃换行符
        return new String(byteBuffer, 0, buffer.position() - 1);
    }

    //监听IoArgs的状态
    public interface IoArgsEventListener {
        //当开始的时候回调
        void onStarted(IoArgs args);

        //当完成时回调
        void onCompleted(IoArgs args);
    }
}
