package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
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
final class SavedStateRegistryOwnerDelegate<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateRegistry f22890a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f22891b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22892c;

    /* renamed from: d  reason: collision with root package name */
    public final SavedStateConfiguration f22893d;

    /* renamed from: e  reason: collision with root package name */
    public final Function0 f22894e;

    /* renamed from: f  reason: collision with root package name */
    public Object f22895f;

    private final String c(Object obj, KProperty kProperty) {
        String str;
        if (obj != null) {
            str = Reflection.b(obj.getClass()).b() + '.';
        } else {
            str = "";
        }
        return str + kProperty.getName();
    }

    private final Object d(String str) {
        Bundle a2 = this.f22890a.a(str);
        if (a2 != null) {
            return SavedStateDecoderKt.a(this.f22891b, a2, this.f22893d);
        }
        return null;
    }

    private final void e(String str) {
        this.f22890a.c(str, new b(this));
    }

    public static final Bundle f(SavedStateRegistryOwnerDelegate savedStateRegistryOwnerDelegate) {
        SerializationStrategy serializationStrategy = savedStateRegistryOwnerDelegate.f22891b;
        Object obj = savedStateRegistryOwnerDelegate.f22895f;
        if (obj == null) {
            Intrinsics.y("value");
            obj = Unit.f40552a;
        }
        return SavedStateEncoderKt.a(serializationStrategy, obj, savedStateRegistryOwnerDelegate.f22893d);
    }

    public Object a(Object obj, KProperty kProperty) {
        Intrinsics.i(kProperty, "property");
        if (this.f22895f == null) {
            String str = this.f22892c;
            if (str == null) {
                str = c(obj, kProperty);
            }
            e(str);
            Object d2 = d(str);
            if (d2 == null) {
                d2 = this.f22894e.invoke();
            }
            this.f22895f = d2;
        }
        Object obj2 = this.f22895f;
        if (obj2 != null) {
            return obj2;
        }
        Intrinsics.y("value");
        return Unit.f40552a;
    }
}
