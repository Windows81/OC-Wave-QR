package androidx.navigation.compose;

import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;

@Metadata
@NavDestinationDsl
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {

    /* renamed from: i  reason: collision with root package name */
    public final ComposeNavigator f22465i;

    /* renamed from: j  reason: collision with root package name */
    public final Function4 f22466j;

    /* renamed from: k  reason: collision with root package name */
    public Function1 f22467k;

    /* renamed from: l  reason: collision with root package name */
    public Function1 f22468l;

    /* renamed from: m  reason: collision with root package name */
    public Function1 f22469m;

    /* renamed from: n  reason: collision with root package name */
    public Function1 f22470n;

    /* renamed from: o  reason: collision with root package name */
    public Function1 f22471o;

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, KClass kClass, Map map, Function4 function4) {
        super((Navigator) composeNavigator, kClass, map);
        this.f22465i = composeNavigator;
        this.f22466j = function4;
    }

    /* renamed from: f */
    public ComposeNavigator.Destination a() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.a();
        destination.U(this.f22467k);
        destination.V(this.f22468l);
        destination.W(this.f22469m);
        destination.Y(this.f22470n);
        destination.Z(this.f22471o);
        return destination;
    }

    /* renamed from: g */
    public ComposeNavigator.Destination d() {
        return new ComposeNavigator.Destination(this.f22465i, this.f22466j);
    }

    public final void h(Function1 function1) {
        this.f22467k = function1;
    }

    public final void i(Function1 function1) {
        this.f22468l = function1;
    }

    public final void j(Function1 function1) {
        this.f22469m = function1;
    }

    public final void k(Function1 function1) {
        this.f22470n = function1;
    }

    public final void l(Function1 function1) {
        this.f22471o = function1;
    }
}
