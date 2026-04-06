package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

public final /* synthetic */ class zab implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ zab f25030z = new zab();

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature.H().equals(feature2.H()) ? feature.H().compareTo(feature2.H()) : (feature.Q() > feature2.Q() ? 1 : (feature.Q() == feature2.Q() ? 0 : -1));
    }
}
