package b;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.OperationErrorContext;
import androidx.compose.runtime.changelist.OperationKt;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SlotWriter f18204A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ OperationErrorContext f18205B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Anchor f18206z;

    public /* synthetic */ a(Anchor anchor, SlotWriter slotWriter, OperationErrorContext operationErrorContext) {
        this.f18206z = anchor;
        this.f18204A = slotWriter;
        this.f18205B = operationErrorContext;
    }

    public final Object invoke() {
        return OperationKt.g(this.f18206z, this.f18204A, this.f18205B);
    }
}
