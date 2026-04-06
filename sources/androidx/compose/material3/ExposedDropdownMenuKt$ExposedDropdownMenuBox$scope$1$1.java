package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 extends ExposedDropdownMenuBoxScopeImpl {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f9948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9949c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MutableState f9950d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f9951e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f9952f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f9953g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SoftwareKeyboardController f9954h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MutableState f9955i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function1 f9956j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9957k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9958l;

    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(FocusRequester focusRequester, boolean z2, MutableState mutableState, String str, String str2, String str3, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState2, Function1 function1, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.f9948b = focusRequester;
        this.f9949c = z2;
        this.f9950d = mutableState;
        this.f9951e = str;
        this.f9952f = str2;
        this.f9953g = str3;
        this.f9954h = softwareKeyboardController;
        this.f9955i = mutableState2;
        this.f9956j = function1;
        this.f9957k = mutableIntState;
        this.f9958l = mutableIntState2;
    }

    public static final MeasureResult q(boolean z2, MutableIntState mutableIntState, MutableIntState mutableIntState2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int g2 = ConstraintsKt.g(constraints.r(), ExposedDropdownMenuKt.p(mutableIntState));
        int f2 = ConstraintsKt.f(constraints.r(), ExposedDropdownMenuKt.r(mutableIntState2));
        int n2 = z2 ? g2 : Constraints.n(constraints.r());
        if (!z2) {
            g2 = Constraints.l(constraints.r());
        }
        Placeable c0 = measurable.c0(Constraints.d(constraints.r(), n2, g2, 0, f2, 4, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new J2(c0), 4, (Object) null);
    }

    public static final Unit r(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit s(String str, MutableState mutableState) {
        if (ExposedDropdownMenuKt.F(str, ((ExposedDropdownMenuAnchorType) mutableState.getValue()).j())) {
            mutableState.setValue(ExposedDropdownMenuAnchorType.d(str));
        }
        return Unit.f40552a;
    }

    public static final Unit t(MutableState mutableState, String str, Function1 function1, boolean z2) {
        mutableState.setValue(ExposedDropdownMenuAnchorType.d(str));
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.f40552a;
    }

    public Modifier h(Modifier modifier, boolean z2) {
        return LayoutModifierKt.a(modifier, new I2(z2, this.f9957k, this.f9958l));
    }

    public boolean i() {
        return ((Boolean) this.f9950d.getValue()).booleanValue();
    }

    public String j() {
        return ((ExposedDropdownMenuAnchorType) this.f9955i.getValue()).j();
    }

    public Modifier k(Modifier modifier, String str, boolean z2) {
        Modifier modifier2;
        Modifier o0 = FocusRequesterModifierKt.a(modifier, this.f9948b).o0(new ExposedDropdownMenuAnchorElement(new K2(str, this.f9955i)));
        if (!z2) {
            modifier2 = Modifier.f15489d;
        } else {
            Modifier.Companion companion = Modifier.f15489d;
            boolean z3 = this.f9949c;
            modifier2 = ExposedDropdownMenuKt.B(companion, z3, new L2(this.f9955i, str, this.f9956j, z3), str, this.f9950d, this.f9951e, this.f9952f, this.f9953g, this.f9954h);
        }
        return o0.o0(modifier2);
    }
}
