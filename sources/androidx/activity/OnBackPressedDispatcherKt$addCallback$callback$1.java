package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class OnBackPressedDispatcherKt$addCallback$callback$1 extends OnBackPressedCallback {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function1 f104d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnBackPressedDispatcherKt$addCallback$callback$1(boolean z2, Function1 function1) {
        super(z2);
        this.f104d = function1;
    }

    public void d() {
        this.f104d.invoke(this);
    }
}
