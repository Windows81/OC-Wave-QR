package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
final class ContextMenuGestures_androidKt$contextMenuGestures$1 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f3240z;

    public final void b(long j2) {
        this.f3240z.b(new ContextMenuState.Status.Open(j2, (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
