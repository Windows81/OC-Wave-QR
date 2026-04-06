package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zaz extends RemoteCreator {

    /* renamed from: c  reason: collision with root package name */
    public static final zaz f24963c = new zaz();

    public zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i2, int i3) {
        zaz zaz = f24963c;
        try {
            zax zax = new zax(1, i2, i3, (Scope[]) null);
            return (View) ObjectWrapper.P(((zam) zaz.b(context)).W2(ObjectWrapper.u1(context), zax));
        } catch (Exception e2) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i2 + " and color " + i3, e2);
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}
