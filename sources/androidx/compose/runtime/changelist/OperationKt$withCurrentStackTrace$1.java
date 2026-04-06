package androidx.compose.runtime.changelist;

import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class OperationKt$withCurrentStackTrace$1 implements OperationErrorContext {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SlotWriter f14987A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OperationErrorContext f14988z;

    public OperationKt$withCurrentStackTrace$1(OperationErrorContext operationErrorContext, SlotWriter slotWriter) {
        this.f14988z = operationErrorContext;
        this.f14987A = slotWriter;
    }

    public List f(Integer num) {
        List f2 = this.f14988z.f((Integer) null);
        int d0 = this.f14987A.d0();
        if (d0 < 0) {
            return f2;
        }
        SlotWriter slotWriter = this.f14987A;
        return CollectionsKt.x0(ComposeStackTraceBuilderKt.b(slotWriter, num, d0, Integer.valueOf(slotWriter.H0(d0))), f2);
    }
}
