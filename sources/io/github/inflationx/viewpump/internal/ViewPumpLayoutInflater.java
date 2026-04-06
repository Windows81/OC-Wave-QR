package io.github.inflationx.viewpump.internal;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BuildCompat;
import io.github.inflationx.viewpump.FallbackViewCreator;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.R;
import io.github.inflationx.viewpump.ViewPump;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater  reason: invalid class name */
public final class ViewPumpLayoutInflater extends LayoutInflater implements ViewPumpActivityFactory {

    /* renamed from: f  reason: collision with root package name */
    public static final Set f39824f = SetsKt.f("android.widget.", "android.webkit.");

    /* renamed from: g  reason: collision with root package name */
    public static final Lazy f39825g = LazyKt.b(ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2.f39835z);

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f39826h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39827a;

    /* renamed from: b  reason: collision with root package name */
    public final FallbackViewCreator f39828b;

    /* renamed from: c  reason: collision with root package name */
    public final FallbackViewCreator f39829c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f39830d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39831e;

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$ActivityViewCreator */
    public static final class ActivityViewCreator implements FallbackViewCreator {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPumpLayoutInflater f39832a;

        /* renamed from: b  reason: collision with root package name */
        public final View f39833b;

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return this.f39832a.f(this.f39833b, str, context, attributeSet);
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$Companion */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f39834a = {Reflection.i(new PropertyReference1Impl(Reflection.b(Companion.class), "CONSTRUCTOR_ARGS_FIELD", "getCONSTRUCTOR_ARGS_FIELD()Ljava/lang/reflect/Field;"))};

        public Companion() {
        }

