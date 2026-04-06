package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class FixupList extends OperationsDebugStringFormattable {

    /* renamed from: a  reason: collision with root package name */
    public final Operations f14945a = new Operations();

    /* renamed from: b  reason: collision with root package name */
    public final Operations f14946b = new Operations();

    public final void a() {
        this.f14946b.a();
        this.f14945a.a();
    }

    public final void b(Function0 function0, int i2, Anchor anchor) {
        Operations operations = this.f14945a;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.f14963c;
        operations.j(insertNodeFixup);
        Operations a2 = Operations.WriteScope.a(operations);
        Operations.WriteScope.d(a2, Operation.ObjectParameter.a(0), function0);
        a2.f14991c[a2.f14992d - a2.f14989a[a2.f14990b - 1].d()] = i2;
        Operations.WriteScope.d(a2, Operation.ObjectParameter.a(1), anchor);
        operations.c(insertNodeFixup);
        Operations operations2 = this.f14946b;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.f14969c;
        operations2.j(postInsertNodeFixup);
        Operations a3 = Operations.WriteScope.a(operations2);
        a3.f14991c[a3.f14992d - a3.f14989a[a3.f14990b - 1].d()] = i2;
        Operations.WriteScope.d(a3, Operation.ObjectParameter.a(0), anchor);
        operations2.c(postInsertNodeFixup);
    }

    public final void c() {
        if (!this.f14946b.g()) {
            ComposerKt.v("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f14946b.h(this.f14945a);
    }

    public final void d(Applier applier, SlotWriter slotWriter, RememberManager rememberManager, OperationErrorContext operationErrorContext) {
        if (!this.f14946b.f()) {
            ComposerKt.v("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f14945a.d(applier, slotWriter, rememberManager, operationErrorContext);
    }

    public final boolean e() {
        return this.f14945a.f();
    }

    public final void f(Object obj, Function2 function2) {
        Operations operations = this.f14945a;
        Operation.UpdateNode updateNode = Operation.UpdateNode.f14983c;
        operations.j(updateNode);
        Operations a2 = Operations.WriteScope.a(operations);
        Operations.WriteScope.d(a2, Operation.ObjectParameter.a(0), obj);
        int a3 = Operation.ObjectParameter.a(1);
        Intrinsics.g(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.d(a2, a3, (Function2) TypeIntrinsics.e(function2, 2));
        operations.c(updateNode);
    }
}
