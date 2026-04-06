package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class F implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12247A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12248z;

    public /* synthetic */ F(CoroutineScope coroutineScope, TooltipState tooltipState) {
        this.f12248z = coroutineScope;
        this.f12247A = tooltipState;
    }

    public final Object invoke() {
        return Boolean.valueOf(BasicTooltipKt.s(this.f12248z, this.f12247A));
    }
}
