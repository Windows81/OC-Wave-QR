package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MeasurePassDelegate$layoutChildrenBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasurePassDelegate f17365z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasurePassDelegate$layoutChildrenBlock$1(MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.f17365z = measurePassDelegate;
    }

    public final void invoke() {
        this.f17365z.e1();
        this.f17365z.n0(AnonymousClass1.f17366z);
        this.f17365z.M().g1().r();
        this.f17365z.d1();
        this.f17365z.n0(AnonymousClass2.f17367z);
    }
}
