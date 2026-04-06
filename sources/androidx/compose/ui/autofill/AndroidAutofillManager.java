package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {

    /* renamed from: a  reason: collision with root package name */
    public PlatformAutofillManager f15558a;

    /* renamed from: b  reason: collision with root package name */
    public final SemanticsOwner f15559b;

    /* renamed from: c  reason: collision with root package name */
    public final View f15560c;

    /* renamed from: d  reason: collision with root package name */
    public final RectManager f15561d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15562e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f15563f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public AutofillId f15564g;

    /* renamed from: h  reason: collision with root package name */
    public MutableIntSet f15565h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15566i;

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        this.f15558a = platformAutofillManager;
        this.f15559b = semanticsOwner;
        this.f15560c = view;
        this.f15561d = rectManager;
        this.f15562e = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat a2 = ViewCompatShims.a(view);
        AutofillId a3 = a2 != null ? a2.a() : null;
        if (a3 != null) {
            this.f15564g = a3;
            this.f15565h = new MutableIntSet(0, 1, (DefaultConstructorMarker) null);
            return;
        }
        InlineClassHelperKt.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public void a(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo q2;
        SemanticsConfiguration a0;
        SemanticsInfo q3;
        SemanticsConfiguration a02;
        if (!(focusTargetModifierNode == null || (q3 = DelegatableNodeKt.q(focusTargetModifierNode)) == null || (a02 = q3.a0()) == null || !AndroidAutofillManager_androidKt.d(a02))) {
            this.f15558a.d(this.f15560c, q3.v());
        }
        if (focusTargetModifierNode2 != null && (q2 = DelegatableNodeKt.q(focusTargetModifierNode2)) != null && (a0 = q2.a0()) != null && AndroidAutofillManager_androidKt.d(a0)) {
            int v2 = q2.v();
            this.f15561d.e().l(v2, new AndroidAutofillManager$onFocusChanged$2$1(this, v2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r10, androidx.compose.ui.semantics.SemanticsProperties.f18102a.o());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.compose.ui.semantics.SemanticsInfo r9, androidx.compose.ui.semantics.SemanticsConfiguration r10) {
        /*
            r8 = this;
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r9.a0()
            int r9 = r9.v()
            r1 = 0
            if (r10 == 0) goto L_0x001e
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.o()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r10, r2)
            androidx.compose.ui.text.AnnotatedString r2 = (androidx.compose.ui.text.AnnotatedString) r2
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.k()
            goto L_0x001f
        L_0x001e:
            r2 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0034
            androidx.compose.ui.semantics.SemanticsProperties r3 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.o()
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r3)
            androidx.compose.ui.text.AnnotatedString r3 = (androidx.compose.ui.text.AnnotatedString) r3
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = r3.k()
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0076
            if (r2 != 0) goto L_0x0043
            androidx.compose.ui.autofill.PlatformAutofillManager r2 = r8.f15558a
            android.view.View r3 = r8.f15560c
            r2.c(r3, r9, r5)
            goto L_0x0076
        L_0x0043:
            if (r3 != 0) goto L_0x004d
            androidx.compose.ui.autofill.PlatformAutofillManager r2 = r8.f15558a
            android.view.View r3 = r8.f15560c
            r2.c(r3, r9, r4)
            goto L_0x0076
        L_0x004d:
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.c()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r2)
            androidx.compose.ui.autofill.ContentDataType r2 = (androidx.compose.ui.autofill.ContentDataType) r2
            androidx.compose.ui.autofill.ContentDataType$Companion r6 = androidx.compose.ui.autofill.ContentDataType.f15591a
            androidx.compose.ui.autofill.ContentDataType r6 = r6.a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 == 0) goto L_0x0076
            androidx.compose.ui.autofill.PlatformAutofillManager r2 = r8.f15558a
            android.view.View r6 = r8.f15560c
            androidx.compose.ui.autofill.AutofillApi26Helper r7 = androidx.compose.ui.autofill.AutofillApi26Helper.f15576a
            java.lang.String r3 = r3.toString()
            android.view.autofill.AutofillValue r3 = r7.b(r3)
            r2.a(r6, r9, r3)
        L_0x0076:
            boolean r2 = androidx.compose.ui.ComposeUiFlags.f15479g
            if (r2 != 0) goto L_0x00d3
            if (r10 == 0) goto L_0x0089
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.i()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r10, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L_0x008a
        L_0x0089:
            r2 = r1
        L_0x008a:
            if (r0 == 0) goto L_0x0098
            androidx.compose.ui.semantics.SemanticsProperties r1 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.i()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0098:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r6 != 0) goto L_0x00ba
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r6 == 0) goto L_0x00ba
            boolean r6 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.d(r0)
            if (r6 == 0) goto L_0x00ba
            androidx.compose.ui.spatial.RectManager r6 = r8.f15561d
            androidx.compose.ui.spatial.RectList r6 = r6.e()
            androidx.compose.ui.autofill.AndroidAutofillManager$onSemanticsChanged$1 r7 = new androidx.compose.ui.autofill.AndroidAutofillManager$onSemanticsChanged$1
            r7.<init>(r8, r9)
            r6.l(r9, r7)
        L_0x00ba:
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto L_0x00d3
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r1 != 0) goto L_0x00d3
            boolean r1 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.d(r10)
            if (r1 == 0) goto L_0x00d3
            androidx.compose.ui.autofill.PlatformAutofillManager r1 = r8.f15558a
            android.view.View r2 = r8.f15560c
            r1.d(r2, r9)
        L_0x00d3:
            if (r10 == 0) goto L_0x00dd
            boolean r10 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.e(r10)
            if (r10 != r5) goto L_0x00dd
            r10 = r5
            goto L_0x00de
        L_0x00dd:
            r10 = r4
        L_0x00de:
            if (r0 == 0) goto L_0x00e7
            boolean r0 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.e(r0)
            if (r0 != r5) goto L_0x00e7
            r4 = r5
        L_0x00e7:
            if (r10 == r4) goto L_0x00f6
            if (r4 == 0) goto L_0x00f1
            androidx.collection.MutableIntSet r10 = r8.f15565h
            r10.g(r9)
            goto L_0x00f6
        L_0x00f1:
            androidx.collection.MutableIntSet r10 = r8.f15565h
            r10.r(r9)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.AndroidAutofillManager.b(androidx.compose.ui.semantics.SemanticsInfo, androidx.compose.ui.semantics.SemanticsConfiguration):void");
    }

    public void c() {
        this.f15558a.cancel();
    }

    public final PlatformAutofillManager f() {
        return this.f15558a;
    }

    public final void g(SemanticsInfo semanticsInfo) {
        if (this.f15565h.r(semanticsInfo.v())) {
            this.f15558a.c(this.f15560c, semanticsInfo.v(), false);
        }
    }

    public final void h() {
        if (this.f15565h.c() && this.f15566i) {
            this.f15558a.commit();
            this.f15566i = false;
        }
        if (this.f15565h.d()) {
            this.f15566i = true;
        }
    }

    public final void i(SemanticsInfo semanticsInfo) {
        if (this.f15565h.r(semanticsInfo.v())) {
            this.f15558a.c(this.f15560c, semanticsInfo.v(), false);
        }
    }

    public final void j(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration a0 = semanticsInfo.a0();
        if (a0 != null && AndroidAutofillManager_androidKt.e(a0)) {
            this.f15565h.g(semanticsInfo.v());
            this.f15558a.c(this.f15560c, semanticsInfo.v(), true);
        }
    }

    public final void k(SemanticsInfo semanticsInfo, int i2) {
        if (this.f15565h.r(i2)) {
            this.f15558a.c(this.f15560c, i2, false);
        }
        SemanticsConfiguration a0 = semanticsInfo.a0();
        if (a0 != null && AndroidAutofillManager_androidKt.e(a0)) {
            this.f15565h.g(semanticsInfo.v());
            this.f15558a.c(this.f15560c, semanticsInfo.v(), true);
        }
    }

    public final void l(SparseArray sparseArray) {
        SemanticsConfiguration a0;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f15576a;
            if (autofillApi26Helper.e(autofillValue)) {
                SemanticsInfo a2 = this.f15559b.a(keyAt);
                if (!(a2 == null || (a0 = a2.a0()) == null || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(a0, SemanticsActions.f18056a.k())) == null || (function1 = (Function1) accessibilityAction.a()) == null)) {
                    Boolean bool = (Boolean) function1.invoke(new AnnotatedString(autofillApi26Helper.B(autofillValue).toString(), (List) null, 2, (DefaultConstructorMarker) null));
                }
            } else if (autofillApi26Helper.c(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.d(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.f(autofillValue)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void m(ViewStructure viewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f15576a;
        SemanticsInfo c2 = this.f15559b.c();
        PopulateViewStructure_androidKt.a(viewStructure, c2, this.f15564g, this.f15562e, this.f15561d);
        MutableObjectList h2 = ObjectListKt.h(c2, viewStructure);
        while (h2.h()) {
            Object A2 = h2.A(h2.f1938b - 1);
            Intrinsics.g(A2, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) A2;
            Object A3 = h2.A(h2.f1938b - 1);
            Intrinsics.g(A3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List c0 = ((SemanticsInfo) A3).c0();
            int size = c0.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsInfo semanticsInfo = (SemanticsInfo) c0.get(i2);
                if (!semanticsInfo.x() && semanticsInfo.b() && semanticsInfo.u()) {
                    SemanticsConfiguration a0 = semanticsInfo.a0();
                    if (a0 == null || !AndroidAutofillManager_androidKt.f(a0)) {
                        h2.n(semanticsInfo);
                        h2.n(viewStructure2);
                    } else {
                        ViewStructure g2 = autofillApi26Helper.g(viewStructure2, autofillApi26Helper.a(viewStructure2, 1));
                        PopulateViewStructure_androidKt.a(g2, semanticsInfo, this.f15564g, this.f15562e, this.f15561d);
                        h2.n(semanticsInfo);
                        h2.n(g2);
                    }
                }
            }
        }
    }

    public final void n(SemanticsInfo semanticsInfo) {
        this.f15561d.e().l(semanticsInfo.v(), new AndroidAutofillManager$requestAutofill$1(this, semanticsInfo));
    }
}
