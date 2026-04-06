package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayMap f23038a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f23039b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayMap f23040c;

    /* renamed from: androidx.versionedparcelable.VersionedParcel$1  reason: invalid class name */
    class AnonymousClass1 extends ObjectInputStream {
        public Class resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.f23038a = arrayMap;
        this.f23039b = arrayMap2;
        this.f23040c = arrayMap3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i2) {
        w(i2);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i2) {
        w(i2);
        C(charSequence);
    }

    public abstract void E(int i2);

    public void F(int i2, int i3) {
        w(i3);
        E(i2);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i2) {
        w(i2);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i2) {
        w(i2);
        I(str);
    }

    public void K(VersionedParcelable versionedParcelable, VersionedParcel versionedParcel) {
        try {
            e(versionedParcelable.getClass()).invoke((Object) null, new Object[]{versionedParcelable, versionedParcel});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public void L(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            I((String) null);
            return;
        }
        N(versionedParcelable);
        VersionedParcel b2 = b();
        K(versionedParcelable, b2);
        b2.a();
    }

    public void M(VersionedParcelable versionedParcelable, int i2) {
        w(i2);
        L(versionedParcelable);
    }

    public final void N(VersionedParcelable versionedParcelable) {
        try {
            I(c(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.f23040c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f23040c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        Method method = (Method) this.f23038a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f23038a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.f23039b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f23039b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z2, int i2) {
        return !m(i2) ? z2 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i2) {
        return !m(i2) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i2) {
        return !m(i2) ? charSequence : k();
    }

    public abstract boolean m(int i2);

    public VersionedParcelable n(String str, VersionedParcel versionedParcel) {
        try {
            return (VersionedParcelable) d(str).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public abstract int o();

    public int p(int i2, int i3) {
        return !m(i3) ? i2 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i2) {
        return !m(i2) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i2) {
        return !m(i2) ? str : s();
    }

    public VersionedParcelable u() {
        String s2 = s();
        if (s2 == null) {
            return null;
        }
        return n(s2, b());
    }

    public VersionedParcelable v(VersionedParcelable versionedParcelable, int i2) {
        return !m(i2) ? versionedParcelable : u();
    }

    public abstract void w(int i2);

    public void x(boolean z2, boolean z3) {
    }

    public abstract void y(boolean z2);

    public void z(boolean z2, int i2) {
        w(i2);
        y(z2);
    }
}
