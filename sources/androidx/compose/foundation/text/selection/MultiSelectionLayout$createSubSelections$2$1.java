package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiSelectionLayout$createSubSelections$2$1 extends Lambda implements Function1<SelectableInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableLongObjectMap f6760A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Selection f6761B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MultiSelectionLayout f6762z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiSelectionLayout$createSubSelections$2$1(MultiSelectionLayout multiSelectionLayout, MutableLongObjectMap mutableLongObjectMap, Selection selection) {
        super(1);
        this.f6762z = multiSelectionLayout;
        this.f6760A = mutableLongObjectMap;
        this.f6761B = selection;
    }

    public final void b(SelectableInfo selectableInfo) {
        this.f6762z.o(this.f6760A, this.f6761B, selectableInfo, 0, selectableInfo.l());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SelectableInfo) obj);
        return Unit.f40552a;
    }
}
