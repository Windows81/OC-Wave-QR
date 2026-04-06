package androidx.compose.material;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WindowBoundsCalculator f7826A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f7827B;
    public final /* synthetic */ MutableIntState C;
    public final /* synthetic */ MutableIntState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref f7828z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1(Ref ref, WindowBoundsCalculator windowBoundsCalculator, int i2, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(1);
        this.f7828z = ref;
        this.f7826A = windowBoundsCalculator;
        this.f7827B = i2;
        this.C = mutableIntState;
        this.D = mutableIntState2;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        ExposedDropdownMenu_androidKt.c(this.C, IntSize.g(layoutCoordinates.a()));
        this.f7828z.b(layoutCoordinates);
        int i2 = this.f7827B;
        final MutableIntState mutableIntState = this.D;
        ExposedDropdownMenu_androidKt.l(this.f7826A.a(), (LayoutCoordinates) this.f7828z.a(), i2, new Function1<Integer, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.f40552a;
            }

            public final void invoke(int i2) {
                ExposedDropdownMenu_androidKt.e(mutableIntState, i2);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
