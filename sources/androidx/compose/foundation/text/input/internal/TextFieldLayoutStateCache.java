package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {

    /* renamed from: A  reason: collision with root package name */
    public final MutableState f6353A = SnapshotStateKt.i((Object) null, MeasureInputs.f6368g.a());

    /* renamed from: B  reason: collision with root package name */
    public TextMeasurer f6354B;
    public CacheRecord C = new CacheRecord();

    /* renamed from: z  reason: collision with root package name */
    public final MutableState f6355z = SnapshotStateKt.i((Object) null, NonMeasureInputs.f6376f.a());

    @Metadata
    public static final class CacheRecord extends StateRecord {

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f6356c;

        /* renamed from: d  reason: collision with root package name */
        public List f6357d;

        /* renamed from: e  reason: collision with root package name */
        public TextRange f6358e;

        /* renamed from: f  reason: collision with root package name */
        public TextStyle f6359f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6360g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6361h;

        /* renamed from: i  reason: collision with root package name */
        public float f6362i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f6363j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public LayoutDirection f6364k;

        /* renamed from: l  reason: collision with root package name */
        public FontFamily.Resolver f6365l;

        /* renamed from: m  reason: collision with root package name */
        public long f6366m = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);

        /* renamed from: n  reason: collision with root package name */
        public TextLayoutResult f6367n;

        public final void A(float f2) {
            this.f6363j = f2;
        }

        public final void B(LayoutDirection layoutDirection) {
            this.f6364k = layoutDirection;
        }

        public final void C(TextLayoutResult textLayoutResult) {
            this.f6367n = textLayoutResult;
        }

        public final void D(boolean z2) {
            this.f6360g = z2;
        }

        public final void E(boolean z2) {
            this.f6361h = z2;
        }

        public final void F(TextStyle textStyle) {
            this.f6359f = textStyle;
        }

        public final void G(CharSequence charSequence) {
            this.f6356c = charSequence;
        }

        public void c(StateRecord stateRecord) {
            Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.f6356c = cacheRecord.f6356c;
            this.f6357d = cacheRecord.f6357d;
            this.f6358e = cacheRecord.f6358e;
            this.f6359f = cacheRecord.f6359f;
            this.f6360g = cacheRecord.f6360g;
            this.f6361h = cacheRecord.f6361h;
            this.f6362i = cacheRecord.f6362i;
            this.f6363j = cacheRecord.f6363j;
            this.f6364k = cacheRecord.f6364k;
            this.f6365l = cacheRecord.f6365l;
            this.f6366m = cacheRecord.f6366m;
            this.f6367n = cacheRecord.f6367n;
        }

        public StateRecord d() {
            return new CacheRecord();
        }

        public final List j() {
            return this.f6357d;
        }

        public final TextRange k() {
            return this.f6358e;
        }

        public final long l() {
            return this.f6366m;
        }

        public final float m() {
            return this.f6362i;
        }

        public final FontFamily.Resolver n() {
            return this.f6365l;
        }

        public final float o() {
            return this.f6363j;
        }

        public final LayoutDirection p() {
            return this.f6364k;
        }

        public final TextLayoutResult q() {
            return this.f6367n;
        }

        public final boolean r() {
            return this.f6360g;
        }

        public final boolean s() {
            return this.f6361h;
        }

        public final TextStyle t() {
            return this.f6359f;
        }

        public String toString() {
            return "CacheRecord(visualText=" + this.f6356c + ", composingAnnotations=" + this.f6357d + ", composition=" + this.f6358e + ", textStyle=" + this.f6359f + ", singleLine=" + this.f6360g + ", softWrap=" + this.f6361h + ", densityValue=" + this.f6362i + ", fontScale=" + this.f6363j + ", layoutDirection=" + this.f6364k + ", fontFamilyResolver=" + this.f6365l + ", constraints=" + Constraints.q(this.f6366m) + ", layoutResult=" + this.f6367n + ')';
        }

        public final CharSequence u() {
            return this.f6356c;
        }

        public final void v(List list) {
            this.f6357d = list;
        }

        public final void w(TextRange textRange) {
            this.f6358e = textRange;
        }

        public final void x(long j2) {
            this.f6366m = j2;
        }

        public final void y(float f2) {
            this.f6362i = f2;
        }

        public final void z(FontFamily.Resolver resolver) {
            this.f6365l = resolver;
        }
    }

    @Metadata
    public static final class MeasureInputs {

        /* renamed from: g  reason: collision with root package name */
        public static final Companion f6368g = new Companion((DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        public static final SnapshotMutationPolicy f6369h = new TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1();

        /* renamed from: a  reason: collision with root package name */
        public final Density f6370a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutDirection f6371b;

        /* renamed from: c  reason: collision with root package name */
        public final FontFamily.Resolver f6372c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6373d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6374e;

        /* renamed from: f  reason: collision with root package name */
        public final float f6375f;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SnapshotMutationPolicy a() {
                return MeasureInputs.f6369h;
            }

            public Companion() {
            }
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, resolver, j2);
        }

        public final long b() {
            return this.f6373d;
        }

        public final Density c() {
            return this.f6370a;
        }

        public final float d() {
            return this.f6374e;
        }

        public final FontFamily.Resolver e() {
            return this.f6372c;
        }

        public final float f() {
            return this.f6375f;
        }

        public final LayoutDirection g() {
            return this.f6371b;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.f6370a + ", densityValue=" + this.f6374e + ", fontScale=" + this.f6375f + ", layoutDirection=" + this.f6371b + ", fontFamilyResolver=" + this.f6372c + ", constraints=" + Constraints.q(this.f6373d) + ')';
        }

        public MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
            this.f6370a = density;
            this.f6371b = layoutDirection;
            this.f6372c = resolver;
            this.f6373d = j2;
            this.f6374e = density.getDensity();
            this.f6375f = density.u1();
        }
    }

    @Metadata
    public static final class NonMeasureInputs {

        /* renamed from: f  reason: collision with root package name */
        public static final Companion f6376f = new Companion((DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        public static final SnapshotMutationPolicy f6377g = new TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1();

        /* renamed from: a  reason: collision with root package name */
        public final TransformedTextFieldState f6378a;

        /* renamed from: b  reason: collision with root package name */
        public final TextStyle f6379b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6380c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6381d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6382e;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SnapshotMutationPolicy a() {
                return NonMeasureInputs.f6377g;
            }

            public Companion() {
            }
        }

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3, boolean z4) {
            this.f6378a = transformedTextFieldState;
            this.f6379b = textStyle;
            this.f6380c = z2;
            this.f6381d = z3;
            this.f6382e = z4;
        }

        public final boolean b() {
            return this.f6380c;
        }

        public final boolean c() {
            return this.f6381d;
        }

        public final TransformedTextFieldState d() {
            return this.f6378a;
        }

        public final TextStyle e() {
            return this.f6379b;
        }

        public final boolean f() {
            return this.f6382e;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.f6378a + ", textStyle=" + this.f6379b + ", singleLine=" + this.f6380c + ", softWrap=" + this.f6381d + ", isKeyboardTypePhone=" + this.f6382e + ')';
        }
    }

    public final void A(NonMeasureInputs nonMeasureInputs) {
        this.f6355z.setValue(nonMeasureInputs);
    }

    public final void B(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3, KeyboardOptions keyboardOptions) {
        A(new NonMeasureInputs(transformedTextFieldState, textStyle, z2, z3, KeyboardType.n(keyboardOptions.k(), KeyboardType.f18852b.g())));
    }

    public void g(StateRecord stateRecord) {
        Intrinsics.g(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.C = (CacheRecord) stateRecord;
    }

    public StateRecord h() {
        return this.C;
    }

    public StateRecord i(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }

    public final TextLayoutResult m(TextFieldCharSequence textFieldCharSequence, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextStyle textStyle;
        Locale locale;
        TextMeasurer y2 = y(measureInputs);
        if (nonMeasureInputs.f()) {
            LocaleList u2 = nonMeasureInputs.e().u();
            if (u2 == null || (locale = u2.h(0)) == null) {
                locale = Locale.f18939b.a();
            }
            int a2 = TextFieldLayoutStateCache_androidKt.a(locale.a());
            TextStyle e2 = nonMeasureInputs.e();
            TextStyle textStyle2 = r4;
            TextStyle textStyle3 = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, a2, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16711679, (DefaultConstructorMarker) null);
            textStyle = e2.J(textStyle2);
        } else {
            textStyle = nonMeasureInputs.e();
        }
        String textFieldCharSequence2 = textFieldCharSequence.toString();
        List c2 = textFieldCharSequence.c();
        if (c2 == null) {
            c2 = CollectionsKt.m();
        }
        return TextMeasurer.b(y2, new AnnotatedString(textFieldCharSequence2, c2), textStyle, 0, nonMeasureInputs.c(), nonMeasureInputs.b() ? 1 : Integer.MAX_VALUE, (List) null, measureInputs.b(), measureInputs.g(), measureInputs.c(), measureInputs.e(), false, 1060, (Object) null);
    }

    public final MeasureInputs t() {
        return (MeasureInputs) this.f6353A.getValue();
    }

    public final NonMeasureInputs u() {
        return (NonMeasureInputs) this.f6355z.getValue();
    }

    public final TextLayoutResult v(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence u2;
        TextFieldCharSequence o2 = nonMeasureInputs.d().o();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.K(this.C);
        TextLayoutResult q2 = cacheRecord.q();
        if (q2 != null && (u2 = cacheRecord.u()) != null && StringsKt.w(u2, o2) && Intrinsics.d(cacheRecord.j(), o2.c()) && Intrinsics.d(cacheRecord.k(), o2.d()) && cacheRecord.r() == nonMeasureInputs.b() && cacheRecord.s() == nonMeasureInputs.c() && cacheRecord.p() == measureInputs.g() && cacheRecord.m() == measureInputs.c().getDensity() && cacheRecord.o() == measureInputs.c().u1() && Constraints.f(cacheRecord.l(), measureInputs.b()) && Intrinsics.d(cacheRecord.n(), measureInputs.e()) && !q2.w().j().a()) {
            TextStyle t2 = cacheRecord.t();
            boolean z2 = false;
            boolean G = t2 != null ? t2.G(nonMeasureInputs.e()) : false;
            TextStyle t3 = cacheRecord.t();
            if (t3 != null) {
                z2 = t3.F(nonMeasureInputs.e());
            }
            if (G && z2) {
                return q2;
            }
            if (G) {
                return TextLayoutResult.b(q2, new TextLayoutInput(q2.l().j(), nonMeasureInputs.e(), q2.l().g(), q2.l().e(), q2.l().h(), q2.l().f(), q2.l().b(), q2.l().d(), q2.l().c(), q2.l().a(), (DefaultConstructorMarker) null), 0, 2, (Object) null);
            }
        }
        TextLayoutResult m2 = m(o2, nonMeasureInputs, measureInputs);
        if (!Intrinsics.d(m2, q2)) {
            Snapshot c2 = Snapshot.f15255e.c();
            if (!c2.h()) {
                CacheRecord cacheRecord2 = this.C;
                synchronized (SnapshotKt.O()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.p0(cacheRecord2, this, c2);
                    cacheRecord3.G(o2);
                    cacheRecord3.v(o2.c());
                    cacheRecord3.w(o2.d());
                    cacheRecord3.D(nonMeasureInputs.b());
                    cacheRecord3.E(nonMeasureInputs.c());
                    cacheRecord3.F(nonMeasureInputs.e());
                    cacheRecord3.B(measureInputs.g());
                    cacheRecord3.y(measureInputs.d());
                    cacheRecord3.A(measureInputs.f());
                    cacheRecord3.x(measureInputs.b());
                    cacheRecord3.z(measureInputs.e());
                    cacheRecord3.C(m2);
                    Unit unit = Unit.f40552a;
                }
                SnapshotKt.X(c2, this);
            }
        }
        return m2;
    }

    /* renamed from: w */
    public TextLayoutResult getValue() {
        MeasureInputs t2;
        NonMeasureInputs u2 = u();
        if (u2 == null || (t2 = t()) == null) {
            return null;
        }
        return v(u2, t2);
    }

    public final TextLayoutResult x(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j2, (DefaultConstructorMarker) null);
        z(measureInputs);
        NonMeasureInputs u2 = u();
        if (u2 != null) {
            return v(u2, measureInputs);
        }
        InlineClassHelperKt.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new KotlinNothingValueException();
    }

    public final TextMeasurer y(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.f6354B;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.e(), measureInputs.c(), measureInputs.g(), 1);
        this.f6354B = textMeasurer2;
        return textMeasurer2;
    }

    public final void z(MeasureInputs measureInputs) {
        this.f6353A.setValue(measureInputs);
    }
}
