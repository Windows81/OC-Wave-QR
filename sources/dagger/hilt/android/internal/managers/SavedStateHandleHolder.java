package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;

public final class SavedStateHandleHolder {

    /* renamed from: a  reason: collision with root package name */
    public CreationExtras f39742a;

    /* renamed from: b  reason: collision with root package name */
    public SavedStateHandle f39743b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39744c;

    public SavedStateHandleHolder(CreationExtras creationExtras) {
        this.f39744c = creationExtras == null;
        this.f39742a = creationExtras;
    }

    public void a() {
        this.f39742a = null;
    }

    public SavedStateHandle b() {
        ThreadUtil.a();
        Preconditions.c(!this.f39744c, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        SavedStateHandle savedStateHandle = this.f39743b;
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        Preconditions.b(this.f39742a, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f39742a);
        mutableCreationExtras.c(SavedStateHandleSupport.f21971c, Bundle.EMPTY);
        this.f39742a = mutableCreationExtras;
        SavedStateHandle a2 = SavedStateHandleSupport.a(mutableCreationExtras);
        this.f39743b = a2;
        this.f39742a = null;
        return a2;
    }

    public boolean c() {
        return this.f39743b == null && this.f39742a == null;
    }

    public void d(CreationExtras creationExtras) {
        if (this.f39743b == null) {
            this.f39742a = creationExtras;
        }
    }
}
