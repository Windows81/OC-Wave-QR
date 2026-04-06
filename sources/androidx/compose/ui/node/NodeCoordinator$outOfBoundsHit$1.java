package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$outOfBoundsHit$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f17398A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f17399B;
    public final /* synthetic */ long C;
    public final /* synthetic */ HitTestResult D;
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f17400z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$outOfBoundsHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f2, boolean z3) {
        super(0);
        this.f17400z = nodeCoordinator;
        this.f17398A = node;
        this.f17399B = hitTestSource;
        this.C = j2;
        this.D = hitTestResult;
        this.E = i2;
        this.F = z2;
        this.G = f2;
        this.H = z3;
    }

    public final void invoke() {
        this.f17400z.u3(NodeCoordinatorKt.d(this.f17398A, this.f17399B.a(), NodeKind.a(2)), this.f17399B, this.C, this.D, this.E, this.F, this.G, this.H);
    }
}
