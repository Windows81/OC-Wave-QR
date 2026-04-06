package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectionHandlesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f6848a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f6849b;

    /* renamed from: c  reason: collision with root package name */
    public static final SemanticsPropertyKey f6850c = new SemanticsPropertyKey("SelectionHandleInfo", (Function2) null, 2, (DefaultConstructorMarker) null);

    static {
        float f2 = (float) 25;
        f6848a = Dp.m(f2);
        f6849b = Dp.m(f2);
    }

    public static final long a(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - 1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32));
    }

    public static final float b() {
        return f6849b;
    }

    public static final float c() {
        return f6848a;
    }

    public static final SemanticsPropertyKey d() {
        return f6850c;
    }

    public static final boolean e(ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
    }

    public static final boolean f(boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        return z2 ? e(resolvedTextDirection, z3) : !e(resolvedTextDirection, z3);
    }
}
