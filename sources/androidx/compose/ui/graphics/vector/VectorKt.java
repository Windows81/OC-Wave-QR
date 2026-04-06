package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class VectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final List f16659a = CollectionsKt.m();

    /* renamed from: b  reason: collision with root package name */
    public static final int f16660b = StrokeCap.f16130b.a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f16661c = StrokeJoin.f16135b.b();

    /* renamed from: d  reason: collision with root package name */
    public static final int f16662d = BlendMode.f15926b.z();

    /* renamed from: e  reason: collision with root package name */
    public static final long f16663e = Color.f15975b.e();

    /* renamed from: f  reason: collision with root package name */
    public static final int f16664f = PathFillType.f16071b.b();

    public static final int a() {
        return f16664f;
    }

    public static final int b() {
        return f16660b;
    }

    public static final int c() {
        return f16661c;
    }

    public static final List d() {
        return f16659a;
    }

    public static final boolean e(long j2, long j3) {
        return Color.s(j2) == Color.s(j3) && Color.r(j2) == Color.r(j3) && Color.p(j2) == Color.p(j3);
    }

    public static final boolean f(ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
            int b2 = blendModeColorFilter.b();
            BlendMode.Companion companion = BlendMode.f15926b;
            if (BlendMode.F(b2, companion.z()) || BlendMode.F(blendModeColorFilter.b(), companion.B())) {
                return true;
            }
        } else if (colorFilter == null) {
            return true;
        }
        return false;
    }
}
