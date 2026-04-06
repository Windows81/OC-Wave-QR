package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CombinedClickableNode$clickPointerInput$5 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNode f3042z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$5(CombinedClickableNode combinedClickableNode) {
        super(1);
        this.f3042z = combinedClickableNode;
    }

    public final void b(long j2) {
        if (this.f3042z.s3()) {
            this.f3042z.t3().invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
