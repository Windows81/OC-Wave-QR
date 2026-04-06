package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

final class AppCompatTextClassifierHelper {

    /* renamed from: a  reason: collision with root package name */
    public TextView f1140a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1141b;

    public static final class Api26Impl {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(TextView textView) {
        this.f1140a = (TextView) Preconditions.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1141b;
        return textClassifier == null ? Api26Impl.a(this.f1140a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1141b = textClassifier;
    }
}
