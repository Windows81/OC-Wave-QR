package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18552a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f18553b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f18554c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Constructor b() {
            if (StaticLayoutFactoryDefault.f18553b) {
                return StaticLayoutFactoryDefault.f18554c;
            }
            StaticLayoutFactoryDefault.f18553b = true;
            Class<StaticLayout> cls = StaticLayout.class;
            Class<CharSequence> cls2 = CharSequence.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Float.TYPE;
                StaticLayoutFactoryDefault.f18554c = cls.getConstructor(new Class[]{cls2, cls3, cls3, TextPaint.class, cls3, Layout.Alignment.class, TextDirectionHeuristic.class, cls4, cls4, Boolean.TYPE, TextUtils.TruncateAt.class, cls3, cls3});
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.f18554c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryDefault.f18554c;
        }

        public Companion() {
        }
    }

    public StaticLayout a(StaticLayoutParams staticLayoutParams) {
        Constructor a2 = f18552a.b();
        StaticLayout staticLayout = null;
        if (a2 != null) {
            try {
                staticLayout = (StaticLayout) a2.newInstance(new Object[]{staticLayoutParams.r(), Integer.valueOf(staticLayoutParams.q()), Integer.valueOf(staticLayoutParams.e()), staticLayoutParams.o(), Integer.valueOf(staticLayoutParams.u()), staticLayoutParams.a(), staticLayoutParams.s(), Float.valueOf(staticLayoutParams.m()), Float.valueOf(staticLayoutParams.l()), Boolean.valueOf(staticLayoutParams.g()), staticLayoutParams.c(), Integer.valueOf(staticLayoutParams.d()), Integer.valueOf(staticLayoutParams.n())});
            } catch (IllegalAccessException unused) {
                f18554c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f18554c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f18554c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(staticLayoutParams.r(), staticLayoutParams.q(), staticLayoutParams.e(), staticLayoutParams.o(), staticLayoutParams.u(), staticLayoutParams.a(), staticLayoutParams.m(), staticLayoutParams.l(), staticLayoutParams.g(), staticLayoutParams.c(), staticLayoutParams.d());
    }

    public boolean b(StaticLayout staticLayout, boolean z2) {
        return false;
    }
}
