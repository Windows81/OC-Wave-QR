package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<LazyListIntervalContent> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f4373z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1(State state) {
        super(0);
        this.f4373z = state;
    }

    /* renamed from: b */
    public final LazyListIntervalContent invoke() {
        return new LazyListIntervalContent((Function1) this.f4373z.getValue());
    }
}
