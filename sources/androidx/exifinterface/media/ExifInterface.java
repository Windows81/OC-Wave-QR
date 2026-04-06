package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import androidx.compose.foundation.text.UndoManagerKt;
import androidx.exifinterface.media.ExifInterfaceUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class ExifInterface {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f21427A = {-1, -40, -1};

    /* renamed from: B  reason: collision with root package name */
    public static final byte[] f21428B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {79, 76, 89, 77, 80, 0};
    public static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] H = {101, 88, 73, 102};
    public static final byte[] I = {73, 72, 68, 82};
    public static final byte[] J = {73, 69, 78, 68};
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static SimpleDateFormat T;
    public static SimpleDateFormat U;
    public static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final ExifTag[] Y;
    public static final ExifTag[] Z;
    public static final ExifTag[] a0;
    public static final ExifTag[] b0;
    public static final ExifTag[] c0;
    public static final ExifTag d0 = new ExifTag("StripOffsets", 273, 3);
    public static final ExifTag[] e0;
    public static final ExifTag[] f0;
    public static final ExifTag[] g0;
    public static final ExifTag[] h0;
    public static final ExifTag[][] i0;
    public static final ExifTag[] j0 = {new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap[] k0;
    public static final HashMap[] l0;
    public static final HashSet m0 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap n0 = new HashMap();
    public static final Charset o0;
    public static final byte[] p0;
    public static final byte[] q0;
    public static final Pattern r0 = Pattern.compile(".*[1-9].*");
    public static final Pattern s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f21429u = Log.isLoggable("ExifInterface", 3);
    public static final Pattern u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: v  reason: collision with root package name */
    public static final List f21430v = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: w  reason: collision with root package name */
    public static final List f21431w = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f21432x = {8, 8, 8};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f21433y = {4};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f21434z = {8};

    /* renamed from: a  reason: collision with root package name */
    public String f21435a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f21436b;

    /* renamed from: c  reason: collision with root package name */
    public AssetManager.AssetInputStream f21437c;

    /* renamed from: d  reason: collision with root package name */
    public int f21438d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21439e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap[] f21440f;

    /* renamed from: g  reason: collision with root package name */
    public Set f21441g;

    /* renamed from: h  reason: collision with root package name */
    public ByteOrder f21442h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21443i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21444j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f21445k;

    /* renamed from: l  reason: collision with root package name */
    public int f21446l;

    /* renamed from: m  reason: collision with root package name */
    public int f21447m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f21448n;

    /* renamed from: o  reason: collision with root package name */
    public int f21449o;

    /* renamed from: p  reason: collision with root package name */
    public int f21450p;

    /* renamed from: q  reason: collision with root package name */
    public int f21451q;

    /* renamed from: r  reason: collision with root package name */
    public int f21452r;

    /* renamed from: s  reason: collision with root package name */
    public int f21453s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f21454t;

    public static class ByteOrderedDataOutputStream extends FilterOutputStream {

        /* renamed from: z  reason: collision with root package name */
        public final OutputStream f21461z;

        public void write(byte[] bArr) {
            this.f21461z.write(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            this.f21461z.write(bArr, i2, i3);
        }
    }

    public static class ExifAttribute {

        /* renamed from: a  reason: collision with root package name */
        public final int f21462a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21463b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21464c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f21465d;

        public ExifAttribute(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1, bArr);
        }

        public static ExifAttribute a(String str) {
            byte[] bytes = (str + 0).getBytes(ExifInterface.o0);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public static ExifAttribute b(long j2, ByteOrder byteOrder) {
            return c(new long[]{j2}, byteOrder);
        }

        public static ExifAttribute c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.W[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j2 : jArr) {
                wrap.putInt((int) j2);
            }
            return new ExifAttribute(4, jArr.length, wrap.array());
        }

        public static ExifAttribute d(Rational rational, ByteOrder byteOrder) {
            return e(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute e(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.W[5] * rationalArr.length)]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.f21470a);
                wrap.putInt((int) rational.f21471b);
            }
            return new ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static ExifAttribute f(int i2, ByteOrder byteOrder) {
            return g(new int[]{i2}, byteOrder);
        }

        public static ExifAttribute g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.W[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i2 : iArr) {
                wrap.putShort((short) i2);
            }
            return new ExifAttribute(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k2 = k(byteOrder);
            if (k2 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k2 instanceof String) {
                return Double.parseDouble((String) k2);
            } else {
                if (k2 instanceof long[]) {
                    long[] jArr = (long[]) k2;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k2 instanceof int[]) {
                    int[] iArr = (int[]) k2;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k2 instanceof double[]) {
                    double[] dArr = (double[]) k2;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k2 instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) k2;
                    if (rationalArr.length == 1) {
                        return rationalArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int i(ByteOrder byteOrder) {
            Object k2 = k(byteOrder);
            if (k2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k2 instanceof String) {
                return Integer.parseInt((String) k2);
            } else {
                if (k2 instanceof long[]) {
                    long[] jArr = (long[]) k2;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k2 instanceof int[]) {
                    int[] iArr = (int[]) k2;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String j(ByteOrder byteOrder) {
            Object k2 = k(byteOrder);
            if (k2 == null) {
                return null;
            }
            if (k2 instanceof String) {
                return (String) k2;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (k2 instanceof long[]) {
                long[] jArr = (long[]) k2;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k2 instanceof int[]) {
                int[] iArr = (int[]) k2;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k2 instanceof double[]) {
                double[] dArr = (double[]) k2;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k2 instanceof Rational[])) {
                return null;
            } else {
                Rational[] rationalArr = (Rational[]) k2;
                while (i2 < rationalArr.length) {
                    sb.append(rationalArr[i2].f21470a);
                    sb.append('/');
                    sb.append(rationalArr[i2].f21471b);
                    i2++;
                    if (i2 != rationalArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:162:0x018f A[SYNTHETIC, Splitter:B:162:0x018f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object k(java.nio.ByteOrder r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "IOException occurred while closing InputStream"
                java.lang.String r3 = "ExifInterface"
                r4 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                byte[] r6 = r11.f21465d     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.<init>((byte[]) r6)     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.d(r12)     // Catch:{ IOException -> 0x0033 }
                int r12 = r11.f21462a     // Catch:{ IOException -> 0x0033 }
                switch(r12) {
                    case 1: goto L_0x0149;
                    case 2: goto L_0x0103;
                    case 3: goto L_0x00ea;
                    case 4: goto L_0x00d1;
                    case 5: goto L_0x00af;
                    case 6: goto L_0x0149;
                    case 7: goto L_0x0103;
                    case 8: goto L_0x0096;
                    case 9: goto L_0x007d;
                    case 10: goto L_0x0059;
                    case 11: goto L_0x003f;
                    case 12: goto L_0x001f;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r5.close()     // Catch:{ IOException -> 0x001a }
                goto L_0x001e
            L_0x001a:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x001e:
                return r4
            L_0x001f:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0023:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0036
                double r6 = r5.readDouble()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x002f:
                r12 = move-exception
                r4 = r5
                goto L_0x018d
            L_0x0033:
                r12 = move-exception
                goto L_0x017d
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003e
            L_0x003a:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x003e:
                return r12
            L_0x003f:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0043:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0050
                float r6 = r5.readFloat()     // Catch:{ IOException -> 0x0033 }
                double r6 = (double) r6     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0043
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0058:
                return r12
            L_0x0059:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.ExifInterface$Rational[] r12 = new androidx.exifinterface.media.ExifInterface.Rational[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x005d:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0074
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r6 = (long) r6     // Catch:{ IOException -> 0x0033 }
                int r8 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r8 = (long) r8     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.ExifInterface$Rational r10 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x005d
            L_0x0074:
                r5.close()     // Catch:{ IOException -> 0x0078 }
                goto L_0x007c
            L_0x0078:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x007c:
                return r12
            L_0x007d:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0081:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x008d
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0081
            L_0x008d:
                r5.close()     // Catch:{ IOException -> 0x0091 }
                goto L_0x0095
            L_0x0091:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0095:
                return r12
            L_0x0096:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x009a:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00a6
                short r6 = r5.readShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x009a
            L_0x00a6:
                r5.close()     // Catch:{ IOException -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00ae:
                return r12
            L_0x00af:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.ExifInterface$Rational[] r12 = new androidx.exifinterface.media.ExifInterface.Rational[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00b3:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00c8
                long r6 = r5.c()     // Catch:{ IOException -> 0x0033 }
                long r8 = r5.c()     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.ExifInterface$Rational r10 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00b3
            L_0x00c8:
                r5.close()     // Catch:{ IOException -> 0x00cc }
                goto L_0x00d0
            L_0x00cc:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00d0:
                return r12
            L_0x00d1:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                long[] r12 = new long[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00d5:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00e1
                long r6 = r5.c()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00d5
            L_0x00e1:
                r5.close()     // Catch:{ IOException -> 0x00e5 }
                goto L_0x00e9
            L_0x00e5:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00e9:
                return r12
            L_0x00ea:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00ee:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00fa
                int r6 = r5.readUnsignedShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00ee
            L_0x00fa:
                r5.close()     // Catch:{ IOException -> 0x00fe }
                goto L_0x0102
            L_0x00fe:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0102:
                return r12
            L_0x0103:
                int r12 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                byte[] r6 = androidx.exifinterface.media.ExifInterface.X     // Catch:{ IOException -> 0x0033 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 < r6) goto L_0x011c
                r12 = r0
            L_0x010b:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.X     // Catch:{ IOException -> 0x0033 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 >= r7) goto L_0x011b
                byte[] r7 = r11.f21465d     // Catch:{ IOException -> 0x0033 }
                byte r7 = r7[r12]     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r12]     // Catch:{ IOException -> 0x0033 }
                if (r7 == r6) goto L_0x0119
                goto L_0x011c
            L_0x0119:
                int r12 = r12 + r1
                goto L_0x010b
            L_0x011b:
                int r0 = r6.length     // Catch:{ IOException -> 0x0033 }
            L_0x011c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033 }
                r12.<init>()     // Catch:{ IOException -> 0x0033 }
            L_0x0121:
                int r6 = r11.f21463b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x013c
                byte[] r6 = r11.f21465d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 != 0) goto L_0x012c
                goto L_0x013c
            L_0x012c:
                r7 = 32
                if (r6 < r7) goto L_0x0135
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
                goto L_0x013a
            L_0x0135:
                r6 = 63
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
            L_0x013a:
                int r0 = r0 + r1
                goto L_0x0121
            L_0x013c:
                java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0144 }
                goto L_0x0148
            L_0x0144:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0148:
                return r12
            L_0x0149:
                byte[] r12 = r11.f21465d     // Catch:{ IOException -> 0x0033 }
                int r6 = r12.length     // Catch:{ IOException -> 0x0033 }
                if (r6 != r1) goto L_0x0169
                byte r6 = r12[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 < 0) goto L_0x0169
                if (r6 > r1) goto L_0x0169
                java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0033 }
                r1[r0] = r6     // Catch:{ IOException -> 0x0033 }
                r12.<init>(r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0164 }
                goto L_0x0168
            L_0x0164:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0168:
                return r12
            L_0x0169:
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                java.nio.charset.Charset r1 = androidx.exifinterface.media.ExifInterface.o0     // Catch:{ IOException -> 0x0033 }
                r0.<init>(r12, r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0174 }
                goto L_0x0178
            L_0x0174:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x0178:
                return r0
            L_0x0179:
                r12 = move-exception
                goto L_0x018d
            L_0x017b:
                r12 = move-exception
                r5 = r4
            L_0x017d:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r3, r0, r12)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x018c
                r5.close()     // Catch:{ IOException -> 0x0188 }
                goto L_0x018c
            L_0x0188:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x018c:
                return r4
            L_0x018d:
                if (r4 == 0) goto L_0x0197
                r4.close()     // Catch:{ IOException -> 0x0193 }
                goto L_0x0197
            L_0x0193:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0197:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + ExifInterface.V[this.f21462a] + ", data length:" + this.f21465d.length + ")";
        }

        public ExifAttribute(int i2, int i3, long j2, byte[] bArr) {
            this.f21462a = i2;
            this.f21463b = i3;
            this.f21464c = j2;
            this.f21465d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    public static class Rational {

        /* renamed from: a  reason: collision with root package name */
        public final long f21470a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21471b;

        public Rational(long j2, long j3) {
            if (j3 == 0) {
                this.f21470a = 0;
                this.f21471b = 1;
                return;
            }
            this.f21470a = j2;
            this.f21471b = j3;
        }

        public double a() {
            return ((double) this.f21470a) / ((double) this.f21471b);
        }

        public String toString() {
            return this.f21470a + "/" + this.f21471b;
        }
    }

    static {
        ExifTag exifTag = r12;
        ExifTag exifTag2 = new ExifTag("NewSubfileType", 254, 4);
        ExifTag exifTag3 = r6;
        ExifTag exifTag4 = new ExifTag("SubfileType", 255, 4);
        ExifTag exifTag5 = r6;
        ExifTag exifTag6 = new ExifTag("ImageWidth", 256, 3, 4);
        ExifTag exifTag7 = r6;
        ExifTag exifTag8 = new ExifTag("ImageLength", 257, 3, 4);
        ExifTag exifTag9 = r6;
        ExifTag exifTag10 = new ExifTag("BitsPerSample", 258, 3);
        ExifTag exifTag11 = r6;
        ExifTag exifTag12 = new ExifTag("Compression", 259, 3);
        ExifTag exifTag13 = r6;
        ExifTag exifTag14 = new ExifTag("PhotometricInterpretation", 262, 3);
        ExifTag exifTag15 = r6;
        ExifTag exifTag16 = new ExifTag("ImageDescription", 270, 2);
        ExifTag exifTag17 = r6;
        ExifTag exifTag18 = new ExifTag("Make", 271, 2);
        ExifTag exifTag19 = r6;
        ExifTag exifTag20 = new ExifTag("Model", 272, 2);
        ExifTag exifTag21 = r6;
        ExifTag exifTag22 = new ExifTag("StripOffsets", 273, 3, 4);
        ExifTag exifTag23 = r6;
        ExifTag exifTag24 = new ExifTag("Orientation", 274, 3);
        ExifTag exifTag25 = r0;
        ExifTag exifTag26 = new ExifTag("SamplesPerPixel", 277, 3);
        ExifTag exifTag27 = r0;
        ExifTag exifTag28 = new ExifTag("RowsPerStrip", 278, 3, 4);
        ExifTag exifTag29 = r0;
        ExifTag exifTag30 = new ExifTag("StripByteCounts", 279, 3, 4);
        ExifTag exifTag31 = r0;
        ExifTag exifTag32 = new ExifTag("XResolution", 282, 5);
        ExifTag exifTag33 = r0;
        ExifTag exifTag34 = new ExifTag("YResolution", 283, 5);
        ExifTag exifTag35 = r0;
        ExifTag exifTag36 = new ExifTag("PlanarConfiguration", 284, 3);
        ExifTag exifTag37 = r0;
        ExifTag exifTag38 = new ExifTag("ResolutionUnit", 296, 3);
        ExifTag exifTag39 = r0;
        ExifTag exifTag40 = new ExifTag("TransferFunction", 301, 3);
        ExifTag exifTag41 = r0;
        ExifTag exifTag42 = new ExifTag("Software", 305, 2);
        ExifTag exifTag43 = r0;
        ExifTag exifTag44 = new ExifTag("DateTime", 306, 2);
        ExifTag exifTag45 = r0;
        ExifTag exifTag46 = new ExifTag("Artist", 315, 2);
        ExifTag exifTag47 = r0;
        ExifTag exifTag48 = new ExifTag("WhitePoint", 318, 5);
        ExifTag exifTag49 = r0;
        ExifTag exifTag50 = new ExifTag("PrimaryChromaticities", 319, 5);
        ExifTag exifTag51 = r0;
        ExifTag exifTag52 = new ExifTag("SubIFDPointer", 330, 4);
        ExifTag exifTag53 = r0;
        ExifTag exifTag54 = new ExifTag("JPEGInterchangeFormat", 513, 4);
        ExifTag exifTag55 = r0;
        ExifTag exifTag56 = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
        ExifTag exifTag57 = r0;
        ExifTag exifTag58 = new ExifTag("YCbCrCoefficients", 529, 5);
        ExifTag exifTag59 = r0;
        ExifTag exifTag60 = new ExifTag("YCbCrSubSampling", 530, 3);
        ExifTag exifTag61 = r0;
        ExifTag exifTag62 = new ExifTag("YCbCrPositioning", 531, 3);
        ExifTag exifTag63 = r0;
        ExifTag exifTag64 = new ExifTag("ReferenceBlackWhite", 532, 5);
        ExifTag exifTag65 = r0;
        ExifTag exifTag66 = new ExifTag("Copyright", 33432, 2);
        ExifTag exifTag67 = r0;
        ExifTag exifTag68 = new ExifTag("ExifIFDPointer", 34665, 4);
        ExifTag exifTag69 = r0;
        ExifTag exifTag70 = new ExifTag("GPSInfoIFDPointer", 34853, 4);
        ExifTag exifTag71 = r0;
        ExifTag exifTag72 = new ExifTag("SensorTopBorder", 4, 4);
        ExifTag exifTag73 = r0;
        ExifTag exifTag74 = new ExifTag("SensorLeftBorder", 5, 4);
        ExifTag exifTag75 = r0;
        ExifTag exifTag76 = new ExifTag("SensorBottomBorder", 6, 4);
        ExifTag exifTag77 = r0;
        ExifTag exifTag78 = new ExifTag("SensorRightBorder", 7, 4);
        ExifTag exifTag79 = r0;
        ExifTag exifTag80 = new ExifTag("ISO", 23, 3);
        ExifTag exifTag81 = r0;
        ExifTag exifTag82 = new ExifTag("JpgFromRaw", 46, 7);
        ExifTag exifTag83 = r0;
        ExifTag exifTag84 = new ExifTag("Xmp", 700, 1);
        ExifTag[] exifTagArr = {exifTag, exifTag3, exifTag5, exifTag7, exifTag9, exifTag11, exifTag13, exifTag15, exifTag17, exifTag19, exifTag21, exifTag23, exifTag25, exifTag27, exifTag29, exifTag31, exifTag33, exifTag35, exifTag37, exifTag39, exifTag41, exifTag43, exifTag45, exifTag47, exifTag49, exifTag51, exifTag53, exifTag55, exifTag57, exifTag59, exifTag61, exifTag63, exifTag65, exifTag67, exifTag69, exifTag71, exifTag73, exifTag75, exifTag77, exifTag79, exifTag81, exifTag83};
        Y = exifTagArr;
        ExifTag exifTag85 = r0;
        ExifTag exifTag86 = new ExifTag("ExposureTime", 33434, 5);
        ExifTag exifTag87 = r0;
        ExifTag exifTag88 = new ExifTag("FNumber", 33437, 5);
        ExifTag exifTag89 = r0;
        ExifTag exifTag90 = new ExifTag("ExposureProgram", 34850, 3);
        ExifTag exifTag91 = r0;
        ExifTag exifTag92 = new ExifTag("SpectralSensitivity", 34852, 2);
        ExifTag exifTag93 = r0;
        ExifTag exifTag94 = new ExifTag("PhotographicSensitivity", 34855, 3);
        ExifTag exifTag95 = r0;
        ExifTag exifTag96 = new ExifTag("OECF", 34856, 7);
        ExifTag exifTag97 = r0;
        ExifTag exifTag98 = new ExifTag("SensitivityType", 34864, 3);
        ExifTag exifTag99 = r0;
        ExifTag exifTag100 = new ExifTag("StandardOutputSensitivity", 34865, 4);
        ExifTag exifTag101 = r0;
        ExifTag exifTag102 = new ExifTag("RecommendedExposureIndex", 34866, 4);
        ExifTag exifTag103 = r0;
        ExifTag exifTag104 = new ExifTag("ISOSpeed", 34867, 4);
        ExifTag exifTag105 = r0;
        ExifTag exifTag106 = new ExifTag("ISOSpeedLatitudeyyy", 34868, 4);
        ExifTag exifTag107 = r0;
        ExifTag exifTag108 = new ExifTag("ISOSpeedLatitudezzz", 34869, 4);
        ExifTag exifTag109 = r0;
        ExifTag exifTag110 = new ExifTag("ExifVersion", 36864, 2);
        ExifTag exifTag111 = r0;
        ExifTag exifTag112 = new ExifTag("DateTimeOriginal", 36867, 2);
        ExifTag exifTag113 = r0;
        ExifTag exifTag114 = new ExifTag("DateTimeDigitized", 36868, 2);
        ExifTag exifTag115 = r0;
        ExifTag exifTag116 = new ExifTag("OffsetTime", 36880, 2);
        ExifTag exifTag117 = r0;
        ExifTag exifTag118 = new ExifTag("OffsetTimeOriginal", 36881, 2);
        ExifTag exifTag119 = r0;
        ExifTag exifTag120 = new ExifTag("OffsetTimeDigitized", 36882, 2);
        ExifTag exifTag121 = r0;
        ExifTag exifTag122 = new ExifTag("ComponentsConfiguration", 37121, 7);
        ExifTag exifTag123 = r0;
        ExifTag exifTag124 = new ExifTag("CompressedBitsPerPixel", 37122, 5);
        ExifTag exifTag125 = r0;
        ExifTag exifTag126 = new ExifTag("ShutterSpeedValue", 37377, 10);
        ExifTag exifTag127 = r0;
        ExifTag exifTag128 = new ExifTag("ApertureValue", 37378, 5);
        ExifTag exifTag129 = r0;
        ExifTag exifTag130 = new ExifTag("BrightnessValue", 37379, 10);
        ExifTag exifTag131 = r0;
        ExifTag exifTag132 = new ExifTag("ExposureBiasValue", 37380, 10);
        ExifTag exifTag133 = r0;
        ExifTag exifTag134 = new ExifTag("MaxApertureValue", 37381, 5);
        ExifTag exifTag135 = r0;
        ExifTag exifTag136 = new ExifTag("SubjectDistance", 37382, 5);
        ExifTag exifTag137 = r0;
        ExifTag exifTag138 = new ExifTag("MeteringMode", 37383, 3);
        ExifTag exifTag139 = r0;
        ExifTag exifTag140 = new ExifTag("LightSource", 37384, 3);
        ExifTag exifTag141 = r0;
        ExifTag exifTag142 = new ExifTag("Flash", 37385, 3);
        ExifTag exifTag143 = r0;
        ExifTag exifTag144 = new ExifTag("FocalLength", 37386, 5);
        ExifTag exifTag145 = r0;
        ExifTag exifTag146 = new ExifTag("SubjectArea", 37396, 3);
        ExifTag exifTag147 = r0;
        ExifTag exifTag148 = new ExifTag("MakerNote", 37500, 7);
        ExifTag exifTag149 = r0;
        ExifTag exifTag150 = new ExifTag("UserComment", 37510, 7);
        ExifTag exifTag151 = r0;
        ExifTag exifTag152 = new ExifTag("SubSecTime", 37520, 2);
        ExifTag exifTag153 = r0;
        ExifTag exifTag154 = new ExifTag("SubSecTimeOriginal", 37521, 2);
        ExifTag exifTag155 = r0;
        ExifTag exifTag156 = new ExifTag("SubSecTimeDigitized", 37522, 2);
        ExifTag exifTag157 = r0;
        ExifTag exifTag158 = new ExifTag("FlashpixVersion", 40960, 7);
        ExifTag exifTag159 = r0;
        ExifTag exifTag160 = new ExifTag("ColorSpace", 40961, 3);
        ExifTag exifTag161 = r0;
        ExifTag exifTag162 = new ExifTag("PixelXDimension", 40962, 3, 4);
        ExifTag exifTag163 = r0;
        ExifTag exifTag164 = new ExifTag("PixelYDimension", 40963, 3, 4);
        ExifTag exifTag165 = r0;
        ExifTag exifTag166 = new ExifTag("RelatedSoundFile", 40964, 2);
        ExifTag exifTag167 = r0;
        ExifTag exifTag168 = new ExifTag("InteroperabilityIFDPointer", 40965, 4);
        ExifTag exifTag169 = r0;
        ExifTag exifTag170 = new ExifTag("FlashEnergy", 41483, 5);
        ExifTag exifTag171 = r0;
        ExifTag exifTag172 = new ExifTag("SpatialFrequencyResponse", 41484, 7);
        ExifTag exifTag173 = r0;
        ExifTag exifTag174 = new ExifTag("FocalPlaneXResolution", 41486, 5);
        ExifTag exifTag175 = r0;
        ExifTag exifTag176 = new ExifTag("FocalPlaneYResolution", 41487, 5);
        ExifTag exifTag177 = r0;
        ExifTag exifTag178 = new ExifTag("FocalPlaneResolutionUnit", 41488, 3);
        ExifTag exifTag179 = r0;
        ExifTag exifTag180 = new ExifTag("SubjectLocation", 41492, 3);
        ExifTag exifTag181 = r0;
        ExifTag exifTag182 = new ExifTag("ExposureIndex", 41493, 5);
        ExifTag exifTag183 = r0;
        ExifTag exifTag184 = new ExifTag("SensingMethod", 41495, 3);
        ExifTag exifTag185 = r0;
        ExifTag exifTag186 = new ExifTag("FileSource", 41728, 7);
        ExifTag exifTag187 = r0;
        ExifTag exifTag188 = new ExifTag("SceneType", 41729, 7);
        ExifTag exifTag189 = r0;
        ExifTag exifTag190 = new ExifTag("CFAPattern", 41730, 7);
        ExifTag exifTag191 = r0;
        ExifTag exifTag192 = new ExifTag("CustomRendered", 41985, 3);
        ExifTag exifTag193 = r0;
        ExifTag exifTag194 = new ExifTag("ExposureMode", 41986, 3);
        ExifTag exifTag195 = r0;
        ExifTag exifTag196 = new ExifTag("WhiteBalance", 41987, 3);
        ExifTag exifTag197 = r0;
        ExifTag exifTag198 = new ExifTag("DigitalZoomRatio", 41988, 5);
        ExifTag exifTag199 = r0;
        ExifTag exifTag200 = new ExifTag("FocalLengthIn35mmFilm", 41989, 3);
        ExifTag exifTag201 = r0;
        ExifTag exifTag202 = new ExifTag("SceneCaptureType", 41990, 3);
        ExifTag exifTag203 = r0;
        ExifTag exifTag204 = new ExifTag("GainControl", 41991, 3);
        ExifTag exifTag205 = r0;
        ExifTag exifTag206 = new ExifTag("Contrast", 41992, 3);
        ExifTag exifTag207 = r0;
        ExifTag exifTag208 = new ExifTag("Saturation", 41993, 3);
        ExifTag exifTag209 = r0;
        ExifTag exifTag210 = new ExifTag("Sharpness", 41994, 3);
        ExifTag exifTag211 = r0;
        ExifTag exifTag212 = new ExifTag("DeviceSettingDescription", 41995, 7);
        ExifTag exifTag213 = r0;
        ExifTag exifTag214 = new ExifTag("SubjectDistanceRange", 41996, 3);
        ExifTag exifTag215 = r0;
        ExifTag exifTag216 = new ExifTag("ImageUniqueID", 42016, 2);
        ExifTag exifTag217 = r0;
        ExifTag exifTag218 = new ExifTag("CameraOwnerName", 42032, 2);
        ExifTag exifTag219 = r0;
        ExifTag exifTag220 = new ExifTag("BodySerialNumber", 42033, 2);
        ExifTag exifTag221 = r0;
        ExifTag exifTag222 = new ExifTag("LensSpecification", 42034, 5);
        ExifTag exifTag223 = r0;
        ExifTag exifTag224 = new ExifTag("LensMake", 42035, 2);
        ExifTag exifTag225 = r0;
        ExifTag exifTag226 = new ExifTag("LensModel", 42036, 2);
        ExifTag exifTag227 = r0;
        ExifTag exifTag228 = new ExifTag("Gamma", 42240, 5);
        ExifTag exifTag229 = r0;
        ExifTag exifTag230 = new ExifTag("DNGVersion", 50706, 1);
        ExifTag exifTag231 = r0;
        ExifTag exifTag232 = new ExifTag("DefaultCropSize", 50720, 3, 4);
        ExifTag[] exifTagArr2 = {exifTag85, exifTag87, exifTag89, exifTag91, exifTag93, exifTag95, exifTag97, exifTag99, exifTag101, exifTag103, exifTag105, exifTag107, exifTag109, exifTag111, exifTag113, exifTag115, exifTag117, exifTag119, exifTag121, exifTag123, exifTag125, exifTag127, exifTag129, exifTag131, exifTag133, exifTag135, exifTag137, exifTag139, exifTag141, exifTag143, exifTag145, exifTag147, exifTag149, exifTag151, exifTag153, exifTag155, exifTag157, exifTag159, exifTag161, exifTag163, exifTag165, exifTag167, exifTag169, exifTag171, exifTag173, exifTag175, exifTag177, exifTag179, exifTag181, exifTag183, exifTag185, exifTag187, exifTag189, exifTag191, exifTag193, exifTag195, exifTag197, exifTag199, exifTag201, exifTag203, exifTag205, exifTag207, exifTag209, exifTag211, exifTag213, exifTag215, exifTag217, exifTag219, exifTag221, exifTag223, exifTag225, exifTag227, exifTag229, exifTag231};
        Z = exifTagArr2;
        ExifTag exifTag233 = r0;
        ExifTag exifTag234 = new ExifTag("GPSVersionID", 0, 1);
        ExifTag exifTag235 = r0;
        ExifTag exifTag236 = new ExifTag("GPSLatitudeRef", 1, 2);
        ExifTag exifTag237 = r0;
        ExifTag exifTag238 = new ExifTag("GPSLatitude", 2, 5, 10);
        ExifTag exifTag239 = r0;
        ExifTag exifTag240 = new ExifTag("GPSLongitudeRef", 3, 2);
        ExifTag exifTag241 = r0;
        ExifTag exifTag242 = new ExifTag("GPSLongitude", 4, 5, 10);
        ExifTag exifTag243 = r0;
        ExifTag exifTag244 = new ExifTag("GPSAltitudeRef", 5, 1);
        ExifTag exifTag245 = r0;
        ExifTag exifTag246 = new ExifTag("GPSAltitude", 6, 5);
        ExifTag exifTag247 = r0;
        ExifTag exifTag248 = new ExifTag("GPSTimeStamp", 7, 5);
        ExifTag exifTag249 = r0;
        ExifTag exifTag250 = new ExifTag("GPSSatellites", 8, 2);
        ExifTag exifTag251 = r0;
        ExifTag exifTag252 = new ExifTag("GPSStatus", 9, 2);
        ExifTag exifTag253 = r0;
        ExifTag exifTag254 = new ExifTag("GPSMeasureMode", 10, 2);
        ExifTag exifTag255 = r0;
        ExifTag exifTag256 = new ExifTag("GPSDOP", 11, 5);
        ExifTag exifTag257 = r0;
        ExifTag exifTag258 = new ExifTag("GPSSpeedRef", 12, 2);
        ExifTag exifTag259 = r0;
        ExifTag exifTag260 = new ExifTag("GPSSpeed", 13, 5);
        ExifTag exifTag261 = r0;
        ExifTag exifTag262 = new ExifTag("GPSTrackRef", 14, 2);
        ExifTag exifTag263 = r0;
        ExifTag exifTag264 = new ExifTag("GPSTrack", 15, 5);
        ExifTag exifTag265 = r0;
        ExifTag exifTag266 = new ExifTag("GPSImgDirectionRef", 16, 2);
        ExifTag exifTag267 = r0;
        ExifTag exifTag268 = new ExifTag("GPSImgDirection", 17, 5);
        ExifTag exifTag269 = r0;
        ExifTag exifTag270 = new ExifTag("GPSMapDatum", 18, 2);
        ExifTag exifTag271 = r0;
        ExifTag exifTag272 = new ExifTag("GPSDestLatitudeRef", 19, 2);
        ExifTag exifTag273 = r0;
        ExifTag exifTag274 = new ExifTag("GPSDestLatitude", 20, 5);
        ExifTag exifTag275 = r0;
        ExifTag exifTag276 = new ExifTag("GPSDestLongitudeRef", 21, 2);
        ExifTag exifTag277 = r0;
        ExifTag exifTag278 = new ExifTag("GPSDestLongitude", 22, 5);
        ExifTag exifTag279 = r0;
        ExifTag exifTag280 = new ExifTag("GPSDestBearingRef", 23, 2);
        ExifTag exifTag281 = r0;
        ExifTag exifTag282 = new ExifTag("GPSDestBearing", 24, 5);
        ExifTag exifTag283 = r0;
        ExifTag exifTag284 = new ExifTag("GPSDestDistanceRef", 25, 2);
        ExifTag exifTag285 = r0;
        ExifTag exifTag286 = new ExifTag("GPSDestDistance", 26, 5);
        ExifTag exifTag287 = r0;
        ExifTag exifTag288 = new ExifTag("GPSProcessingMethod", 27, 7);
        ExifTag exifTag289 = r0;
        ExifTag exifTag290 = new ExifTag("GPSAreaInformation", 28, 7);
        ExifTag exifTag291 = r0;
        ExifTag exifTag292 = new ExifTag("GPSDateStamp", 29, 2);
        ExifTag exifTag293 = r0;
        ExifTag exifTag294 = new ExifTag("GPSDifferential", 30, 3);
        ExifTag exifTag295 = r0;
        ExifTag exifTag296 = new ExifTag("GPSHPositioningError", 31, 5);
        ExifTag[] exifTagArr3 = {exifTag233, exifTag235, exifTag237, exifTag239, exifTag241, exifTag243, exifTag245, exifTag247, exifTag249, exifTag251, exifTag253, exifTag255, exifTag257, exifTag259, exifTag261, exifTag263, exifTag265, exifTag267, exifTag269, exifTag271, exifTag273, exifTag275, exifTag277, exifTag279, exifTag281, exifTag283, exifTag285, exifTag287, exifTag289, exifTag291, exifTag293, exifTag295};
        a0 = exifTagArr3;
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        b0 = exifTagArr4;
        ExifTag exifTag297 = r0;
        ExifTag exifTag298 = new ExifTag("NewSubfileType", 254, 4);
        ExifTag exifTag299 = r0;
        ExifTag exifTag300 = new ExifTag("SubfileType", 255, 4);
        ExifTag exifTag301 = r0;
        ExifTag exifTag302 = new ExifTag("ThumbnailImageWidth", 256, 3, 4);
        ExifTag exifTag303 = r0;
        ExifTag exifTag304 = new ExifTag("ThumbnailImageLength", 257, 3, 4);
        ExifTag exifTag305 = r0;
        ExifTag exifTag306 = new ExifTag("BitsPerSample", 258, 3);
        ExifTag exifTag307 = r0;
        ExifTag exifTag308 = new ExifTag("Compression", 259, 3);
        ExifTag exifTag309 = r0;
        ExifTag exifTag310 = new ExifTag("PhotometricInterpretation", 262, 3);
        ExifTag exifTag311 = r0;
        ExifTag exifTag312 = new ExifTag("ImageDescription", 270, 2);
        ExifTag exifTag313 = r0;
        ExifTag exifTag314 = new ExifTag("Make", 271, 2);
        ExifTag exifTag315 = r0;
        ExifTag exifTag316 = new ExifTag("Model", 272, 2);
        ExifTag exifTag317 = r0;
        ExifTag exifTag318 = new ExifTag("StripOffsets", 273, 3, 4);
        ExifTag exifTag319 = r0;
        ExifTag exifTag320 = new ExifTag("ThumbnailOrientation", 274, 3);
        ExifTag exifTag321 = r0;
        ExifTag exifTag322 = new ExifTag("SamplesPerPixel", 277, 3);
        ExifTag exifTag323 = r0;
        ExifTag exifTag324 = new ExifTag("RowsPerStrip", 278, 3, 4);
        ExifTag exifTag325 = r0;
        ExifTag exifTag326 = new ExifTag("StripByteCounts", 279, 3, 4);
        ExifTag exifTag327 = r0;
        ExifTag exifTag328 = new ExifTag("XResolution", 282, 5);
        ExifTag exifTag329 = r0;
        ExifTag exifTag330 = new ExifTag("YResolution", 283, 5);
        ExifTag exifTag331 = r0;
        ExifTag exifTag332 = new ExifTag("PlanarConfiguration", 284, 3);
        ExifTag exifTag333 = r0;
        ExifTag exifTag334 = new ExifTag("ResolutionUnit", 296, 3);
        ExifTag exifTag335 = r0;
        ExifTag exifTag336 = new ExifTag("TransferFunction", 301, 3);
        ExifTag exifTag337 = r0;
        ExifTag exifTag338 = new ExifTag("Software", 305, 2);
        ExifTag exifTag339 = r0;
        ExifTag exifTag340 = new ExifTag("DateTime", 306, 2);
        ExifTag exifTag341 = r0;
        ExifTag exifTag342 = new ExifTag("Artist", 315, 2);
        ExifTag exifTag343 = r0;
        ExifTag exifTag344 = new ExifTag("WhitePoint", 318, 5);
        ExifTag exifTag345 = r0;
        ExifTag exifTag346 = new ExifTag("PrimaryChromaticities", 319, 5);
        ExifTag exifTag347 = r0;
        ExifTag exifTag348 = new ExifTag("SubIFDPointer", 330, 4);
        ExifTag exifTag349 = r0;
        ExifTag exifTag350 = new ExifTag("JPEGInterchangeFormat", 513, 4);
        ExifTag exifTag351 = r0;
        ExifTag exifTag352 = new ExifTag("JPEGInterchangeFormatLength", 514, 4);
        ExifTag exifTag353 = r0;
        ExifTag exifTag354 = new ExifTag("YCbCrCoefficients", 529, 5);
        ExifTag exifTag355 = r0;
        ExifTag exifTag356 = new ExifTag("YCbCrSubSampling", 530, 3);
        ExifTag exifTag357 = r0;
        ExifTag exifTag358 = new ExifTag("YCbCrPositioning", 531, 3);
        ExifTag exifTag359 = r0;
        ExifTag exifTag360 = new ExifTag("ReferenceBlackWhite", 532, 5);
        ExifTag exifTag361 = r0;
        ExifTag exifTag362 = new ExifTag("Copyright", 33432, 2);
        ExifTag exifTag363 = r0;
        ExifTag exifTag364 = new ExifTag("ExifIFDPointer", 34665, 4);
        ExifTag exifTag365 = r0;
        ExifTag exifTag366 = new ExifTag("GPSInfoIFDPointer", 34853, 4);
        ExifTag exifTag367 = r0;
        ExifTag exifTag368 = new ExifTag("DNGVersion", 50706, 1);
        ExifTag exifTag369 = r0;
        ExifTag exifTag370 = new ExifTag("DefaultCropSize", 50720, 3, 4);
        ExifTag[] exifTagArr5 = {exifTag297, exifTag299, exifTag301, exifTag303, exifTag305, exifTag307, exifTag309, exifTag311, exifTag313, exifTag315, exifTag317, exifTag319, exifTag321, exifTag323, exifTag325, exifTag327, exifTag329, exifTag331, exifTag333, exifTag335, exifTag337, exifTag339, exifTag341, exifTag343, exifTag345, exifTag347, exifTag349, exifTag351, exifTag353, exifTag355, exifTag357, exifTag359, exifTag361, exifTag363, exifTag365, exifTag367, exifTag369};
        c0 = exifTagArr5;
        ExifTag[] exifTagArr6 = {new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)};
        e0 = exifTagArr6;
        ExifTag[] exifTagArr7 = {new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)};
        f0 = exifTagArr7;
        ExifTag[] exifTagArr8 = {new ExifTag("AspectFrame", 4371, 3)};
        g0 = exifTagArr8;
        ExifTag[] exifTagArr9 = {new ExifTag("ColorSpace", 55, 3)};
        h0 = exifTagArr9;
        ExifTag[][] exifTagArr10 = {exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, exifTagArr6, exifTagArr7, exifTagArr8, exifTagArr9};
        i0 = exifTagArr10;
        k0 = new HashMap[exifTagArr10.length];
        l0 = new HashMap[exifTagArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        o0 = forName;
        p0 = "Exif\u0000\u0000".getBytes(forName);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr11 = i0;
            if (i2 < exifTagArr11.length) {
                k0[i2] = new HashMap();
                l0[i2] = new HashMap();
                for (ExifTag exifTag371 : exifTagArr11[i2]) {
                    k0[i2].put(Integer.valueOf(exifTag371.f21466a), exifTag371);
                    l0[i2].put(exifTag371.f21467b, exifTag371);
                }
                i2++;
            } else {
                HashMap hashMap = n0;
                ExifTag[] exifTagArr12 = j0;
                hashMap.put(Integer.valueOf(exifTagArr12[0].f21466a), 5);
                hashMap.put(Integer.valueOf(exifTagArr12[1].f21466a), 1);
                hashMap.put(Integer.valueOf(exifTagArr12[2].f21466a), 2);
                hashMap.put(Integer.valueOf(exifTagArr12[3].f21466a), 3);
                hashMap.put(Integer.valueOf(exifTagArr12[4].f21466a), 7);
                hashMap.put(Integer.valueOf(exifTagArr12[5].f21466a), 8);
                return;
            }
        }
    }

    public ExifInterface(InputStream inputStream) {
        this(inputStream, 0);
    }

    public static boolean M(int i2) {
        return (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) ? false : true;
    }

    public static boolean r(BufferedInputStream bufferedInputStream) {
        byte[] bArr = p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr3 = p0;
            if (i2 >= bArr3.length) {
                return true;
            }
            if (bArr2[i2] != bArr3[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static boolean u(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f21427A;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static boolean z(FileDescriptor fileDescriptor) {
        try {
            ExifInterfaceUtils.Api21Impl.c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f21429u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public final boolean A(HashMap hashMap) {
        ExifAttribute exifAttribute;
        int i2;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("BitsPerSample");
        if (exifAttribute2 != null) {
            int[] iArr = (int[]) exifAttribute2.k(this.f21442h);
            int[] iArr2 = f21432x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f21438d == 3 && (exifAttribute = (ExifAttribute) hashMap.get("PhotometricInterpretation")) != null && (((i2 = exifAttribute.i(this.f21442h)) == 1 && Arrays.equals(iArr, f21434z)) || (i2 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f21429u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public final boolean B(HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.i(this.f21442h) <= 512 && exifAttribute2.i(this.f21442h) <= 512;
    }

    public final boolean C(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i2 >= bArr2.length) {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i3 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i3 + 4] != bArr3[i3]) {
                        return false;
                    }
                    i3++;
                }
            } else if (bArr[i2] != bArr2[i2]) {
                return false;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
        L_0x0004:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = i0     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r2 = r2.length     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 >= r2) goto L_0x001e
            java.util.HashMap[] r2 = r4.f21440f     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r3.<init>()     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2[r1] = r3     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            r5 = move-exception
            goto L_0x00ad
        L_0x0018:
            r5 = move-exception
            goto L_0x009b
        L_0x001b:
            r5 = move-exception
            goto L_0x009b
        L_0x001e:
            boolean r1 = r4.f21439e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 != 0) goto L_0x0030
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.g(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.f21438d = r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r5 = r1
        L_0x0030:
            int r1 = r4.f21438d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r1 = M(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 == 0) goto L_0x006b
            androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r5 = r4.f21439e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r5 == 0) goto L_0x0045
            r4.n(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0045:
            int r5 = r4.f21438d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1 = 12
            if (r5 != r1) goto L_0x004f
            r4.e(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x004f:
            r1 = 7
            if (r5 != r1) goto L_0x0056
            r4.h(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0056:
            r1 = 10
            if (r5 != r1) goto L_0x005e
            r4.m(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x005e:
            r4.k(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0061:
            int r5 = r4.f21450p     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            long r1 = (long) r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.g(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.L(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x006b:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.f21438d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 4
            if (r5 != r2) goto L_0x0079
            r4.f(r1, r0, r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0079:
            r0 = 13
            if (r5 != r0) goto L_0x0081
            r4.i(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0081:
            r0 = 9
            if (r5 != r0) goto L_0x0089
            r4.j(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0089:
            r0 = 14
            if (r5 != r0) goto L_0x0090
            r4.o(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0090:
            r4.a()
            boolean r5 = f21429u
            if (r5 == 0) goto L_0x00ac
        L_0x0097:
            r4.F()
            goto L_0x00ac
        L_0x009b:
            boolean r0 = f21429u     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch:{ all -> 0x0015 }
        L_0x00a6:
            r4.a()
            if (r0 == 0) goto L_0x00ac
            goto L_0x0097
        L_0x00ac:
            return
        L_0x00ad:
            r4.a()
            boolean r0 = f21429u
            if (r0 == 0) goto L_0x00b7
            r4.F()
        L_0x00b7:
            throw r5
        L_0x00b8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.D(java.io.InputStream):void");
    }

    public final void E(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ByteOrder G2 = G(byteOrderedDataInputStream);
        this.f21442h = G2;
        byteOrderedDataInputStream.d(G2);
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.f21438d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = byteOrderedDataInputStream.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    byteOrderedDataInputStream.f(i3);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void F() {
        for (int i2 = 0; i2 < this.f21440f.length; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.f21440f[i2].size());
            for (Map.Entry entry : this.f21440f[i2].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.j(this.f21442h) + "'");
            }
        }
    }

    public final ByteOrder G(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            if (f21429u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f21429u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void H(byte[] bArr, int i2) {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        E(seekableByteOrderedDataInputStream);
        I(seekableByteOrderedDataInputStream, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0280  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.util.Set r3 = r0.f21441g
            int r4 = r26.b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r26.readShort()
            boolean r4 = f21429u
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0031
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0031:
            if (r3 > 0) goto L_0x0034
            return
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 >= r3) goto L_0x0341
            int r10 = r26.readUnsignedShort()
            int r11 = r26.readUnsignedShort()
            int r14 = r26.readInt()
            int r12 = r26.b()
            long r12 = (long) r12
            r15 = 4
            long r12 = r12 + r15
            java.util.HashMap[] r17 = k0
            r4 = r17[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r9)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = (androidx.exifinterface.media.ExifInterface.ExifTag) r4
            boolean r9 = f21429u
            if (r9 == 0) goto L_0x0086
            java.lang.Integer r15 = java.lang.Integer.valueOf(r27)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            if (r4 == 0) goto L_0x006c
            java.lang.String r8 = r4.f21467b
        L_0x0069:
            r20 = r3
            goto L_0x006e
        L_0x006c:
            r8 = 0
            goto L_0x0069
        L_0x006e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r21 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r15, r7, r8, r3, r6}
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r5, r3)
            goto L_0x008a
        L_0x0086:
            r20 = r3
            r21 = r6
        L_0x008a:
            r3 = 7
            if (r4 != 0) goto L_0x00a7
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a3:
            r22 = r4
            goto L_0x0125
        L_0x00a7:
            if (r11 <= 0) goto L_0x00ae
            int[] r6 = W
            int r7 = r6.length
            if (r11 < r7) goto L_0x00b1
        L_0x00ae:
            r22 = r4
            goto L_0x010f
        L_0x00b1:
            boolean r7 = r4.a(r11)
            if (r7 != 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = V
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f21467b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto L_0x00a3
        L_0x00dc:
            if (r11 != r3) goto L_0x00e0
            int r11 = r4.f21468c
        L_0x00e0:
            long r7 = (long) r14
            r6 = r6[r11]
            r22 = r4
            long r3 = (long) r6
            long r3 = r3 * r7
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00f7
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 1
            goto L_0x0128
        L_0x00f7:
            if (r9 == 0) goto L_0x010d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x010d:
            r6 = 0
            goto L_0x0128
        L_0x010f:
            if (r9 == 0) goto L_0x0125
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0125:
            r3 = 0
            goto L_0x010d
        L_0x0128:
            if (r6 != 0) goto L_0x012f
            r1.g(r12)
            goto L_0x0338
        L_0x012f:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x01bb
            int r6 = r26.readInt()
            if (r9 == 0) goto L_0x0151
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "seek to data offset: "
            r8.append(r15)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
        L_0x0151:
            int r8 = r0.f21438d
            r15 = 7
            if (r8 != r15) goto L_0x01b0
            r8 = r22
            java.lang.String r15 = r8.f21467b
            r18 = r12
            java.lang.String r12 = "MakerNote"
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0169
            r0.f21451q = r6
        L_0x0166:
            r16 = r14
            goto L_0x01b6
        L_0x0169:
            r12 = 6
            if (r2 != r12) goto L_0x0166
            java.lang.String r13 = "ThumbnailImage"
            java.lang.String r15 = r8.f21467b
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0166
            r0.f21452r = r6
            r0.f21453s = r14
            java.nio.ByteOrder r13 = r0.f21442h
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = androidx.exifinterface.media.ExifInterface.ExifAttribute.f(r12, r13)
            int r13 = r0.f21452r
            r15 = r14
            long r13 = (long) r13
            java.nio.ByteOrder r2 = r0.f21442h
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.b(r13, r2)
            int r13 = r0.f21453s
            long r13 = (long) r13
            r16 = r15
            java.nio.ByteOrder r15 = r0.f21442h
            androidx.exifinterface.media.ExifInterface$ExifAttribute r13 = androidx.exifinterface.media.ExifInterface.ExifAttribute.b(r13, r15)
            java.util.HashMap[] r14 = r0.f21440f
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r12)
            java.util.HashMap[] r12 = r0.f21440f
            r12 = r12[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r12.put(r14, r2)
            java.util.HashMap[] r2 = r0.f21440f
            r2 = r2[r15]
            java.lang.String r12 = "JPEGInterchangeFormatLength"
            r2.put(r12, r13)
            goto L_0x01b6
        L_0x01b0:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01b6:
            long r12 = (long) r6
            r1.g(r12)
            goto L_0x01c1
        L_0x01bb:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01c1:
            java.util.HashMap r2 = n0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r9 == 0) goto L_0x01eb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "nextIfdType: "
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = " byteCount: "
            r6.append(r10)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x01eb:
            r6 = 8
            r10 = 3
            if (r2 == 0) goto L_0x02bd
            if (r11 == r10) goto L_0x0212
            r3 = 4
            if (r11 == r3) goto L_0x020d
            if (r11 == r6) goto L_0x0208
            r3 = 9
            if (r11 == r3) goto L_0x0202
            r3 = 13
            if (r11 == r3) goto L_0x0202
            r3 = -1
            goto L_0x0217
        L_0x0202:
            int r3 = r26.readInt()
        L_0x0206:
            long r3 = (long) r3
            goto L_0x0217
        L_0x0208:
            short r3 = r26.readShort()
            goto L_0x0206
        L_0x020d:
            long r3 = r26.c()
            goto L_0x0217
        L_0x0212:
            int r3 = r26.readUnsignedShort()
            goto L_0x0206
        L_0x0217:
            if (r9 == 0) goto L_0x022c
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.String r7 = r8.f21467b
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x022c:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = ")"
            r8 = -1
            if (r6 <= 0) goto L_0x0280
            int r6 = r26.a()
            if (r6 == r8) goto L_0x0244
            int r6 = r26.a()
            long r10 = (long) r6
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0280
        L_0x0244:
            java.util.Set r6 = r0.f21441g
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x025e
            r1.g(r3)
            int r2 = r2.intValue()
            r0.I(r1, r2)
        L_0x025b:
            r12 = r18
            goto L_0x02b8
        L_0x025e:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x0280:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r26.a()
            if (r3 == r8) goto L_0x02b4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " (total length: "
            r3.append(r2)
            int r2 = r26.a()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
        L_0x02b4:
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x02b8:
            r1.g(r12)
            goto L_0x0338
        L_0x02bd:
            r12 = r18
            int r2 = r26.b()
            int r9 = r0.f21450p
            int r2 = r2 + r9
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r14 = (long) r2
            r23 = r12
            r12 = r4
            r13 = r11
            r18 = r14
            r14 = r16
            r15 = r18
            r17 = r3
            r12.<init>(r13, r14, r15, r17)
            java.util.HashMap[] r2 = r0.f21440f
            r2 = r2[r27]
            java.lang.String r3 = r8.f21467b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.f21467b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02f3
            r0.f21438d = r10
        L_0x02f3:
            java.lang.String r2 = "Make"
            java.lang.String r3 = r8.f21467b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0307
            java.lang.String r2 = "Model"
            java.lang.String r3 = r8.f21467b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0315
        L_0x0307:
            java.nio.ByteOrder r2 = r0.f21442h
            java.lang.String r2 = r4.j(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0328
        L_0x0315:
            java.lang.String r2 = r8.f21467b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x032a
            java.nio.ByteOrder r2 = r0.f21442h
            int r2 = r4.i(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x032a
        L_0x0328:
            r0.f21438d = r6
        L_0x032a:
            int r2 = r26.b()
            long r2 = (long) r2
            r12 = r23
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0338
            r1.g(r12)
        L_0x0338:
            int r6 = r21 + 1
            short r6 = (short) r6
            r2 = r27
            r3 = r20
            goto L_0x0035
        L_0x0341:
            int r2 = r26.readInt()
            boolean r3 = f21429u
            if (r3 == 0) goto L_0x035a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x035a:
            long r6 = (long) r2
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x03a5
            java.util.Set r4 = r0.f21441g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x038e
            r1.g(r6)
            java.util.HashMap[] r2 = r0.f21440f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037f
            r0.I(r1, r3)
            goto L_0x03bb
        L_0x037f:
            java.util.HashMap[] r2 = r0.f21440f
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03bb
            r0.I(r1, r3)
            goto L_0x03bb
        L_0x038e:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L_0x03bb
        L_0x03a5:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.I(androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream, int):void");
    }

    public final void J(int i2, String str, String str2) {
        if (!this.f21440f[i2].isEmpty() && this.f21440f[i2].get(str) != null) {
            HashMap hashMap = this.f21440f[i2];
            hashMap.put(str2, hashMap.get(str));
            this.f21440f[i2].remove(str);
        }
    }

    public final void K(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) {
        ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            ExifAttribute exifAttribute3 = (ExifAttribute) this.f21440f[i2].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute4 = (ExifAttribute) this.f21440f[i2].get("JPEGInterchangeFormatLength");
            if (exifAttribute3 != null && exifAttribute4 != null) {
                int i3 = exifAttribute3.i(this.f21442h);
                int i4 = exifAttribute3.i(this.f21442h);
                seekableByteOrderedDataInputStream.g((long) i3);
                byte[] bArr = new byte[i4];
                seekableByteOrderedDataInputStream.readFully(bArr);
                f(new ByteOrderedDataInputStream(bArr), i3, i2);
            }
        }
    }

    public final void L(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        HashMap hashMap = this.f21440f[4];
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("Compression");
        if (exifAttribute != null) {
            int i2 = exifAttribute.i(this.f21442h);
            this.f21449o = i2;
            if (i2 != 1) {
                if (i2 == 6) {
                    p(byteOrderedDataInputStream, hashMap);
                    return;
                } else if (i2 != 7) {
                    return;
                }
            }
            if (A(hashMap)) {
                q(byteOrderedDataInputStream, hashMap);
                return;
            }
            return;
        }
        this.f21449o = 6;
        p(byteOrderedDataInputStream, hashMap);
    }

    public final void N(int i2, int i3) {
        if (!this.f21440f[i2].isEmpty() && !this.f21440f[i3].isEmpty()) {
            ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[i2].get("ImageLength");
            ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[i2].get("ImageWidth");
            ExifAttribute exifAttribute3 = (ExifAttribute) this.f21440f[i3].get("ImageLength");
            ExifAttribute exifAttribute4 = (ExifAttribute) this.f21440f[i3].get("ImageWidth");
            if (exifAttribute == null || exifAttribute2 == null) {
                if (f21429u) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (exifAttribute3 != null && exifAttribute4 != null) {
                int i4 = exifAttribute.i(this.f21442h);
                int i5 = exifAttribute2.i(this.f21442h);
                int i6 = exifAttribute3.i(this.f21442h);
                int i7 = exifAttribute4.i(this.f21442h);
                if (i4 < i6 && i5 < i7) {
                    HashMap[] hashMapArr = this.f21440f;
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            } else if (f21429u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f21429u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void O(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2;
        ExifAttribute exifAttribute3 = (ExifAttribute) this.f21440f[i2].get("DefaultCropSize");
        ExifAttribute exifAttribute4 = (ExifAttribute) this.f21440f[i2].get("SensorTopBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) this.f21440f[i2].get("SensorLeftBorder");
        ExifAttribute exifAttribute6 = (ExifAttribute) this.f21440f[i2].get("SensorBottomBorder");
        ExifAttribute exifAttribute7 = (ExifAttribute) this.f21440f[i2].get("SensorRightBorder");
        if (exifAttribute3 != null) {
            if (exifAttribute3.f21462a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute3.k(this.f21442h);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                exifAttribute2 = ExifAttribute.d(rationalArr[0], this.f21442h);
                exifAttribute = ExifAttribute.d(rationalArr[1], this.f21442h);
            } else {
                int[] iArr = (int[]) exifAttribute3.k(this.f21442h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttribute2 = ExifAttribute.f(iArr[0], this.f21442h);
                exifAttribute = ExifAttribute.f(iArr[1], this.f21442h);
            }
            this.f21440f[i2].put("ImageWidth", exifAttribute2);
            this.f21440f[i2].put("ImageLength", exifAttribute);
        } else if (exifAttribute4 == null || exifAttribute5 == null || exifAttribute6 == null || exifAttribute7 == null) {
            K(seekableByteOrderedDataInputStream, i2);
        } else {
            int i3 = exifAttribute4.i(this.f21442h);
            int i4 = exifAttribute6.i(this.f21442h);
            int i5 = exifAttribute7.i(this.f21442h);
            int i6 = exifAttribute5.i(this.f21442h);
            if (i4 > i3 && i5 > i6) {
                ExifAttribute f2 = ExifAttribute.f(i4 - i3, this.f21442h);
                ExifAttribute f3 = ExifAttribute.f(i5 - i6, this.f21442h);
                this.f21440f[i2].put("ImageLength", f2);
                this.f21440f[i2].put("ImageWidth", f3);
            }
        }
    }

    public final void P() {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[1].get("PixelYDimension");
        if (!(exifAttribute == null || exifAttribute2 == null)) {
            this.f21440f[0].put("ImageWidth", exifAttribute);
            this.f21440f[0].put("ImageLength", exifAttribute2);
        }
        if (this.f21440f[4].isEmpty() && B(this.f21440f[5])) {
            HashMap[] hashMapArr = this.f21440f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!B(this.f21440f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        J(0, "ThumbnailOrientation", "Orientation");
        J(0, "ThumbnailImageLength", "ImageLength");
        J(0, "ThumbnailImageWidth", "ImageWidth");
        J(5, "ThumbnailOrientation", "Orientation");
        J(5, "ThumbnailImageLength", "ImageLength");
        J(5, "ThumbnailImageWidth", "ImageWidth");
        J(4, "Orientation", "ThumbnailOrientation");
        J(4, "ImageLength", "ThumbnailImageLength");
        J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.f21440f[0].put("DateTime", ExifAttribute.a(b2));
        }
        if (b("ImageWidth") == null) {
            this.f21440f[0].put("ImageWidth", ExifAttribute.b(0, this.f21442h));
        }
        if (b("ImageLength") == null) {
            this.f21440f[0].put("ImageLength", ExifAttribute.b(0, this.f21442h));
        }
        if (b("Orientation") == null) {
            this.f21440f[0].put("Orientation", ExifAttribute.b(0, this.f21442h));
        }
        if (b("LightSource") == null) {
            this.f21440f[1].put("LightSource", ExifAttribute.b(0, this.f21442h));
        }
    }

    public String b(String str) {
        if (str != null) {
            ExifAttribute d2 = d(str);
            if (d2 != null) {
                if (!m0.contains(str)) {
                    return d2.j(this.f21442h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i2 = d2.f21462a;
                    if (i2 == 5 || i2 == 10) {
                        Rational[] rationalArr = (Rational[]) d2.k(this.f21442h);
                        if (rationalArr == null || rationalArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                            return null;
                        }
                        Rational rational = rationalArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) rational.f21470a) / ((float) rational.f21471b)));
                        Rational rational2 = rationalArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) rational2.f21470a) / ((float) rational2.f21471b)));
                        Rational rational3 = rationalArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) rational3.f21470a) / ((float) rational3.f21471b)))});
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d2.f21462a);
                    return null;
                }
                try {
                    return Double.toString(d2.h(this.f21442h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int c(String str, int i2) {
        if (str != null) {
            ExifAttribute d2 = d(str);
            if (d2 == null) {
                return i2;
            }
            try {
                return d2.i(this.f21442h);
            } catch (NumberFormatException unused) {
                return i2;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    public final ExifAttribute d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f21429u) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < i0.length; i2++) {
                ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[i2].get(str);
                if (exifAttribute != null) {
                    return exifAttribute;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:47|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0125 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(final androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0131
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.ExifInterface$1 r2 = new androidx.exifinterface.media.ExifInterface$1     // Catch:{ RuntimeException -> 0x0125 }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.ExifInterfaceUtils.Api23Impl.a(r1, r2)     // Catch:{ RuntimeException -> 0x0125 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0125 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0125 }
            if (r4 == 0) goto L_0x0049
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x0065
        L_0x0046:
            r13 = move-exception
            goto L_0x012d
        L_0x0049:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0125 }
            if (r0 == 0) goto L_0x0062
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x0065
        L_0x0062:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x0065:
            r6 = 0
            if (r0 == 0) goto L_0x007b
            java.util.HashMap[] r7 = r12.f21440f     // Catch:{ RuntimeException -> 0x0125 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0125 }
            java.nio.ByteOrder r10 = r12.f21442h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.f(r9, r10)     // Catch:{ RuntimeException -> 0x0125 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x007b:
            if (r4 == 0) goto L_0x0090
            java.util.HashMap[] r7 = r12.f21440f     // Catch:{ RuntimeException -> 0x0125 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0125 }
            java.nio.ByteOrder r10 = r12.f21442h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.ExifInterface$ExifAttribute r9 = androidx.exifinterface.media.ExifInterface.ExifAttribute.f(r9, r10)     // Catch:{ RuntimeException -> 0x0125 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x0090:
            r7 = 6
            if (r5 == 0) goto L_0x00ba
            int r8 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0125 }
            r9 = 90
            if (r8 == r9) goto L_0x00aa
            r9 = 180(0xb4, float:2.52E-43)
            if (r8 == r9) goto L_0x00a8
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 == r9) goto L_0x00a5
            r8 = 1
            goto L_0x00ab
        L_0x00a5:
            r8 = 8
            goto L_0x00ab
        L_0x00a8:
            r8 = 3
            goto L_0x00ab
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            java.util.HashMap[] r9 = r12.f21440f     // Catch:{ RuntimeException -> 0x0125 }
            r9 = r9[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f21442h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.ExifInterface$ExifAttribute r8 = androidx.exifinterface.media.ExifInterface.ExifAttribute.f(r8, r11)     // Catch:{ RuntimeException -> 0x0125 }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00f7
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0125 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0125 }
            if (r3 <= r7) goto L_0x00ef
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x0125 }
            r13.g(r8)     // Catch:{ RuntimeException -> 0x0125 }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x0125 }
            r13.readFully(r8)     // Catch:{ RuntimeException -> 0x0125 }
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = p0     // Catch:{ RuntimeException -> 0x0125 }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x0125 }
            if (r7 == 0) goto L_0x00e7
            byte[] r3 = new byte[r3]     // Catch:{ RuntimeException -> 0x0125 }
            r13.readFully(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r12.f21450p = r2     // Catch:{ RuntimeException -> 0x0125 }
            r12.H(r3, r6)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x00f7
        L_0x00e7:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0125 }
            throw r13     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00ef:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0125 }
            throw r13     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00f7:
            boolean r13 = f21429u     // Catch:{ RuntimeException -> 0x0125 }
            if (r13 == 0) goto L_0x0121
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0125 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "x"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r5)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x0125 }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x0121:
            r1.release()
            return
        L_0x0125:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0046 }
            throw r13     // Catch:{ all -> 0x0046 }
        L_0x012d:
            r1.release()
            throw r13
        L_0x0131:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.e(androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0170 A[LOOP:0: B:8:0x0037->B:56:0x0170, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0177 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = f21429u
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.d(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01c4
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01a9
            r3 = 2
        L_0x0037:
            byte r5 = r22.readByte()
            if (r5 != r6) goto L_0x018c
            byte r5 = r22.readByte()
            boolean r7 = f21429u
            if (r7 == 0) goto L_0x005f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x005f:
            r8 = -39
            if (r5 == r8) goto L_0x0186
            r8 = -38
            if (r5 != r8) goto L_0x0069
            goto L_0x0186
        L_0x0069:
            int r8 = r22.readUnsignedShort()
            int r9 = r8 + -2
            r10 = 4
            int r3 = r3 + r10
            if (r7 == 0) goto L_0x009a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "JPEG segment: "
            r7.append(r11)
            r11 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r7.append(r11)
            java.lang.String r11 = " (length: "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r11 = ")"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
        L_0x009a:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L_0x017f
            r11 = -31
            r12 = 1
            r13 = 0
            if (r5 == r11) goto L_0x0112
            r11 = -2
            if (r5 == r11) goto L_0x00ef
            switch(r5) {
                case -64: goto L_0x00b7;
                case -63: goto L_0x00b7;
                case -62: goto L_0x00b7;
                case -61: goto L_0x00b7;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r5) {
                case -59: goto L_0x00b7;
                case -58: goto L_0x00b7;
                case -57: goto L_0x00b7;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r5) {
                case -55: goto L_0x00b7;
                case -54: goto L_0x00b7;
                case -53: goto L_0x00b7;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r5) {
                case -51: goto L_0x00b7;
                case -50: goto L_0x00b7;
                case -49: goto L_0x00b7;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r20 = r7
            goto L_0x016e
        L_0x00b7:
            r1.f(r12)
            java.util.HashMap[] r5 = r0.f21440f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00c3
            java.lang.String r9 = "ImageLength"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r9 = "ThumbnailImageLength"
        L_0x00c5:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f21442h
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.b(r11, r13)
            r5.put(r9, r11)
            java.util.HashMap[] r5 = r0.f21440f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00dc
            java.lang.String r9 = "ImageWidth"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r9 = "ThumbnailImageWidth"
        L_0x00de:
            int r10 = r22.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f21442h
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.b(r10, r12)
            r5.put(r9, r10)
            int r9 = r8 + -7
            goto L_0x00b3
        L_0x00ef:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.b(r8)
            if (r9 != 0) goto L_0x010e
            java.util.HashMap[] r9 = r0.f21440f
            r9 = r9[r12]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = o0
            r10.<init>(r5, r11)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.a(r10)
            r9.put(r8, r5)
        L_0x010e:
            r20 = r7
        L_0x0110:
            r9 = r13
            goto L_0x016e
        L_0x0112:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r3 + r9
            byte[] r10 = p0
            boolean r11 = androidx.exifinterface.media.ExifInterfaceUtils.b(r5, r10)
            if (r11 == 0) goto L_0x013a
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r3 = r23 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.f21450p = r3
            r0.H(r5, r2)
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r3.<init>((byte[]) r5)
            r0.L(r3)
        L_0x0137:
            r20 = r7
            goto L_0x016c
        L_0x013a:
            byte[] r10 = q0
            boolean r11 = androidx.exifinterface.media.ExifInterfaceUtils.b(r5, r10)
            if (r11 == 0) goto L_0x0137
            int r11 = r10.length
            int r3 = r3 + r11
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r10 = r0.b(r9)
            if (r10 != 0) goto L_0x0137
            java.util.HashMap[] r10 = r0.f21440f
            r10 = r10[r13]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            int r15 = r5.length
            r20 = r7
            long r6 = (long) r3
            r3 = 1
            r14 = r11
            r16 = r15
            r15 = r3
            r17 = r6
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            r10.put(r9, r11)
            r0.f21454t = r12
        L_0x016c:
            r3 = r8
            goto L_0x0110
        L_0x016e:
            if (r9 < 0) goto L_0x0177
            r1.f(r9)
            int r3 = r3 + r9
            r6 = -1
            goto L_0x0037
        L_0x0177:
            java.io.IOException r1 = new java.io.IOException
            r2 = r20
            r1.<init>(r2)
            throw r1
        L_0x017f:
            r2 = r7
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L_0x0186:
            java.nio.ByteOrder r2 = r0.f21442h
            r1.d(r2)
            return
        L_0x018c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.f(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    public final int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(UndoManagerKt.f6027a);
        byte[] bArr = new byte[UndoManagerKt.f6027a];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    public final void h(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        int i2;
        int i3;
        k(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f21465d);
            seekableByteOrderedDataInputStream2.d(this.f21442h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.g(0);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.g(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.g(12);
            }
            I(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) this.f21440f[7].get("PreviewImageLength");
            if (!(exifAttribute2 == null || exifAttribute3 == null)) {
                this.f21440f[5].put("JPEGInterchangeFormat", exifAttribute2);
                this.f21440f[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) this.f21440f[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.k(this.f21442h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    ExifAttribute f2 = ExifAttribute.f(i6, this.f21442h);
                    ExifAttribute f3 = ExifAttribute.f(i7, this.f21442h);
                    this.f21440f[0].put("ImageWidth", f2);
                    this.f21440f[0].put("ImageLength", f3);
                }
            }
        }
    }

    public final void i(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (f21429u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        byteOrderedDataInputStream.f(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16) {
                    if (!Arrays.equals(bArr2, I)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                }
                if (!Arrays.equals(bArr2, J)) {
                    if (Arrays.equals(bArr2, H)) {
                        byte[] bArr3 = new byte[readInt];
                        byteOrderedDataInputStream.readFully(bArr3);
                        int readInt2 = byteOrderedDataInputStream.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f21450p = i2;
                            H(bArr3, 0);
                            P();
                            L(new ByteOrderedDataInputStream(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i3 = readInt + 4;
                    byteOrderedDataInputStream.f(i3);
                    length = i2 + i3;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        boolean z2 = f21429u;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        byteOrderedDataInputStream.f(i2 - byteOrderedDataInputStream.b());
        byteOrderedDataInputStream.readFully(bArr4);
        f(new ByteOrderedDataInputStream(bArr4), i2, 5);
        byteOrderedDataInputStream.f(i4 - byteOrderedDataInputStream.b());
        byteOrderedDataInputStream.d(ByteOrder.BIG_ENDIAN);
        int readInt = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == d0.f21466a) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute f2 = ExifAttribute.f(readShort, this.f21442h);
                ExifAttribute f3 = ExifAttribute.f(readShort2, this.f21442h);
                this.f21440f[0].put("ImageLength", f2);
                this.f21440f[0].put("ImageWidth", f3);
                if (f21429u) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.f(readUnsignedShort2);
        }
    }

    public final void k(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        ExifAttribute exifAttribute;
        E(seekableByteOrderedDataInputStream);
        I(seekableByteOrderedDataInputStream, 0);
        O(seekableByteOrderedDataInputStream, 0);
        O(seekableByteOrderedDataInputStream, 5);
        O(seekableByteOrderedDataInputStream, 4);
        P();
        if (this.f21438d == 8 && (exifAttribute = (ExifAttribute) this.f21440f[1].get("MakerNote")) != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f21465d);
            seekableByteOrderedDataInputStream2.d(this.f21442h);
            seekableByteOrderedDataInputStream2.f(6);
            I(seekableByteOrderedDataInputStream2, 9);
            ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[9].get("ColorSpace");
            if (exifAttribute2 != null) {
                this.f21440f[1].put("ColorSpace", exifAttribute2);
            }
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        if (f21429u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        k(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = (ExifAttribute) this.f21440f[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            f(new ByteOrderedDataInputStream(exifAttribute.f21465d), (int) exifAttribute.f21464c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) this.f21440f[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) this.f21440f[1].get("PhotographicSensitivity");
        if (exifAttribute2 != null && exifAttribute3 == null) {
            this.f21440f[1].put("PhotographicSensitivity", exifAttribute2);
        }
    }

    public final void n(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        byte[] bArr = p0;
        seekableByteOrderedDataInputStream.f(bArr.length);
        byte[] bArr2 = new byte[seekableByteOrderedDataInputStream.available()];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        this.f21450p = bArr.length;
        H(bArr2, 0);
    }

    public final void o(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (f21429u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.d(ByteOrder.LITTLE_ENDIAN);
        byteOrderedDataInputStream.f(K.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = L;
        byteOrderedDataInputStream.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i2 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    this.f21450p = i2;
                    H(bArr3, 0);
                    L(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length != readInt) {
                    if (length <= readInt) {
                        byteOrderedDataInputStream.f(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute != null && exifAttribute2 != null) {
            int i2 = exifAttribute.i(this.f21442h);
            int i3 = exifAttribute2.i(this.f21442h);
            if (this.f21438d == 7) {
                i2 += this.f21451q;
            }
            if (i2 > 0 && i3 > 0) {
                this.f21443i = true;
                if (this.f21435a == null && this.f21437c == null && this.f21436b == null) {
                    byte[] bArr = new byte[i3];
                    byteOrderedDataInputStream.f(i2);
                    byteOrderedDataInputStream.readFully(bArr);
                    this.f21448n = bArr;
                }
                this.f21446l = i2;
                this.f21447m = i3;
            }
            if (f21429u) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i2 + ", length: " + i3);
            }
        }
    }

    public final void q(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        byte[] bArr;
        ByteOrderedDataInputStream byteOrderedDataInputStream2 = byteOrderedDataInputStream;
        HashMap hashMap2 = hashMap;
        ExifAttribute exifAttribute = (ExifAttribute) hashMap2.get("StripOffsets");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap2.get("StripByteCounts");
        if (exifAttribute != null && exifAttribute2 != null) {
            long[] a2 = ExifInterfaceUtils.a(exifAttribute.k(this.f21442h));
            long[] a3 = ExifInterfaceUtils.a(exifAttribute2.k(this.f21442h));
            if (a2 == null || a2.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (a3 == null || a3.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (a2.length != a3.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j2 = 0;
                for (long j3 : a3) {
                    j2 += j3;
                }
                int i2 = (int) j2;
                byte[] bArr2 = new byte[i2];
                this.f21445k = true;
                this.f21444j = true;
                this.f21443i = true;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < a2.length) {
                    int i6 = (int) a2[i3];
                    int i7 = (int) a3[i3];
                    if (i3 < a2.length - 1) {
                        bArr = bArr2;
                        if (((long) (i6 + i7)) != a2[i3 + 1]) {
                            this.f21445k = false;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        byteOrderedDataInputStream2.f(i8);
                        int i9 = i4 + i8;
                        byte[] bArr3 = new byte[i7];
                        try {
                            byteOrderedDataInputStream2.readFully(bArr3);
                            i4 = i9 + i7;
                            byte[] bArr4 = bArr;
                            System.arraycopy(bArr3, 0, bArr4, i5, i7);
                            i5 += i7;
                            i3++;
                            bArr2 = bArr4;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i7 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                }
                this.f21448n = bArr2;
                if (this.f21445k) {
                    this.f21446l = (int) a2[0];
                    this.f21447m = i2;
                }
            }
        }
    }

    public boolean s() {
        int c2 = c("Orientation", 1);
        return c2 == 2 || c2 == 7 || c2 == 4 || c2 == 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0090 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ Exception -> 0x008b }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008b }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            byte[] r6 = f21428B     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x003b
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r2.close()
            return r0
        L_0x0034:
            r15 = move-exception
            r1 = r2
            goto L_0x009d
        L_0x0038:
            r15 = move-exception
            r1 = r2
            goto L_0x008c
        L_0x003b:
            r10 = r8
        L_0x003c:
            int r7 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0044
            int r15 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r15
        L_0x0044:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r2.close()
            return r0
        L_0x004d:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r7 = 0
            r1 = r0
            r9 = r1
        L_0x0053:
            r10 = 4
            long r10 = r3 / r10
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0085
            r2.readFully(r15)     // Catch:{ EOFException -> 0x0081 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r10 = C     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r10 = java.util.Arrays.equals(r15, r10)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r11 = 1
            if (r10 == 0) goto L_0x006e
            r1 = r11
            goto L_0x0077
        L_0x006e:
            byte[] r10 = D     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r10 = java.util.Arrays.equals(r15, r10)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r10 == 0) goto L_0x0077
            r9 = r11
        L_0x0077:
            if (r1 == 0) goto L_0x007f
            if (r9 == 0) goto L_0x007f
            r2.close()
            return r11
        L_0x007f:
            long r7 = r7 + r5
            goto L_0x0053
        L_0x0081:
            r2.close()
            return r0
        L_0x0085:
            r2.close()
            goto L_0x009c
        L_0x0089:
            r15 = move-exception
            goto L_0x009d
        L_0x008b:
            r15 = move-exception
        L_0x008c:
            boolean r2 = f21429u     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x0089 }
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()
        L_0x009c:
            return r0
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.t(byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.G(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f21442h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.d(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.v(byte[]):boolean");
    }

    public final boolean w(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public final boolean x(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.G(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f21442h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.d(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.y(byte[]):boolean");
    }

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {

        /* renamed from: A  reason: collision with root package name */
        public int f21458A;

        /* renamed from: B  reason: collision with root package name */
        public ByteOrder f21459B;
        public byte[] C;
        public int D;

        /* renamed from: z  reason: collision with root package name */
        public final DataInputStream f21460z;

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.D = bArr.length;
        }

        public int a() {
            return this.D;
        }

        public int available() {
            return this.f21460z.available();
        }

        public int b() {
            return this.f21458A;
        }

        public long c() {
            return ((long) readInt()) & 4294967295L;
        }

        public void d(ByteOrder byteOrder) {
            this.f21459B = byteOrder;
        }

        public void f(int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int skip = (int) this.f21460z.skip((long) i4);
                if (skip <= 0) {
                    if (this.C == null) {
                        this.C = new byte[8192];
                    }
                    skip = this.f21460z.read(this.C, 0, Math.min(8192, i4));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                    }
                }
                i3 += skip;
            }
            this.f21458A += i3;
        }

        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int read() {
            this.f21458A++;
            return this.f21460z.read();
        }

        public boolean readBoolean() {
            this.f21458A++;
            return this.f21460z.readBoolean();
        }

        public byte readByte() {
            this.f21458A++;
            int read = this.f21460z.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f21458A += 2;
            return this.f21460z.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            this.f21458A += i3;
            this.f21460z.readFully(bArr, i2, i3);
        }

        public int readInt() {
            this.f21458A += 4;
            int read = this.f21460z.read();
            int read2 = this.f21460z.read();
            int read3 = this.f21460z.read();
            int read4 = this.f21460z.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f21459B;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f21459B);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f21458A += 8;
            int read = this.f21460z.read();
            int read2 = this.f21460z.read();
            int read3 = this.f21460z.read();
            int read4 = this.f21460z.read();
            int read5 = this.f21460z.read();
            int read6 = this.f21460z.read();
            int read7 = this.f21460z.read();
            int read8 = this.f21460z.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f21459B;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f21459B);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f21458A += 2;
            int read = this.f21460z.read();
            int read2 = this.f21460z.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f21459B;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f21459B);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f21458A += 2;
            return this.f21460z.readUTF();
        }

        public int readUnsignedByte() {
            this.f21458A++;
            return this.f21460z.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f21458A += 2;
            int read = this.f21460z.read();
            int read2 = this.f21460z.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f21459B;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f21459B);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.f21460z.read(bArr, i2, i3);
            this.f21458A += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            this.f21458A += bArr.length;
            this.f21460z.readFully(bArr);
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f21460z = dataInputStream;
            dataInputStream.mark(0);
            this.f21458A = 0;
            this.f21459B = byteOrder;
            this.D = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).a() : -1;
        }
    }

    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.f21460z.mark(Integer.MAX_VALUE);
        }

        public void g(long j2) {
            int i2 = this.f21458A;
            if (((long) i2) > j2) {
                this.f21458A = 0;
                this.f21460z.reset();
            } else {
                j2 -= (long) i2;
            }
            f((int) j2);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f21460z.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public ExifInterface(InputStream inputStream, int i2) {
        ExifTag[][] exifTagArr = i0;
        this.f21440f = new HashMap[exifTagArr.length];
        this.f21441g = new HashSet(exifTagArr.length);
        this.f21442h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f21435a = null;
            if (i2 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, p0.length);
                if (!r(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f21439e = true;
                this.f21437c = null;
                this.f21436b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f21437c = (AssetManager.AssetInputStream) inputStream;
                this.f21436b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (z(fileInputStream.getFD())) {
                        this.f21437c = null;
                        this.f21436b = fileInputStream.getFD();
                    }
                }
                this.f21437c = null;
                this.f21436b = null;
            }
            D(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static class ExifTag {

        /* renamed from: a  reason: collision with root package name */
        public final int f21466a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21467b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21468c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21469d;

        public ExifTag(String str, int i2, int i3) {
            this.f21467b = str;
            this.f21466a = i2;
            this.f21468c = i3;
            this.f21469d = -1;
        }

        public boolean a(int i2) {
            int i3;
            int i4 = this.f21468c;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.f21469d) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i4 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i4 == 12 || i3 == 12) && i2 == 11;
        }

        public ExifTag(String str, int i2, int i3, int i4) {
            this.f21467b = str;
            this.f21466a = i2;
            this.f21468c = i3;
            this.f21469d = i4;
        }
    }
}
