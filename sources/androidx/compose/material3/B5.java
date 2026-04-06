package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class B5 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f9231A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9232z;

    public /* synthetic */ B5(CoroutineScope coroutineScope, SearchBarState searchBarState) {
        this.f9232z = coroutineScope;
        this.f9231A = searchBarState;
    }

    public final Object invoke() {
        return SearchBarKt.h(this.f9232z, this.f9231A);
    }
}
