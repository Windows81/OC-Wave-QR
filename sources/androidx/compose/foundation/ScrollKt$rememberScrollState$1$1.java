package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollKt$rememberScrollState$1$1 extends Lambda implements Function0<ScrollState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f3155z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1$1(int i2) {
        super(0);
        this.f3155z = i2;
    }

    /* renamed from: b */
    public final ScrollState invoke() {
        return new ScrollState(this.f3155z);
    }
}
