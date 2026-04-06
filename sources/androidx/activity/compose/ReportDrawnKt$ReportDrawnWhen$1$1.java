package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ReportDrawnKt$ReportDrawnWhen$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f186A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FullyDrawnReporter f187z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1$1(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        super(1);
        this.f187z = fullyDrawnReporter;
        this.f186A = function0;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return this.f187z.e() ? new ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1() : new ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2(new ReportDrawnComposition(this.f187z, this.f186A));
    }
}
