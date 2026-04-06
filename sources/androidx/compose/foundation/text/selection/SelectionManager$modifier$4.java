package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$modifier$4 extends Lambda implements Function1<Boolean, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6909z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.f6909z = selectionManager;
    }

    public final void b(boolean z2) {
        this.f6909z.c0(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }
}
