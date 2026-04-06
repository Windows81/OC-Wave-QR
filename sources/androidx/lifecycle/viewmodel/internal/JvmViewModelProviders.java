package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JvmViewModelProviders {

    /* renamed from: a  reason: collision with root package name */
    public static final JvmViewModelProviders f22081a = new JvmViewModelProviders();

    public final ViewModel a(Class cls) {
        Intrinsics.i(cls, "modelClass");
        try {
            Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            Intrinsics.f(newInstance);
            return (ViewModel) newInstance;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
