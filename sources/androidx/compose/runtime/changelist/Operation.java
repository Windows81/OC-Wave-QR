package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public abstract class Operation {

    /* renamed from: a  reason: collision with root package name */
    public final int f14947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14948b;

    @Metadata
    public static final class AdvanceSlotsBy extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final AdvanceSlotsBy f14949c = new AdvanceSlotsBy();

        public AdvanceSlotsBy() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.A(operationArgContainer.getInt(0));
        }
    }

    @Metadata
    public static final class AppendValue extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final AppendValue f14950c = new AppendValue();

        public AppendValue() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Anchor anchor = (Anchor) operationArgContainer.a(ObjectParameter.a(0));
            Object a2 = operationArgContainer.a(ObjectParameter.a(1));
            if (a2 instanceof RememberObserverHolder) {
                rememberManager.e((RememberObserverHolder) a2);
            }
            slotWriter.D(anchor, a2);
        }
    }

    @Metadata
    public static final class ApplyChangeList extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final ApplyChangeList f14951c = new ApplyChangeList();

        public ApplyChangeList() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) operationArgContainer.a(ObjectParameter.a(1));
            int a2 = intRef != null ? intRef.a() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.a(ObjectParameter.a(0));
            if (a2 > 0) {
                applier = new OffsetApplier(applier, a2);
            }
            changeList.b(applier, slotWriter, rememberManager, operationErrorContext != null ? OperationKt.k(operationErrorContext, slotWriter) : null);
        }
    }

    @Metadata
    public static final class CopyNodesToNewAnchorLocation extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final CopyNodesToNewAnchorLocation f14952c = new CopyNodesToNewAnchorLocation();

        public CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int a2 = ((IntRef) operationArgContainer.a(ObjectParameter.a(0))).a();
            List list = (List) operationArgContainer.a(ObjectParameter.a(1));
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i3 = a2 + i2;
                applier.c(i3, obj);
                applier.j(i3, obj);
            }
        }
    }

    @Metadata
    public static final class CopySlotTableToAnchorLocation extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final CopySlotTableToAnchorLocation f14953c = new CopySlotTableToAnchorLocation();

        public CopySlotTableToAnchorLocation() {
            super(0, 4, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.a(ObjectParameter.a(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.a(ObjectParameter.a(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.a(ObjectParameter.a(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.a(ObjectParameter.a(0));
            if (movableContentState == null && (movableContentState = compositionContext.p(movableContentStateReference)) == null) {
                ComposerKt.w("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List A0 = slotWriter.A0(1, movableContentState.f(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.f14778h;
            ControlledComposition b2 = movableContentStateReference2.b();
            Intrinsics.g(b2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.a(slotWriter, A0, (RecomposeScopeOwner) b2);
        }
    }

    @Metadata
    public static final class DeactivateCurrentGroup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final DeactivateCurrentGroup f14954c = new DeactivateCurrentGroup();

        public DeactivateCurrentGroup() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ComposerKt.x(slotWriter, rememberManager);
        }
    }

    @Metadata
    public static final class DetermineMovableContentNodeIndex extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final DetermineMovableContentNodeIndex f14955c = new DetermineMovableContentNodeIndex();

        public DetermineMovableContentNodeIndex() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            ((IntRef) operationArgContainer.a(ObjectParameter.a(0))).b(OperationKt.i(slotWriter, (Anchor) operationArgContainer.a(ObjectParameter.a(1)), applier));
        }
    }

    @Metadata
    public static final class Downs extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final Downs f14956c = new Downs();

        public Downs() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object d2 : (Object[]) operationArgContainer.a(ObjectParameter.a(0))) {
                applier.d(d2);
            }
        }
    }

    @Metadata
    public static final class EndCompositionScope extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EndCompositionScope f14957c = new EndCompositionScope();

        public EndCompositionScope() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ((Function1) operationArgContainer.a(ObjectParameter.a(0))).invoke((Composition) operationArgContainer.a(ObjectParameter.a(1)));
        }
    }

    @Metadata
    public static final class EndCurrentGroup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EndCurrentGroup f14958c = new EndCurrentGroup();

        public EndCurrentGroup() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.R();
        }
    }

    @Metadata
    public static final class EndMovableContentPlacement extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EndMovableContentPlacement f14959c = new EndMovableContentPlacement();

        public EndMovableContentPlacement() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.j(slotWriter, applier, 0);
            slotWriter.R();
        }
    }

    @Metadata
    public static final class EndResumingScope extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EndResumingScope f14960c = new EndResumingScope();

        public EndResumingScope() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.a((RecomposeScopeImpl) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class EnsureGroupStarted extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EnsureGroupStarted f14961c = new EnsureGroupStarted();

        public EnsureGroupStarted() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.U((Anchor) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class EnsureRootGroupStarted extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final EnsureRootGroupStarted f14962c = new EnsureRootGroupStarted();

        public EnsureRootGroupStarted() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.T(0);
        }
    }

    @Metadata
    public static final class InsertNodeFixup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final InsertNodeFixup f14963c = new InsertNodeFixup();

        public InsertNodeFixup() {
            super(1, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object invoke = ((Function0) operationArgContainer.a(ObjectParameter.a(0))).invoke();
            int i2 = operationArgContainer.getInt(0);
            Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.u1((Anchor) operationArgContainer.a(ObjectParameter.a(1)), invoke);
            applier.j(i2, invoke);
            applier.d(invoke);
        }

        public Anchor c(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (Anchor) operationArgContainer.a(ObjectParameter.a(1));
        }
    }

    @Metadata
    public static final class InsertSlots extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final InsertSlots f14964c = new InsertSlots();

        public InsertSlots() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            SlotTable slotTable = (SlotTable) operationArgContainer.a(ObjectParameter.a(1));
            slotWriter.F();
            slotWriter.x0(slotTable, ((Anchor) operationArgContainer.a(ObjectParameter.a(0))).d(slotTable), false);
            slotWriter.S();
        }
    }

    @Metadata
    public static final class InsertSlotsWithFixups extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final InsertSlotsWithFixups f14965c = new InsertSlotsWithFixups();

        public InsertSlotsWithFixups() {
            super(0, 3, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            OperationErrorContext operationErrorContext2;
            SlotTable slotTable = (SlotTable) operationArgContainer.a(ObjectParameter.a(1));
            Anchor anchor = (Anchor) operationArgContainer.a(ObjectParameter.a(0));
            FixupList fixupList = (FixupList) operationArgContainer.a(ObjectParameter.a(2));
            SlotWriter F = slotTable.F();
            if (operationErrorContext != null) {
                try {
                    operationErrorContext2 = OperationKt.k(operationErrorContext, slotWriter);
                } catch (Throwable th) {
                    F.J(false);
                    throw th;
                }
            } else {
                operationErrorContext2 = null;
            }
            fixupList.d(applier, F, rememberManager, operationErrorContext2);
            Unit unit = Unit.f40552a;
            F.J(true);
            slotWriter.F();
            slotWriter.x0(slotTable, anchor.d(slotTable), false);
            slotWriter.S();
        }
    }

    @Metadata
    public static final class MoveCurrentGroup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final MoveCurrentGroup f14966c = new MoveCurrentGroup();

        public MoveCurrentGroup() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.y0(operationArgContainer.getInt(0));
        }
    }

    @Metadata
    public static final class MoveNode extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final MoveNode f14967c = new MoveNode();

        public MoveNode() {
            super(3, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.g(operationArgContainer.getInt(0), operationArgContainer.getInt(1), operationArgContainer.getInt(2));
        }
    }

    @JvmInline
    @Metadata
    public static final class ObjectParameter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f14968a;

        public static int a(int i2) {
            return i2;
        }

        public static boolean b(int i2, Object obj) {
            return (obj instanceof ObjectParameter) && i2 == ((ObjectParameter) obj).e();
        }

        public static int c(int i2) {
            return Integer.hashCode(i2);
        }

        public static String d(int i2) {
            return "ObjectParameter(offset=" + i2 + ')';
        }

        public final /* synthetic */ int e() {
            return this.f14968a;
        }

        public boolean equals(Object obj) {
            return b(this.f14968a, obj);
        }

        public int hashCode() {
            return c(this.f14968a);
        }

        public String toString() {
            return d(this.f14968a);
        }
    }

    @Metadata
    public static final class PostInsertNodeFixup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final PostInsertNodeFixup f14969c = new PostInsertNodeFixup();

        public PostInsertNodeFixup() {
            super(1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            applier.h();
            Intrinsics.g(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.c(i2, slotWriter.E0((Anchor) operationArgContainer.a(ObjectParameter.a(0))));
        }

        public Anchor c(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
            return (Anchor) operationArgContainer.a(ObjectParameter.a(0));
        }
    }

    @Metadata
    public static final class ReleaseMovableGroupAtCurrent extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final ReleaseMovableGroupAtCurrent f14970c = new ReleaseMovableGroupAtCurrent();

        public ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.a(ObjectParameter.a(2));
            ((CompositionContext) operationArgContainer.a(ObjectParameter.a(1))).o(movableContentStateReference, ComposerKt.A((ControlledComposition) operationArgContainer.a(ObjectParameter.a(0)), movableContentStateReference, slotWriter, (Applier) null), applier);
        }
    }

    @Metadata
    public static final class Remember extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final Remember f14971c = new Remember();

        public Remember() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.e((RememberObserverHolder) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class RememberPausingScope extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final RememberPausingScope f14972c = new RememberPausingScope();

        public RememberPausingScope() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.h((RecomposeScopeImpl) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class RemoveCurrentGroup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final RemoveCurrentGroup f14973c = new RemoveCurrentGroup();

        public RemoveCurrentGroup() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            ComposerKt.S(slotWriter, rememberManager);
        }
    }

    @Metadata
    public static final class RemoveNode extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final RemoveNode f14974c = new RemoveNode();

        public RemoveNode() {
            super(2, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.a(operationArgContainer.getInt(0), operationArgContainer.getInt(1));
        }
    }

    @Metadata
    public static final class ResetSlots extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final ResetSlots f14975c = new ResetSlots();

        public ResetSlots() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.R0();
        }
    }

    @Metadata
    public static final class SideEffect extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final SideEffect f14976c = new SideEffect();

        public SideEffect() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.b((Function0) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class SkipToEndOfCurrentGroup extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final SkipToEndOfCurrentGroup f14977c = new SkipToEndOfCurrentGroup();

        public SkipToEndOfCurrentGroup() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.Z0();
        }
    }

    @Metadata
    public static final class StartResumingScope extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final StartResumingScope f14978c = new StartResumingScope();

        public StartResumingScope() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            rememberManager.c((RecomposeScopeImpl) operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class TestOperation extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public final Function3 f14979c;

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            this.f14979c.d(applier, slotWriter, rememberManager);
        }

        public String toString() {
            return "TestOperation(ints = " + d() + ", objects = " + f() + ")@" + System_jvmKt.a(this);
        }
    }

    @Metadata
    public static final class TrimParentValues extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final TrimParentValues f14980c = new TrimParentValues();

        public TrimParentValues() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            int d0 = slotWriter.d0();
            int f1 = slotWriter.f1(d0);
            int e1 = slotWriter.e1(d0);
            for (int max = Math.max(f1, e1 - i2); max < e1; max++) {
                Object obj = slotWriter.f14867c[slotWriter.P(max)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.d((RememberObserverHolder) obj);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).A();
                }
            }
            slotWriter.m1(i2);
        }
    }

    @Metadata
    public static final class UpdateAnchoredValue extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final UpdateAnchoredValue f14981c = new UpdateAnchoredValue();

        public UpdateAnchoredValue() {
            super(1, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object a2 = operationArgContainer.a(ObjectParameter.a(0));
            Anchor anchor = (Anchor) operationArgContainer.a(ObjectParameter.a(1));
            int i2 = operationArgContainer.getInt(0);
            if (a2 instanceof RememberObserverHolder) {
                rememberManager.e((RememberObserverHolder) a2);
            }
            Object V0 = slotWriter.V0(slotWriter.C(anchor), i2, a2);
            if (V0 instanceof RememberObserverHolder) {
                rememberManager.d((RememberObserverHolder) V0);
            } else if (V0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) V0).A();
            }
        }
    }

    @Metadata
    public static final class UpdateAuxData extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final UpdateAuxData f14982c = new UpdateAuxData();

        public UpdateAuxData() {
            super(0, 1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            slotWriter.q1(operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class UpdateNode extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final UpdateNode f14983c = new UpdateNode();

        public UpdateNode() {
            super(0, 2, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.i((Function2) operationArgContainer.a(ObjectParameter.a(1)), operationArgContainer.a(ObjectParameter.a(0)));
        }
    }

    @Metadata
    public static final class UpdateValue extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final UpdateValue f14984c = new UpdateValue();

        public UpdateValue() {
            super(1, 1, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            Object a2 = operationArgContainer.a(ObjectParameter.a(0));
            int i2 = operationArgContainer.getInt(0);
            if (a2 instanceof RememberObserverHolder) {
                rememberManager.e((RememberObserverHolder) a2);
            }
            Object V0 = slotWriter.V0(slotWriter.b0(), i2, a2);
            if (V0 instanceof RememberObserverHolder) {
                rememberManager.d((RememberObserverHolder) V0);
            } else if (V0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) V0).A();
            }
        }
    }

    @Metadata
    public static final class Ups extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final Ups f14985c = new Ups();

        public Ups() {
            super(1, 0, 2, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            int i2 = operationArgContainer.getInt(0);
            for (int i3 = 0; i3 < i2; i3++) {
                applier.h();
            }
        }
    }

    @Metadata
    public static final class UseCurrentNode extends Operation {

        /* renamed from: c  reason: collision with root package name */
        public static final UseCurrentNode f14986c = new UseCurrentNode();

        public UseCurrentNode() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
            applier.e();
        }
    }

    public /* synthetic */ Operation(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public abstract void a(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext);

    public final void b(OperationArgContainer operationArgContainer, Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        Anchor c2 = c(operationArgContainer, slotWriter);
        try {
            a(operationArgContainer, applier, slotWriter, rememberManager, operationErrorContext);
        } catch (Throwable th) {
            throw OperationKt.f(th, operationErrorContext, slotWriter, c2);
        }
    }

    public Anchor c(OperationArgContainer operationArgContainer, SlotWriter slotWriter) {
        return null;
    }

    public final int d() {
        return this.f14947a;
    }

    public final String e() {
        String e2 = Reflection.b(getClass()).e();
        return e2 == null ? "" : e2;
    }

    public final int f() {
        return this.f14948b;
    }

    public String toString() {
        return e();
    }

    public Operation(int i2, int i3) {
        this.f14947a = i2;
        this.f14948b = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Operation(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (DefaultConstructorMarker) null);
    }
}
