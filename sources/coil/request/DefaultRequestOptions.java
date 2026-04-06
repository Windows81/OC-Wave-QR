package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.size.Precision;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class DefaultRequestOptions {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineDispatcher f23542a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f23543b;

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineDispatcher f23544c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineDispatcher f23545d;

    /* renamed from: e  reason: collision with root package name */
    public final Transition.Factory f23546e;

    /* renamed from: f  reason: collision with root package name */
    public final Precision f23547f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f23548g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23549h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23550i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f23551j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f23552k;

    /* renamed from: l  reason: collision with root package name */
    public final Drawable f23553l;

    /* renamed from: m  reason: collision with root package name */
    public final CachePolicy f23554m;

    /* renamed from: n  reason: collision with root package name */
    public final CachePolicy f23555n;

    /* renamed from: o  reason: collision with root package name */
    public final CachePolicy f23556o;

    public DefaultRequestOptions(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Transition.Factory factory, Precision precision, Bitmap.Config config, boolean z2, boolean z3, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f23542a = coroutineDispatcher;
        this.f23543b = coroutineDispatcher2;
        this.f23544c = coroutineDispatcher3;
        this.f23545d = coroutineDispatcher4;
        this.f23546e = factory;
        this.f23547f = precision;
        this.f23548g = config;
        this.f23549h = z2;
        this.f23550i = z3;
        this.f23551j = drawable;
        this.f23552k = drawable2;
        this.f23553l = drawable3;
        this.f23554m = cachePolicy;
        this.f23555n = cachePolicy2;
        this.f23556o = cachePolicy3;
    }

    public final boolean a() {
        return this.f23549h;
    }

    public final boolean b() {
        return this.f23550i;
    }

    public final Bitmap.Config c() {
        return this.f23548g;
    }

    public final CoroutineDispatcher d() {
        return this.f23544c;
    }

    public final CachePolicy e() {
        return this.f23555n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRequestOptions) {
            DefaultRequestOptions defaultRequestOptions = (DefaultRequestOptions) obj;
            return Intrinsics.d(this.f23542a, defaultRequestOptions.f23542a) && Intrinsics.d(this.f23543b, defaultRequestOptions.f23543b) && Intrinsics.d(this.f23544c, defaultRequestOptions.f23544c) && Intrinsics.d(this.f23545d, defaultRequestOptions.f23545d) && Intrinsics.d(this.f23546e, defaultRequestOptions.f23546e) && this.f23547f == defaultRequestOptions.f23547f && this.f23548g == defaultRequestOptions.f23548g && this.f23549h == defaultRequestOptions.f23549h && this.f23550i == defaultRequestOptions.f23550i && Intrinsics.d(this.f23551j, defaultRequestOptions.f23551j) && Intrinsics.d(this.f23552k, defaultRequestOptions.f23552k) && Intrinsics.d(this.f23553l, defaultRequestOptions.f23553l) && this.f23554m == defaultRequestOptions.f23554m && this.f23555n == defaultRequestOptions.f23555n && this.f23556o == defaultRequestOptions.f23556o;
        }
    }

    public final Drawable f() {
        return this.f23552k;
    }

    public final Drawable g() {
        return this.f23553l;
    }

    public final CoroutineDispatcher h() {
        return this.f23543b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f23542a.hashCode() * 31) + this.f23543b.hashCode()) * 31) + this.f23544c.hashCode()) * 31) + this.f23545d.hashCode()) * 31) + this.f23546e.hashCode()) * 31) + this.f23547f.hashCode()) * 31) + this.f23548g.hashCode()) * 31) + Boolean.hashCode(this.f23549h)) * 31) + Boolean.hashCode(this.f23550i)) * 31;
        Drawable drawable = this.f23551j;
        int i2 = 0;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f23552k;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f23553l;
        if (drawable3 != null) {
            i2 = drawable3.hashCode();
        }
        return ((((((hashCode3 + i2) * 31) + this.f23554m.hashCode()) * 31) + this.f23555n.hashCode()) * 31) + this.f23556o.hashCode();
    }

    public final CoroutineDispatcher i() {
        return this.f23542a;
    }

    public final CachePolicy j() {
        return this.f23554m;
    }

    public final CachePolicy k() {
        return this.f23556o;
    }

    public final Drawable l() {
        return this.f23551j;
    }

    public final Precision m() {
        return this.f23547f;
    }

    public final CoroutineDispatcher n() {
        return this.f23545d;
    }

    public final Transition.Factory o() {
        return this.f23546e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DefaultRequestOptions(kotlinx.coroutines.CoroutineDispatcher r16, kotlinx.coroutines.CoroutineDispatcher r17, kotlinx.coroutines.CoroutineDispatcher r18, kotlinx.coroutines.CoroutineDispatcher r19, coil.transition.Transition.Factory r20, coil.size.Precision r21, android.graphics.Bitmap.Config r22, boolean r23, boolean r24, android.graphics.drawable.Drawable r25, android.graphics.drawable.Drawable r26, android.graphics.drawable.Drawable r27, coil.request.CachePolicy r28, coil.request.CachePolicy r29, coil.request.CachePolicy r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000f
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.c()
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r1.H0()
            goto L_0x0011
        L_0x000f:
            r1 = r16
        L_0x0011:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001a
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.b()
            goto L_0x0027
        L_0x0025:
            r3 = r18
        L_0x0027:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.b()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            coil.transition.Transition$Factory r5 = coil.transition.Transition.Factory.f23730b
            goto L_0x003b
        L_0x0039:
            r5 = r20
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0042
            coil.size.Precision r6 = coil.size.Precision.AUTOMATIC
            goto L_0x0044
        L_0x0042:
            r6 = r21
        L_0x0044:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x004d
            android.graphics.Bitmap$Config r7 = coil.util.Utils.f()
            goto L_0x004f
        L_0x004d:
            r7 = r22
        L_0x004f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0055
            r8 = 1
            goto L_0x0057
        L_0x0055:
            r8 = r23
        L_0x0057:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005d
            r9 = 0
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r10 == 0) goto L_0x0066
            r10 = r11
            goto L_0x0068
        L_0x0066:
            r10 = r25
        L_0x0068:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x006e
            r12 = r11
            goto L_0x0070
        L_0x006e:
            r12 = r26
        L_0x0070:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r11 = r27
        L_0x0077:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007e
            coil.request.CachePolicy r13 = coil.request.CachePolicy.ENABLED
            goto L_0x0080
        L_0x007e:
            r13 = r28
        L_0x0080:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0087
            coil.request.CachePolicy r14 = coil.request.CachePolicy.ENABLED
            goto L_0x0089
        L_0x0087:
            r14 = r29
        L_0x0089:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0090
            coil.request.CachePolicy r0 = coil.request.CachePolicy.ENABLED
            goto L_0x0092
        L_0x0090:
            r0 = r30
        L_0x0092:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r11
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.DefaultRequestOptions.<init>(kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, coil.transition.Transition$Factory, coil.size.Precision, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, coil.request.CachePolicy, coil.request.CachePolicy, coil.request.CachePolicy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
