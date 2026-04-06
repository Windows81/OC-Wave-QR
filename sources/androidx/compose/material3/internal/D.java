package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.ui.focus.FocusState;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class D implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12207A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12208z;

    public /* synthetic */ D(CoroutineScope coroutineScope, TooltipState tooltipState) {
        this.f12208z = coroutineScope;
        this.f12207A = tooltipState;
    }

    public final Object invoke(Object obj) {
        return BasicTooltipKt.v(this.f12208z, this.f12207A, (FocusState) obj);
    }
}
