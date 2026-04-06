package coil.util;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;

@Metadata
public final class ImageLoaderOptions {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23753a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23754b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23755c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23756d;

    /* renamed from: e  reason: collision with root package name */
    public final ExifOrientationPolicy f23757e;

    public ImageLoaderOptions(boolean z2, boolean z3, boolean z4, int i2, ExifOrientationPolicy exifOrientationPolicy) {
        this.f23753a = z2;
        this.f23754b = z3;
        this.f23755c = z4;
        this.f23756d = i2;
        this.f23757e = exifOrientationPolicy;
    }

    public final boolean a() {
        return this.f23753a;
    }

    public final ExifOrientationPolicy b() {
        return this.f23757e;
    }

    public final int c() {
        return this.f23756d;
    }

    public final boolean d() {
        return this.f23754b;
    }

    public final boolean e() {
        return this.f23755c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ImageLoaderOptions(boolean r4, boolean r5, boolean r6, int r7, coil.decode.ExifOrientationPolicy r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 1
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r6
        L_0x0015:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001a
            r7 = 4
        L_0x001a:
            r2 = r7
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0021
            coil.decode.ExifOrientationPolicy r8 = coil.decode.ExifOrientationPolicy.RESPECT_PERFORMANCE
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.ImageLoaderOptions.<init>(boolean, boolean, boolean, int, coil.decode.ExifOrientationPolicy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
