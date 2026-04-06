package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$speculativeHit$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f17401A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f17402B;
    public final /* synthetic */ long C;
    public final /* synthetic */ HitTestResult D;
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f17403z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$speculativeHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f2) {
        super(0);
        this.f17403z = nodeCoordinator;
        this.f17401A = node;
        this.f17402B = hitTestSource;
        this.C = j2;
        this.D = hitTestResult;
        this.E = i2;
        this.F = z2;
        this.G = f2;
    }

    public final void invoke() {
        this.f17403z.u3(NodeCoordinatorKt.d(this.f17401A, this.f17402B.a(), NodeKind.a(2)), this.f17402B, this.C, this.D, this.E, this.F, this.G, false);
    }
}
