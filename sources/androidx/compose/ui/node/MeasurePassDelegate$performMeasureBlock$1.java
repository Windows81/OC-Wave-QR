package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MeasurePassDelegate$performMeasureBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasurePassDelegate f17368z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$performMeasureBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.f17368z = measurePassDelegate;
    }

    public final void invoke() {
        this.f17368z.C1().c0(this.f17368z.b0);
    }
}
