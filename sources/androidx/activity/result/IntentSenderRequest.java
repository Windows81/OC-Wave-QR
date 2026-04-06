package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new IntentSenderRequest$Companion$CREATOR$1();
    public static final Companion D = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final Intent f243A;

    /* renamed from: B  reason: collision with root package name */
    public final int f244B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final IntentSender f245z;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final IntentSender f246a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f247b;

        /* renamed from: c  reason: collision with root package name */
        public int f248c;

        /* renamed from: d  reason: collision with root package name */
        public int f249d;

        @Metadata
        @Retention
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            Intrinsics.i(intentSender, "intentSender");
            this.f246a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f246a, this.f247b, this.f248c, this.f249d);
        }

        public final Builder b(Intent intent) {
            this.f247b = intent;
            return this;
        }

        public final Builder c(int i2, int i3) {
            this.f249d = i2;
            this.f248c = i3;
            return this;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.Intrinsics.i(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.Intrinsics.h(r2, r0)
                r1.<init>((android.content.IntentSender) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.Builder.<init>(android.app.PendingIntent):void");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        Intrinsics.i(intentSender, "intentSender");
        this.f245z = intentSender;
        this.f243A = intent;
        this.f244B = i2;
        this.C = i3;
    }

    public final Intent a() {
        return this.f243A;
    }

    public final int b() {
        return this.f244B;
    }

    public final int c() {
        return this.C;
    }

    public final IntentSender d() {
        return this.f245z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.i(parcel, "dest");
        parcel.writeParcelable(this.f245z, i2);
        parcel.writeParcelable(this.f243A, i2);
        parcel.writeInt(this.f244B);
        parcel.writeInt(this.C);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IntentSenderRequest(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.Intrinsics.f(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.os.Parcel):void");
    }
}
