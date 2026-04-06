package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionContainerKt$SelectionContainer$1$1 extends Lambda implements Function1<Selection, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f6799z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(MutableState mutableState) {
        super(1);
        this.f6799z = mutableState;
    }

    public final void b(Selection selection) {
        SelectionContainerKt.e(this.f6799z, selection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Selection) obj);
        return Unit.f40552a;
    }
}
