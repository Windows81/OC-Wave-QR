package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedBoundsNode$draw$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f2306A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContentDrawScope f2307z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$1(ContentDrawScope contentDrawScope, SharedBoundsNode sharedBoundsNode) {
        super(1);
        this.f2307z = contentDrawScope;
        this.f2306A = sharedBoundsNode;
    }

    public final void b(DrawScope drawScope) {
        this.f2307z.q2();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
