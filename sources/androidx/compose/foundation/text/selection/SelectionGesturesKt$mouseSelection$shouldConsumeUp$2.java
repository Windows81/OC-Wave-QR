package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SelectionGesturesKt$mouseSelection$shouldConsumeUp$2 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SelectionAdjustment f6823A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f6824B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MouseSelectionObserver f6825z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelection$shouldConsumeUp$2(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment, Ref.BooleanRef booleanRef) {
        super(1);
        this.f6825z = mouseSelectionObserver;
        this.f6823A = selectionAdjustment;
        this.f6824B = booleanRef;
    }

    public final void b(PointerInputChange pointerInputChange) {
        if (this.f6825z.d(pointerInputChange.h(), this.f6823A)) {
            pointerInputChange.a();
            this.f6824B.f40901z = true;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
