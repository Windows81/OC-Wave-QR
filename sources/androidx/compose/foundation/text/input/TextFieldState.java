package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class TextFieldState {

    /* renamed from: a  reason: collision with root package name */
    public final TextUndoManager f6074a;

    /* renamed from: b  reason: collision with root package name */
    public TextFieldBuffer f6075b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f6076c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f6077d;

    /* renamed from: e  reason: collision with root package name */
    public final UndoState f6078e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableVector f6079f;

    @Metadata
    public interface NotifyImeListener {
        void a(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2);
    }

    @Metadata
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final Saver f6080a = new Saver();

        /* renamed from: c */
        public TextFieldState a(Object obj) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Int");
            long b2 = TextRangeKt.b(intValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.f6098a;
            Intrinsics.f(obj5);
            TextUndoManager c2 = saver.a(obj5);
            Intrinsics.f(c2);
            return new TextFieldState((String) obj2, b2, c2, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public Object b(SaverScope saverScope, TextFieldState textFieldState) {
            return CollectionsKt.p(textFieldState.i().toString(), Integer.valueOf(TextRange.n(textFieldState.h())), Integer.valueOf(TextRange.i(textFieldState.h())), TextUndoManager.Companion.Saver.f6098a.b(saverScope, textFieldState.j()));
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[] r0 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r1 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.ClearHistory     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r1 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r1 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6081a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldState.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ TextFieldState(String str, long j2, TextUndoManager textUndoManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textUndoManager);
    }

    public final void c(NotifyImeListener notifyImeListener) {
        this.f6079f.d(notifyImeListener);
    }

    public final void d(TextFieldBuffer textFieldBuffer) {
        boolean z2 = textFieldBuffer.f().a() > 0;
        boolean g2 = true ^ TextRange.g(textFieldBuffer.l(), this.f6075b.l());
        if (z2) {
            this.f6074a.c();
        }
        s(textFieldBuffer, z2, g2);
    }

    public final void e(InputTransformation inputTransformation, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldBuffer textFieldBuffer;
        InputTransformation inputTransformation2 = inputTransformation;
        boolean z3 = z2;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        TextFieldCharSequence l2 = l();
        if (this.f6075b.e().a() != 0 || !TextRange.g(l2.g(), this.f6075b.l())) {
            boolean z4 = false;
            boolean z5 = this.f6075b.e().a() != 0;
            TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.f6075b.toString(), this.f6075b.l(), this.f6075b.h(), this.f6075b.i(), TextFieldStateKt.b(this.f6075b.h(), this.f6075b.g()), (DefaultConstructorMarker) null);
            if (inputTransformation2 == null) {
                if (z5 && z3) {
                    z4 = true;
                }
                t(l2, textFieldCharSequence, z4);
                n(l2, textFieldCharSequence, this.f6075b.e(), textFieldEditUndoBehavior2);
                return;
            }
            TextFieldCharSequence textFieldCharSequence2 = textFieldCharSequence;
            TextFieldBuffer textFieldBuffer2 = new TextFieldBuffer(textFieldCharSequence, this.f6075b.e(), l2, (OffsetMappingCalculator) null, 8, (DefaultConstructorMarker) null);
            inputTransformation2.X(textFieldBuffer2);
            boolean w2 = StringsKt.w(textFieldBuffer2.a(), textFieldCharSequence2);
            boolean z6 = !w2;
            boolean g2 = TextRange.g(textFieldBuffer2.l(), textFieldCharSequence2.g());
            boolean z7 = !g2;
            if (!w2 || !g2) {
                textFieldBuffer = textFieldBuffer2;
                s(textFieldBuffer, z6, z7);
            } else {
                textFieldBuffer = textFieldBuffer2;
                t(l2, TextFieldBuffer.A(textFieldBuffer2, 0, textFieldCharSequence2.d(), (List) null, 5, (Object) null), z3);
            }
            n(l2, l(), textFieldBuffer.f(), textFieldEditUndoBehavior2);
        } else if (!Intrinsics.d(l2.d(), this.f6075b.h()) || !Intrinsics.d(l2.e(), this.f6075b.i()) || !Intrinsics.d(l2.c(), this.f6075b.g())) {
            t(l(), new TextFieldCharSequence(this.f6075b.toString(), this.f6075b.l(), this.f6075b.h(), this.f6075b.i(), TextFieldStateKt.b(this.f6075b.h(), this.f6075b.g()), (DefaultConstructorMarker) null), z3);
        }
    }

    public final void f() {
        p(false);
    }

    public final TextFieldBuffer g() {
        return this.f6075b;
    }

    public final long h() {
        return l().g();
    }

    public final CharSequence i() {
        return l().h();
    }

    public final TextUndoManager j() {
        return this.f6074a;
    }

    public final UndoState k() {
        return this.f6078e;
    }

    public final TextFieldCharSequence l() {
        return (TextFieldCharSequence) this.f6077d.getValue();
    }

    public final boolean m() {
        return ((Boolean) this.f6076c.getValue()).booleanValue();
    }

    public final void n(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i2 = WhenMappings.f6081a[textFieldEditUndoBehavior.ordinal()];
        if (i2 == 1) {
            this.f6074a.c();
        } else if (i2 == 2) {
            TextUndoManagerKt.c(this.f6074a, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else if (i2 == 3) {
            TextUndoManagerKt.c(this.f6074a, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        }
    }

    public final void o(NotifyImeListener notifyImeListener) {
        this.f6079f.v(notifyImeListener);
    }

    public final void p(boolean z2) {
        this.f6076c.setValue(Boolean.valueOf(z2));
    }

    public final void q(TextFieldCharSequence textFieldCharSequence) {
        this.f6077d.setValue(textFieldCharSequence);
    }

    public final TextFieldBuffer r() {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            if (m()) {
                InlineClassHelperKt.c("TextFieldState does not support concurrent or nested editing.");
            }
            p(true);
            return new TextFieldBuffer(l(), (ChangeTracker) null, (TextFieldCharSequence) null, (OffsetMappingCalculator) null, 14, (DefaultConstructorMarker) null);
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public final void s(TextFieldBuffer textFieldBuffer, boolean z2, boolean z3) {
        TextFieldCharSequence A2 = TextFieldBuffer.A(this.f6075b, 0, (TextRange) null, (List) null, 7, (Object) null);
        if (z2) {
            this.f6075b = new TextFieldBuffer(new TextFieldCharSequence(textFieldBuffer.toString(), textFieldBuffer.l(), (TextRange) null, (Pair) null, (List) null, 28, (DefaultConstructorMarker) null), (ChangeTracker) null, (TextFieldCharSequence) null, (OffsetMappingCalculator) null, 14, (DefaultConstructorMarker) null);
        } else if (z3) {
            this.f6075b.x(TextRangeKt.b(TextRange.n(textFieldBuffer.l()), TextRange.i(textFieldBuffer.l())));
        }
        if (z2 || z3 || !Intrinsics.d(A2.d(), textFieldBuffer.h())) {
            this.f6075b.d();
        }
        t(A2, TextFieldBuffer.A(this.f6075b, 0, (TextRange) null, (List) null, 7, (Object) null), true);
    }

    public final void t(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        q(textFieldCharSequence2);
        f();
        MutableVector mutableVector = this.f6079f;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((NotifyImeListener) objArr[i2]).a(textFieldCharSequence, textFieldCharSequence2, z2 && !textFieldCharSequence.a(textFieldCharSequence2) && textFieldCharSequence.d() != null);
        }
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            return "TextFieldState(selection=" + TextRange.q(h()) + ", text=\"" + i() + "\")";
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public /* synthetic */ TextFieldState(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public TextFieldState(String str, long j2, TextUndoManager textUndoManager) {
        this.f6074a = textUndoManager;
        String str2 = str;
        this.f6075b = new TextFieldBuffer(new TextFieldCharSequence(str2, TextRangeKt.c(j2, 0, str.length()), (TextRange) null, (Pair) null, (List) null, 28, (DefaultConstructorMarker) null), (ChangeTracker) null, (TextFieldCharSequence) null, (OffsetMappingCalculator) null, 14, (DefaultConstructorMarker) null);
        this.f6076c = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6077d = SnapshotStateKt__SnapshotStateKt.e(new TextFieldCharSequence(str, j2, (TextRange) null, (Pair) null, (List) null, 28, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6078e = new UndoState(this);
        this.f6079f = new MutableVector(new NotifyImeListener[16], 0);
    }

    public TextFieldState(String str, long j2) {
        this(str, j2, new TextUndoManager((TextUndoOperation) null, (UndoManager) null, 3, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
    }
}
