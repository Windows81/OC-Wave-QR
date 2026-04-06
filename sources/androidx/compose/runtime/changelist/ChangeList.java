package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class ChangeList extends OperationsDebugStringFormattable {

    /* renamed from: a  reason: collision with root package name */
    public final Operations f14930a = new Operations();

    public final void A(int i2, int i3) {
        Operations operations = this.f14930a;
        Operation.RemoveNode removeNode = Operation.RemoveNode.f14974c;
        operations.j(removeNode);
        Operations a2 = Operations.WriteScope.a(operations);
        int d2 = a2.f14992d - a2.f14989a[a2.f14990b - 1].d();
        int[] iArr = a2.f14991c;
        iArr[d2] = i2;
        iArr[d2 + 1] = i3;
        operations.c(removeNode);
    }

    public final void B() {
        this.f14930a.i(Operation.ResetSlots.f14975c);
    }

    public final void C(Function0 function0) {
        Operations operations = this.f14930a;
        Operation.SideEffect sideEffect = Operation.SideEffect.f14976c;
        operations.j(sideEffect);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), function0);
        operations.c(sideEffect);
    }

    public final void D() {
        this.f14930a.i(Operation.SkipToEndOfCurrentGroup.f14977c);
    }

    public final void E(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.f14930a;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.f14978c;
        operations.j(startResumingScope);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), recomposeScopeImpl);
        operations.c(startResumingScope);
    }

    public final void F(int i2) {
        Operations operations = this.f14930a;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.f14980c;
        operations.j(trimParentValues);
        Operations a2 = Operations.WriteScope.a(operations);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(trimParentValues);
    }

    public final void G(Object obj, Anchor anchor, int i2) {
        Operations operations = this.f14930a;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.f14981c;
        operations.j(updateAnchoredValue);
        Operations a2 = Operations.WriteScope.a(operations);
        Operations.WriteScope.e(a2, Operation.ObjectParameter.a(0), obj, Operation.ObjectParameter.a(1), anchor);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(updateAnchoredValue);
    }

    public final void H(Object obj) {
        Operations operations = this.f14930a;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.f14982c;
        operations.j(updateAuxData);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), obj);
        operations.c(updateAuxData);
    }

    public final void I(Object obj, Function2 function2) {
        Operations operations = this.f14930a;
        Operation.UpdateNode updateNode = Operation.UpdateNode.f14983c;
        operations.j(updateNode);
        Operations a2 = Operations.WriteScope.a(operations);
        int a3 = Operation.ObjectParameter.a(0);
        int a4 = Operation.ObjectParameter.a(1);
        Intrinsics.g(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.e(a2, a3, obj, a4, (Function2) TypeIntrinsics.e(function2, 2));
        operations.c(updateNode);
    }

    public final void J(Object obj, int i2) {
        Operations operations = this.f14930a;
        Operation.UpdateValue updateValue = Operation.UpdateValue.f14984c;
        operations.j(updateValue);
        Operations a2 = Operations.WriteScope.a(operations);
        Operations.WriteScope.d(a2, Operation.ObjectParameter.a(0), obj);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(updateValue);
    }

    public final void K(int i2) {
        Operations operations = this.f14930a;
        Operation.Ups ups = Operation.Ups.f14985c;
        operations.j(ups);
        Operations a2 = Operations.WriteScope.a(operations);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(ups);
    }

    public final void L(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.f14930a.i(Operation.UseCurrentNode.f14986c);
        }
    }

    public final void a() {
        this.f14930a.a();
    }

    public final void b(Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        this.f14930a.d(applier, slotWriter, rememberManager, operationErrorContext);
    }

    public final boolean c() {
        return this.f14930a.f();
    }

    public final boolean d() {
        return this.f14930a.g();
    }

    public final void e(int i2) {
        Operations operations = this.f14930a;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.f14949c;
        operations.j(advanceSlotsBy);
        Operations a2 = Operations.WriteScope.a(operations);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(advanceSlotsBy);
    }

    public final void f(Anchor anchor, Object obj) {
        Operations operations = this.f14930a;
        Operation.AppendValue appendValue = Operation.AppendValue.f14950c;
        operations.j(appendValue);
        Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), anchor, Operation.ObjectParameter.a(1), obj);
        operations.c(appendValue);
    }

    public final void g(List list, IntRef intRef) {
        if (!list.isEmpty()) {
            Operations operations = this.f14930a;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.f14952c;
            operations.j(copyNodesToNewAnchorLocation);
            Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(1), list, Operation.ObjectParameter.a(0), intRef);
            operations.c(copyNodesToNewAnchorLocation);
        }
    }

    public final void h(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.f14930a;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.f14953c;
        operations.j(copySlotTableToAnchorLocation);
        Operations.WriteScope.f(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), movableContentState, Operation.ObjectParameter.a(1), compositionContext, Operation.ObjectParameter.a(3), movableContentStateReference2, Operation.ObjectParameter.a(2), movableContentStateReference);
        operations.c(copySlotTableToAnchorLocation);
    }

    public final void i() {
        this.f14930a.i(Operation.DeactivateCurrentGroup.f14954c);
    }

    public final void j(IntRef intRef, Anchor anchor) {
        Operations operations = this.f14930a;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.f14955c;
        operations.j(determineMovableContentNodeIndex);
        Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), intRef, Operation.ObjectParameter.a(1), anchor);
        operations.c(determineMovableContentNodeIndex);
    }

    public final void k(Object[] objArr) {
        if (!(objArr.length == 0)) {
            Operations operations = this.f14930a;
            Operation.Downs downs = Operation.Downs.f14956c;
            operations.j(downs);
            Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), objArr);
            operations.c(downs);
        }
    }

    public final void l(Function1 function1, Composition composition) {
        Operations operations = this.f14930a;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.f14957c;
        operations.j(endCompositionScope);
        Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), function1, Operation.ObjectParameter.a(1), composition);
        operations.c(endCompositionScope);
    }

    public final void m() {
        this.f14930a.i(Operation.EndCurrentGroup.f14958c);
    }

    public final void n() {
        this.f14930a.i(Operation.EndMovableContentPlacement.f14959c);
    }

    public final void o(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.f14930a;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.f14960c;
        operations.j(endResumingScope);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), recomposeScopeImpl);
        operations.c(endResumingScope);
    }

    public final void p(Anchor anchor) {
        Operations operations = this.f14930a;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.f14961c;
        operations.j(ensureGroupStarted);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), anchor);
        operations.c(ensureGroupStarted);
    }

    public final void q() {
        this.f14930a.i(Operation.EnsureRootGroupStarted.f14962c);
    }

    public final void r(ChangeList changeList, IntRef intRef) {
        if (changeList.d()) {
            Operations operations = this.f14930a;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.f14951c;
            operations.j(applyChangeList);
            Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), changeList, Operation.ObjectParameter.a(1), intRef);
            operations.c(applyChangeList);
        }
    }

    public final void s(Anchor anchor, SlotTable slotTable) {
        Operations operations = this.f14930a;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.f14964c;
        operations.j(insertSlots);
        Operations.WriteScope.e(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), anchor, Operation.ObjectParameter.a(1), slotTable);
        operations.c(insertSlots);
    }

    public final void t(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.f14930a;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.f14965c;
        operations.j(insertSlotsWithFixups);
        Operations.WriteScope.g(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), anchor, Operation.ObjectParameter.a(1), slotTable, Operation.ObjectParameter.a(2), fixupList);
        operations.c(insertSlotsWithFixups);
    }

    public final void u(int i2) {
        Operations operations = this.f14930a;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.f14966c;
        operations.j(moveCurrentGroup);
        Operations a2 = Operations.WriteScope.a(operations);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        operations.c(moveCurrentGroup);
    }

    public final void v(int i2, int i3, int i4) {
        Operations operations = this.f14930a;
        Operation.MoveNode moveNode = Operation.MoveNode.f14967c;
        operations.j(moveNode);
        Operations a2 = Operations.WriteScope.a(operations);
        int d2 = a2.f14992d - a2.f14989a[a2.f14990b - 1].d();
        int[] iArr = a2.f14991c;
        iArr[d2 + 1] = i2;
        iArr[d2] = i3;
        iArr[d2 + 2] = i4;
        operations.c(moveNode);
    }

    public final void w(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.f14930a;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.f14970c;
        operations.j(releaseMovableGroupAtCurrent);
        Operations.WriteScope.g(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), controlledComposition, Operation.ObjectParameter.a(1), compositionContext, Operation.ObjectParameter.a(2), movableContentStateReference);
        operations.c(releaseMovableGroupAtCurrent);
    }

    public final void x(RememberObserverHolder rememberObserverHolder) {
        Operations operations = this.f14930a;
        Operation.Remember remember = Operation.Remember.f14971c;
        operations.j(remember);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), rememberObserverHolder);
        operations.c(remember);
    }

    public final void y(RecomposeScopeImpl recomposeScopeImpl) {
        Operations operations = this.f14930a;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.f14972c;
        operations.j(rememberPausingScope);
        Operations.WriteScope.d(Operations.WriteScope.a(operations), Operation.ObjectParameter.a(0), recomposeScopeImpl);
        operations.c(rememberPausingScope);
    }

    public final void z() {
        this.f14930a.i(Operation.RemoveCurrentGroup.f14973c);
    }
}
