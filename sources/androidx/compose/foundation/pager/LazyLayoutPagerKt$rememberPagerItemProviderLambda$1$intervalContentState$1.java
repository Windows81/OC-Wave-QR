package androidx.compose.foundation.pager;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<PagerLayoutIntervalContent> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f5237A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f5238B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f5239z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(State state, State state2, Function0 function0) {
        super(0);
        this.f5239z = state;
        this.f5237A = state2;
        this.f5238B = function0;
    }

    /* renamed from: b */
    public final PagerLayoutIntervalContent invoke() {
        return new PagerLayoutIntervalContent((Function4) this.f5239z.getValue(), (Function1) this.f5237A.getValue(), ((Number) this.f5238B.invoke()).intValue());
    }
}
