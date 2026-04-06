package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowLayoutKt$breakDownItems$1$1 extends Lambda implements Function1<Placeable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3953z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$1$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f3953z = objectRef;
    }

    public final void b(Placeable placeable) {
        this.f3953z.f40908z = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable) obj);
        return Unit.f40552a;
    }
}
