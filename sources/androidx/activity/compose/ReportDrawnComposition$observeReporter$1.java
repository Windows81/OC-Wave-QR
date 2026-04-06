package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class ReportDrawnComposition$observeReporter$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f176A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(Ref.BooleanRef booleanRef, Function0 function0) {
        super(0);
        this.f177z = booleanRef;
        this.f176A = function0;
    }

    public final void invoke() {
        this.f177z.f40901z = ((Boolean) this.f176A.invoke()).booleanValue();
    }
}
