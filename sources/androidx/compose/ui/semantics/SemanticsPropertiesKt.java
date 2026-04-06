package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata
public final class SemanticsPropertiesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f18145a;

    static {
        Class<SemanticsPropertiesKt> cls = SemanticsPropertiesKt.class;
        f18145a = new KProperty[]{Reflection.e(new MutablePropertyReference1Impl(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.e(new MutablePropertyReference1Impl(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        semanticsProperties.F();
        semanticsProperties.B();
        semanticsProperties.z();
        semanticsProperties.x();
        semanticsProperties.i();
        semanticsProperties.q();
        semanticsProperties.v();
        semanticsProperties.e();
        semanticsProperties.c();
        semanticsProperties.L();
        semanticsProperties.l();
        semanticsProperties.M();
        semanticsProperties.C();
        semanticsProperties.G();
        semanticsProperties.J();
        semanticsProperties.u();
        semanticsProperties.o();
        semanticsProperties.g();
        semanticsProperties.I();
        semanticsProperties.m();
        semanticsProperties.E();
        semanticsProperties.a();
        semanticsProperties.b();
        semanticsProperties.K();
        semanticsProperties.s();
        semanticsProperties.y();
        SemanticsActions.f18056a.d();
    }

    public static /* synthetic */ void A(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        z(semanticsPropertyReceiver, str, function1);
    }

    public static final void A0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.z(), new AccessibilityAction(str, function1));
    }

    public static final void B(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.l(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void B0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        A0(semanticsPropertyReceiver, str, function1);
    }

    public static /* synthetic */ void C(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        B(semanticsPropertyReceiver, str, function0);
    }

    public static final void C0(SemanticsPropertyReceiver semanticsPropertyReceiver, long j2) {
        SemanticsProperties.f18102a.I().d(semanticsPropertyReceiver, f18145a[18], TextRange.b(j2));
    }

    public static final void D(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.m(), ImeAction.j(i2));
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.m(), new AccessibilityAction(str, function0));
    }

    public static final void D0(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f18102a.J().d(semanticsPropertyReceiver, f18145a[14], annotatedString);
    }

    public static /* synthetic */ void E(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        D(semanticsPropertyReceiver, i2, str, function0);
    }

    public static final void E0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.A(), new AccessibilityAction(str, function1));
    }

    public static final void F(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.n(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void F0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        E0(semanticsPropertyReceiver, str, function1);
    }

    public static /* synthetic */ void G(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        F(semanticsPropertyReceiver, str, function0);
    }

    public static final void G0(SemanticsPropertyReceiver semanticsPropertyReceiver, ToggleableState toggleableState) {
        SemanticsProperties.f18102a.K().d(semanticsPropertyReceiver, f18145a[23], toggleableState);
    }

    public static final void H(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.o(), new AccessibilityAction(str, function0));
    }

    public static final void H0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.v().d(semanticsPropertyReceiver, f18145a[6], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void I(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        H(semanticsPropertyReceiver, str, function0);
    }

    public static final void I0(SemanticsPropertyReceiver semanticsPropertyReceiver, float f2) {
        SemanticsProperties.f18102a.L().d(semanticsPropertyReceiver, f18145a[9], Float.valueOf(f2));
    }

    public static final void J(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.p(), new AccessibilityAction(str, function0));
    }

    public static final void J0(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.f18102a.M().d(semanticsPropertyReceiver, f18145a[11], scrollAxisRange);
    }

    public static /* synthetic */ void K(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        J(semanticsPropertyReceiver, str, function0);
    }

    public static final void K0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.B(), new AccessibilityAction(str, function1));
    }

    public static final void L(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.q(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void L0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        K0(semanticsPropertyReceiver, str, function1);
    }

    public static /* synthetic */ void M(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        L(semanticsPropertyReceiver, str, function0);
    }

    public static final void N(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.r(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void O(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        N(semanticsPropertyReceiver, str, function0);
    }

    public static final void P(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.A(), Unit.f40552a);
    }

    public static final void Q(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.s(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void R(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Q(semanticsPropertyReceiver, str, function0);
    }

    public static final void S(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.t(), Unit.f40552a);
    }

    public static final void T(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.t(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void U(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        T(semanticsPropertyReceiver, str, function0);
    }

    public static final void V(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.u(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void W(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        V(semanticsPropertyReceiver, str, function2);
    }

    public static final void X(SemanticsPropertyReceiver semanticsPropertyReceiver, Function2 function2) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.v(), function2);
    }

    public static final void Y(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.w(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void Z(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        Y(semanticsPropertyReceiver, str, function1);
    }

    public static final SemanticsPropertyKey a(String str) {
        return new SemanticsPropertyKey(str, true);
    }

    public static final void a0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.D(), Unit.f40552a);
    }

    public static final SemanticsPropertyKey b(String str, Function2 function2) {
        return new SemanticsPropertyKey(str, true, function2);
    }

    public static final void b0(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        SemanticsProperties.f18102a.a().d(semanticsPropertyReceiver, f18145a[21], collectionInfo);
    }

    public static final void c(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.a(), new AccessibilityAction(str, function0));
    }

    public static final void c0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.q().d(semanticsPropertyReceiver, f18145a[5], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void d(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        c(semanticsPropertyReceiver, str, function0);
    }

    public static final void d0(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentDataType contentDataType) {
        SemanticsProperties.f18102a.c().d(semanticsPropertyReceiver, f18145a[8], contentDataType);
    }

    public static final void e(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.b(), new AccessibilityAction(str, function0));
    }

    public static final void e0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.d(), CollectionsKt.e(str));
    }

    public static /* synthetic */ void f(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        e(semanticsPropertyReceiver, str, function0);
    }

    public static final void f0(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentType contentType) {
        SemanticsProperties.f18102a.e().d(semanticsPropertyReceiver, f18145a[7], contentType);
    }

    public static final void g(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.c(), new AccessibilityAction(str, function0));
    }

    public static final void g0(SemanticsPropertyReceiver semanticsPropertyReceiver, List list) {
        SemanticsActions.f18056a.d().d(semanticsPropertyReceiver, f18145a[26], list);
    }

    public static /* synthetic */ void h(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        g(semanticsPropertyReceiver, str, function0);
    }

    public static final void h0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.s().d(semanticsPropertyReceiver, f18145a[24], Boolean.valueOf(z2));
    }

    public static final void i(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.e(), new AccessibilityAction(str, function0));
    }

    public static final void i0(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f18102a.g().d(semanticsPropertyReceiver, f18145a[17], annotatedString);
    }

    public static /* synthetic */ void j(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        i(semanticsPropertyReceiver, str, function0);
    }

    public static final void j0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.i().d(semanticsPropertyReceiver, f18145a[4], Boolean.valueOf(z2));
    }

    public static final void k(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.r(), Unit.f40552a);
    }

    public static final void k0(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.f18102a.l().d(semanticsPropertyReceiver, f18145a[10], scrollAxisRange);
    }

    public static final void l(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.f(), Unit.f40552a);
    }

    public static final void l0(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.f18102a.o().d(semanticsPropertyReceiver, f18145a[16], annotatedString);
    }

    public static final void m(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.f(), new AccessibilityAction(str, function0));
    }

    public static final void m0(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f18102a.x().d(semanticsPropertyReceiver, f18145a[3], LiveRegionMode.c(i2));
    }

    public static /* synthetic */ void n(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        m(semanticsPropertyReceiver, str, function0);
    }

    public static final void n0(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f18102a.y().d(semanticsPropertyReceiver, f18145a[25], Integer.valueOf(i2));
    }

    public static final void o(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.h(), str);
    }

    public static final void o0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f18102a.z().d(semanticsPropertyReceiver, f18145a[2], str);
    }

    public static final void p(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.g(), new AccessibilityAction(str, function0));
    }

    public static final void p0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.x(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void q(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        p(semanticsPropertyReceiver, str, function0);
    }

    public static /* synthetic */ void q0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        p0(semanticsPropertyReceiver, str, function1);
    }

    public static final void r(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.h(), new AccessibilityAction(str, new SemanticsPropertiesKt$getScrollViewportLength$1(function0)));
    }

    public static final void r0(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.f18102a.B().d(semanticsPropertyReceiver, f18145a[1], progressBarRangeInfo);
    }

    public static /* synthetic */ void s(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        r(semanticsPropertyReceiver, str, function0);
    }

    public static final void s0(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.f18102a.C().d(semanticsPropertyReceiver, f18145a[12], Role.j(i2));
    }

    public static final void t(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.i(), new AccessibilityAction(str, function1));
    }

    public static final void t0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.E().d(semanticsPropertyReceiver, f18145a[20], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void u(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        t(semanticsPropertyReceiver, str, function1);
    }

    public static final void u0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.y(), new AccessibilityAction(str, function3));
    }

    public static final void v(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.n(), function1);
    }

    public static /* synthetic */ void v0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        u0(semanticsPropertyReceiver, str, function3);
    }

    public static final void w(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.j(), new AccessibilityAction(str, function1));
    }

    public static final void w0(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.f18102a.u().d(semanticsPropertyReceiver, f18145a[15], Boolean.valueOf(z2));
    }

    public static /* synthetic */ void x(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        w(semanticsPropertyReceiver, str, function1);
    }

    public static final void x0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f18102a.F().d(semanticsPropertyReceiver, f18145a[0], str);
    }

    public static final void y(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.p(), Unit.f40552a);
    }

    public static final void y0(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.f18102a.G().d(semanticsPropertyReceiver, f18145a[13], str);
    }

    public static final void z(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1) {
        semanticsPropertyReceiver.e(SemanticsActions.f18056a.k(), new AccessibilityAction(str, function1));
    }

    public static final void z0(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        semanticsPropertyReceiver.e(SemanticsProperties.f18102a.H(), CollectionsKt.e(annotatedString));
    }
}
