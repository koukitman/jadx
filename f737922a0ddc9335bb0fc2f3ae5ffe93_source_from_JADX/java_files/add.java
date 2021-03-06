import com.aide.uidesigner.ProxyTextView;

public final class add {
    public static String j6(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String j6(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String DW(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String FH(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String Hw(int i) {
        if (i == ((char) i)) {
            return FH(i);
        }
        return j6(i);
    }

    public static String v5(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String Zo(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    public static String DW(long j) {
        int i = 0;
        char[] cArr = new char[17];
        if (j < 0) {
            cArr[0] = '-';
            j = -j;
        } else {
            cArr[0] = '+';
        }
        while (i < 16) {
            cArr[16 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
            i++;
        }
        return new String(cArr);
    }

    public static String VH(int i) {
        int i2 = 0;
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        while (i2 < 8) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
            i2++;
        }
        return new String(cArr);
    }

    public static String gn(int i) {
        int i2 = 0;
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        while (i2 < 4) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
            i2++;
        }
        return new String(cArr);
    }

    public static String u7(int i) {
        int i2 = 0;
        char[] cArr = new char[3];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        while (i2 < 2) {
            cArr[2 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
            i2++;
        }
        return new String(cArr);
    }

    public static String j6(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2;
        if (((i | i2) | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
        } else if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        } else if (i2 == 0) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer((i2 * 4) + 6);
            int i7 = 0;
            while (i2 > 0) {
                if (i7 == 0) {
                    String v5;
                    switch (i5) {
                        case ProxyTextView.TYPEFACE_SERIF /*2*/:
                            v5 = v5(i3);
                            break;
                        case ProxyTextView.INPUTTYPE_datetime /*4*/:
                            v5 = FH(i3);
                            break;
                        case 6:
                            v5 = DW(i3);
                            break;
                        default:
                            v5 = j6(i3);
                            break;
                    }
                    stringBuffer.append(v5);
                    stringBuffer.append(": ");
                } else if ((i7 & 1) == 0) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(v5(bArr[i]));
                i3++;
                i++;
                i6 = i7 + 1;
                if (i6 == i4) {
                    stringBuffer.append('\n');
                    i6 = 0;
                }
                i2--;
                i7 = i6;
            }
            if (i7 != 0) {
                stringBuffer.append('\n');
            }
            return stringBuffer.toString();
        }
    }
}
