package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final /* synthetic */ class zaa implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ zaa f24346z = new zaa();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).H().compareTo(((Scope) obj2).H());
    }
}
