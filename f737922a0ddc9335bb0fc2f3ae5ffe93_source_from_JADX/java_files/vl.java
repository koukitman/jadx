import java.util.BitSet;

public final class vl extends ul {
    public static final ul DW;

    static {
        DW = new vl();
    }

    private vl() {
    }

    public String j6(uf ufVar) {
        return ufVar.tp().DW(0).J0() + ", " + ul.Hw(ufVar);
    }

    public String DW(uf ufVar, boolean z) {
        return ul.v5(ufVar);
    }

    public int j6() {
        return 2;
    }

    public boolean DW(uf ufVar) {
        zx tp = ufVar.tp();
        if (!(ufVar instanceof uz) || tp.m_() != 1 || !ul.Hw(tp.DW(0).VH())) {
            return false;
        }
        uz uzVar = (uz) ufVar;
        if (uzVar.Ws()) {
            return j6(uzVar);
        }
        return true;
    }

    public BitSet FH(uf ufVar) {
        zx tp = ufVar.tp();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, ul.Hw(tp.DW(0).VH()));
        return bitSet;
    }

    public boolean j6(uz uzVar) {
        int v5 = uzVar.v5();
        return v5 != 0 && ul.v5(v5);
    }

    public void j6(acr acr, uf ufVar) {
        ul.j6(acr, ul.j6(ufVar, ufVar.tp().DW(0).VH()), (short) ((uz) ufVar).v5());
    }
}