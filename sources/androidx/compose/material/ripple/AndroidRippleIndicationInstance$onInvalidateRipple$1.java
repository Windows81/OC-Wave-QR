package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidRippleIndicationInstance f9050z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.f9050z = androidRippleIndicationInstance;
    }

    public final void invoke() {
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.f9050z;
        androidRippleIndicationInstance.o(!androidRippleIndicationInstance.l());
    }
}
