import com.aide.common.k;
import com.aide.ui.R;
import com.aide.ui.e;

public class nh implements qi, qk {
    public boolean DW() {
        qg currentFileSpan = e.u7().sh().getCurrentFileSpan();
        e.u7().we();
        e.XL().Hw(currentFileSpan.j6, currentFileSpan.DW, currentFileSpan.Hw);
        return true;
    }

    public boolean g_() {
        return e.j3().tp() && e.j3().gn();
    }

    public int f_() {
        return R.b.editorMenuUnComment;
    }

    public k j6() {
        return new k(76, true, true, false);
    }

    public String v5() {
        return "Un-Outcomment Code";
    }
}
