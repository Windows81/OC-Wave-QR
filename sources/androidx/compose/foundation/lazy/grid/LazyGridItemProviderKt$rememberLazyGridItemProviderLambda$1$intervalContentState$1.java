package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<LazyGridIntervalContent> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f4600z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1(State state) {
        super(0);
        this.f4600z = state;
    }

    /* renamed from: b */
    public final LazyGridIntervalContent invoke() {
        return new LazyGridIntervalContent((Function1) this.f4600z.getValue());
    }
}
