package com.google.common.net;

import com.google.common.base.CharMatcher;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;

@ElementTypesAreNonnullByDefault
public final class InetAddresses {

    /* renamed from: a  reason: collision with root package name */
    public static final CharMatcher f29074a = CharMatcher.k('.');

    /* renamed from: b  reason: collision with root package name */
    public static final CharMatcher f29075b = CharMatcher.k(':');

    /* renamed from: c  reason: collision with root package name */
    public static final Inet4Address f29076c = ((Inet4Address) c("127.0.0.1"));

    /* renamed from: d  reason: collision with root package name */
    public static final Inet4Address f29077d = ((Inet4Address) c("0.0.0.0"));

    public static final class TeredoInfo {
    }

    public static InetAddress a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] h2 = h(str.substring(lastIndexOf));
        if (h2 == null) {
            return null;
        }
        String hexString = Integer.toHexString(((h2[0] & 255) << 8) | (h2[1] & 255));
        String hexString2 = Integer.toHexString((h2[3] & 255) | ((h2[2] & 255) << 8));
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
        sb.append(substring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    public static InetAddress c(String str) {
        byte[] e2 = e(str);
        if (e2 != null) {
            return a(e2);
        }
        throw d("'%s' is not an IP string literal.", str);
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    public static byte[] e(String str) {
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (i2 >= str.length()) {
                i2 = -1;
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt == '.') {
                z2 = true;
            } else if (charAt == ':') {
                if (z2) {
                    return null;
                }
                z3 = true;
            } else if (charAt == '%') {
                break;
            } else if (Character.digit(charAt, 16) == -1) {
                return null;
            }
            i2++;
        }
        if (z3) {
            if (z2 && (str = b(str)) == null) {
                return null;
            }
            if (i2 != -1) {
                str = str.substring(0, i2);
            }
            return i(str);
        } else if (!z2 || i2 != -1) {
            return null;
        } else {
            return h(str);
        }
    }

    public static short f(String str, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 4) {
            throw new NumberFormatException();
        }
        int i5 = 0;
        while (i2 < i3) {
            i5 = (i5 << 4) | Character.digit(str.charAt(i2), 16);
            i2++;
        }
        return (short) i5;
    }

    public static byte g(String str, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 3) {
            throw new NumberFormatException();
        } else if (i4 <= 1 || str.charAt(i2) != '0') {
            int i5 = 0;
            while (i2 < i3) {
                int i6 = i5 * 10;
                int digit = Character.digit(str.charAt(i2), 10);
                if (digit >= 0) {
                    i5 = i6 + digit;
                    i2++;
                } else {
                    throw new NumberFormatException();
                }
            }
            if (i5 <= 255) {
                return (byte) i5;
            }
            throw new NumberFormatException();
        } else {
            throw new NumberFormatException();
        }
    }

    public static byte[] h(String str) {
        if (f29074a.g(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 4) {
            int indexOf = str.indexOf(46, i3);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = g(str, i3, indexOf);
                i3 = indexOf + 1;
                i2++;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    public static byte[] i(String str) {
        int g2 = f29075b.g(str);
        if (g2 >= 2 && g2 <= 8) {
            int i2 = 1;
            int i3 = g2 + 1;
            int i4 = 8 - i3;
            boolean z2 = false;
            for (int i5 = 0; i5 < str.length() - 1; i5++) {
                if (str.charAt(i5) == ':' && str.charAt(i5 + 1) == ':') {
                    if (z2) {
                        return null;
                    }
                    int i6 = i4 + 1;
                    if (i5 == 0) {
                        i6 = i4 + 2;
                    }
                    if (i5 == str.length() - 2) {
                        i6++;
                    }
                    i4 = i6;
                    z2 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z2 && i4 <= 0) {
                return null;
            }
            if (!z2 && i3 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i2 = 0;
                }
                while (i2 < str.length()) {
                    int indexOf = str.indexOf(58, i2);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i2) == ':') {
                        for (int i7 = 0; i7 < i4; i7++) {
                            allocate.putShort(0);
                        }
                    } else {
                        allocate.putShort(f(str, i2, indexOf));
                    }
                    i2 = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
