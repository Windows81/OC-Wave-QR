package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2142A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f2143B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2144z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("animateEnterExit");
        inspectorInfo.a().b("enter", this.f2144z);
        inspectorInfo.a().b("exit", this.f2142A);
        inspectorInfo.a().b("label", this.f2143B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
