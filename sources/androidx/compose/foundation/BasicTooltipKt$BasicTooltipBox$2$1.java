package androidx.compose.foundation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTooltipKt$BasicTooltipBox$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2935z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$BasicTooltipBox$2$1(BasicTooltipState basicTooltipState) {
        super(1);
        this.f2935z = basicTooltipState;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new BasicTooltipKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1(this.f2935z);
    }
}
