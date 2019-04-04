package fw.adapter.classadapter;


/**
 * @Auther: Administrator
 * @Date: 2019/4/4 14:36
 * @Description:
 */
public class ClassAdapter extends DVIConnect implements HDMI {


    public void hdmiconnect()
    {
        System.out.println("hdmi转接dvi");
        dviconnect();
    }
}
