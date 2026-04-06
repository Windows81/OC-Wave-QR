package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SelectionLayoutKt$isCollapsed$1 extends Lambda implements Function1<SelectableInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f6864z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionLayoutKt$isCollapsed$1(Ref.BooleanRef booleanRef) {
        super(1);
        this.f6864z = booleanRef;
    }

    public final void b(SelectableInfo selectableInfo) {
        if (selectableInfo.c().length() > 0) {
            this.f6864z.f40901z = false;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SelectableInfo) obj);
        return Unit.f40552a;
    }
}
