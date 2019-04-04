package fw.adapter.objectadapter;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 14:41
 * @Description:
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {

        HDMI hdmi=new ObjectAdapter(new DVIConnect());
        hdmi.hdmiconnect();
    }
}
