package androidx.compose.material;

import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f8435A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8436B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8437z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1(boolean z2, String str, SnackbarData snackbarData) {
        super(1);
        this.f8437z = z2;
        this.f8435A = str;
        this.f8436B = snackbarData;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.f8437z) {
            SemanticsPropertiesKt.m0(semanticsPropertyReceiver, LiveRegionMode.f18031b.b());
        }
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, this.f8435A);
        final SnackbarData snackbarData = this.f8436B;
        SemanticsPropertiesKt.n(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
            /* renamed from: b */
            public final Boolean invoke() {
                snackbarData.dismiss();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
