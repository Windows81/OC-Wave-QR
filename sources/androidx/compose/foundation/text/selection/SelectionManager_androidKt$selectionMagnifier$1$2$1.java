package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager_androidKt$selectionMagnifier$1$2$1 extends Lambda implements Function1<Function0<? extends Offset>, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f6928A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f6929z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1$2$1(Density density, MutableState mutableState) {
        super(1);
        this.f6929z = density;
        this.f6928A = mutableState;
    }

    /* renamed from: b */
    public final Modifier invoke(final Function0 function0) {
        Modifier.Companion companion = Modifier.f15489d;
        AnonymousClass1 r1 = new Function1<Density, Offset>() {
            public final long b(Density density) {
                return ((Offset) function0.invoke()).t();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Offset.d(b((Density) obj));
            }
        };
        final Density density = this.f6929z;
        final MutableState mutableState = this.f6928A;
        return Magnifier_androidKt.f(companion, r1, (Function1) null, new Function1<DpSize, Unit>() {
            public final void b(long j2) {
                MutableState mutableState = mutableState;
                Density density = density;
                int P1 = density.P1(DpSize.j(j2));
                SelectionManager_androidKt$selectionMagnifier$1.g(mutableState, IntSize.c((((long) density.P1(DpSize.i(j2))) & 4294967295L) | (((long) P1) << 32)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((DpSize) obj).m());
                return Unit.f40552a;
            }
        }, 0.0f, true, 0, 0.0f, 0.0f, false, PlatformMagnifierFactory.f3140a.a(), 490, (Object) null);
    }
}
