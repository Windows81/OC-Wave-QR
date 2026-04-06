package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawCacheModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackwardsCompatNode$updateDrawCache$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f17211A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier.Element f17212z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f17212z = element;
        this.f17211A = backwardsCompatNode;
    }

    public final void invoke() {
        ((DrawCacheModifier) this.f17212z).U0(this.f17211A);
    }
}
