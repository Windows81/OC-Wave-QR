package androidx.navigation;

import androidx.navigation.NavOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata
@NavOptionsDsl
public final class NavOptionsBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final NavOptions.Builder f22386a = new NavOptions.Builder();

    /* renamed from: b  reason: collision with root package name */
    public boolean f22387b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22388c;

    /* renamed from: d  reason: collision with root package name */
    public int f22389d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f22390e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22391f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22392g;

    /* renamed from: h  reason: collision with root package name */
    public KClass f22393h;

    /* renamed from: i  reason: collision with root package name */
    public Object f22394i;

    public static /* synthetic */ void e(NavOptionsBuilder navOptionsBuilder, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$1.f22395z;
        }
        navOptionsBuilder.c(i2, function1);
    }

    public static /* synthetic */ void f(NavOptionsBuilder navOptionsBuilder, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$4.f22398z;
        }
        navOptionsBuilder.d(obj, function1);
    }

    public final void a(Function1 function1) {
        Intrinsics.i(function1, "animBuilder");
        AnimBuilder animBuilder = new AnimBuilder();
        function1.invoke(animBuilder);
        this.f22386a.b(animBuilder.a()).c(animBuilder.b()).e(animBuilder.c()).f(animBuilder.d());
    }

    public final NavOptions b() {
        NavOptions.Builder builder = this.f22386a;
        builder.d(this.f22387b);
        builder.l(this.f22388c);
        String str = this.f22390e;
        if (str != null) {
            builder.i(str, this.f22391f, this.f22392g);
        } else {
            KClass kClass = this.f22393h;
            if (kClass != null) {
                Intrinsics.f(kClass);
                builder.j(kClass, this.f22391f, this.f22392g);
            } else {
                Object obj = this.f22394i;
                if (obj != null) {
                    Intrinsics.f(obj);
                    builder.h(obj, this.f22391f, this.f22392g);
                } else {
                    builder.g(this.f22389d, this.f22391f, this.f22392g);
                }
            }
        }
        return builder.a();
    }

    public final void c(int i2, Function1 function1) {
        Intrinsics.i(function1, "popUpToBuilder");
        h(i2);
        i((String) null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        function1.invoke(popUpToBuilder);
        this.f22391f = popUpToBuilder.a();
        this.f22392g = popUpToBuilder.b();
    }

    public final void d(Object obj, Function1 function1) {
        Intrinsics.i(obj, "route");
        Intrinsics.i(function1, "popUpToBuilder");
        j(obj);
        h(-1);
        i((String) null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        function1.invoke(popUpToBuilder);
        this.f22391f = popUpToBuilder.a();
        this.f22392g = popUpToBuilder.b();
    }

    public final void g(boolean z2) {
        this.f22387b = z2;
    }

    public final void h(int i2) {
        this.f22389d = i2;
        this.f22391f = false;
    }

    public final void i(String str) {
        if (str == null) {
            return;
        }
        if (!StringsKt.l0(str)) {
            this.f22390e = str;
            this.f22391f = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route");
    }

    public final void j(Object obj) {
        if (obj != null) {
            this.f22394i = obj;
            this.f22391f = false;
        }
    }

    public final void k(boolean z2) {
        this.f22388c = z2;
    }
}
