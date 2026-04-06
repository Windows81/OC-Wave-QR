package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 extends Lambda implements Function2<IntRect, IntRect, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f7813z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(MutableState mutableState) {
        super(2);
        this.f7813z = mutableState;
    }

    public final void b(IntRect intRect, IntRect intRect2) {
        this.f7813z.setValue(TransformOrigin.b(MenuKt.h(intRect, intRect2)));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((IntRect) obj, (IntRect) obj2);
        return Unit.f40552a;
    }
}
