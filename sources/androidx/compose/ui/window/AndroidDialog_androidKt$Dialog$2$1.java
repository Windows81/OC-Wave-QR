package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidDialog_androidKt$Dialog$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f19263A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DialogProperties f19264B;
    public final /* synthetic */ LayoutDirection C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DialogWrapper f19265z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2$1(DialogWrapper dialogWrapper, Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.f19265z = dialogWrapper;
        this.f19263A = function0;
        this.f19264B = dialogProperties;
        this.C = layoutDirection;
    }

    public final void invoke() {
        this.f19265z.p(this.f19263A, this.f19264B, this.C);
    }
}
