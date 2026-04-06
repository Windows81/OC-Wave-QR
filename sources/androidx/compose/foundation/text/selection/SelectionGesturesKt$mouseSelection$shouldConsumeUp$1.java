package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionGesturesKt$mouseSelection$shouldConsumeUp$1 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MouseSelectionObserver f6822z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelection$shouldConsumeUp$1(MouseSelectionObserver mouseSelectionObserver) {
        super(1);
        this.f6822z = mouseSelectionObserver;
    }

    public final void b(PointerInputChange pointerInputChange) {
        if (this.f6822z.a(pointerInputChange.h())) {
            pointerInputChange.a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
