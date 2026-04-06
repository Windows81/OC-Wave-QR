package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackgroundNode$getOutline$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContentDrawScope f2925A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackgroundNode f2926z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundNode$getOutline$1(BackgroundNode backgroundNode, ContentDrawScope contentDrawScope) {
        super(0);
        this.f2926z = backgroundNode;
        this.f2925A = contentDrawScope;
    }

    public final void invoke() {
        BackgroundNode backgroundNode = this.f2926z;
        backgroundNode.V = backgroundNode.d3().a(this.f2925A.c(), this.f2925A.getLayoutDirection(), this.f2925A);
    }
}
