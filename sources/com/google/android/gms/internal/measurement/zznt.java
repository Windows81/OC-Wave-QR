package com.google.android.gms.internal.measurement;

final class zznt {
    public static String a(zzjs zzjs) {
        zzns zzns = new zzns(zzjs);
        StringBuilder sb = new StringBuilder(zzns.a());
        for (int i2 = 0; i2 < zzns.a(); i2++) {
            byte j2 = zzns.j(i2);
            if (j2 == 34) {
                sb.append("\\\"");
            } else if (j2 == 39) {
                sb.append("\\'");
            } else if (j2 != 92) {
                switch (j2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (j2 >= 32 && j2 <= 126) {
                            sb.append((char) j2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((j2 >>> 6) & 3) + 48));
                            sb.append((char) (((j2 >>> 3) & 7) + 48));
                            sb.append((char) ((j2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
