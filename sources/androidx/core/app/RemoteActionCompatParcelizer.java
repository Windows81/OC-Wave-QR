package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f19669a = (IconCompat) versionedParcel.v(remoteActionCompat.f19669a, 1);
        remoteActionCompat.f19670b = versionedParcel.l(remoteActionCompat.f19670b, 2);
        remoteActionCompat.f19671c = versionedParcel.l(remoteActionCompat.f19671c, 3);
        remoteActionCompat.f19672d = (PendingIntent) versionedParcel.r(remoteActionCompat.f19672d, 4);
        remoteActionCompat.f19673e = versionedParcel.h(remoteActionCompat.f19673e, 5);
        remoteActionCompat.f19674f = versionedParcel.h(remoteActionCompat.f19674f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f19669a, 1);
        versionedParcel.D(remoteActionCompat.f19670b, 2);
        versionedParcel.D(remoteActionCompat.f19671c, 3);
        versionedParcel.H(remoteActionCompat.f19672d, 4);
        versionedParcel.z(remoteActionCompat.f19673e, 5);
        versionedParcel.z(remoteActionCompat.f19674f, 6);
    }
}
