package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollState$canScrollBackward$2 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollState f3176z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollState$canScrollBackward$2(ScrollState scrollState) {
        super(0);
        this.f3176z = scrollState;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f3176z.n() > 0);
    }
}
