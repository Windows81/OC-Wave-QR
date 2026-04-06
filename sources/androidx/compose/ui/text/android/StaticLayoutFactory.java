package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

@Metadata
public final class StaticLayoutFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final StaticLayoutFactory f18545a = new StaticLayoutFactory();

    /* renamed from: b  reason: collision with root package name */
    public static final StaticLayoutFactoryImpl f18546b = new StaticLayoutFactory23();

    /* renamed from: c  reason: collision with root package name */
    public static final int f18547c = 8;

    public static /* synthetic */ StaticLayout b(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, int i12, Object obj) {
        int i13 = i12;
        return staticLayoutFactory.a(charSequence, textPaint, i2, (i13 & 8) != 0 ? 0 : i3, (i13 & 16) != 0 ? charSequence.length() : i4, (i13 & 32) != 0 ? LayoutCompat.f18522a.b() : textDirectionHeuristic, (i13 & 64) != 0 ? LayoutCompat.f18522a.a() : alignment, (i13 & 128) != 0 ? Integer.MAX_VALUE : i5, (i13 & 256) != 0 ? null : truncateAt, (i13 & 512) != 0 ? i2 : i6, (i13 & 1024) != 0 ? 1.0f : f2, (i13 & 2048) != 0 ? 0.0f : f3, (i13 & 4096) != 0 ? 0 : i7, (i13 & 8192) != 0 ? false : z2, (i13 & 16384) != 0 ? true : z3, (32768 & i13) != 0 ? 0 : i8, (65536 & i13) != 0 ? 0 : i9, (131072 & i13) != 0 ? 0 : i10, (262144 & i13) != 0 ? 0 : i11, (524288 & i13) != 0 ? null : iArr, (i13 & 1048576) != 0 ? null : iArr2);
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        StaticLayoutFactoryImpl staticLayoutFactoryImpl = f18546b;
        StaticLayoutParams staticLayoutParams = r0;
        CharSequence charSequence3 = charSequence;
        StaticLayoutParams staticLayoutParams2 = new StaticLayoutParams(charSequence3, i3, i4, textPaint, i2, textDirectionHeuristic, alignment, i5, truncateAt, i6, f2, f3, i7, z2, z3, i8, i9, i10, i11, iArr, iArr2);
        return staticLayoutFactoryImpl.a(staticLayoutParams);
    }

    public final boolean c(StaticLayout staticLayout, boolean z2) {
        return f18546b.b(staticLayout, z2);
    }
}
