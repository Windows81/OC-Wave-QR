package androidx.compose.foundation;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImageKt$Image$semantics$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f3086z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$semantics$1$1(String str) {
        super(1);
        this.f3086z = str;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, this.f3086z);
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.e());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
