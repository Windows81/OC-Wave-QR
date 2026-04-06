package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.y  reason: case insensitive filesystem */
public final /* synthetic */ class C0151y implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12461z;

    public /* synthetic */ C0151y(TooltipState tooltipState) {
        this.f12461z = tooltipState;
    }

    public final Object invoke(Object obj) {
        return BasicTooltipKt.j(this.f12461z, (DisposableEffectScope) obj);
    }
}
