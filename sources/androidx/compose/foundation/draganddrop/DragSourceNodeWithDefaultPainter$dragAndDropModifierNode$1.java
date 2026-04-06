package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragSourceNodeWithDefaultPainter f3307z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        super(1);
        this.f3307z = dragSourceNodeWithDefaultPainter;
    }

    public final void b(DrawScope drawScope) {
        this.f3307z.P.c(drawScope);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
