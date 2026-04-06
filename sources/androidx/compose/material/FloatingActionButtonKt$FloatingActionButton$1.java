package androidx.compose.material;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FloatingActionButtonKt$FloatingActionButton$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final FloatingActionButtonKt$FloatingActionButton$1 f7880z = new FloatingActionButtonKt$FloatingActionButton$1();

    public FloatingActionButtonKt$FloatingActionButton$1() {
        super(1);
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
