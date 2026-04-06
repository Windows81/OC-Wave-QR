package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7830A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f7831z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1(Function1 function1, boolean z2) {
        super(0);
        this.f7831z = function1;
        this.f7830A = z2;
    }

    public final void invoke() {
        this.f7831z.invoke(Boolean.valueOf(!this.f7830A));
    }
}
