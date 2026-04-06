package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new NavBackStackEntryState$Companion$CREATOR$1();
    public static final Companion D = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f22202A;

    /* renamed from: B  reason: collision with root package name */
    public final Bundle f22203B;
    public final Bundle C;

    /* renamed from: z  reason: collision with root package name */
    public final String f22204z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "entry");
        this.f22204z = navBackStackEntry.h();
        this.f22202A = navBackStackEntry.g().q();
        this.f22203B = navBackStackEntry.e();
        Bundle bundle = new Bundle();
        this.C = bundle;
        navBackStackEntry.k(bundle);
    }

    public final int a() {
        return this.f22202A;
    }

    public final NavBackStackEntry b(Context context, NavDestination navDestination, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        Intrinsics.i(context, "context");
        Intrinsics.i(navDestination, "destination");
        Intrinsics.i(state, "hostLifecycleState");
        Bundle bundle = this.f22203B;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.N.a(context, navDestination, bundle, state, navControllerViewModel, this.f22204z, this.C);
    }

    public int describeContents() {
        return 0;
    }

    public final String m() {
        return this.f22204z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "parcel");
        parcel.writeString(this.f22204z);
        parcel.writeInt(this.f22202A);
        parcel.writeBundle(this.f22203B);
        parcel.writeBundle(this.C);
    }

    public NavBackStackEntryState(Parcel parcel) {
        Intrinsics.i(parcel, "inParcel");
        String readString = parcel.readString();
        Intrinsics.f(readString);
        this.f22204z = readString;
        this.f22202A = parcel.readInt();
        Class<NavBackStackEntryState> cls = NavBackStackEntryState.class;
        this.f22203B = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Intrinsics.f(readBundle);
        this.C = readBundle;
    }
}
