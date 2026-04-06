package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata
public final class VectorConvertersKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TwoWayConverter f2783a = a(VectorConvertersKt$FloatToVector$1.f2796z, VectorConvertersKt$FloatToVector$2.f2797z);

    /* renamed from: b  reason: collision with root package name */
    public static final TwoWayConverter f2784b = a(VectorConvertersKt$IntToVector$1.f2802z, VectorConvertersKt$IntToVector$2.f2803z);

    /* renamed from: c  reason: collision with root package name */
    public static final TwoWayConverter f2785c = a(VectorConvertersKt$DpToVector$1.f2794z, VectorConvertersKt$DpToVector$2.f2795z);

    /* renamed from: d  reason: collision with root package name */
    public static final TwoWayConverter f2786d = a(VectorConvertersKt$DpOffsetToVector$1.f2792z, VectorConvertersKt$DpOffsetToVector$2.f2793z);

    /* renamed from: e  reason: collision with root package name */
    public static final TwoWayConverter f2787e = a(VectorConvertersKt$SizeToVector$1.f2808z, VectorConvertersKt$SizeToVector$2.f2809z);

    /* renamed from: f  reason: collision with root package name */
    public static final TwoWayConverter f2788f = a(VectorConvertersKt$OffsetToVector$1.f2804z, VectorConvertersKt$OffsetToVector$2.f2805z);

    /* renamed from: g  reason: collision with root package name */
    public static final TwoWayConverter f2789g = a(VectorConvertersKt$IntOffsetToVector$1.f2798z, VectorConvertersKt$IntOffsetToVector$2.f2799z);

    /* renamed from: h  reason: collision with root package name */
    public static final TwoWayConverter f2790h = a(VectorConvertersKt$IntSizeToVector$1.f2800z, VectorConvertersKt$IntSizeToVector$2.f2801z);

    /* renamed from: i  reason: collision with root package name */
    public static final TwoWayConverter f2791i = a(VectorConvertersKt$RectToVector$1.f2806z, VectorConvertersKt$RectToVector$2.f2807z);

    public static final TwoWayConverter a(Function1 function1, Function1 function12) {
        return new TwoWayConverterImpl(function1, function12);
    }

    public static final TwoWayConverter b(Offset.Companion companion) {
        return f2788f;
    }

    public static final TwoWayConverter c(Rect.Companion companion) {
        return f2791i;
    }

    public static final TwoWayConverter d(Size.Companion companion) {
        return f2787e;
    }

    public static final TwoWayConverter e(Dp.Companion companion) {
        return f2785c;
    }

    public static final TwoWayConverter f(DpOffset.Companion companion) {
        return f2786d;
    }

    public static final TwoWayConverter g(IntOffset.Companion companion) {
        return f2789g;
    }

    public static final TwoWayConverter h(IntSize.Companion companion) {
        return f2790h;
    }

    public static final TwoWayConverter i(FloatCompanionObject floatCompanionObject) {
        return f2783a;
    }

    public static final TwoWayConverter j(IntCompanionObject intCompanionObject) {
        return f2784b;
    }
}
