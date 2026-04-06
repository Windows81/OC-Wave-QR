package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class NestedScrollDispatcher$calculateNestedScrollScope$1 extends Lambda implements Function0<CoroutineScope> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f16790z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$calculateNestedScrollScope$1(NestedScrollDispatcher nestedScrollDispatcher) {
        super(0);
        this.f16790z = nestedScrollDispatcher;
    }

    /* renamed from: b */
    public final CoroutineScope invoke() {
        return this.f16790z.h();
    }
}
