package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RenderNodeLayer$updateDisplayList$1$1 extends Lambda implements Function1<Canvas, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f17867z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(Function2 function2) {
        super(1);
        this.f17867z = function2;
    }

    public final void b(Canvas canvas) {
        this.f17867z.m(canvas, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Canvas) obj);
        return Unit.f40552a;
    }
}
