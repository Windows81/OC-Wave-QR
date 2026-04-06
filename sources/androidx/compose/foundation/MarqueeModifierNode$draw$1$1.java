package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MarqueeModifierNode$draw$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContentDrawScope f3117z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$draw$1$1(ContentDrawScope contentDrawScope) {
        super(1);
        this.f3117z = contentDrawScope;
    }

    public final void b(DrawScope drawScope) {
        this.f3117z.q2();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
