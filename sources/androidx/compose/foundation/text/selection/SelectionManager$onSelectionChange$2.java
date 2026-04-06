package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$onSelectionChange$2 extends Lambda implements Function1<Selection, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f6915A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6916z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$onSelectionChange$2(SelectionManager selectionManager, Function1 function1) {
        super(1);
        this.f6916z = selectionManager;
        this.f6915A = function1;
    }

    public final void b(Selection selection) {
        this.f6916z.f0(selection);
        this.f6915A.invoke(selection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Selection) obj);
        return Unit.f40552a;
    }
}
