package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends Lambda implements Function0<LazyLayoutItemProvider> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f4884z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(State state) {
        super(0);
        this.f4884z = state;
    }

    /* renamed from: b */
    public final LazyLayoutItemProvider invoke() {
        return (LazyLayoutItemProvider) ((Function0) this.f4884z.getValue()).invoke();
    }
}
