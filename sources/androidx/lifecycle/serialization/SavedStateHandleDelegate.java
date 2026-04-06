package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

@Metadata
final class SavedStateHandleDelegate<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateHandle f22055a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f22056b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22057c;

    /* renamed from: d  reason: collision with root package name */
    public final SavedStateConfiguration f22058d;

    /* renamed from: e  reason: collision with root package name */
    public final Function0 f22059e;

    /* renamed from: f  reason: collision with root package name */
    public Object f22060f;

    public static final Bundle f(SavedStateHandleDelegate savedStateHandleDelegate) {
        SerializationStrategy serializationStrategy = savedStateHandleDelegate.f22056b;
        Object obj = savedStateHandleDelegate.f22060f;
        if (obj == null) {
            Intrinsics.y("value");
            obj = Unit.f40552a;
        }
        return SavedStateEncoderKt.a(serializationStrategy, obj, savedStateHandleDelegate.f22058d);
    }

    public Object a(Object obj, KProperty kProperty) {
        Intrinsics.i(kProperty, "property");
        if (this.f22060f == null) {
            String str = this.f22057c;
            if (str == null) {
                str = c(obj, kProperty);
            }
            e(str);
            Object d2 = d(str);
            if (d2 == null) {
                d2 = this.f22059e.invoke();
            }
            this.f22060f = d2;
        }
        Object obj2 = this.f22060f;
        if (obj2 != null) {
            return obj2;
        }
        Intrinsics.y("value");
        return Unit.f40552a;
    }

    public final String c(Object obj, KProperty kProperty) {
        String str;
        if (obj != null) {
            str = Reflection.b(obj.getClass()).b() + '.';
        } else {
            str = "";
        }
        return str + kProperty.getName();
    }

    public final Object d(String str) {
        Bundle bundle = (Bundle) this.f22055a.c(str);
        if (bundle != null) {
            return SavedStateDecoderKt.a(this.f22056b, bundle, this.f22058d);
        }
        return null;
    }

    public final void e(String str) {
        this.f22055a.g(str, new a(this));
    }
}
