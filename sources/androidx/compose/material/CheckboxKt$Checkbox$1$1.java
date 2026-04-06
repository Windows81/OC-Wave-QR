package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$Checkbox$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7453A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f7454z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$1$1(Function1 function1, boolean z2) {
        super(0);
        this.f7454z = function1;
        this.f7453A = z2;
    }

    public final void invoke() {
        this.f7454z.invoke(Boolean.valueOf(!this.f7453A));
    }
}
