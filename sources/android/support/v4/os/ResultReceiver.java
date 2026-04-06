package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final Handler f21A = null;

    /* renamed from: B  reason: collision with root package name */
    public IResultReceiver f22B;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f23z = false;

    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
        }

        public void Q(int i2, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f21A;
            if (handler != null) {
                handler.post(new MyRunnable(i2, bundle));
            } else {
                resultReceiver.a(i2, bundle);
            }
        }
    }

    public class MyRunnable implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final Bundle f25A;

        /* renamed from: z  reason: collision with root package name */
        public final int f27z;

        public MyRunnable(int i2, Bundle bundle) {
            this.f27z = i2;
            this.f25A = bundle;
        }

        public void run() {
            ResultReceiver.this.a(this.f27z, this.f25A);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f22B = IResultReceiver.Stub.J(parcel.readStrongBinder());
    }

    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            try {
                if (this.f22B == null) {
                    this.f22B = new MyResultReceiver();
                }
                parcel.writeStrongBinder(this.f22B.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
