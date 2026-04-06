package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class A implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12096A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12097B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12098z;

    public /* synthetic */ A(Function0 function0, TooltipState tooltipState, CoroutineScope coroutineScope, MutableState mutableState) {
        this.f12098z = function0;
        this.f12096A = tooltipState;
        this.f12097B = coroutineScope;
        this.C = mutableState;
    }

    public final Object invoke() {
        return BasicTooltipKt.n(this.f12098z, this.f12096A, this.f12097B, this.C);
    }
}
