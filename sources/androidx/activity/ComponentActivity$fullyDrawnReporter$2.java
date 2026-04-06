package androidx.activity;

import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComponentActivity$fullyDrawnReporter$2 extends Lambda implements Function0<FullyDrawnReporter> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f52z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentActivity$fullyDrawnReporter$2(ComponentActivity componentActivity) {
        super(0);
        this.f52z = componentActivity;
    }

    /* renamed from: b */
    public final FullyDrawnReporter invoke() {
        ComponentActivity.ReportFullyDrawnExecutor O = this.f52z.F;
        final ComponentActivity componentActivity = this.f52z;
        return new FullyDrawnReporter(O, new Function0<Unit>() {
            public final void invoke() {
                componentActivity.reportFullyDrawn();
            }
        });
    }
}
