package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScopeKt;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class ViewModelKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SynchronizedObject f21990a = new SynchronizedObject();

    public static final CoroutineScope a(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScope;
        Intrinsics.i(viewModel, "<this>");
        synchronized (f21990a) {
            closeableCoroutineScope = (CloseableCoroutineScope) viewModel.e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScope == null) {
                closeableCoroutineScope = CloseableCoroutineScopeKt.a();
                viewModel.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScope);
            }
        }
        return closeableCoroutineScope;
    }
}
