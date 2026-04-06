package androidx.biometric;

import android.content.DialogInterface;
import android.hardware.biometrics.PromptContentItemBulletedText;
import android.hardware.biometrics.PromptContentItemPlainText;
import android.hardware.biometrics.PromptContentView;
import android.hardware.biometrics.PromptContentViewWithMoreOptionsButton;
import android.hardware.biometrics.PromptVerticalListContentView;
import android.os.Build;
import java.util.concurrent.Executor;

class PromptContentViewUtils {

    public static class Api35Impl {
        public static PromptContentView b(PromptContentViewWithMoreOptionsButton promptContentViewWithMoreOptionsButton, Executor executor, DialogInterface.OnClickListener onClickListener) {
            PromptContentViewWithMoreOptionsButton.Builder builder = new PromptContentViewWithMoreOptionsButton.Builder();
            if (promptContentViewWithMoreOptionsButton.a() != null) {
                builder.setDescription(promptContentViewWithMoreOptionsButton.a());
            }
            builder.setMoreOptionsButtonListener(executor, onClickListener);
            return builder.build();
        }

        public static PromptContentView c(PromptVerticalListContentView promptVerticalListContentView) {
            PromptVerticalListContentView.Builder builder = new PromptVerticalListContentView.Builder();
            if (promptVerticalListContentView.a() != null) {
                builder.setDescription(promptVerticalListContentView.a());
            }
            promptVerticalListContentView.b().forEach(new m(builder));
            return builder.build();
        }

        public static /* synthetic */ void d(PromptVerticalListContentView.Builder builder, PromptContentItem promptContentItem) {
            if (promptContentItem instanceof PromptContentItemPlainText) {
                builder.addListItem(new PromptContentItemPlainText(((PromptContentItemPlainText) promptContentItem).a()));
            } else if (promptContentItem instanceof PromptContentItemBulletedText) {
                builder.addListItem(new PromptContentItemBulletedText(((PromptContentItemBulletedText) promptContentItem).a()));
            }
        }
    }

    public static PromptContentView a(PromptContentView promptContentView, Executor executor, DialogInterface.OnClickListener onClickListener) {
        if (promptContentView != null && Build.VERSION.SDK_INT >= 35) {
            if (promptContentView instanceof PromptVerticalListContentView) {
                return Api35Impl.c((PromptVerticalListContentView) promptContentView);
            }
            if (promptContentView instanceof PromptContentViewWithMoreOptionsButton) {
                return Api35Impl.b((PromptContentViewWithMoreOptionsButton) promptContentView, executor, onClickListener);
            }
        }
        return null;
    }
}
