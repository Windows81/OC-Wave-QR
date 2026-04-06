package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetKt$Scrim$dismissModifier$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8011A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8012z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissModifier$2$1(String str, Function0 function0) {
        super(1);
        this.f8012z = str;
        this.f8011A = function0;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, this.f8012z);
        final Function0 function0 = this.f8011A;
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
            /* renamed from: b */
            public final Boolean invoke() {
                function0.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
