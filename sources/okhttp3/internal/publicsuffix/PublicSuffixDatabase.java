package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;

@Metadata
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f43233e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f43234f = {42};

    /* renamed from: g  reason: collision with root package name */
    public static final List f43235g = CollectionsKt.e("*");

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f43236h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f43237a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f43238b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f43239c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f43240d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            int i4;
            boolean z2;
            int d2;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr3[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i3 = i7 + i8;
                    if (bArr3[i3] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i3 - i7;
                int i10 = i2;
                boolean z3 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z3) {
                        i4 = 46;
                        z2 = false;
                    } else {
                        boolean z4 = z3;
                        i4 = Util.d(bArr4[i10][i11], 255);
                        z2 = z4;
                    }
                    d2 = i4 - Util.d(bArr3[i7 + i12], 255);
                    if (d2 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z3 = z2;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z3 = true;
                        i11 = -1;
                    }
                }
                if (d2 >= 0) {
                    if (d2 <= 0) {
                        int i13 = i9 - i12;
                        int length2 = bArr4[i10].length - i11;
                        int length3 = bArr4.length;
                        for (int i14 = i10 + 1; i14 < length3; i14++) {
                            length2 += bArr4[i14].length;
                        }
                        if (length2 >= i13) {
                            if (length2 <= i13) {
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics.h(charset, "UTF_8");
                                return new String(bArr3, i7, i9, charset);
                            }
                        }
                    }
                    i5 = i3 + 1;
                }
                length = i6;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f43236h;
        }

        public Companion() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List b(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f43237a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f43237a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f43238b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f43239c
            if (r1 == 0) goto L_0x010c
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x0030:
            if (r5 >= r1) goto L_0x004e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.h(r8, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            r4[r5] = r7
            int r5 = r5 + r3
            goto L_0x0030
        L_0x004e:
            r5 = r2
        L_0x004f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0067
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r8 = f43233e
            byte[] r9 = r0.f43239c
            if (r9 != 0) goto L_0x005e
            kotlin.jvm.internal.Intrinsics.y(r6)
            r9 = r7
        L_0x005e:
            java.lang.String r8 = r8.b(r9, r4, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            int r5 = r5 + r3
            goto L_0x004f
        L_0x0067:
            r8 = r7
        L_0x0068:
            if (r1 <= r3) goto L_0x008d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x0073:
            if (r10 >= r9) goto L_0x008d
            byte[] r11 = f43234f
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r11 = f43233e
            byte[] r12 = r0.f43239c
            if (r12 != 0) goto L_0x0083
            kotlin.jvm.internal.Intrinsics.y(r6)
            r12 = r7
        L_0x0083:
            java.lang.String r11 = r11.b(r12, r5, r10)
            if (r11 == 0) goto L_0x008b
            r5 = r11
            goto L_0x008e
        L_0x008b:
            int r10 = r10 + r3
            goto L_0x0073
        L_0x008d:
            r5 = r7
        L_0x008e:
            if (r5 == 0) goto L_0x00aa
            int r1 = r1 - r3
            r6 = r2
        L_0x0092:
            if (r6 >= r1) goto L_0x00aa
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = f43233e
            byte[] r10 = r0.f43240d
            if (r10 != 0) goto L_0x00a0
            java.lang.String r10 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.y(r10)
            r10 = r7
        L_0x00a0:
            java.lang.String r9 = r9.b(r10, r4, r6)
            if (r9 == 0) goto L_0x00a8
            r7 = r9
            goto L_0x00aa
        L_0x00a8:
            int r6 = r6 + r3
            goto L_0x0092
        L_0x00aa:
            r1 = 46
            if (r7 == 0) goto L_0x00cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            java.util.List r1 = kotlin.text.StringsKt.M0(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00cc:
            if (r8 != 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00d3
            java.util.List r1 = f43235g
            return r1
        L_0x00d3:
            if (r8 == 0) goto L_0x00e5
            char[] r7 = new char[r3]
            r7[r2] = r1
            r10 = 6
            r11 = 0
            r4 = 0
            r9 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = kotlin.text.StringsKt.M0(r6, r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x00e9
        L_0x00e5:
            java.util.List r4 = kotlin.collections.CollectionsKt.m()
        L_0x00e9:
            if (r5 == 0) goto L_0x00fb
            char[] r12 = new char[r3]
            r12[r2] = r1
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            r11 = r5
            java.util.List r1 = kotlin.text.StringsKt.M0(r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto L_0x00ff
        L_0x00fb:
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
        L_0x00ff:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r4 = r1
        L_0x010b:
            return r4
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    public final String c(String str) {
        int size;
        int size2;
        Intrinsics.i(str, "domain");
        String unicode = IDN.toUnicode(str);
        Intrinsics.h(unicode, "unicodeDomain");
        List f2 = f(unicode);
        List b2 = b(f2);
        if (f2.size() == b2.size() && ((String) b2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b2.get(0)).charAt(0) == '!') {
            size = f2.size();
            size2 = b2.size();
        } else {
            size = f2.size();
            size2 = b2.size() + 1;
        }
        return SequencesKt.x(SequencesKt.p(CollectionsKt.V(f(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        kotlin.io.CloseableKt.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x001a
            java.util.concurrent.CountDownLatch r0 = r5.f43238b
            r0.countDown()
            return
        L_0x001a:
            okio.GzipSource r3 = new okio.GzipSource     // Catch:{ all -> 0x005d }
            okio.Source r2 = okio.Okio.k(r2)     // Catch:{ all -> 0x005d }
            r3.<init>(r2)     // Catch:{ all -> 0x005d }
            okio.BufferedSource r2 = okio.Okio.d(r3)     // Catch:{ all -> 0x005d }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0062 }
            long r3 = (long) r3     // Catch:{ all -> 0x0062 }
            byte[] r3 = r2.e1(r3)     // Catch:{ all -> 0x0062 }
            r0.f40908z = r3     // Catch:{ all -> 0x0062 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0062 }
            long r3 = (long) r3     // Catch:{ all -> 0x0062 }
            byte[] r3 = r2.e1(r3)     // Catch:{ all -> 0x0062 }
            r1.f40908z = r3     // Catch:{ all -> 0x0062 }
            kotlin.Unit r3 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0062 }
            r3 = 0
            kotlin.io.CloseableKt.a(r2, r3)     // Catch:{ all -> 0x005d }
            monitor-enter(r5)     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.f40908z     // Catch:{ all -> 0x005f }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x005f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x005f }
            r5.f43239c = r0     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r1.f40908z     // Catch:{ all -> 0x005f }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x005f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x005f }
            r5.f43240d = r0     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x005d }
            java.util.concurrent.CountDownLatch r0 = r5.f43238b
            r0.countDown()
            return
        L_0x005d:
            r0 = move-exception
            goto L_0x0069
        L_0x005f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x0062:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            kotlin.io.CloseableKt.a(r2, r0)     // Catch:{ all -> 0x005d }
            throw r1     // Catch:{ all -> 0x005d }
        L_0x0069:
            java.util.concurrent.CountDownLatch r1 = r5.f43238b
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.f43200a     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.k(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    public final List f(String str) {
        List M0 = StringsKt.M0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.d(CollectionsKt.p0(M0), "") ? CollectionsKt.a0(M0, 1) : M0;
    }
}
