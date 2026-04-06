package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata
public final class VisibilityThresholdsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f2872a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);

    /* renamed from: b  reason: collision with root package name */
    public static final Map f2873b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        TwoWayConverter j2 = VectorConvertersKt.j(IntCompanionObject.f40897a);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair a2 = TuplesKt.a(j2, valueOf2);
        Pair a3 = TuplesKt.a(VectorConvertersKt.h(IntSize.f19170b), valueOf2);
        Pair a4 = TuplesKt.a(VectorConvertersKt.g(IntOffset.f19160b), valueOf2);
        Pair a5 = TuplesKt.a(VectorConvertersKt.i(FloatCompanionObject.f40896a), Float.valueOf(0.01f));
        Pair a6 = TuplesKt.a(VectorConvertersKt.c(Rect.f15860e), valueOf);
        Pair a7 = TuplesKt.a(VectorConvertersKt.d(Size.f15876b), valueOf);
        Pair a8 = TuplesKt.a(VectorConvertersKt.b(Offset.f15855b), valueOf);
        TwoWayConverter e2 = VectorConvertersKt.e(Dp.f19144A);
        Float valueOf3 = Float.valueOf(0.1f);
        f2873b = MapsKt.k(a2, a3, a4, a5, a6, a7, a8, TuplesKt.a(e2, valueOf3), TuplesKt.a(VectorConvertersKt.f(DpOffset.f19147b), valueOf3));
    }

    public static final float a(Dp.Companion companion) {
        return Dp.m(0.1f);
    }

    public static final int b(IntCompanionObject intCompanionObject) {
        return 1;
    }

    public static final long c(Offset.Companion companion) {
        return Offset.e((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    public static final long d(Size.Companion companion) {
        return Size.d((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    public static final long e(IntOffset.Companion companion) {
        long j2 = (long) 1;
        return IntOffset.f((j2 & 4294967295L) | (j2 << 32));
    }

    public static final long f(IntSize.Companion companion) {
        long j2 = (long) 1;
        return IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public static final Rect g(Rect.Companion companion) {
        return f2872a;
    }

    public static final Map h() {
        return f2873b;
    }
}
