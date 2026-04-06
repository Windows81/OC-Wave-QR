package androidx.compose.material;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref f7834A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f7835B;
    public final /* synthetic */ MutableIntState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowBoundsCalculator f7836z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1(WindowBoundsCalculator windowBoundsCalculator, Ref ref, int i2, MutableIntState mutableIntState) {
        super(0);
        this.f7836z = windowBoundsCalculator;
        this.f7834A = ref;
        this.f7835B = i2;
        this.C = mutableIntState;
    }

    public final void invoke() {
        int i2 = this.f7835B;
        final MutableIntState mutableIntState = this.C;
        ExposedDropdownMenu_androidKt.l(this.f7836z.a(), (LayoutCoordinates) this.f7834A.a(), i2, new Function1<Integer, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.f40552a;
            }

            public final void invoke(int i2) {
                ExposedDropdownMenu_androidKt.e(mutableIntState, i2);
            }
        });
    }
}
