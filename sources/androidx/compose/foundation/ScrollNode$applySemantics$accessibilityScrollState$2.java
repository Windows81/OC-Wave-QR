package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollNode$applySemantics$accessibilityScrollState$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollNode f3157z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollNode$applySemantics$accessibilityScrollState$2(ScrollNode scrollNode) {
        super(0);
        this.f3157z = scrollNode;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf((float) this.f3157z.a3().m());
    }
}
