package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;

public abstract class RemoteCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f25200a;

    /* renamed from: b  reason: collision with root package name */
    public Object f25201b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RemoteCreator(String str) {
        this.f25200a = str;
    }

    public abstract Object a(IBinder iBinder);

    public final Object b(Context context) {
        if (this.f25201b == null) {
            Preconditions.m(context);
            Context e2 = GooglePlayServicesUtilLight.e(context);
            if (e2 != null) {
                try {
                    this.f25201b = a((IBinder) e2.getClassLoader().loadClass(this.f25200a).newInstance());
                } catch (ClassNotFoundException e3) {
                    throw new RemoteCreatorException("Could not load creator class.", e3);
                } catch (InstantiationException e4) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e4);
                } catch (IllegalAccessException e5) {
                    throw new RemoteCreatorException("Could not access creator.", e5);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f25201b;
    }
}
