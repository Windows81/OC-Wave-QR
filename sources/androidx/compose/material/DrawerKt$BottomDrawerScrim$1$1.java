package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$BottomDrawerScrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f7733A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7734z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$1$1(long j2, State state) {
        super(1);
        this.f7734z = j2;
        this.f7733A = state;
    }

    public final void b(DrawScope drawScope) {
        DrawScope.A1(drawScope, this.f7734z, 0, 0, DrawerKt.c(this.f7733A), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
