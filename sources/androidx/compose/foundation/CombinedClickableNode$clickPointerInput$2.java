package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CombinedClickableNode$clickPointerInput$2 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNode f3040z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$2(CombinedClickableNode combinedClickableNode) {
        super(1);
        this.f3040z = combinedClickableNode;
    }

    public final void b(long j2) {
        Function0 E3 = this.f3040z.k0;
        if (E3 != null) {
            E3.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
