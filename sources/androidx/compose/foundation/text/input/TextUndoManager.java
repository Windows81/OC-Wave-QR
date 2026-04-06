package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextUndoManager {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f6093c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6094d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final UndoManager f6095a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f6096b;

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {

            /* renamed from: a  reason: collision with root package name */
            public static final Saver f6098a = new Saver();

            /* renamed from: b  reason: collision with root package name */
            public static final androidx.compose.runtime.saveable.Saver f6099b = new TextUndoManager$Companion$Saver$special$$inlined$createSaver$1(TextUndoOperation.f6580i.a());

            /* renamed from: c  reason: collision with root package name */
            public static final int f6100c = 8;

            static {
                UndoManager.Companion companion = UndoManager.f6590d;
            }

            /* renamed from: c */
            public TextUndoManager a(Object obj) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation textUndoOperation = obj2 != null ? (TextUndoOperation) TextUndoOperation.f6580i.a().a(obj2) : null;
                androidx.compose.runtime.saveable.Saver saver = f6099b;
                Intrinsics.f(obj3);
                UndoManager undoManager = (UndoManager) saver.a(obj3);
                Intrinsics.f(undoManager);
                return new TextUndoManager(textUndoOperation, undoManager);
            }

            /* renamed from: d */
            public Object b(SaverScope saverScope, TextUndoManager textUndoManager) {
                TextUndoOperation a2 = textUndoManager.g();
                return CollectionsKt.p(a2 != null ? TextUndoOperation.f6580i.a().b(saverScope, a2) : null, f6099b.b(saverScope, textUndoManager.f6095a));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager) {
        this.f6095a = undoManager;
        this.f6096b = SnapshotStateKt__SnapshotStateKt.e(textUndoOperation, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public final void c() {
        j((TextUndoOperation) null);
        this.f6095a.d();
    }

    public final void d() {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            TextUndoOperation g3 = g();
            if (g3 != null) {
                this.f6095a.h(g3);
            }
            j((TextUndoOperation) null);
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public final boolean e() {
        return this.f6095a.e() && g() == null;
    }

    public final boolean f() {
        return this.f6095a.f() || g() != null;
    }

    public final TextUndoOperation g() {
        return (TextUndoOperation) this.f6096b.getValue();
    }

    public final void h(TextUndoOperation textUndoOperation) {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            TextUndoOperation g3 = g();
            if (g3 == null) {
                j(textUndoOperation);
                return;
            }
            TextUndoOperation b2 = TextUndoManagerKt.b(g3, textUndoOperation);
            if (b2 != null) {
                j(b2);
                return;
            }
            d();
            j(textUndoOperation);
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public final void i(TextFieldState textFieldState) {
        if (e()) {
            TextUndoOperationKt.a(textFieldState, (TextUndoOperation) this.f6095a.i());
        }
    }

    public final void j(TextUndoOperation textUndoOperation) {
        this.f6096b.setValue(textUndoOperation);
    }

    public final void k(TextFieldState textFieldState) {
        if (f()) {
            d();
            TextUndoOperationKt.b(textFieldState, (TextUndoOperation) this.f6095a.j());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textUndoOperation, (i2 & 2) != 0 ? new UndoManager((List) null, (List) null, 100, 3, (DefaultConstructorMarker) null) : undoManager);
    }
}
