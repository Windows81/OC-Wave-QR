package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransformedTextFieldState {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f6396h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final TextFieldState f6397a;

    /* renamed from: b  reason: collision with root package name */
    public InputTransformation f6398b;

    /* renamed from: c  reason: collision with root package name */
    public final CodepointTransformation f6399c;

    /* renamed from: d  reason: collision with root package name */
    public final OutputTransformation f6400d;

    /* renamed from: e  reason: collision with root package name */
    public final State f6401e;

    /* renamed from: f  reason: collision with root package name */
    public final State f6402f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f6403g;

    @Metadata
    public static final class Companion {

        @Metadata
        public /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f6404a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    androidx.compose.foundation.text.input.internal.WedgeAffinity[] r0 = androidx.compose.foundation.text.input.internal.WedgeAffinity.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = androidx.compose.foundation.text.input.internal.WedgeAffinity.Start     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.foundation.text.input.internal.WedgeAffinity r1 = androidx.compose.foundation.text.input.internal.WedgeAffinity.End     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f6404a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.WhenMappings.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ long i(Companion companion, long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.h(j2, offsetMappingCalculator, selectionWedgeAffinity);
        }

        public final TransformedText e(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            TextRange textRange;
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, (ChangeTracker) null, (TextFieldCharSequence) null, offsetMappingCalculator, 6, (DefaultConstructorMarker) null);
            outputTransformation.a(textFieldBuffer);
            if (textFieldBuffer.f().a() == 0) {
                return null;
            }
            long h2 = h(textFieldCharSequence.g(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange d2 = textFieldCharSequence.d();
            if (d2 != null) {
                textRange = TextRange.b(TransformedTextFieldState.f6396h.h(d2.r(), offsetMappingCalculator, selectionWedgeAffinity));
            } else {
                textRange = null;
            }
            return new TransformedText(TextFieldBuffer.A(textFieldBuffer, h2, textRange, (List) null, 4, (Object) null), offsetMappingCalculator);
        }

        public final TransformedText f(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            TextRange textRange;
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence a2 = CodepointTransformationKt.a(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            if (a2 == textFieldCharSequence) {
                return null;
            }
            long h2 = h(textFieldCharSequence.g(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange d2 = textFieldCharSequence.d();
            if (d2 != null) {
                textRange = TextRange.b(TransformedTextFieldState.f6396h.h(d2.r(), offsetMappingCalculator, selectionWedgeAffinity));
            } else {
                textRange = null;
            }
            return new TransformedText(new TextFieldCharSequence(a2, h2, textRange, (Pair) null, (List) null, 24, (DefaultConstructorMarker) null), offsetMappingCalculator);
        }

        public final long g(long j2, OffsetMappingCalculator offsetMappingCalculator) {
            long b2 = offsetMappingCalculator.b(TextRange.n(j2));
            long b3 = TextRange.h(j2) ? b2 : offsetMappingCalculator.b(TextRange.i(j2));
            int min = Math.min(TextRange.l(b2), TextRange.l(b3));
            int max = Math.max(TextRange.k(b2), TextRange.k(b3));
            return TextRange.m(j2) ? TextRangeKt.b(max, min) : TextRangeKt.b(min, max);
        }

        public final long h(long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long a2;
            long c2 = offsetMappingCalculator.c(TextRange.n(j2));
            long c3 = TextRange.h(j2) ? c2 : offsetMappingCalculator.c(TextRange.i(j2));
            WedgeAffinity wedgeAffinity = null;
            WedgeAffinity d2 = selectionWedgeAffinity != null ? selectionWedgeAffinity.d() : null;
            if (TextRange.h(j2)) {
                wedgeAffinity = d2;
            } else if (selectionWedgeAffinity != null) {
                wedgeAffinity = selectionWedgeAffinity.c();
            }
            if (d2 != null && !TextRange.h(c2)) {
                int i2 = WhenMappings.f6404a[d2.ordinal()];
                if (i2 == 1) {
                    c2 = TextRangeKt.a(TextRange.n(c2));
                } else if (i2 == 2) {
                    c2 = TextRangeKt.a(TextRange.i(c2));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (wedgeAffinity != null && !TextRange.h(c3)) {
                int i3 = WhenMappings.f6404a[wedgeAffinity.ordinal()];
                if (i3 == 1) {
                    a2 = TextRangeKt.a(TextRange.n(c3));
                } else if (i3 == 2) {
                    a2 = TextRangeKt.a(TextRange.i(c3));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c3 = a2;
            }
            int min = Math.min(TextRange.l(c2), TextRange.l(c3));
            int max = Math.max(TextRange.k(c2), TextRange.k(c3));
            return TextRange.m(j2) ? TextRangeKt.b(max, min) : TextRangeKt.b(min, max);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class TransformedText {

        /* renamed from: a  reason: collision with root package name */
        public final TextFieldCharSequence f6405a;

        /* renamed from: b  reason: collision with root package name */
        public final OffsetMappingCalculator f6406b;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.f6405a = textFieldCharSequence;
            this.f6406b = offsetMappingCalculator;
        }

        public final OffsetMappingCalculator a() {
            return this.f6406b;
        }

        public final TextFieldCharSequence b() {
            return this.f6405a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return Intrinsics.d(this.f6405a, transformedText.f6405a) && Intrinsics.d(this.f6406b, transformedText.f6406b);
        }

        public int hashCode() {
            return (this.f6405a.hashCode() * 31) + this.f6406b.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + this.f6405a + ", offsetMapping=" + this.f6406b + ')';
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation) {
        this.f6397a = textFieldState;
        this.f6398b = inputTransformation;
        this.f6399c = codepointTransformation;
        this.f6400d = outputTransformation;
        this.f6401e = outputTransformation != null ? SnapshotStateKt.e(new TransformedTextFieldState$outputTransformedText$1$1(this, outputTransformation)) : null;
        this.f6402f = codepointTransformation != null ? SnapshotStateKt.e(new TransformedTextFieldState$codepointTransformedText$1$1(this, codepointTransformation)) : null;
        this.f6403g = SnapshotStateKt__SnapshotStateKt.e(new SelectionWedgeAffinity(WedgeAffinity.Start), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final void j(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        TextFieldCharSequence b2;
        TransformedText a2 = f6396h.e(textFieldCharSequence, transformedTextFieldState.f6400d, transformedTextFieldState.m());
        if (!(a2 == null || (b2 = a2.b()) == null)) {
            textFieldCharSequence = b2;
        }
        notifyImeListener.a(textFieldCharSequence, transformedTextFieldState.o(), z2);
    }

    public static /* synthetic */ void x(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        transformedTextFieldState.w(charSequence, z2, textFieldEditUndoBehavior, z3);
    }

    public static /* synthetic */ void z(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        transformedTextFieldState.y(charSequence, j2, textFieldEditUndoBehavior2, z2);
    }

    public final void A() {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        TextFieldBufferKt.c(g2, 0, g2.j());
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void B(long j2) {
        C(r(j2));
    }

    public final void C(long j2) {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        TextFieldBufferKt.c(textFieldState.g(), TextRange.n(j2), TextRange.i(j2));
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void D(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.f6403g.setValue(selectionWedgeAffinity);
    }

    public final void E() {
        this.f6397a.k().b();
    }

    public final void F(InputTransformation inputTransformation) {
        this.f6398b = inputTransformation;
    }

    public final void G(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.e().a() > 0 && TextRange.h(textFieldBuffer.l())) {
            D(new SelectionWedgeAffinity(WedgeAffinity.Start));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (Intrinsics.d(this.f6397a, transformedTextFieldState.f6397a) && Intrinsics.d(this.f6399c, transformedTextFieldState.f6399c)) {
            return Intrinsics.d(this.f6400d, transformedTextFieldState.f6400d);
        }
        return false;
    }

    public final void g() {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        TextFieldBufferKt.d(g2, TextRange.i(g2.l()), 0, 2, (Object) null);
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void h() {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        TextFieldBufferKt.d(g2, TextRange.k(g2.l()), 0, 2, (Object) null);
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public int hashCode() {
        int hashCode = this.f6397a.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.f6399c;
        int i2 = 0;
        int hashCode2 = (hashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.f6400d;
        if (outputTransformation != null) {
            i2 = outputTransformation.hashCode();
        }
        return hashCode2 + i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            java.lang.Object r5 = r0.D
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r5 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r5
            java.lang.Object r5 = r0.C
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0077
        L_0x0039:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.text.input.OutputTransformation r6 = r4.f6400d
            if (r6 == 0) goto L_0x0046
            androidx.compose.foundation.text.input.internal.f0 r6 = new androidx.compose.foundation.text.input.internal.f0
            r6.<init>(r5, r4)
            r5 = r6
        L_0x0046:
            r0.C = r4
            r0.D = r5
            r0.G = r3
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r6.<init>(r2, r3)
            r6.G()
            androidx.compose.foundation.text.input.TextFieldState r2 = r4.f6397a
            r2.c(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r2 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r2.<init>(r4, r5)
            r6.u(r2)
            java.lang.Object r5 = r6.A()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r5 != r6) goto L_0x0074
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0074:
            if (r5 != r1) goto L_0x0077
            return r1
        L_0x0077:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.i(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k() {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        TextFieldBufferKt.b(g2, TextRange.l(g2.l()), TextRange.k(g2.l()));
        TextFieldBufferKt.d(g2, TextRange.l(g2.l()), 0, 2, (Object) null);
        G(g2);
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0.getValue()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.text.input.TextFieldCharSequence l() {
        /*
            r1 = this;
            androidx.compose.runtime.State r0 = r1.f6401e
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.b()
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r1.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.l():androidx.compose.foundation.text.input.TextFieldCharSequence");
    }

    public final SelectionWedgeAffinity m() {
        return (SelectionWedgeAffinity) this.f6403g.getValue();
    }

    public final TextFieldCharSequence n() {
        return this.f6397a.l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0.getValue()).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.text.input.TextFieldCharSequence o() {
        /*
            r1 = this;
            androidx.compose.runtime.State r0 = r1.f6402f
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.b()
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r1.l()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.o():androidx.compose.foundation.text.input.TextFieldCharSequence");
    }

    public final void p(int i2, long j2) {
        long r2 = r(j2);
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        textFieldState.g().w(i2, TextRange.n(r2), TextRange.i(r2));
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q(int r4) {
        /*
            r3 = this;
            androidx.compose.runtime.State r0 = r3.f6401e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r0 = r0.a()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            androidx.compose.runtime.State r2 = r3.f6402f
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r2 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r2
            if (r2 == 0) goto L_0x0023
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r1 = r2.a()
        L_0x0023:
            if (r1 == 0) goto L_0x002a
            long r1 = r1.b(r4)
            goto L_0x002e
        L_0x002a:
            long r1 = androidx.compose.ui.text.TextRangeKt.a(r4)
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$Companion r4 = f6396h
            long r1 = r4.g(r1, r0)
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.q(int):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long r(long r4) {
        /*
            r3 = this;
            androidx.compose.runtime.State r0 = r3.f6401e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r0 = r0.a()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            androidx.compose.runtime.State r2 = r3.f6402f
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r2 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r2
            if (r2 == 0) goto L_0x0023
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r1 = r2.a()
        L_0x0023:
            if (r1 == 0) goto L_0x002b
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$Companion r2 = f6396h
            long r4 = r2.g(r4, r1)
        L_0x002b:
            if (r0 == 0) goto L_0x0033
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$Companion r1 = f6396h
            long r4 = r1.g(r4, r0)
        L_0x0033:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.r(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long s(long r10) {
        /*
            r9 = this;
            androidx.compose.runtime.State r0 = r9.f6401e
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0013
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r0 = r0.a()
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = r1
        L_0x0014:
            androidx.compose.runtime.State r0 = r9.f6402f
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$TransformedText r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) r0
            if (r0 == 0) goto L_0x0024
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator r1 = r0.a()
        L_0x0024:
            if (r5 == 0) goto L_0x0030
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$Companion r2 = f6396h
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r10
            long r10 = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.i(r2, r3, r5, r6, r7, r8)
        L_0x0030:
            if (r1 == 0) goto L_0x003c
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$Companion r0 = f6396h
            androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity r2 = r9.m()
            long r10 = r0.h(r10, r1, r2)
        L_0x003c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.s(long):long");
    }

    public final void t(int i2) {
        B(TextRangeKt.a(i2));
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f6397a + ", outputTransformation=" + this.f6400d + ", outputTransformedText=" + this.f6401e + ", codepointTransformation=" + this.f6399c + ", codepointTransformedText=" + this.f6402f + ", outputText=\"" + l() + "\", visualText=\"" + o() + "\")";
    }

    public final void u() {
        this.f6397a.k().a();
    }

    public final void v(CharSequence charSequence) {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        TextFieldBufferKt.b(g2, 0, g2.j());
        g2.append((CharSequence) charSequence.toString());
        G(g2);
        textFieldState.e(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void w(CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z3) {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        if (z2) {
            g2.d();
        }
        long l2 = g2.l();
        g2.p(TextRange.l(l2), TextRange.k(l2), charSequence);
        TextFieldBufferKt.d(g2, TextRange.l(l2) + charSequence.length(), 0, 2, (Object) null);
        G(g2);
        textFieldState.e(inputTransformation, z3, textFieldEditUndoBehavior);
    }

    public final void y(CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2) {
        TextFieldState textFieldState = this.f6397a;
        InputTransformation inputTransformation = this.f6398b;
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        long r2 = r(j2);
        g2.p(TextRange.l(r2), TextRange.k(r2), charSequence);
        TextFieldBufferKt.d(g2, TextRange.l(r2) + charSequence.length(), 0, 2, (Object) null);
        G(g2);
        textFieldState.e(inputTransformation, z2, textFieldEditUndoBehavior);
    }
}
