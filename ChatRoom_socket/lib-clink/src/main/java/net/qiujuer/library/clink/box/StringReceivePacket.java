package net.qiujuer.library.clink.box;

import net.qiujuer.library.clink.core.ReceivePacket;

public class StringReceivePacket extends ReceivePacket {
   private byte[] buffer;
   private int position;//坐标

   public StringReceivePacket(int len){
       buffer = new byte[len];
       length = len;
   }

    @Override
    public void save(byte[] bytes, int count) {
       //把传进来数组得数据copy到定义好得数组buffer
       System.arraycopy(bytes,0,buffer,position,count);
       position += count;
    }

    public String string(){
       return new String(buffer);
    }
}
