package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f8767A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8768z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f2, MutableState mutableState) {
        super(1);
        this.f8768z = f2;
        this.f8767A = mutableState;
    }

    public final void b(long j2) {
        float i2 = Size.i(j2) * this.f8768z;
        float g2 = Size.g(j2) * this.f8768z;
        if (Size.i(((Size) this.f8767A.getValue()).m()) != i2 || Size.g(((Size) this.f8767A.getValue()).m()) != g2) {
            this.f8767A.setValue(Size.c(SizeKt.a(i2, g2)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Size) obj).m());
        return Unit.f40552a;
    }
}
