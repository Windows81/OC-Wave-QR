package androidx.compose.ui.contentcapture;

import android.util.LongSparseArray;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f15652A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidContentCaptureManager f15653z;

    public /* synthetic */ j(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        this.f15653z = androidContentCaptureManager;
        this.f15652A = longSparseArray;
    }

    public final void run() {
        AndroidContentCaptureManager.ViewTranslationHelperMethods.e(this.f15653z, this.f15652A);
    }
}
