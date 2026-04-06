package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.c8  reason: case insensitive filesystem */
public final /* synthetic */ class C0071c8 implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f11896A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Density f11897B;
    public final /* synthetic */ PopupPositionProvider C;
    public final /* synthetic */ MutableState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f11898z;

    public /* synthetic */ C0071c8(long j2, Function1 function1, Density density, PopupPositionProvider popupPositionProvider, MutableState mutableState) {
        this.f11898z = j2;
        this.f11896A = function1;
        this.f11897B = density;
        this.C = popupPositionProvider;
        this.D = mutableState;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return TooltipKt.x(this.f11898z, this.f11896A, this.f11897B, this.C, this.D, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}
