package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Painter$drawLambda$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f16459z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Painter$drawLambda$1(Painter painter) {
        super(1);
        this.f16459z = painter;
    }

    public final void b(DrawScope drawScope) {
        this.f16459z.m(drawScope);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
