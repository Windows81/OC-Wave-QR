package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OnLookaheadMeasured f2099z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(OnLookaheadMeasured onLookaheadMeasured) {
        super(3);
        this.f2099z = onLookaheadMeasured;
    }

    public final MeasureResult b(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        OnLookaheadMeasured onLookaheadMeasured = this.f2099z;
        if (measureScope.w1()) {
            onLookaheadMeasured.a(IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L)));
        }
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1(c0), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).r());
    }
}
