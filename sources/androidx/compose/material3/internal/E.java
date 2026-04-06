package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class E implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12239A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12240B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f12241z;

    public /* synthetic */ E(String str, CoroutineScope coroutineScope, TooltipState tooltipState) {
        this.f12241z = str;
        this.f12239A = coroutineScope;
        this.f12240B = tooltipState;
    }

    public final Object invoke(Object obj) {
        return BasicTooltipKt.r(this.f12241z, this.f12239A, this.f12240B, (SemanticsPropertyReceiver) obj);
    }
}
