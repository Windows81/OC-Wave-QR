package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
final class ReportDrawnComposition implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f173A;

    /* renamed from: B  reason: collision with root package name */
    public final SnapshotStateObserver f174B;
    public final Function1 C = new ReportDrawnComposition$checkReporter$1(this);

    /* renamed from: z  reason: collision with root package name */
    public final FullyDrawnReporter f175z;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        this.f175z = fullyDrawnReporter;
        this.f173A = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.f178z);
        snapshotStateObserver.q();
        this.f174B = snapshotStateObserver;
        fullyDrawnReporter.b(this);
        if (!fullyDrawnReporter.e()) {
            fullyDrawnReporter.c();
            e(function0);
        }
    }

    public void c() {
        this.f174B.f();
        this.f174B.r();
    }

    public final void e(Function0 function0) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f174B.k(function0, this.C, new ReportDrawnComposition$observeReporter$1(booleanRef, function0));
        if (booleanRef.f40901z) {
            f();
        }
    }

    public final void f() {
        this.f174B.g(this.f173A);
        if (!this.f175z.e()) {
            this.f175z.g();
        }
        c();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        c();
        return Unit.f40552a;
    }
}
