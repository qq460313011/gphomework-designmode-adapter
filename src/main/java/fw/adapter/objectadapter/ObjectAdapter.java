package fw.adapter.objectadapter;


/**
 * @Auther: Administrator
 * @Date: 2019/4/4 14:36
 * @Description:
 */
public class ObjectAdapter implements HDMI {

    private DVIConnect dviConnect;

    public ObjectAdapter(DVIConnect dviConnect ){
        this.dviConnect=dviConnect;
    }
    public void hdmiconnect()
    {
        System.out.println("hdmi转接dvi");
       dviConnect.dviconnect();
    }
}
