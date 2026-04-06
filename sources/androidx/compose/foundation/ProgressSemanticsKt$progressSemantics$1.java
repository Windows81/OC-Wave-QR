package androidx.compose.foundation;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class ProgressSemanticsKt$progressSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange f3148A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f3149B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f3150z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2) {
        super(1);
        this.f3150z = f2;
        this.f3148A = closedFloatingPointRange;
        this.f3149B = i2;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.r0(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) RangesKt.r(Float.valueOf(this.f3150z), this.f3148A)).floatValue(), this.f3148A, this.f3149B));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