        public final Field b() {
            Lazy c2 = ViewPumpLayoutInflater.f39825g;
            KProperty kProperty = f39834a[0];
            return (Field) c2.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$NameAndAttrsViewCreator */
    public static final class NameAndAttrsViewCreator implements FallbackViewCreator {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPumpLayoutInflater f39836a;

        public NameAndAttrsViewCreator(ViewPumpLayoutInflater r2) {
            Intrinsics.j(r2, "inflater");
            this.f39836a = r2;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            View view2 = null;
            for (String createView : ViewPumpLayoutInflater.f39824f) {
                try {
                    view2 = this.f39836a.createView(str, createView, attributeSet);
                    if (view2 != null) {
                        break;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return view2 == null ? this.f39836a.j(str, attributeSet) : view2;
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$ParentAndNameAndAttrsViewCreator */
    public static final class ParentAndNameAndAttrsViewCreator implements FallbackViewCreator {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPumpLayoutInflater f39837a;

        public ParentAndNameAndAttrsViewCreator(ViewPumpLayoutInflater r2) {
            Intrinsics.j(r2, "inflater");
            this.f39837a = r2;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return this.f39837a.i(view, str, attributeSet);
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$PrivateWrapperFactory2 */
    public static final class PrivateWrapperFactory2 extends WrapperFactory2 {

        /* renamed from: A  reason: collision with root package name */
        public final PrivateWrapperFactory2ViewCreator f39838A;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PrivateWrapperFactory2(LayoutInflater.Factory2 factory2, ViewPumpLayoutInflater r3) {
            super(factory2);
            Intrinsics.j(factory2, "factory2");
            Intrinsics.j(r3, "inflater");
            this.f39838A = new PrivateWrapperFactory2ViewCreator(factory2, r3);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return ViewPump.f39802h.b().c(new InflateRequest(str, context, attributeSet, view, this.f39838A)).b();
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$PrivateWrapperFactory2ViewCreator */
    public static final class PrivateWrapperFactory2ViewCreator extends WrapperFactory2ViewCreator implements FallbackViewCreator {

        /* renamed from: b  reason: collision with root package name */
        public final ViewPumpLayoutInflater f39839b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PrivateWrapperFactory2ViewCreator(LayoutInflater.Factory2 factory2, ViewPumpLayoutInflater r3) {
            super(factory2);
            Intrinsics.j(factory2, "factory2");
            Intrinsics.j(r3, "inflater");
            this.f39839b = r3;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return this.f39839b.f(a().onCreateView(view, str, context, attributeSet), str, context, attributeSet);
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory */
    public static final class WrapperFactory implements LayoutInflater.Factory {

        /* renamed from: z  reason: collision with root package name */
        public final FallbackViewCreator f39840z;

        public WrapperFactory(LayoutInflater.Factory factory) {
            Intrinsics.j(factory, "factory");
            this.f39840z = new WrapperFactoryViewCreator(factory);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return ViewPump.f39802h.b().c(new InflateRequest(str, context, attributeSet, (View) null, this.f39840z, 8, (DefaultConstructorMarker) null)).b();
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory2 */
    public static class WrapperFactory2 implements LayoutInflater.Factory2 {

        /* renamed from: z  reason: collision with root package name */
        public final WrapperFactory2ViewCreator f39841z;

        public WrapperFactory2(LayoutInflater.Factory2 factory2) {
            Intrinsics.j(factory2, "factory2");
            this.f39841z = new WrapperFactory2ViewCreator(factory2);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return onCreateView((View) null, str, context, attributeSet);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return ViewPump.f39802h.b().c(new InflateRequest(str, context, attributeSet, view, this.f39841z)).b();
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory2ViewCreator */
    public static class WrapperFactory2ViewCreator implements FallbackViewCreator {

        /* renamed from: a  reason: collision with root package name */
        public final LayoutInflater.Factory2 f39842a;

        public WrapperFactory2ViewCreator(LayoutInflater.Factory2 factory2) {
            Intrinsics.j(factory2, "factory2");
            this.f39842a = factory2;
        }

        public final LayoutInflater.Factory2 a() {
            return this.f39842a;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return this.f39842a.onCreateView(view, str, context, attributeSet);
        }
    }

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactoryViewCreator */
    public static final class WrapperFactoryViewCreator implements FallbackViewCreator {

        /* renamed from: a  reason: collision with root package name */
        public final LayoutInflater.Factory f39843a;

        public WrapperFactoryViewCreator(LayoutInflater.Factory factory) {
            Intrinsics.j(factory, "factory");
            this.f39843a = factory;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            Intrinsics.j(str, "name");
            Intrinsics.j(context, "context");
            return this.f39843a.onCreateView(str, context, attributeSet);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPumpLayoutInflater(LayoutInflater layoutInflater, Context context, boolean z2) {
        super(layoutInflater, context);
        Intrinsics.j(layoutInflater, "original");
        Intrinsics.j(context, "newContext");
        this.f39827a = Build.VERSION.SDK_INT > 28 || BuildCompat.b();
        this.f39828b = new NameAndAttrsViewCreator(this);
        this.f39829c = new ParentAndNameAndAttrsViewCreator(this);
        this.f39831e = ViewPump.f39802h.b().f();
        h(z2);
    }

    public LayoutInflater cloneInContext(Context context) {
        Intrinsics.j(context, "newContext");
        return new ViewPumpLayoutInflater(this, context, true);
    }

    public final View f(View view, String str, Context context, AttributeSet attributeSet) {
        Field a2;
        if (!ViewPump.f39802h.b().d() || view != null || StringsKt.i0(str, '.', 0, false, 6, (Object) null) <= -1) {
            return view;
        }
        if (this.f39827a) {
            return cloneInContext(context).createView(str, (String) null, attributeSet);
        }
        Companion companion = f39826h;
        Object obj = companion.b().get(this);
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[0];
            objArr[0] = context;
            ReflectionUtils.c(companion.b(), this, objArr);
            try {
                view = createView(str, (String) null, attributeSet);
                objArr[0] = obj2;
                a2 = companion.b();
            } catch (ClassNotFoundException unused) {
                objArr[0] = obj2;
                a2 = f39826h.b();
            } catch (Throwable th) {
                objArr[0] = obj2;
                ReflectionUtils.c(f39826h.b(), this, objArr);
                throw th;
            }
            ReflectionUtils.c(a2, this, objArr);
            return view;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
    }

    public final void g() {
        if (this.f39830d || !ViewPump.f39802h.b().e()) {
            return;
        }
        if (!(getContext() instanceof LayoutInflater.Factory2)) {
            this.f39830d = true;
            return;
        }
        Method a2 = ReflectionUtils.a(LayoutInflater.class, "setPrivateFactory");
        Context context = getContext();
        if (context != null) {
            ReflectionUtils.b(a2, this, new PrivateWrapperFactory2((LayoutInflater.Factory2) context, this));
            this.f39830d = true;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
    }

    public final void h(boolean z2) {
        if (!z2) {
            if (getFactory2() != null && !(getFactory2() instanceof WrapperFactory2)) {
                setFactory2(getFactory2());
            }
            if (getFactory() != null && !(getFactory() instanceof WrapperFactory)) {
                setFactory(getFactory());
            }
        }
    }

    public final View i(View view, String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public View inflate(int i2, ViewGroup viewGroup, boolean z2) {
        View inflate = super.inflate(i2, viewGroup, z2);
        if (inflate != null && this.f39831e) {
            inflate.setTag(R.id.f39799a, Integer.valueOf(i2));
        }
        return inflate;
    }

    public final View j(String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public View onCreateView(View view, String str, AttributeSet attributeSet) {
        Intrinsics.j(str, "name");
        ViewPump b2 = ViewPump.f39802h.b();
        Context context = getContext();
        Intrinsics.e(context, "context");
        return b2.c(new InflateRequest(str, context, attributeSet, view, this.f39829c)).b();
    }

    public void setFactory(LayoutInflater.Factory factory) {
        Intrinsics.j(factory, "factory");
        if (!(factory instanceof WrapperFactory)) {
            super.setFactory(new WrapperFactory(factory));
        } else {
            super.setFactory(factory);
        }
    }

    public void setFactory2(LayoutInflater.Factory2 factory2) {
        Intrinsics.j(factory2, "factory2");
        if (!(factory2 instanceof WrapperFactory2)) {
            super.setFactory2(new WrapperFactory2(factory2));
        } else {
            super.setFactory2(factory2);
        }
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z2) {
        Intrinsics.j(xmlPullParser, "parser");
        g();
        View inflate = super.inflate(xmlPullParser, viewGroup, z2);
        Intrinsics.e(inflate, "super.inflate(parser, root, attachToRoot)");
        return inflate;
    }

    public View onCreateView(String str, AttributeSet attributeSet) {
        Intrinsics.j(str, "name");
        ViewPump b2 = ViewPump.f39802h.b();
        Context context = getContext();
        Intrinsics.e(context, "context");
        return b2.c(new InflateRequest(str, context, attributeSet, (View) null, this.f39828b, 8, (DefaultConstructorMarker) null)).b();
    }
}
