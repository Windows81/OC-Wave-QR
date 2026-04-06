package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class NestedScrollNode$updateDispatcherFields$1 extends Lambda implements Function0<CoroutineScope> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NestedScrollNode f16793z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$updateDispatcherFields$1(NestedScrollNode nestedScrollNode) {
        super(0);
        this.f16793z = nestedScrollNode;
    }

    /* renamed from: b */
    public final CoroutineScope invoke() {
        return this.f16793z.a3();
    }
}
