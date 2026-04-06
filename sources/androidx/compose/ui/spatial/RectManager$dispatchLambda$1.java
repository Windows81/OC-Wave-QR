package androidx.compose.ui.spatial;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RectManager$dispatchLambda$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RectManager f18177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectManager$dispatchLambda$1(RectManager rectManager) {
        super(0);
        this.f18177z = rectManager;
    }

    public final void invoke() {
        this.f18177z.f18170h = null;
        RectManager rectManager = this.f18177z;
        Trace.beginSection("OnPositionedDispatch");
        try {
            rectManager.d();
            Unit unit = Unit.f40552a;
        } finally {
            Trace.endSection();
        }
    }
}
