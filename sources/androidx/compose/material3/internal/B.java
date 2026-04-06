package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final /* synthetic */ class B implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12148A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f12149B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f12150z;

    public /* synthetic */ B(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, Function0 function0, CoroutineScope coroutineScope, boolean z2, MutableState mutableState, Function2 function2, int i2) {
        this.f12150z = popupPositionProvider;
        this.f12148A = tooltipState;
        this.f12149B = function0;
        this.C = coroutineScope;
        this.D = z2;
        this.E = mutableState;
        this.F = function2;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return BasicTooltipKt.m(this.f12150z, this.f12148A, this.f12149B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
