package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MeasurePassDelegate$remeasure$2 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final MeasurePassDelegate$remeasure$2 f17370z = new MeasurePassDelegate$remeasure$2();

    public MeasurePassDelegate$remeasure$2() {
        super(1);
    }

    public final void b(AlignmentLinesOwner alignmentLinesOwner) {
        alignmentLinesOwner.q().u(false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AlignmentLinesOwner) obj);
        return Unit.f40552a;
    }
}
