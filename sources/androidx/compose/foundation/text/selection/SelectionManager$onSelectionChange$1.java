package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$onSelectionChange$1 extends Lambda implements Function1<Selection, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6914z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$onSelectionChange$1(SelectionManager selectionManager) {
        super(1);
        this.f6914z = selectionManager;
    }

    public final void b(Selection selection) {
        this.f6914z.f0(selection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Selection) obj);
        return Unit.f40552a;
    }
}
