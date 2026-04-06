package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

final class Utf8 {

    /* renamed from: a  reason: collision with root package name */
    public static final Processor f32360a = ((!UnsafeProcessor.p() || Android.c()) ? new SafeProcessor() : new UnsafeProcessor());

    public static class DecodeUtil {
        public static void h(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
            if (m(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || m(b4) || m(b5)) {
                throw InvalidProtocolBufferException.d();
            }
            int r2 = ((b2 & 7) << 18) | (r(b3) << 12) | (r(b4) << 6) | r(b5);
            cArr[i2] = l(r2);
            cArr[i2 + 1] = q(r2);
        }

        public static void i(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        public static void j(byte b2, byte b3, byte b4, char[] cArr, int i2) {
            if (m(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || m(b4)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i2] = (char) (((b2 & 15) << 12) | (r(b3) << 6) | r(b4));
        }

        public static void k(byte b2, byte b3, char[] cArr, int i2) {
            if (b2 < -62 || m(b3)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | r(b3));
        }

        public static char l(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        public static boolean m(byte b2) {
            return b2 > -65;
        }

        public static boolean n(byte b2) {
            return b2 >= 0;
        }

        public static boolean o(byte b2) {
            return b2 < -16;
        }

        public static boolean p(byte b2) {
            return b2 < -32;
        }

        public static char q(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        public static int r(byte b2) {
            return b2 & 63;
        }
    }

    public static abstract class Processor {
        public static int m(ByteBuffer byteBuffer, int i2, int i3) {
            int e2 = i2 + Utf8.m(byteBuffer, i2, i3);
            while (e2 < i3) {
                int i4 = e2 + 1;
                byte b2 = byteBuffer.get(e2);
                if (b2 >= 0) {
                    e2 = i4;
                } else if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                    e2 += 2;
                } else if (b2 < -16) {
                    if (i4 >= i3 - 1) {
                        return Utf8.q(byteBuffer, b2, i4, i3 - i4);
                    }
                    int i5 = e2 + 2;
                    byte b3 = byteBuffer.get(i4);
                    if (b3 > -65 || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || byteBuffer.get(i5) > -65))) {
                        return -1;
                    }
                    e2 += 3;
                } else if (i4 >= i3 - 2) {
                    return Utf8.q(byteBuffer, b2, i4, i3 - i4);
                } else {
                    int i6 = e2 + 2;
                    byte b4 = byteBuffer.get(i4);
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i7 = e2 + 3;
                        if (byteBuffer.get(i6) <= -65) {
                            e2 += 4;
                            if (byteBuffer.get(i7) > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            return 0;
        }

        public final String a(ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? d(byteBuffer, i2, i3) : c(byteBuffer, i2, i3);
            }
            return b(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }

        public abstract String b(byte[] bArr, int i2, int i3);

        public final String c(ByteBuffer byteBuffer, int i2, int i3) {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (r11 < i4) {
                    byte b2 = byteBuffer.get(r11);
                    if (!DecodeUtil.n(b2)) {
                        break;
                    }
                    i2 = r11 + 1;
                    DecodeUtil.i(b2, cArr, i5);
                    i5++;
                }
                int i6 = i5;
                while (r11 < i4) {
                    int i7 = r11 + 1;
                    byte b3 = byteBuffer.get(r11);
                    if (DecodeUtil.n(b3)) {
                        int i8 = i6 + 1;
                        DecodeUtil.i(b3, cArr, i6);
                        while (i7 < i4) {
                            byte b4 = byteBuffer.get(i7);
                            if (!DecodeUtil.n(b4)) {
                                break;
                            }
                            i7++;
                            DecodeUtil.i(b4, cArr, i8);
                            i8++;
                        }
                        i6 = i8;
                        r11 = i7;
                    } else if (DecodeUtil.p(b3)) {
                        if (i7 < i4) {
                            r11 += 2;
                            DecodeUtil.k(b3, byteBuffer.get(i7), cArr, i6);
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (DecodeUtil.o(b3)) {
                        if (i7 < i4 - 1) {
                            int i9 = r11 + 2;
                            r11 += 3;
                            DecodeUtil.j(b3, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i7 < i4 - 2) {
                        byte b5 = byteBuffer.get(i7);
                        int i10 = r11 + 3;
                        byte b6 = byteBuffer.get(r11 + 2);
                        r11 += 4;
                        DecodeUtil.h(b3, b5, b6, byteBuffer.get(i10), cArr, i6);
                        i6 += 2;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        public abstract String d(ByteBuffer byteBuffer, int i2, int i3);

        public abstract int e(CharSequence charSequence, byte[] bArr, int i2, int i3);

        public final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(Utf8.i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        public final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i2;
            int i3;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i4 = 0;
            while (i4 < length) {
                try {
                    char charAt = charSequence.charAt(i4);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i4, (byte) charAt);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                }
            }
            if (i4 == length) {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position + i4);
                return;
            }
            position += i4;
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    i2 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                        position = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt2 < 55296 || 57343 < charAt2) {
                    i2 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> 12) | 224));
                    position += 2;
                    byteBuffer.put(i2, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                } else {
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i6 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    i3 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i6;
                                    i4 = i5;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i6, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i3, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i4 = i5;
                                    position = i3;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i4 = i5;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                            i4 = i5;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i4) + " at index " + (byteBuffer.position() + Math.max(i4, (position - byteBuffer.position()) + 1)));
                        }
                    }
                    throw new UnpairedSurrogateException(i4, length);
                }
                i4++;
                position++;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
        }

        public abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean i(ByteBuffer byteBuffer, int i2, int i3) {
            return k(0, byteBuffer, i2, i3) == 0;
        }

        public final boolean j(byte[] bArr, int i2, int i3) {
            return l(0, bArr, i2, i3) == 0;
        }

        public final int k(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? o(i2, byteBuffer, i3, i4) : n(i2, byteBuffer, i3, i4);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return l(i2, byteBuffer.array(), i3 + arrayOffset, arrayOffset + i4);
        }

        public abstract int l(int i2, byte[] bArr, int i3, int i4);

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            if (r8.get(r9) > -65) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
            if (r8.get(r7) > -65) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r8.get(r9) > -65) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0092
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001e
                r7 = -62
                if (r0 < r7) goto L_0x001d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                r9 = r7
                goto L_0x0092
            L_0x001d:
                return r2
            L_0x001e:
                r4 = -16
                if (r0 >= r4) goto L_0x004f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0038
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L_0x0035
                int r7 = com.google.protobuf.Utf8.o(r0, r9)
                return r7
            L_0x0035:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0038:
                if (r7 > r3) goto L_0x004e
                r4 = -96
                if (r0 != r1) goto L_0x0040
                if (r7 < r4) goto L_0x004e
            L_0x0040:
                r1 = -19
                if (r0 != r1) goto L_0x0046
                if (r7 >= r4) goto L_0x004e
            L_0x0046:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x004e:
                return r2
            L_0x004f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L_0x0064
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L_0x0062
                int r7 = com.google.protobuf.Utf8.o(r0, r1)
                return r7
            L_0x0062:
                r9 = 0
                goto L_0x006a
            L_0x0064:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x006a:
                if (r9 != 0) goto L_0x007c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L_0x0079
                int r7 = com.google.protobuf.Utf8.p(r0, r1, r7)
                return r7
            L_0x0079:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x007c:
                if (r1 > r3) goto L_0x0091
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L_0x0091
                if (r9 > r3) goto L_0x0091
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L_0x0092
            L_0x0091:
                return r2
            L_0x0092:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.n(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int o(int i2, ByteBuffer byteBuffer, int i3, int i4);
    }

    public static final class SafeProcessor extends Processor {
        public static int p(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return q(bArr, i2, i3);
        }

        public static int q(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    i2 = i4;
                } else if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b2 < -16) {
                    if (i4 >= i3 - 1) {
                        return Utf8.r(bArr, i4, i3);
                    }
                    int i5 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i2 += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return Utf8.r(bArr, i4, i3);
                } else {
                    int i6 = i2 + 2;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i7 = i2 + 3;
                        if (bArr[i6] <= -65) {
                            i2 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            return 0;
        }

        public String b(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (r11 < i4) {
                    byte b2 = bArr[r11];
                    if (!DecodeUtil.n(b2)) {
                        break;
                    }
                    i2 = r11 + 1;
                    DecodeUtil.i(b2, cArr, i5);
                    i5++;
                }
                int i6 = i5;
                while (r11 < i4) {
                    int i7 = r11 + 1;
                    byte b3 = bArr[r11];
                    if (DecodeUtil.n(b3)) {
                        int i8 = i6 + 1;
                        DecodeUtil.i(b3, cArr, i6);
                        while (i7 < i4) {
                            byte b4 = bArr[i7];
                            if (!DecodeUtil.n(b4)) {
                                break;
                            }
                            i7++;
                            DecodeUtil.i(b4, cArr, i8);
                            i8++;
                        }
                        i6 = i8;
                        r11 = i7;
                    } else if (DecodeUtil.p(b3)) {
                        if (i7 < i4) {
                            r11 += 2;
                            DecodeUtil.k(b3, bArr[i7], cArr, i6);
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (DecodeUtil.o(b3)) {
                        if (i7 < i4 - 1) {
                            int i9 = r11 + 2;
                            r11 += 3;
                            DecodeUtil.j(b3, bArr[i7], bArr[i9], cArr, i6);
                            i6++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (i7 < i4 - 2) {
                        byte b5 = bArr[i7];
                        int i10 = r11 + 3;
                        byte b6 = bArr[r11 + 2];
                        r11 += 4;
                        DecodeUtil.h(b3, b5, b6, bArr[i10], cArr, i6);
                        i6 += 2;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        public String d(ByteBuffer byteBuffer, int i2, int i3) {
            return c(byteBuffer, i2, i3);
        }

        public int e(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i3 + i2;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i2) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i2 + length;
            }
            int i8 = i2 + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    bArr[i8] = (byte) charAt2;
                    i8++;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 += 2;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i10 = i8 + 2;
                    bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i8 += 3;
                    bArr[i10] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i11 = i7 + 1;
                    if (i11 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i12 = i8 + 3;
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i7 = i11;
                        } else {
                            i7 = i11;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i7++;
            }
            return i8;
        }

        public void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0083, code lost:
            if (r8[r7] > -65) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0086
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0086
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = com.google.protobuf.Utf8.o(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L_0x005c
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005a
                int r7 = com.google.protobuf.Utf8.o(r0, r1)
                return r7
            L_0x005a:
                r9 = 0
                goto L_0x0062
            L_0x005c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0062:
                if (r9 != 0) goto L_0x0072
                int r9 = r7 + 1
                byte r7 = r8[r7]
                if (r9 < r10) goto L_0x006f
                int r7 = com.google.protobuf.Utf8.p(r0, r1, r7)
                return r7
            L_0x006f:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0072:
                if (r1 > r3) goto L_0x0085
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L_0x0085
                if (r9 > r3) goto L_0x0085
                int r9 = r7 + 1
                byte r7 = r8[r7]
                if (r7 <= r3) goto L_0x0086
            L_0x0085:
                return r2
            L_0x0086:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.l(int, byte[], int, int):int");
        }

        public int o(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            return n(i2, byteBuffer, i3, i4);
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean p() {
            return UnsafeUtil.J() && UnsafeUtil.K();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int q(long r10, int r12) {
            /*
                int r0 = s(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r12 <= 0) goto L_0x001a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.x(r10)
                if (r1 < 0) goto L_0x0019
                int r12 = r12 + -1
                r10 = r4
                goto L_0x0009
            L_0x0019:
                r10 = r4
            L_0x001a:
                if (r12 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r0 = r12 + -1
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L_0x003a
                if (r0 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r12 = r12 + -2
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.UnsafeUtil.x(r10)
                if (r10 <= r6) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r10 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L_0x0065
                r7 = 2
                if (r0 >= r7) goto L_0x0048
                int r10 = u(r10, r1, r0)
                return r10
            L_0x0048:
                int r12 = r12 + -3
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.x(r10)
                if (r0 > r6) goto L_0x0064
                r7 = -96
                if (r1 != r4) goto L_0x0057
                if (r0 < r7) goto L_0x0064
            L_0x0057:
                r4 = -19
                if (r1 != r4) goto L_0x005d
                if (r0 >= r7) goto L_0x0064
            L_0x005d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.x(r2)
                if (r0 <= r6) goto L_0x0007
            L_0x0064:
                return r5
            L_0x0065:
                r4 = 3
                if (r0 >= r4) goto L_0x006d
                int r10 = u(r10, r1, r0)
                return r10
            L_0x006d:
                int r12 = r12 + -4
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.x(r10)
                if (r0 > r6) goto L_0x008f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L_0x008f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.x(r2)
                if (r0 > r6) goto L_0x008f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.x(r8)
                if (r0 <= r6) goto L_0x0007
            L_0x008f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.q(long, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int r(byte[] r10, long r11, int r13) {
            /*
                int r0 = t(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r13 <= 0) goto L_0x001a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.y(r10, r11)
                if (r1 < 0) goto L_0x0019
                int r13 = r13 + -1
                r11 = r4
                goto L_0x0009
            L_0x0019:
                r11 = r4
            L_0x001a:
                if (r13 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r0 = r13 + -1
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L_0x003a
                if (r0 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r13 = r13 + -2
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.UnsafeUtil.y(r10, r11)
                if (r11 <= r6) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r11 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L_0x0065
                r7 = 2
                if (r0 >= r7) goto L_0x0048
                int r10 = v(r10, r1, r11, r0)
                return r10
            L_0x0048:
                int r13 = r13 + -3
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.y(r10, r11)
                if (r0 > r6) goto L_0x0064
                r7 = -96
                if (r1 != r4) goto L_0x0057
                if (r0 < r7) goto L_0x0064
            L_0x0057:
                r4 = -19
                if (r1 != r4) goto L_0x005d
                if (r0 >= r7) goto L_0x0064
            L_0x005d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.y(r10, r2)
                if (r0 <= r6) goto L_0x0007
            L_0x0064:
                return r5
            L_0x0065:
                r4 = 3
                if (r0 >= r4) goto L_0x006d
                int r10 = v(r10, r1, r11, r0)
                return r10
            L_0x006d:
                int r13 = r13 + -4
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.y(r10, r11)
                if (r0 > r6) goto L_0x008f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L_0x008f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.y(r10, r2)
                if (r0 > r6) goto L_0x008f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.y(r10, r8)
                if (r0 <= r6) goto L_0x0007
            L_0x008f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.r(byte[], long, int):int");
        }

        public static int s(long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = (int) ((-j2) & 7);
            int i4 = i3;
            while (i4 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.x(j2) < 0) {
                    return i3 - i4;
                }
                i4--;
                j2 = j3;
            }
            int i5 = i2 - i3;
            while (i5 >= 8 && (UnsafeUtil.E(j2) & -9187201950435737472L) == 0) {
                j2 += 8;
                i5 -= 8;
            }
            return i2 - i5;
        }

        public static int t(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i4 = 8 - (((int) j2) & 7);
            while (i3 < i4) {
                long j3 = 1 + j2;
                if (UnsafeUtil.y(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            while (true) {
                int i5 = i3 + 8;
                if (i5 <= i2 && (UnsafeUtil.F(bArr, UnsafeUtil.f32343h + j2) & -9187201950435737472L) == 0) {
                    j2 += 8;
                    i3 = i5;
                }
            }
            while (i3 < i2) {
                long j4 = j2 + 1;
                if (UnsafeUtil.y(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j4;
            }
            return i2;
        }

        public static int u(long j2, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.n(i2);
            }
            if (i3 == 1) {
                return Utf8.o(i2, UnsafeUtil.x(j2));
            }
            if (i3 == 2) {
                return Utf8.p(i2, UnsafeUtil.x(j2), UnsafeUtil.x(j2 + 1));
            }
            throw new AssertionError();
        }

        public static int v(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return Utf8.n(i2);
            }
            if (i3 == 1) {
                return Utf8.o(i2, UnsafeUtil.y(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.p(i2, UnsafeUtil.y(bArr, j2), UnsafeUtil.y(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        public String b(byte[] bArr, int i2, int i3) {
            Charset charset = Internal.f32168b;
            String str = new String(bArr, i2, i3, charset);
            if (!str.contains("�") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                return str;
            }
            throw InvalidProtocolBufferException.d();
        }

        public String d(ByteBuffer byteBuffer, int i2, int i3) {
            long j2;
            int i4 = i2;
            int i5 = i3;
            if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) >= 0) {
                long k2 = UnsafeUtil.k(byteBuffer) + ((long) i4);
                long j3 = ((long) i5) + k2;
                char[] cArr = new char[i5];
                int i6 = 0;
                while (j2 < j3) {
                    byte x2 = UnsafeUtil.x(j2);
                    if (!DecodeUtil.n(x2)) {
                        break;
                    }
                    k2 = j2 + 1;
                    DecodeUtil.i(x2, cArr, i6);
                    i6++;
                }
                int i7 = i6;
                while (j2 < j3) {
                    long j4 = j2 + 1;
                    byte x3 = UnsafeUtil.x(j2);
                    if (DecodeUtil.n(x3)) {
                        int i8 = i7 + 1;
                        DecodeUtil.i(x3, cArr, i7);
                        while (j4 < j3) {
                            byte x4 = UnsafeUtil.x(j4);
                            if (!DecodeUtil.n(x4)) {
                                break;
                            }
                            j4++;
                            DecodeUtil.i(x4, cArr, i8);
                            i8++;
                        }
                        i7 = i8;
                        j2 = j4;
                    } else if (DecodeUtil.p(x3)) {
                        if (j4 < j3) {
                            j2 += 2;
                            DecodeUtil.k(x3, UnsafeUtil.x(j4), cArr, i7);
                            i7++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (DecodeUtil.o(x3)) {
                        if (j4 < j3 - 1) {
                            long j5 = 2 + j2;
                            j2 += 3;
                            DecodeUtil.j(x3, UnsafeUtil.x(j4), UnsafeUtil.x(j5), cArr, i7);
                            i7++;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    } else if (j4 < j3 - 2) {
                        byte x5 = UnsafeUtil.x(j4);
                        long j6 = 3 + j2;
                        byte x6 = UnsafeUtil.x(2 + j2);
                        j2 += 4;
                        DecodeUtil.h(x3, x5, x6, UnsafeUtil.x(j6), cArr, i7);
                        i7 += 2;
                    } else {
                        throw InvalidProtocolBufferException.d();
                    }
                }
                return new String(cArr, 0, i7);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f8, LOOP_START, PHI: r2 r4 r6 r9 r10 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(java.lang.CharSequence r25, byte[] r26, int r27, int r28) {
            /*
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r25.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.UnsafeUtil.R(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004f
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004f
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.UnsafeUtil.R(r1, r4, r13)
                r22 = r6
                r17 = r10
                r20 = r11
                r4 = r14
                r14 = r9
                goto L_0x00f8
            L_0x004f:
                r14 = 2048(0x800, float:2.87E-42)
                r15 = 2
                if (r13 >= r14) goto L_0x0076
                long r17 = r6 - r15
                int r14 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r14 > 0) goto L_0x0076
                r14 = r9
                r17 = r10
                long r9 = r4 + r11
                int r11 = r13 >>> 6
                r11 = r11 | 960(0x3c0, float:1.345E-42)
                byte r11 = (byte) r11
                com.google.protobuf.UnsafeUtil.R(r1, r4, r11)
                long r4 = r4 + r15
                r11 = r13 & 63
                r11 = r11 | r3
                byte r11 = (byte) r11
                com.google.protobuf.UnsafeUtil.R(r1, r9, r11)
            L_0x0070:
                r22 = r6
                r20 = 1
                goto L_0x00f8
            L_0x0076:
                r14 = r9
                r17 = r10
                r9 = 57343(0xdfff, float:8.0355E-41)
                r10 = 55296(0xd800, float:7.7486E-41)
                r11 = 3
                if (r13 < r10) goto L_0x0085
                if (r9 >= r13) goto L_0x00ad
            L_0x0085:
                long r18 = r6 - r11
                int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r18 > 0) goto L_0x00ad
                r18 = 1
                long r9 = r4 + r18
                int r11 = r13 >>> 12
                r11 = r11 | 480(0x1e0, float:6.73E-43)
                byte r11 = (byte) r11
                com.google.protobuf.UnsafeUtil.R(r1, r4, r11)
                long r11 = r4 + r15
                int r15 = r13 >>> 6
                r15 = r15 & 63
                r15 = r15 | r3
                byte r15 = (byte) r15
                com.google.protobuf.UnsafeUtil.R(r1, r9, r15)
                r9 = 3
                long r4 = r4 + r9
                r9 = r13 & 63
                r9 = r9 | r3
                byte r9 = (byte) r9
                com.google.protobuf.UnsafeUtil.R(r1, r11, r9)
                goto L_0x0070
            L_0x00ad:
                r11 = 4
                long r20 = r6 - r11
                int r20 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r20 > 0) goto L_0x010c
                int r9 = r2 + 1
                if (r9 == r8) goto L_0x0104
                char r2 = r0.charAt(r9)
                boolean r10 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r10 == 0) goto L_0x0103
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r20 = 1
                long r11 = r4 + r20
                int r10 = r2 >>> 18
                r10 = r10 | 240(0xf0, float:3.36E-43)
                byte r10 = (byte) r10
                com.google.protobuf.UnsafeUtil.R(r1, r4, r10)
                r22 = r6
                long r6 = r4 + r15
                int r10 = r2 >>> 12
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                com.google.protobuf.UnsafeUtil.R(r1, r11, r10)
                r10 = 3
                long r11 = r4 + r10
                int r10 = r2 >>> 6
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                com.google.protobuf.UnsafeUtil.R(r1, r6, r10)
                r6 = 4
                long r4 = r4 + r6
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                com.google.protobuf.UnsafeUtil.R(r1, r11, r2)
                r2 = r9
            L_0x00f8:
                int r2 = r2 + 1
                r9 = r14
                r10 = r17
                r11 = r20
                r6 = r22
                goto L_0x0033
            L_0x0103:
                r2 = r9
            L_0x0104:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010c:
                if (r10 > r13) goto L_0x0124
                if (r13 > r9) goto L_0x0124
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x011e
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0124
            L_0x011e:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0124:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r6 = r17
                r1.append(r6)
                r1.append(r13)
                r7 = r14
                r1.append(r7)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                r7 = r9
                r6 = r10
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r6)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r7)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[LOOP:1: B:11:0x0044->B:36:0x0103, LOOP_START, PHI: r2 r4 r9 r12 r14 
          PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x0039, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:8:0x0039, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v4 int) = (r9v3 int), (r9v6 int) binds: [B:8:0x0039, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r12v1 long) = (r12v0 long), (r12v2 long) binds: [B:8:0x0039, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r14v1 char) = (r14v0 char), (r14v2 char) binds: [B:8:0x0039, B:36:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(java.lang.CharSequence r28, java.nio.ByteBuffer r29) {
            /*
                r27 = this;
                r0 = r28
                r1 = r29
                long r2 = com.google.protobuf.UnsafeUtil.k(r29)
                int r4 = r29.position()
                long r4 = (long) r4
                long r4 = r4 + r2
                int r6 = r29.limit()
                long r6 = (long) r6
                long r6 = r6 + r2
                int r8 = r28.length()
                long r9 = (long) r8
                long r11 = r6 - r4
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                java.lang.String r10 = " at index "
                java.lang.String r11 = "Failed writing "
                if (r9 > 0) goto L_0x0159
                r9 = 0
            L_0x0024:
                r12 = 1
                r14 = 128(0x80, float:1.794E-43)
                if (r9 >= r8) goto L_0x0039
                char r15 = r0.charAt(r9)
                if (r15 >= r14) goto L_0x0039
                long r12 = r12 + r4
                byte r14 = (byte) r15
                com.google.protobuf.UnsafeUtil.Q(r4, r14)
                int r9 = r9 + 1
                r4 = r12
                goto L_0x0024
            L_0x0039:
                if (r9 != r8) goto L_0x0044
                long r4 = r4 - r2
                int r0 = (int) r4
                java.nio.Buffer r0 = r1.position(r0)
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                return
            L_0x0044:
                if (r9 >= r8) goto L_0x014b
                char r15 = r0.charAt(r9)
                if (r15 >= r14) goto L_0x005e
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L_0x005e
                long r16 = r4 + r12
                byte r15 = (byte) r15
                com.google.protobuf.UnsafeUtil.Q(r4, r15)
                r19 = r2
                r1 = r9
                r9 = r14
                r4 = r16
                goto L_0x0103
            L_0x005e:
                r14 = 2048(0x800, float:2.87E-42)
                r17 = 2
                if (r15 >= r14) goto L_0x0086
                long r19 = r6 - r17
                int r14 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r14 > 0) goto L_0x0086
                r19 = r2
                long r1 = r4 + r12
                int r3 = r15 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r4, r3)
                long r4 = r4 + r17
                r3 = r15 & 63
                r14 = 128(0x80, float:1.794E-43)
                r3 = r3 | r14
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r1, r3)
            L_0x0081:
                r1 = r9
                r9 = 128(0x80, float:1.794E-43)
                goto L_0x0103
            L_0x0086:
                r19 = r2
                r1 = 57343(0xdfff, float:8.0355E-41)
                r2 = 55296(0xd800, float:7.7486E-41)
                r21 = 3
                if (r15 < r2) goto L_0x0094
                if (r1 >= r15) goto L_0x00bb
            L_0x0094:
                long r23 = r6 - r21
                int r3 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
                if (r3 > 0) goto L_0x00bb
                long r1 = r4 + r12
                int r3 = r15 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r4, r3)
                long r12 = r4 + r17
                int r3 = r15 >>> 6
                r3 = r3 & 63
                r14 = 128(0x80, float:1.794E-43)
                r3 = r3 | r14
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r1, r3)
                long r4 = r4 + r21
                r1 = r15 & 63
                r1 = r1 | r14
                byte r1 = (byte) r1
                com.google.protobuf.UnsafeUtil.Q(r12, r1)
                goto L_0x0081
            L_0x00bb:
                r12 = 4
                long r25 = r6 - r12
                int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
                if (r3 > 0) goto L_0x0118
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x0110
                char r2 = r0.charAt(r1)
                boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r3 == 0) goto L_0x010f
                int r2 = java.lang.Character.toCodePoint(r15, r2)
                r14 = 1
                long r12 = r4 + r14
                int r3 = r2 >>> 18
                r3 = r3 | 240(0xf0, float:3.36E-43)
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r4, r3)
                long r14 = r4 + r17
                int r3 = r2 >>> 12
                r3 = r3 & 63
                r9 = 128(0x80, float:1.794E-43)
                r3 = r3 | r9
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r12, r3)
                long r12 = r4 + r21
                int r3 = r2 >>> 6
                r3 = r3 & 63
                r3 = r3 | r9
                byte r3 = (byte) r3
                com.google.protobuf.UnsafeUtil.Q(r14, r3)
                r14 = 4
                long r4 = r4 + r14
                r2 = r2 & 63
                r2 = r2 | r9
                byte r2 = (byte) r2
                com.google.protobuf.UnsafeUtil.Q(r12, r2)
            L_0x0103:
                int r1 = r1 + 1
                r14 = r9
                r2 = r19
                r12 = 1
                r9 = r1
                r1 = r29
                goto L_0x0044
            L_0x010f:
                r9 = r1
            L_0x0110:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                int r9 = r9 + -1
                r0.<init>(r9, r8)
                throw r0
            L_0x0118:
                if (r2 > r15) goto L_0x0130
                if (r15 > r1) goto L_0x0130
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x012a
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
                if (r0 != 0) goto L_0x0130
            L_0x012a:
                com.google.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r9, r8)
                throw r0
            L_0x0130:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                r1.append(r15)
                r1.append(r10)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x014b:
                r19 = r2
                long r4 = r4 - r19
                int r0 = (int) r4
                r1 = r29
                java.nio.Buffer r0 = r1.position(r0)
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                return
            L_0x0159:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r3.append(r0)
                r3.append(r10)
                int r0 = r29.limit()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.h(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
            if (com.google.protobuf.UnsafeUtil.y(r12, r0) > -65) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (com.google.protobuf.UnsafeUtil.y(r12, r0) > -65) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int l(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto L_0x00a8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto L_0x00a1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L_0x0010
                return r11
            L_0x0010:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L_0x002a
                r11 = -62
                if (r2 < r11) goto L_0x0029
                long r6 = r6 + r0
                byte r11 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                if (r11 <= r5) goto L_0x0026
                goto L_0x0029
            L_0x0026:
                r0 = r6
                goto L_0x00a1
            L_0x0029:
                return r4
            L_0x002a:
                r8 = -16
                if (r2 >= r8) goto L_0x005e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L_0x0044
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L_0x0043
                int r11 = com.google.protobuf.Utf8.o(r2, r11)
                return r11
            L_0x0043:
                r0 = r8
            L_0x0044:
                if (r11 > r5) goto L_0x005d
                r8 = -96
                if (r2 != r3) goto L_0x004c
                if (r11 < r8) goto L_0x005d
            L_0x004c:
                r3 = -19
                if (r2 != r3) goto L_0x0052
                if (r11 >= r8) goto L_0x005d
            L_0x0052:
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                if (r11 <= r5) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                r0 = r2
                goto L_0x00a1
            L_0x005d:
                return r4
            L_0x005e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L_0x0076
                long r8 = r0 + r6
                byte r3 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L_0x0073
                int r11 = com.google.protobuf.Utf8.o(r2, r3)
                return r11
            L_0x0073:
                r11 = 0
                r0 = r8
                goto L_0x0079
            L_0x0076:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L_0x0079:
                if (r11 != 0) goto L_0x008b
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L_0x008a
                int r11 = com.google.protobuf.Utf8.p(r2, r3, r11)
                return r11
            L_0x008a:
                r0 = r8
            L_0x008b:
                if (r3 > r5) goto L_0x00a0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto L_0x00a0
                if (r11 > r5) goto L_0x00a0
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.y(r12, r0)
                if (r11 <= r5) goto L_0x005b
            L_0x00a0:
                return r4
            L_0x00a1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = r(r12, r0, r11)
                return r11
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.l(int, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (com.google.protobuf.UnsafeUtil.x(r0) > -65) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
            if (com.google.protobuf.UnsafeUtil.x(r0) > -65) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
            if (com.google.protobuf.UnsafeUtil.x(r0) > -65) goto L_0x00a5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int o(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                r9 = this;
                r0 = r12 | r13
                int r1 = r11.limit()
                int r1 = r1 - r13
                r0 = r0 | r1
                if (r0 < 0) goto L_0x00ad
                long r0 = com.google.protobuf.UnsafeUtil.k(r11)
                long r2 = (long) r12
                long r0 = r0 + r2
                int r13 = r13 - r12
                long r11 = (long) r13
                long r11 = r11 + r0
                if (r10 == 0) goto L_0x00a6
                int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r13 < 0) goto L_0x001a
                return r10
            L_0x001a:
                byte r13 = (byte) r10
                r2 = -32
                r3 = -1
                r4 = -65
                r5 = 1
                if (r13 >= r2) goto L_0x0034
                r10 = -62
                if (r13 < r10) goto L_0x0033
                long r5 = r5 + r0
                byte r10 = com.google.protobuf.UnsafeUtil.x(r0)
                if (r10 <= r4) goto L_0x0030
                goto L_0x0033
            L_0x0030:
                r0 = r5
                goto L_0x00a6
            L_0x0033:
                return r3
            L_0x0034:
                r7 = -16
                if (r13 >= r7) goto L_0x0064
                int r10 = r10 >> 8
                int r10 = ~r10
                byte r10 = (byte) r10
                if (r10 != 0) goto L_0x004e
                long r7 = r0 + r5
                byte r10 = com.google.protobuf.UnsafeUtil.x(r0)
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 < 0) goto L_0x004d
                int r10 = com.google.protobuf.Utf8.o(r13, r10)
                return r10
            L_0x004d:
                r0 = r7
            L_0x004e:
                if (r10 > r4) goto L_0x0063
                r7 = -96
                if (r13 != r2) goto L_0x0056
                if (r10 < r7) goto L_0x0063
            L_0x0056:
                r2 = -19
                if (r13 != r2) goto L_0x005c
                if (r10 >= r7) goto L_0x0063
            L_0x005c:
                long r5 = r5 + r0
                byte r10 = com.google.protobuf.UnsafeUtil.x(r0)
                if (r10 <= r4) goto L_0x0030
            L_0x0063:
                return r3
            L_0x0064:
                int r2 = r10 >> 8
                int r2 = ~r2
                byte r2 = (byte) r2
                if (r2 != 0) goto L_0x007c
                long r7 = r0 + r5
                byte r2 = com.google.protobuf.UnsafeUtil.x(r0)
                int r10 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r10 < 0) goto L_0x0079
                int r10 = com.google.protobuf.Utf8.o(r13, r2)
                return r10
            L_0x0079:
                r10 = 0
                r0 = r7
                goto L_0x007f
            L_0x007c:
                int r10 = r10 >> 16
                byte r10 = (byte) r10
            L_0x007f:
                if (r10 != 0) goto L_0x0091
                long r7 = r0 + r5
                byte r10 = com.google.protobuf.UnsafeUtil.x(r0)
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 < 0) goto L_0x0090
                int r10 = com.google.protobuf.Utf8.p(r13, r2, r10)
                return r10
            L_0x0090:
                r0 = r7
            L_0x0091:
                if (r2 > r4) goto L_0x00a5
                int r13 = r13 << 28
                int r2 = r2 + 112
                int r13 = r13 + r2
                int r13 = r13 >> 30
                if (r13 != 0) goto L_0x00a5
                if (r10 > r4) goto L_0x00a5
                long r5 = r5 + r0
                byte r10 = com.google.protobuf.UnsafeUtil.x(r0)
                if (r10 <= r4) goto L_0x0030
            L_0x00a5:
                return r3
            L_0x00a6:
                long r11 = r11 - r0
                int r10 = (int) r11
                int r10 = q(r0, r10)
                return r10
            L_0x00ad:
                java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
                int r11 = r11.limit()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r11 = java.lang.String.format(r12, r11)
                r10.<init>(r11)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    public static String g(ByteBuffer byteBuffer, int i2, int i3) {
        return f32360a.a(byteBuffer, i2, i3);
    }

    public static String h(byte[] bArr, int i2, int i3) {
        return f32360a.b(bArr, i2, i3);
    }

    public static int i(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f32360a.e(charSequence, bArr, i2, i3);
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f32360a.f(charSequence, byteBuffer);
    }

    public static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += l(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static int l(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) >= 65536) {
                        i2++;
                    } else {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                }
            }
            i2++;
        }
        return i3;
    }

    public static int m(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = i3 - 7;
        int i5 = i2;
        while (i5 < i4 && (byteBuffer.getLong(i5) & -9187201950435737472L) == 0) {
            i5 += 8;
        }
        return i5 - i2;
    }

    public static int n(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static int o(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int p(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    public static int q(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        if (i4 == 0) {
            return n(i2);
        }
        if (i4 == 1) {
            return o(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return p(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    public static int r(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return n(b2);
        }
        if (i4 == 1) {
            return o(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return p(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean s(ByteBuffer byteBuffer) {
        return f32360a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return f32360a.j(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i2, int i3) {
        return f32360a.j(bArr, i2, i3);
    }

    public static int v(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        return f32360a.k(i2, byteBuffer, i3, i4);
    }

    public static int w(int i2, byte[] bArr, int i3, int i4) {
        return f32360a.l(i2, bArr, i3, i4);
    }
}
