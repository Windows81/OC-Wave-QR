package androidx.compose.ui.text.android;

import kotlin.Metadata;

@Metadata
final class HorizontalPositionCache {

    /* renamed from: a  reason: collision with root package name */
    public final TextLayout f18519a;

    /* renamed from: b  reason: collision with root package name */
    public int f18520b = -1;

    /* renamed from: c  reason: collision with root package name */
    public float f18521c;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.f18519a = textLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x001f
            androidx.compose.ui.text.android.TextLayout r2 = r5.f18519a
            android.text.Layout r2 = r2.i()
            int r2 = androidx.compose.ui.text.android.LayoutCompat_androidKt.a(r2, r6, r7)
            androidx.compose.ui.text.android.TextLayout r3 = r5.f18519a
            int r3 = r3.v(r2)
            androidx.compose.ui.text.android.TextLayout r4 = r5.f18519a
            int r2 = r4.p(r2)
            if (r6 == r3) goto L_0x0021
            if (r6 != r2) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = r1
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            int r3 = r6 * 4
            if (r9 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x002f
            r0 = r1
            goto L_0x002f
        L_0x002a:
            if (r2 == 0) goto L_0x002e
            r0 = 2
            goto L_0x002f
        L_0x002e:
            r0 = 3
        L_0x002f:
            int r3 = r3 + r0
            int r0 = r5.f18520b
            if (r0 != r3) goto L_0x0037
            float r6 = r5.f18521c
            return r6
        L_0x0037:
            if (r9 == 0) goto L_0x0040
            androidx.compose.ui.text.android.TextLayout r9 = r5.f18519a
            float r6 = r9.A(r6, r7)
            goto L_0x0046
        L_0x0040:
            androidx.compose.ui.text.android.TextLayout r9 = r5.f18519a
            float r6 = r9.D(r6, r7)
        L_0x0046:
            if (r8 == 0) goto L_0x004c
            r5.f18520b = r3
            r5.f18521c = r6
        L_0x004c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.HorizontalPositionCache.a(int, boolean, boolean, boolean):float");
    }

    public final float b(int i2) {
        return a(i2, false, false, true);
    }

    public final float c(int i2) {
        return a(i2, true, true, true);
    }

    public final float d(int i2) {
        return a(i2, false, false, false);
    }

    public final float e(int i2) {
        return a(i2, true, true, false);
    }
}
