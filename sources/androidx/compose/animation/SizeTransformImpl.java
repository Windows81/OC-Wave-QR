package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class SizeTransformImpl implements SizeTransform {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2393a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f2394b;

    public SizeTransformImpl(boolean z2, Function2 function2) {
        this.f2393a = z2;
        this.f2394b = function2;
    }

    public boolean a() {
        return this.f2393a;
    }

    public FiniteAnimationSpec b(long j2, long j3) {
        return (FiniteAnimationSpec) this.f2394b.m(IntSize.b(j2), IntSize.b(j3));
    }
}
