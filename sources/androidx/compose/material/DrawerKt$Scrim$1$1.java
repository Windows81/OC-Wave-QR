package androidx.compose.material;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$Scrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7768A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7769z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$1$1(long j2, Function0 function0) {
        super(1);
        this.f7769z = j2;
        this.f7768A = function0;
    }

    public final void b(DrawScope drawScope) {
        DrawScope.A1(drawScope, this.f7769z, 0, 0, ((Number) this.f7768A.invoke()).floatValue(), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
