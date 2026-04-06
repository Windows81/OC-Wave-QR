package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f3233A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f3234z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1(Function0 function0, ContextMenuState contextMenuState) {
        super(1);
        this.f3234z = function0;
        this.f3233A = contextMenuState;
    }

    public final void b(long j2) {
        this.f3234z.invoke();
        this.f3233A.b(new ContextMenuState.Status.Open(j2, (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
