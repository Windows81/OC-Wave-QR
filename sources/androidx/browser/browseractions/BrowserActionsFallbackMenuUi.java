package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.R;
import androidx.core.widget.TextViewCompat;
import java.util.List;

@Deprecated
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {

    /* renamed from: A  reason: collision with root package name */
    public final Uri f1575A;

    /* renamed from: B  reason: collision with root package name */
    public final List f1576B;
    public BrowserActionsFallMenuUiListener C;
    public BrowserActionsFallbackMenuDialog D;

    /* renamed from: z  reason: collision with root package name */
    public final Context f1577z;

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ BrowserActionsFallbackMenuUi f1578z;

        public void run() {
            ((ClipboardManager) this.f1578z.f1577z.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", this.f1578z.f1575A.toString()));
            Toast.makeText(this.f1578z.f1577z, this.f1578z.f1577z.getString(R.string.f1558a), 0).show();
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2  reason: invalid class name */
    class AnonymousClass2 implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1579a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BrowserActionsFallbackMenuUi f1580b;

        public void onShow(DialogInterface dialogInterface) {
            BrowserActionsFallMenuUiListener browserActionsFallMenuUiListener = this.f1580b.C;
            if (browserActionsFallMenuUiListener == null) {
                Log.e("BrowserActionskMenuUi", "Cannot trigger menu item listener, it is null");
            } else {
                browserActionsFallMenuUiListener.a(this.f1579a);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3  reason: invalid class name */
    class AnonymousClass3 implements View.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ TextView f1581z;

        public void onClick(View view) {
            if (TextViewCompat.c(this.f1581z) == Integer.MAX_VALUE) {
                this.f1581z.setMaxLines(1);
                this.f1581z.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.f1581z.setMaxLines(Integer.MAX_VALUE);
            this.f1581z.setEllipsize((TextUtils.TruncateAt) null);
        }
    }

    public interface BrowserActionsFallMenuUiListener {
        void a(View view);
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f1576B.get(i2);
        if (browserActionItem.a() != null) {
            try {
                browserActionItem.a().send();
            } catch (PendingIntent.CanceledException e2) {
                Log.e("BrowserActionskMenuUi", "Failed to send custom item action", e2);
            }
        } else if (browserActionItem.d() != null) {
            browserActionItem.d().run();
        }
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.D;
        if (browserActionsFallbackMenuDialog == null) {
            Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            browserActionsFallbackMenuDialog.dismiss();
        }
    }
}
