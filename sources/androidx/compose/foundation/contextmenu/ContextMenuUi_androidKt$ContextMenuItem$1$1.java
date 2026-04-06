package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuUi_androidKt$ContextMenuItem$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f3275A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f3276z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuItem$1$1(boolean z2, Function0 function0) {
        super(0);
        this.f3276z = z2;
        this.f3275A = function0;
    }

    public final void invoke() {
        if (this.f3276z) {
            this.f3275A.invoke();
        }
    }
}
